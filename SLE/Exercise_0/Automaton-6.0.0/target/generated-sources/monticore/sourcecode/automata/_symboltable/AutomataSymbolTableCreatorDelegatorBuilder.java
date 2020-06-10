/* generated from model Automata */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package automata._symboltable;

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


 public  class AutomataSymbolTableCreatorDelegatorBuilder  {

    /* generated by template core.Attribute*/
 protected  AutomataSymbolTableCreatorDelegatorBuilder realBuilder ;

    /* generated by template core.Attribute*/
 protected  Deque<automata._symboltable.IAutomataScope> scopeStack ;

    /* generated by template core.Attribute*/
 protected  automata._symboltable.IAutomataGlobalScope globalScope ;


    /* generated by template core.Constructor*/
 protected  AutomataSymbolTableCreatorDelegatorBuilder()  {
    this.realBuilder = (AutomataSymbolTableCreatorDelegatorBuilder) this;
}


    /* generated by template core.Method*/
 public  AutomataSymbolTableCreatorDelegator build ()  {
      /* generated by template _symboltable.symboltablecreatordelegator.Build*/

  AutomataSymbolTableCreatorDelegator obj = new AutomataSymbolTableCreatorDelegator(globalScope);
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
 public  Deque<automata._symboltable.IAutomataScope> getScopeStack ()  {
      /* generated by template methods.Get*/

return this.scopeStack;

}

    /* generated by template core.Method*/
 public  automata._symboltable.IAutomataGlobalScope getGlobalScope ()  {
      /* generated by template methods.Get*/

return this.globalScope;

}

    /* generated by template core.Method*/
 public  AutomataSymbolTableCreatorDelegatorBuilder setScopeStack (Deque<automata._symboltable.IAutomataScope> scopeStack)  {
      /* generated by template _ast.builder.Set*/

    this.scopeStack = scopeStack;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataSymbolTableCreatorDelegatorBuilder setGlobalScope (automata._symboltable.IAutomataGlobalScope globalScope)  {
      /* generated by template _ast.builder.Set*/

    this.globalScope = globalScope;
    return this.realBuilder;

}

}