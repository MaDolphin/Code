/* generated from model AppointmentsFlexibilized */
/* generated by template core.Interface*/

/* (c) https://github.com/MontiCore/monticore */
package appointmentsflexibilized._visitor;

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

 public  interface AppointmentsFlexibilizedVisitor extends de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsVisitor {



  default /* generated by template core.Method*/
 public  appointmentsflexibilized._visitor.AppointmentsFlexibilizedVisitor getRealThis ()  {
      return this;
}

  default /* generated by template core.Method*/
 public  void setRealThis (appointmentsflexibilized._visitor.AppointmentsFlexibilizedVisitor realThis)  {
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
 public  void visit (appointmentsflexibilized._ast.ASTAppointment node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (appointmentsflexibilized._ast.ASTAppointment node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (appointmentsflexibilized._ast.ASTAppointment node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (appointmentsflexibilized._ast.ASTAppointment node)  {
      /* generated by template _visitor.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.


    {
      Iterator<appointmentsflexibilized._ast.ASTI> iter_is = node.getIList().iterator();
      while (iter_is.hasNext()) {
        iter_is.next().accept(getRealThis());
      }
    }

}

  default /* generated by template core.Method*/
 public  void visit (appointmentsflexibilized._ast.ASTStart node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (appointmentsflexibilized._ast.ASTStart node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (appointmentsflexibilized._ast.ASTStart node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (appointmentsflexibilized._ast.ASTStart node)  {
      /* generated by template _visitor.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.


      if (node.isPresentDate()) {
        node.getDate().accept(getRealThis());
      }
      if (null != node.getTime()) {
        node.getTime().accept(getRealThis());
      }

}

  default /* generated by template core.Method*/
 public  void visit (appointmentsflexibilized._ast.ASTEnd node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (appointmentsflexibilized._ast.ASTEnd node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (appointmentsflexibilized._ast.ASTEnd node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (appointmentsflexibilized._ast.ASTEnd node)  {
      /* generated by template _visitor.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.


      if (node.isPresentDate()) {
        node.getDate().accept(getRealThis());
      }
      if (null != node.getTime()) {
        node.getTime().accept(getRealThis());
      }

}

  default /* generated by template core.Method*/
 public  void visit (appointmentsflexibilized._ast.ASTDate node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (appointmentsflexibilized._ast.ASTDate node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (appointmentsflexibilized._ast.ASTDate node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (appointmentsflexibilized._ast.ASTDate node)  {
      /* generated by template _visitor.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.



}

  default /* generated by template core.Method*/
 public  void visit (appointmentsflexibilized._ast.ASTTime node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (appointmentsflexibilized._ast.ASTTime node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (appointmentsflexibilized._ast.ASTTime node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (appointmentsflexibilized._ast.ASTTime node)  {
      /* generated by template _visitor.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.



}

  default /* generated by template core.Method*/
 public  void visit (appointmentsflexibilized._ast.ASTBreak node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (appointmentsflexibilized._ast.ASTBreak node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (appointmentsflexibilized._ast.ASTBreak node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (appointmentsflexibilized._ast.ASTBreak node)  {
      /* generated by template _visitor.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.


      if (null != node.getStart()) {
        node.getStart().accept(getRealThis());
      }
      if (null != node.getEnd()) {
        node.getEnd().accept(getRealThis());
      }

}

  default /* generated by template core.Method*/
 public  void visit (appointmentsflexibilized._ast.ASTParticipants node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (appointmentsflexibilized._ast.ASTParticipants node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (appointmentsflexibilized._ast.ASTParticipants node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (appointmentsflexibilized._ast.ASTParticipants node)  {
      /* generated by template _visitor.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.



}

  default /* generated by template core.Method*/
 public  void visit (appointmentsflexibilized._ast.ASTFrequency node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (appointmentsflexibilized._ast.ASTFrequency node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (appointmentsflexibilized._ast.ASTFrequency node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (appointmentsflexibilized._ast.ASTFrequency node)  {
      /* generated by template _visitor.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.



}

  default /* generated by template core.Method*/
 public  void visit (appointmentsflexibilized._ast.ASTI node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (appointmentsflexibilized._ast.ASTI node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (appointmentsflexibilized._ast.ASTI node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  // no traverse() for abstract classes, interfaces and enums, only concrete classes are traversed
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void visit (appointmentsflexibilized._ast.ASTAppointmentsFlexibilizedNode node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (appointmentsflexibilized._ast.ASTAppointmentsFlexibilizedNode node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (appointmentsflexibilized._ast.ASTAppointmentsFlexibilizedNode node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  // no traverse() for abstract classes, interfaces and enums, only concrete classes are traversed
  getRealThis().endVisit(node);

}

}
