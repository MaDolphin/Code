/* generated from model Automata */
/* generated by template core.Interface*/

/* (c) https://github.com/MontiCore/monticore */
package automata._visitor;

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

 public  interface AutomataInheritanceVisitor extends automata._visitor.AutomataVisitor,de.monticore.mcbasics._visitor.MCBasicsInheritanceVisitor {



  default /* generated by template core.Method*/
 public  void handle (automata._ast.ASTAutomaton node)  {
      /* generated by template _visitor.inheritance.Handle*/

  getRealThis().visit((ASTNode) node);
  getRealThis().visit((automata._ast.ASTAutomataNode) node);
  AutomataVisitor.super.handle(node);
  getRealThis().endVisit((automata._ast.ASTAutomataNode) node);
  getRealThis().endVisit((ASTNode) node);
}

  default /* generated by template core.Method*/
 public  void handle (automata._ast.ASTState node)  {
      /* generated by template _visitor.inheritance.Handle*/

  getRealThis().visit((ASTNode) node);
  getRealThis().visit((automata._ast.ASTAutomataNode) node);
  AutomataVisitor.super.handle(node);
  getRealThis().endVisit((automata._ast.ASTAutomataNode) node);
  getRealThis().endVisit((ASTNode) node);
}

  default /* generated by template core.Method*/
 public  void handle (automata._ast.ASTTransition node)  {
      /* generated by template _visitor.inheritance.Handle*/

  getRealThis().visit((ASTNode) node);
  getRealThis().visit((automata._ast.ASTAutomataNode) node);
  AutomataVisitor.super.handle(node);
  getRealThis().endVisit((automata._ast.ASTAutomataNode) node);
  getRealThis().endVisit((ASTNode) node);
}

  default /* generated by template core.Method*/
 public  void handle (automata._ast.ASTAutomataNode node)  {
      /* generated by template _visitor.inheritance.Handle*/

  getRealThis().visit((ASTNode) node);
  getRealThis().visit((automata._ast.ASTAutomataNode) node);
  AutomataVisitor.super.handle(node);
  getRealThis().endVisit((automata._ast.ASTAutomataNode) node);
  getRealThis().endVisit((ASTNode) node);
}

}
