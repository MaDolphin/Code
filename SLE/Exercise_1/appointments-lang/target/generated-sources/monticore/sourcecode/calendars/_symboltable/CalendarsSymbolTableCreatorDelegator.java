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


 public  class CalendarsSymbolTableCreatorDelegator extends calendars._visitor.CalendarsDelegatorVisitor  {

    /* generated by template core.Attribute*/
 protected  Deque<calendars._symboltable.ICalendarsScope> scopeStack = new java.util.ArrayDeque<>();

    /* generated by template core.Attribute*/
 protected  final  CalendarsSymbolTableCreator symbolTable ;

    /* generated by template core.Attribute*/
 protected  calendars._symboltable.ICalendarsGlobalScope globalScope ;


    /* generated by template core.Constructor*/
 public  CalendarsSymbolTableCreatorDelegator(calendars._symboltable.ICalendarsGlobalScope globalScope)  {
    /* generated by template _symboltable.symboltablecreatordelegator.Constructor*/

  this.scopeStack.push(globalScope);
  this.globalScope = globalScope;
  MCLiteralsBasisSTCForCalendars mCLiteralsBasisSymbolTableCreator = new MCLiteralsBasisSTCForCalendars(scopeStack);
  setMCLiteralsBasisVisitor(mCLiteralsBasisSymbolTableCreator);

  MCCommonLiteralsSTCForCalendars mCCommonLiteralsSymbolTableCreator = new MCCommonLiteralsSTCForCalendars(scopeStack);
  setMCCommonLiteralsVisitor(mCCommonLiteralsSymbolTableCreator);

  symbolTable = new CalendarsSymbolTableCreator(scopeStack);
  setCalendarsVisitor(symbolTable);
}


    /* generated by template core.Method*/
 public  calendars._symboltable.CalendarsArtifactScope createFromAST (calendars._ast.ASTCalendars rootNode)  {
      /* generated by template _symboltable.symboltablecreatordelegator.CreateFromAST*/

  calendars._symboltable.CalendarsArtifactScope as =  symbolTable.createFromAST(rootNode);
  if (as.isPresentName()){
    if (!as.getPackageName().isEmpty()){
      globalScope.cache(as.getPackageName() + "." + as.getName());
    } else {
      globalScope.cache(as.getName());
    }
  }
  return as;
}

}
