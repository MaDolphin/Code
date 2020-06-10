/* generated from model Calendars */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package calendars._symboltable;

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


 public  class CalendarsSymbolTableCreatorDelegatorBuilder  {

    /* generated by template core.Attribute*/
 protected  CalendarsSymbolTableCreatorDelegatorBuilder realBuilder ;

    /* generated by template core.Attribute*/
 protected  Deque<calendars._symboltable.ICalendarsScope> scopeStack ;

    /* generated by template core.Attribute*/
 protected  calendars._symboltable.ICalendarsGlobalScope globalScope ;


    /* generated by template core.Constructor*/
 protected  CalendarsSymbolTableCreatorDelegatorBuilder()  {
    this.realBuilder = (CalendarsSymbolTableCreatorDelegatorBuilder) this;
}


    /* generated by template core.Method*/
 public  CalendarsSymbolTableCreatorDelegator build ()  {
      /* generated by template _symboltable.symboltablecreatordelegator.Build*/

  CalendarsSymbolTableCreatorDelegator obj = new CalendarsSymbolTableCreatorDelegator(globalScope);
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
 public  Deque<calendars._symboltable.ICalendarsScope> getScopeStack ()  {
      /* generated by template methods.Get*/

return this.scopeStack;

}

    /* generated by template core.Method*/
 public  calendars._symboltable.ICalendarsGlobalScope getGlobalScope ()  {
      /* generated by template methods.Get*/

return this.globalScope;

}

    /* generated by template core.Method*/
 public  CalendarsSymbolTableCreatorDelegatorBuilder setScopeStack (Deque<calendars._symboltable.ICalendarsScope> scopeStack)  {
      /* generated by template _ast.builder.Set*/

    this.scopeStack = scopeStack;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  CalendarsSymbolTableCreatorDelegatorBuilder setGlobalScope (calendars._symboltable.ICalendarsGlobalScope globalScope)  {
      /* generated by template _ast.builder.Set*/

    this.globalScope = globalScope;
    return this.realBuilder;

}

}
