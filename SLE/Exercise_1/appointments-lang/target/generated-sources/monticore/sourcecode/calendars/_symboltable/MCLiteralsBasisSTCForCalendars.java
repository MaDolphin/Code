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


 public  class MCLiteralsBasisSTCForCalendars extends de.monticore.literals.mcliteralsbasis._symboltable.MCLiteralsBasisSymbolTableCreator  {


    /* generated by template core.Constructor*/
 public  MCLiteralsBasisSTCForCalendars(Deque<? extends de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope> scopeStack)  {
    super(scopeStack);
}


    /* generated by template core.Method*/
 public  calendars._symboltable.ICalendarsScope createScope (boolean shadowing)  {
      /* generated by template _symboltable.symboltablecreator.CreateScope*/

  calendars._symboltable.ICalendarsScope scope = calendars._symboltable.CalendarsSymTabMill.calendarsScopeBuilder().build();
  scope.setShadowing(shadowing);
  return scope;
}

}
