import numpy as np
# might need to add path to mingw-w64/bin for cvxopt to work
# import os
# os.environ["PATH"] += os.pathsep + ...
import cvxopt


def svmlin(X, t, C):
    # Linear SVM Classifier
    #
    # INPUT:
    # X        : the dataset                  (num_samples x dim)
    # t        : labeling                     (num_samples x 1)
    # C        : penalty factor for slack variables (scalar)
    #
    # OUTPUT:
    # alpha    : output of quadprog function  (num_samples x 1)
    # sv       : support vectors (boolean)    (1 x num_samples)
    # w        : parameters of the classifier (1 x dim)
    # b        : bias of the classifier       (scalar)
    # result   : result of classification     (1 x num_samples)
    # slack    : points inside the margin (boolean)   (1 x num_samples)


    #####Start Subtask 2a#####
    N = X.shape[0]
    # we want to get alpha_n >= 0 for all n : positive Lagrange multipliers
    # maximize svm dual formulation, which is quadratic programming problem

    # constraint t * alpha = 0
    A = t.reshape((1, N)).astype(np.double)
    b = np.double(0)

    # lower and upper bound with N=number of training samples for Lagrange multiplier
    LB = np.zeros(N)
    UB = C * np.ones(N)

    # matrix H with elements H(i,j) = t_i*t_j*dot_product(x_i, x_j)
    H = np.zeros((N, N))
    for i in range(N):
        for j in range(N):
            H[i, j] = t[i] * t[j] * np.dot(X[i], X[j])

    # cvxopt.solvers finds the values for a that minimizes the equation, so we need to
    # negate f so that cvxopt.solvers finds the values for a that maximize the eq.:
    #       max 1'*x - 0.5*x'*H*x    subject to:  A*x <= b
    #        x
    #   <=>
    #       min -1'*x + 0.5*x'*H*x    subject to:  A*x <= b
    #        x
    f = (-1) * np.ones(N)

    # => find positive Lagrange multiplies a_n
    n = H.shape[1]
    G = np.vstack([-np.eye(n), np.eye(n)])
    h = np.hstack([-LB, UB])
    sol = cvxopt.solvers.qp(P=cvxopt.matrix(H), q=cvxopt.matrix(f), G=cvxopt.matrix(G), h=cvxopt.matrix(h),
                            A=cvxopt.matrix(A), b=cvxopt.matrix(b))
    alpha = np.array(sol['x']).reshape((-1,))

    # Support vectors (all those which have nonzero lagrange multiplier).
    # Notice that we compare to 1e-6, which is the tolerance within which
    # cvxopt.solvers satisfies the constraints. See doc for more information.

    sv = np.where(alpha > 1e-6, True, False)
    if ~sv.any():
        raise ValueError('No support vectors found.')
    else:
        # Compute the slacks among all the support vectors,
        # i.e. points within the margin but right side of the decision boundary or
        # points outside of the margin but the wrong side of the decision boundary.
        # this happens when lagrange multiplier alpha == C
        # Due to floating point precision, alpha will never be equal to C.
        # Hence we check alpha within the range of [C-1e-6, C]
        # see solution slides for further explanation
        slack = np.where(alpha > C - 1e-6, True, False)

        # Compute the weight-vector: linear combination of training examples (lecture 7 slide 34)
        w = (alpha[sv] * t[sv]).dot(X[sv])

        # Compute bias by averaging over all support vectors (lecture 7 slide 34)
        b = np.mean(t[sv] - w.dot(X[sv].T))

        # Run the classifier to classify the training data
        result = X.dot(w) + b

    #####End Subtask#####
    return alpha, sv, w, b, result, slack
