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


 public  class TravelCostsSymbolTableCreatorBuilder  {

    /* generated by template core.Attribute*/
 protected  Deque<travelcosts._symboltable.ITravelCostsScope> scopeStack = new java.util.ArrayDeque<>();


    /* generated by template core.Constructor*/
 protected  TravelCostsSymbolTableCreatorBuilder()  {
    /* generated by template core.EmptyBody*/
// empty body

}


    /* generated by template core.Method*/
 public  TravelCostsSymbolTableCreator build ()  {
      return new TravelCostsSymbolTableCreator(scopeStack);
}

    /* generated by template core.Method*/
 public  TravelCostsSymbolTableCreatorBuilder setScopeStack (Deque<travelcosts._symboltable.ITravelCostsScope> scopeStack)  {
      this.scopeStack = scopeStack;
return this;
}

    /* generated by template core.Method*/
 public  TravelCostsSymbolTableCreatorBuilder addToScopeStack (travelcosts._symboltable.ITravelCostsScope scope)  {
      this.scopeStack.add(scope);
return this;
}

    /* generated by template core.Method*/
 public  TravelCostsSymbolTableCreatorBuilder removeFromScopeStack (travelcosts._symboltable.ITravelCostsScope scope)  {
      this.scopeStack.remove(scope);
return this;
}

    /* generated by template core.Method*/
 public  Deque<travelcosts._symboltable.ITravelCostsScope> getScopeStack ()  {
      return this.scopeStack;
}

}