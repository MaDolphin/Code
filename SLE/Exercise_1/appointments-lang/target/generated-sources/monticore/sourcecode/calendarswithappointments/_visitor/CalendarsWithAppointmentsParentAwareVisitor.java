/* generated from model CalendarsWithAppointments */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package calendarswithappointments._visitor;

/* generated by template core.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.monticore.ast.ASTNode;
import de.monticore.ast.Comment;
import de.se_rwth.commons.SourcePosition;
import de.monticore.symboltable.*;
import de.monticore.ast.ASTCNode;

/* generated by template core.Annotations*/
// empty template

 abstract  public  class CalendarsWithAppointmentsParentAwareVisitor  implements calendarswithappointments._visitor.CalendarsWithAppointmentsVisitor {

    /* generated by template core.Attribute*/
 final  java.util.Stack<calendarswithappointments._ast.ASTCalendarsWithAppointmentsNode> parents = new java.util.Stack<>();;



    /* generated by template core.Method*/
 public  Optional<calendarswithappointments._ast.ASTCalendarsWithAppointmentsNode> getParent ()  {
      /* generated by template _visitor.parentaware.GetParent*/

  if (!parents.isEmpty()) {
    calendarswithappointments._ast.ASTCalendarsWithAppointmentsNode topElement = (calendarswithappointments._ast.ASTCalendarsWithAppointmentsNode) parents.peek();
    return Optional.of(topElement);
  }
  // no parent, return an absent value
  return Optional.empty();
}

    /* generated by template core.Method*/
 public  List<calendarswithappointments._ast.ASTCalendarsWithAppointmentsNode> getParents ()  {
      return new java.util.ArrayList<>(parents);
}

    /* generated by template core.Method*/
 public  void traverse (calendarswithappointments._ast.ASTCalendarsWithAppointments node)  {
      /* generated by template _visitor.parentaware.Travers*/

  parents.push(node);
  CalendarsWithAppointmentsVisitor.super.traverse(node);
  parents.pop();

}

    /* generated by template core.Method*/
 public  void traverse (calendarswithappointments._ast.ASTI node)  {
      /* generated by template _visitor.parentaware.Travers*/

  parents.push(node);
  CalendarsWithAppointmentsVisitor.super.traverse(node);
  parents.pop();

}

}