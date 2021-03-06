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


 public  class TravelCostsSymbolTableCreatorDelegatorBuilder  {

    /* generated by template core.Attribute*/
 protected  TravelCostsSymbolTableCreatorDelegatorBuilder realBuilder ;

    /* generated by template core.Attribute*/
 protected  Deque<travelcosts._symboltable.ITravelCostsScope> scopeStack ;

    /* generated by template core.Attribute*/
 protected  travelcosts._symboltable.ITravelCostsGlobalScope globalScope ;


    /* generated by template core.Constructor*/
 protected  TravelCostsSymbolTableCreatorDelegatorBuilder()  {
    this.realBuilder = (TravelCostsSymbolTableCreatorDelegatorBuilder) this;
}


    /* generated by template core.Method*/
 public  TravelCostsSymbolTableCreatorDelegator build ()  {
      /* generated by template _symboltable.symboltablecreatordelegator.Build*/

  TravelCostsSymbolTableCreatorDelegator obj = new TravelCostsSymbolTableCreatorDelegator(globalScope);
  obj.scopeStack = this.scopeStack;
  return obj;
}

    /* generated by template core.Method*/
 public  boolean isValid ()  {
      /* generated by template _ast.builder.IsValidMethod*/

        if (scopeStack == null) {
            return false;
        }
        if (globalScope == null) {
            return false;
        }
        return true;

}

    /* generated by template core.Method*/
 public  Deque<travelcosts._symboltable.ITravelCostsScope> getScopeStack ()  {
      /* generated by template methods.Get*/

return this.scopeStack;

}

    /* generated by template core.Method*/
 public  travelcosts._symboltable.ITravelCostsGlobalScope getGlobalScope ()  {
      /* generated by template methods.Get*/

return this.globalScope;

}

    /* generated by template core.Method*/
 public  TravelCostsSymbolTableCreatorDelegatorBuilder setScopeStack (Deque<travelcosts._symboltable.ITravelCostsScope> scopeStack)  {
      /* generated by template _ast.builder.Set*/

    this.scopeStack = scopeStack;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  TravelCostsSymbolTableCreatorDelegatorBuilder setGlobalScope (travelcosts._symboltable.ITravelCostsGlobalScope globalScope)  {
      /* generated by template _ast.builder.Set*/

    this.globalScope = globalScope;
    return this.realBuilder;

}

}
