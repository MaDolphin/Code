/* generated from model Appointments */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package appointments._symboltable;

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


 public  class MCLiteralsBasisSTCForAppointments extends de.monticore.literals.mcliteralsbasis._symboltable.MCLiteralsBasisSymbolTableCreator  {


    /* generated by template core.Constructor*/
 public  MCLiteralsBasisSTCForAppointments(Deque<? extends de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope> scopeStack)  {
    super(scopeStack);
}


    /* generated by template core.Method*/
 public  appointments._symboltable.IAppointmentsScope createScope (boolean shadowing)  {
      /* generated by template _symboltable.symboltablecreator.CreateScope*/

  appointments._symboltable.IAppointmentsScope scope = appointments._symboltable.AppointmentsSymTabMill.appointmentsScopeBuilder().build();
  scope.setShadowing(shadowing);
  return scope;
}

}
