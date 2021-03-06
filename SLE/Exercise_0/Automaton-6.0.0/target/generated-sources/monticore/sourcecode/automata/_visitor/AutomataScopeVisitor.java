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

 public  interface AutomataScopeVisitor extends AutomataSymbolVisitor,de.monticore.mcbasics._visitor.MCBasicsScopeVisitor {



  default /* generated by template core.Method*/
 public  AutomataScopeVisitor getRealThis ()  {
      return this;
}

  default /* generated by template core.Method*/
 public  void setRealThis (AutomataScopeVisitor realThis)  {
          throw new UnsupportedOperationException("0xA7011x709 The setter for realThis is not implemented. You might want to implement a wrapper class to allow setting/getting realThis.");

}

  default /* generated by template core.Method*/
 public  void visit (de.monticore.symboltable.IScope node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (de.monticore.symboltable.IScope node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void visit (de.monticore.symboltable.ISymbol node)  {
      AutomataSymbolVisitor.super.handle(node);
}

  default /* generated by template core.Method*/
 public  void endVisit (de.monticore.symboltable.ISymbol node)  {
      AutomataSymbolVisitor.super.handle(node);
}

  default /* generated by template core.Method*/
 public  void handle (de.monticore.symboltable.ISymbol node)  {
      AutomataSymbolVisitor.super.handle(node);
}

  default /* generated by template core.Method*/
 public  void visit (automata._symboltable.AutomataScope node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (automata._symboltable.AutomataScope node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (automata._symboltable.AutomataScope node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (automata._symboltable.AutomataScope node)  {
      /* generated by template _visitor.scope.Traverse*/

  // traverse symbols within the scope

  // traverse sub-scopes
  for (automata._symboltable.IAutomataScope s : node.getSubScopes()) {
    s.accept(getRealThis());
  }
}

  default /* generated by template core.Method*/
 public  void visit (automata._symboltable.AutomataArtifactScope node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void endVisit (automata._symboltable.AutomataArtifactScope node)  {
      /* generated by template core.EmptyBody*/
// empty body

}

  default /* generated by template core.Method*/
 public  void handle (automata._symboltable.AutomataArtifactScope node)  {
      /* generated by template _visitor.Handle*/

  getRealThis().visit(node);
  getRealThis().traverse(node);
  getRealThis().endVisit(node);

}

  default /* generated by template core.Method*/
 public  void traverse (automata._symboltable.AutomataArtifactScope node)  {
      /* generated by template _visitor.scope.Traverse*/

  // traverse symbols within the scope

  // traverse sub-scopes
  for (automata._symboltable.IAutomataScope s : node.getSubScopes()) {
    s.accept(getRealThis());
  }
}

}
