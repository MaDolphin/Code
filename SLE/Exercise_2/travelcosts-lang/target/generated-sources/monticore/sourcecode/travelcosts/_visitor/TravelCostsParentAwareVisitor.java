/* generated from model TravelCosts */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package travelcosts._visitor;

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

 abstract  public  class TravelCostsParentAwareVisitor  implements travelcosts._visitor.TravelCostsVisitor {

    /* generated by template core.Attribute*/
 final  java.util.Stack<travelcosts._ast.ASTTravelCostsNode> parents = new java.util.Stack<>();;



    /* generated by template core.Method*/
 public  Optional<travelcosts._ast.ASTTravelCostsNode> getParent ()  {
      /* generated by template _visitor.parentaware.GetParent*/

  if (!parents.isEmpty()) {
    travelcosts._ast.ASTTravelCostsNode topElement = (travelcosts._ast.ASTTravelCostsNode) parents.peek();
    return Optional.of(topElement);
  }
  // no parent, return an absent value
  return Optional.empty();
}

    /* generated by template core.Method*/
 public  List<travelcosts._ast.ASTTravelCostsNode> getParents ()  {
      return new java.util.ArrayList<>(parents);
}

    /* generated by template core.Method*/
 public  void traverse (travelcosts._ast.ASTTravelExpenseReport node)  {
      /* generated by template _visitor.parentaware.Travers*/

  parents.push(node);
  TravelCostsVisitor.super.traverse(node);
  parents.pop();

}

    /* generated by template core.Method*/
 public  void traverse (travelcosts._ast.ASTTravelNumber node)  {
      /* generated by template _visitor.parentaware.Travers*/

  parents.push(node);
  TravelCostsVisitor.super.traverse(node);
  parents.pop();

}

    /* generated by template core.Method*/
 public  void traverse (travelcosts._ast.ASTArrival node)  {
      /* generated by template _visitor.parentaware.Travers*/

  parents.push(node);
  TravelCostsVisitor.super.traverse(node);
  parents.pop();

}

    /* generated by template core.Method*/
 public  void traverse (travelcosts._ast.ASTWorkDay node)  {
      /* generated by template _visitor.parentaware.Travers*/

  parents.push(node);
  TravelCostsVisitor.super.traverse(node);
  parents.pop();

}

    /* generated by template core.Method*/
 public  void traverse (travelcosts._ast.ASTAllWorkDays node)  {
      /* generated by template _visitor.parentaware.Travers*/

  parents.push(node);
  TravelCostsVisitor.super.traverse(node);
  parents.pop();

}

    /* generated by template core.Method*/
 public  void traverse (travelcosts._ast.ASTDeparture node)  {
      /* generated by template _visitor.parentaware.Travers*/

  parents.push(node);
  TravelCostsVisitor.super.traverse(node);
  parents.pop();

}

    /* generated by template core.Method*/
 public  void traverse (travelcosts._ast.ASTCostItems node)  {
      /* generated by template _visitor.parentaware.Travers*/

  parents.push(node);
  TravelCostsVisitor.super.traverse(node);
  parents.pop();

}

    /* generated by template core.Method*/
 public  void traverse (travelcosts._ast.ASTCostItem node)  {
      /* generated by template _visitor.parentaware.Travers*/

  parents.push(node);
  TravelCostsVisitor.super.traverse(node);
  parents.pop();

}

    /* generated by template core.Method*/
 public  void traverse (travelcosts._ast.ASTHotelCost node)  {
      /* generated by template _visitor.parentaware.Travers*/

  parents.push(node);
  TravelCostsVisitor.super.traverse(node);
  parents.pop();

}

    /* generated by template core.Method*/
 public  void traverse (travelcosts._ast.ASTTransportCost node)  {
      /* generated by template _visitor.parentaware.Travers*/

  parents.push(node);
  TravelCostsVisitor.super.traverse(node);
  parents.pop();

}

    /* generated by template core.Method*/
 public  void traverse (travelcosts._ast.ASTExtraCost node)  {
      /* generated by template _visitor.parentaware.Travers*/

  parents.push(node);
  TravelCostsVisitor.super.traverse(node);
  parents.pop();

}

    /* generated by template core.Method*/
 public  void traverse (travelcosts._ast.ASTDescription node)  {
      /* generated by template _visitor.parentaware.Travers*/

  parents.push(node);
  TravelCostsVisitor.super.traverse(node);
  parents.pop();

}

    /* generated by template core.Method*/
 public  void traverse (travelcosts._ast.ASTISODate node)  {
      /* generated by template _visitor.parentaware.Travers*/

  parents.push(node);
  TravelCostsVisitor.super.traverse(node);
  parents.pop();

}

    /* generated by template core.Method*/
 public  void traverse (travelcosts._ast.ASTTime node)  {
      /* generated by template _visitor.parentaware.Travers*/

  parents.push(node);
  TravelCostsVisitor.super.traverse(node);
  parents.pop();

}

    /* generated by template core.Method*/
 public  void traverse (travelcosts._ast.ASTDuration node)  {
      /* generated by template _visitor.parentaware.Travers*/

  parents.push(node);
  TravelCostsVisitor.super.traverse(node);
  parents.pop();

}

}
