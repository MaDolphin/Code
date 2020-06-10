/* generated from model Appointments */
/* generated by template core.Interface*/

/* (c) https://github.com/MontiCore/monticore */
package appointments._visitor;

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

 public  interface AppointmentsVisitor extends de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsVisitor {



  default /* generated by template core.Method*/
 public  appointments._visitor.AppointmentsVisitor getRealThis ()  {
      return this;
}

  default /* generated by template core.Method*/
 public  void setRealThis (appointments._visitor.AppointmentsVisitor realThis)  {
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
 public  void visit (appointments._ast.ASTAppointment node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (appointments._ast.ASTAppointment node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (appointments._ast.ASTAppointment node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (appointments._ast.ASTAppointment node)  {
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
    {
      Iterator<appointments._ast.ASTBreak> iter_breaks = node.getBreakList().iterator();
      while (iter_breaks.hasNext()) {
        iter_breaks.next().accept(getRealThis());
      }
    }

}

  default /* generated by template core.Method*/
 public  void visit (appointments._ast.ASTStart node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (appointments._ast.ASTStart node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (appointments._ast.ASTStart node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (appointments._ast.ASTStart node)  {
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
 public  void visit (appointments._ast.ASTEnd node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (appointments._ast.ASTEnd node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (appointments._ast.ASTEnd node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (appointments._ast.ASTEnd node)  {
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
 public  void visit (appointments._ast.ASTDate node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (appointments._ast.ASTDate node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (appointments._ast.ASTDate node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (appointments._ast.ASTDate node)  {
      /* generated by template _visitor.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.



}

  default /* generated by template core.Method*/
 public  void visit (appointments._ast.ASTTime node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (appointments._ast.ASTTime node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (appointments._ast.ASTTime node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (appointments._ast.ASTTime node)  {
      /* generated by template _visitor.Traverse*/
// One might think that we could call traverse(subelement) immediately,
// but this is not true for interface-types where we do not know the
// concrete type of the element.
// Instead we double-dispatch the call, to call the correctly typed
// traverse(...) method with the elements concrete type.



}

  default /* generated by template core.Method*/
 public  void visit (appointments._ast.ASTBreak node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (appointments._ast.ASTBreak node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (appointments._ast.ASTBreak node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (appointments._ast.ASTBreak node)  {
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
 public  void visit (appointments._ast.ASTAppointmentsNode node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (appointments._ast.ASTAppointmentsNode node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (appointments._ast.ASTAppointmentsNode node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  // no traverse() for abstract classes, interfaces and enums, only concrete classes are traversed
  getRealThis().endVisit(node);

}

}
