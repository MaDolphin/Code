/* generated from model TravelCosts */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package travelcosts._symboltable;

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


 public  class TravelCostsSymbolTableCreator  implements travelcosts._visitor.TravelCostsVisitor {

    /* generated by template core.Attribute*/
 protected  Deque<travelcosts._symboltable.ITravelCostsScope> scopeStack = new java.util.ArrayDeque<>();

    /* generated by template core.Attribute*/
 private  travelcosts._visitor.TravelCostsVisitor realThis = this;

    /* generated by template core.Attribute*/
 protected  travelcosts._symboltable.ITravelCostsScope firstCreatedScope ;


    /* generated by template core.Constructor*/
 public  TravelCostsSymbolTableCreator(travelcosts._symboltable.ITravelCostsScope enclosingScope)  {
    putOnStack(Log.errorIfNull(enclosingScope));
}

    /* generated by template core.Constructor*/
 public  TravelCostsSymbolTableCreator(Deque<? extends travelcosts._symboltable.ITravelCostsScope> scopeStack)  {
    this.scopeStack = Log.errorIfNull((Deque<travelcosts._symboltable.ITravelCostsScope>)scopeStack);
}


    /* generated by template core.Method*/
 public  travelcosts._visitor.TravelCostsVisitor getRealThis ()  {
      /* generated by template methods.Get*/

return this.realThis;

}

    /* generated by template core.Method*/
 public  void setRealThis (travelcosts._visitor.TravelCostsVisitor realThis)  {
      /* generated by template methods.Set*/

this.realThis = realThis;

}

    /* generated by template core.Method*/
 public  travelcosts._symboltable.ITravelCostsScope getFirstCreatedScope ()  {
      /* generated by template methods.Get*/

return this.firstCreatedScope;

}

    /* generated by template core.Method*/
 public  travelcosts._symboltable.TravelCostsArtifactScope createFromAST (travelcosts._ast.ASTTravelExpenseReport rootNode)  {
      /* generated by template _symboltable.symboltablecreator.CreateFromAST*/

  Log.errorIfNull(rootNode, "0xA7004x869 Error by creating of the TravelCostsSymbolTableCreator symbol table: top ast node is null");
  travelcosts._symboltable.TravelCostsArtifactScope artifactScope = new travelcosts._symboltable.TravelCostsArtifactScope(Optional.empty(), "", new ArrayList<>());
  putOnStack(artifactScope);
  rootNode.accept(getRealThis());
  return artifactScope;
}

    /* generated by template core.Method*/
 public  void putOnStack (travelcosts._symboltable.ITravelCostsScope scope)  {
      /* generated by template _symboltable.symboltablecreator.PutOnStack*/
  Log.errorIfNull(scope);

if (scope.getEnclosingScope() == null && getCurrentScope().isPresent()) {
    scope.setEnclosingScope(getCurrentScope().get());
    getCurrentScope().get().addSubScope(scope);
} else if (scope.getEnclosingScope() != null && getCurrentScope().isPresent()) {
    if (scope.getEnclosingScope() != getCurrentScope().get()) {
      Log.warn("0xA1043 The enclosing scope is not the same as the current scope on the stack.");
    }
  }

  if (firstCreatedScope == null) {
    firstCreatedScope = scope;
  }

  scopeStack.addLast(scope);
}

    /* generated by template core.Method*/
 public  final  Optional<travelcosts._symboltable.ITravelCostsScope> getCurrentScope ()  {
      return Optional.ofNullable(scopeStack.peekLast());
}

    /* generated by template core.Method*/
 public  final  Optional<travelcosts._symboltable.ITravelCostsScope> removeCurrentScope ()  {
      return Optional.ofNullable(scopeStack.pollLast());
}

    /* generated by template core.Method*/
 protected  void setTravelExpenseReportScopeStack (Deque<travelcosts._symboltable.ITravelCostsScope> scopeStack)  {
      this.scopeStack = scopeStack;
}

    /* generated by template core.Method*/
 public  travelcosts._symboltable.ITravelCostsScope createScope (boolean shadowing)  {
      /* generated by template _symboltable.symboltablecreator.CreateScope*/

  travelcosts._symboltable.ITravelCostsScope scope = travelcosts._symboltable.TravelCostsSymTabMill.travelCostsScopeBuilder().build();
  scope.setShadowing(shadowing);
  return scope;
}

    /* generated by template core.Method*/
 public  void visit (travelcosts._ast.ASTTravelExpenseReport node)  {
      /* generated by template _symboltable.symboltablecreator.VisitNoSymbol*/
  if (getCurrentScope().isPresent()) {
    node.setEnclosingScope(getCurrentScope().get());
  }
  else {
    Log.error("Could not set enclosing scope of ASTNode \"" + node
              + "\", because no scope is set yet!");
  }
}

    /* generated by template core.Method*/
 public  void visit (travelcosts._ast.ASTTravelNumber node)  {
      /* generated by template _symboltable.symboltablecreator.VisitNoSymbol*/
  if (getCurrentScope().isPresent()) {
    node.setEnclosingScope(getCurrentScope().get());
  }
  else {
    Log.error("Could not set enclosing scope of ASTNode \"" + node
              + "\", because no scope is set yet!");
  }
}

    /* generated by template core.Method*/
 public  void visit (travelcosts._ast.ASTArrival node)  {
      /* generated by template _symboltable.symboltablecreator.VisitNoSymbol*/
  if (getCurrentScope().isPresent()) {
    node.setEnclosingScope(getCurrentScope().get());
  }
  else {
    Log.error("Could not set enclosing scope of ASTNode \"" + node
              + "\", because no scope is set yet!");
  }
}

    /* generated by template core.Method*/
 public  void visit (travelcosts._ast.ASTWorkDay node)  {
      /* generated by template _symboltable.symboltablecreator.VisitNoSymbol*/
  if (getCurrentScope().isPresent()) {
    node.setEnclosingScope(getCurrentScope().get());
  }
  else {
    Log.error("Could not set enclosing scope of ASTNode \"" + node
              + "\", because no scope is set yet!");
  }
}

    /* generated by template core.Method*/
 public  void visit (travelcosts._ast.ASTAllWorkDays node)  {
      /* generated by template _symboltable.symboltablecreator.VisitNoSymbol*/
  if (getCurrentScope().isPresent()) {
    node.setEnclosingScope(getCurrentScope().get());
  }
  else {
    Log.error("Could not set enclosing scope of ASTNode \"" + node
              + "\", because no scope is set yet!");
  }
}

    /* generated by template core.Method*/
 public  void visit (travelcosts._ast.ASTDeparture node)  {
      /* generated by template _symboltable.symboltablecreator.VisitNoSymbol*/
  if (getCurrentScope().isPresent()) {
    node.setEnclosingScope(getCurrentScope().get());
  }
  else {
    Log.error("Could not set enclosing scope of ASTNode \"" + node
              + "\", because no scope is set yet!");
  }
}

    /* generated by template core.Method*/
 public  void visit (travelcosts._ast.ASTCostItems node)  {
      /* generated by template _symboltable.symboltablecreator.VisitNoSymbol*/
  if (getCurrentScope().isPresent()) {
    node.setEnclosingScope(getCurrentScope().get());
  }
  else {
    Log.error("Could not set enclosing scope of ASTNode \"" + node
              + "\", because no scope is set yet!");
  }
}

    /* generated by template core.Method*/
 public  void visit (travelcosts._ast.ASTCostItem node)  {
      /* generated by template _symboltable.symboltablecreator.VisitNoSymbol*/
  if (getCurrentScope().isPresent()) {
    node.setEnclosingScope(getCurrentScope().get());
  }
  else {
    Log.error("Could not set enclosing scope of ASTNode \"" + node
              + "\", because no scope is set yet!");
  }
}

    /* generated by template core.Method*/
 public  void visit (travelcosts._ast.ASTHotelCost node)  {
      /* generated by template _symboltable.symboltablecreator.VisitNoSymbol*/
  if (getCurrentScope().isPresent()) {
    node.setEnclosingScope(getCurrentScope().get());
  }
  else {
    Log.error("Could not set enclosing scope of ASTNode \"" + node
              + "\", because no scope is set yet!");
  }
}

    /* generated by template core.Method*/
 public  void visit (travelcosts._ast.ASTTransportCost node)  {
      /* generated by template _symboltable.symboltablecreator.VisitNoSymbol*/
  if (getCurrentScope().isPresent()) {
    node.setEnclosingScope(getCurrentScope().get());
  }
  else {
    Log.error("Could not set enclosing scope of ASTNode \"" + node
              + "\", because no scope is set yet!");
  }
}

    /* generated by template core.Method*/
 public  void visit (travelcosts._ast.ASTExtraCost node)  {
      /* generated by template _symboltable.symboltablecreator.VisitNoSymbol*/
  if (getCurrentScope().isPresent()) {
    node.setEnclosingScope(getCurrentScope().get());
  }
  else {
    Log.error("Could not set enclosing scope of ASTNode \"" + node
              + "\", because no scope is set yet!");
  }
}

    /* generated by template core.Method*/
 public  void visit (travelcosts._ast.ASTDescription node)  {
      /* generated by template _symboltable.symboltablecreator.VisitNoSymbol*/
  if (getCurrentScope().isPresent()) {
    node.setEnclosingScope(getCurrentScope().get());
  }
  else {
    Log.error("Could not set enclosing scope of ASTNode \"" + node
              + "\", because no scope is set yet!");
  }
}

    /* generated by template core.Method*/
 public  void visit (travelcosts._ast.ASTISODate node)  {
      /* generated by template _symboltable.symboltablecreator.VisitNoSymbol*/
  if (getCurrentScope().isPresent()) {
    node.setEnclosingScope(getCurrentScope().get());
  }
  else {
    Log.error("Could not set enclosing scope of ASTNode \"" + node
              + "\", because no scope is set yet!");
  }
}

    /* generated by template core.Method*/
 public  void visit (travelcosts._ast.ASTTime node)  {
      /* generated by template _symboltable.symboltablecreator.VisitNoSymbol*/
  if (getCurrentScope().isPresent()) {
    node.setEnclosingScope(getCurrentScope().get());
  }
  else {
    Log.error("Could not set enclosing scope of ASTNode \"" + node
              + "\", because no scope is set yet!");
  }
}

    /* generated by template core.Method*/
 public  void visit (travelcosts._ast.ASTDuration node)  {
      /* generated by template _symboltable.symboltablecreator.VisitNoSymbol*/
  if (getCurrentScope().isPresent()) {
    node.setEnclosingScope(getCurrentScope().get());
  }
  else {
    Log.error("Could not set enclosing scope of ASTNode \"" + node
              + "\", because no scope is set yet!");
  }
}

}
