/* generated from model ClassDiagrams */
/* generated by template core.Interface*/

/* (c) https://github.com/MontiCore/monticore */
package classdiagrams._visitor;

/* generated by template core.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.monticore.ast.ASTNode;
import de.monticore.ast.Comment;
import de.se_rwth.commons.SourcePosition;
import de.monticore.symboltable.*;

/* generated by template core.Annotations*/
// empty template

 public  interface ClassDiagramsVisitor extends de.monticore.types.mcsimplegenerictypes._visitor.MCSimpleGenericTypesVisitor,de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsVisitor {



  default /* generated by template core.Method*/
 public  classdiagrams._visitor.ClassDiagramsVisitor getRealThis ()  {
      return this;
}

  default /* generated by template core.Method*/
 public  void setRealThis (classdiagrams._visitor.ClassDiagramsVisitor realThis)  {
          throw new UnsupportedOperationException("0xA7011x709 The setter for realThis is not implemented. You might want to implement a wrapper class to allow setting/getting realThis.");

}

  default /* generated by template core.Method*/
 public  void endVisit (de.monticore.ast.ASTNode node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void visit (de.monticore.ast.ASTNode node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void visit (classdiagrams._ast.ASTCDCompilationUnit node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (classdiagrams._ast.ASTCDCompilationUnit node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (classdiagrams._ast.ASTCDCompilationUnit node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (classdiagrams._ast.ASTCDCompilationUnit node)  {
      /* generated by template _visitor.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.


    {
      Iterator<de.monticore.types.mcbasictypes._ast.ASTMCImportStatement> iter_mCImportStatements = node.getMCImportStatementList().iterator();
      while (iter_mCImportStatements.hasNext()) {
        iter_mCImportStatements.next().accept(getRealThis());
      }
    }
      if (null != node.getCDDefinition()) {
        node.getCDDefinition().accept(getRealThis());
      }

}

  default /* generated by template core.Method*/
 public  void visit (classdiagrams._ast.ASTCDDefinition node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (classdiagrams._ast.ASTCDDefinition node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (classdiagrams._ast.ASTCDDefinition node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (classdiagrams._ast.ASTCDDefinition node)  {
      /* generated by template _visitor.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.


      if (node.isPresentModifier()) {
        node.getModifier().accept(getRealThis());
      }
    {
      Iterator<classdiagrams._ast.ASTCDClass> iter_cDClasss = node.getCDClassList().iterator();
      while (iter_cDClasss.hasNext()) {
        iter_cDClasss.next().accept(getRealThis());
      }
    }
    {
      Iterator<classdiagrams._ast.ASTCDInterface> iter_cDInterfaces = node.getCDInterfaceList().iterator();
      while (iter_cDInterfaces.hasNext()) {
        iter_cDInterfaces.next().accept(getRealThis());
      }
    }

}

  default /* generated by template core.Method*/
 public  void visit (classdiagrams._ast.ASTCDClass node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (classdiagrams._ast.ASTCDClass node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (classdiagrams._ast.ASTCDClass node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (classdiagrams._ast.ASTCDClass node)  {
      /* generated by template _visitor.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.


      if (node.isPresentModifier()) {
        node.getModifier().accept(getRealThis());
      }
      if (node.isPresentSuperclass()) {
        node.getSuperclass().accept(getRealThis());
      }
      if (node.isPresentTImplements()) {
        node.getTImplements().accept(getRealThis());
      }
    {
      Iterator<de.monticore.types.mcbasictypes._ast.ASTMCObjectType> iter_interfaces = node.getInterfaceList().iterator();
      while (iter_interfaces.hasNext()) {
        iter_interfaces.next().accept(getRealThis());
      }
    }
    {
      Iterator<classdiagrams._ast.ASTCDAttribute> iter_cDAttributes = node.getCDAttributeList().iterator();
      while (iter_cDAttributes.hasNext()) {
        iter_cDAttributes.next().accept(getRealThis());
      }
    }
    {
      Iterator<classdiagrams._ast.ASTCDConstructor> iter_cDConstructors = node.getCDConstructorList().iterator();
      while (iter_cDConstructors.hasNext()) {
        iter_cDConstructors.next().accept(getRealThis());
      }
    }
    {
      Iterator<classdiagrams._ast.ASTCDMethod> iter_cDMethods = node.getCDMethodList().iterator();
      while (iter_cDMethods.hasNext()) {
        iter_cDMethods.next().accept(getRealThis());
      }
    }

}

  default /* generated by template core.Method*/
 public  void visit (classdiagrams._ast.ASTTImplements node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (classdiagrams._ast.ASTTImplements node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (classdiagrams._ast.ASTTImplements node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (classdiagrams._ast.ASTTImplements node)  {
      /* generated by template _visitor.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.



}

  default /* generated by template core.Method*/
 public  void visit (classdiagrams._ast.ASTCDInterface node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (classdiagrams._ast.ASTCDInterface node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (classdiagrams._ast.ASTCDInterface node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (classdiagrams._ast.ASTCDInterface node)  {
      /* generated by template _visitor.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.


      if (node.isPresentModifier()) {
        node.getModifier().accept(getRealThis());
      }
    {
      Iterator<de.monticore.types.mcbasictypes._ast.ASTMCObjectType> iter_interfaces = node.getInterfaceList().iterator();
      while (iter_interfaces.hasNext()) {
        iter_interfaces.next().accept(getRealThis());
      }
    }
    {
      Iterator<classdiagrams._ast.ASTCDAttribute> iter_cDAttributes = node.getCDAttributeList().iterator();
      while (iter_cDAttributes.hasNext()) {
        iter_cDAttributes.next().accept(getRealThis());
      }
    }
    {
      Iterator<classdiagrams._ast.ASTCDMethod> iter_cDMethods = node.getCDMethodList().iterator();
      while (iter_cDMethods.hasNext()) {
        iter_cDMethods.next().accept(getRealThis());
      }
    }

}

  default /* generated by template core.Method*/
 public  void visit (classdiagrams._ast.ASTCDAttribute node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (classdiagrams._ast.ASTCDAttribute node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (classdiagrams._ast.ASTCDAttribute node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (classdiagrams._ast.ASTCDAttribute node)  {
      /* generated by template _visitor.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.


      if (node.isPresentModifier()) {
        node.getModifier().accept(getRealThis());
      }
      if (null != node.getMCType()) {
        node.getMCType().accept(getRealThis());
      }

}

  default /* generated by template core.Method*/
 public  void visit (classdiagrams._ast.ASTCDConstructor node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (classdiagrams._ast.ASTCDConstructor node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (classdiagrams._ast.ASTCDConstructor node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (classdiagrams._ast.ASTCDConstructor node)  {
      /* generated by template _visitor.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.


      if (null != node.getModifier()) {
        node.getModifier().accept(getRealThis());
      }
    {
      Iterator<classdiagrams._ast.ASTCDParameter> iter_cDParameters = node.getCDParameterList().iterator();
      while (iter_cDParameters.hasNext()) {
        iter_cDParameters.next().accept(getRealThis());
      }
    }
    {
      Iterator<de.monticore.types.mcbasictypes._ast.ASTMCQualifiedName> iter_exceptions = node.getExceptionList().iterator();
      while (iter_exceptions.hasNext()) {
        iter_exceptions.next().accept(getRealThis());
      }
    }

}

  default /* generated by template core.Method*/
 public  void visit (classdiagrams._ast.ASTCDMethod node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (classdiagrams._ast.ASTCDMethod node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (classdiagrams._ast.ASTCDMethod node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (classdiagrams._ast.ASTCDMethod node)  {
      /* generated by template _visitor.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.


      if (null != node.getModifier()) {
        node.getModifier().accept(getRealThis());
      }
      if (null != node.getMCReturnType()) {
        node.getMCReturnType().accept(getRealThis());
      }
    {
      Iterator<classdiagrams._ast.ASTCDParameter> iter_cDParameters = node.getCDParameterList().iterator();
      while (iter_cDParameters.hasNext()) {
        iter_cDParameters.next().accept(getRealThis());
      }
    }
    {
      Iterator<de.monticore.types.mcbasictypes._ast.ASTMCQualifiedName> iter_exceptions = node.getExceptionList().iterator();
      while (iter_exceptions.hasNext()) {
        iter_exceptions.next().accept(getRealThis());
      }
    }

}

  default /* generated by template core.Method*/
 public  void visit (classdiagrams._ast.ASTCDParameter node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (classdiagrams._ast.ASTCDParameter node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (classdiagrams._ast.ASTCDParameter node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (classdiagrams._ast.ASTCDParameter node)  {
      /* generated by template _visitor.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.


      if (null != node.getMCType()) {
        node.getMCType().accept(getRealThis());
      }

}

  default /* generated by template core.Method*/
 public  void visit (classdiagrams._ast.ASTModifier node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (classdiagrams._ast.ASTModifier node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (classdiagrams._ast.ASTModifier node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (classdiagrams._ast.ASTModifier node)  {
      /* generated by template _visitor.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.



}

  default /* generated by template core.Method*/
 public  void visit (classdiagrams._ast.ASTCDType node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (classdiagrams._ast.ASTCDType node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (classdiagrams._ast.ASTCDType node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  // no traverse() for abstract classes, interfaces and enums, only concrete classes are traversed
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void visit (classdiagrams._ast.ASTCDField node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (classdiagrams._ast.ASTCDField node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (classdiagrams._ast.ASTCDField node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  // no traverse() for abstract classes, interfaces and enums, only concrete classes are traversed
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void visit (classdiagrams._ast.ASTCDMethOrConstr node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (classdiagrams._ast.ASTCDMethOrConstr node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (classdiagrams._ast.ASTCDMethOrConstr node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  // no traverse() for abstract classes, interfaces and enums, only concrete classes are traversed
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void visit (classdiagrams._ast.ASTClassDiagramsNode node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (classdiagrams._ast.ASTClassDiagramsNode node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (classdiagrams._ast.ASTClassDiagramsNode node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  // no traverse() for abstract classes, interfaces and enums, only concrete classes are traversed
  getRealThis().endVisit(node);

}

}