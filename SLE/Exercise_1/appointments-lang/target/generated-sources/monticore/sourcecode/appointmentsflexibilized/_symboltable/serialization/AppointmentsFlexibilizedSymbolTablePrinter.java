/* generated from model AppointmentsFlexibilized */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package appointmentsflexibilized._symboltable.serialization;

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

/* generated by template core.Annotations*/
// empty template

 public  class AppointmentsFlexibilizedSymbolTablePrinter  implements appointmentsflexibilized._visitor.AppointmentsFlexibilizedSymbolVisitor,appointmentsflexibilized._visitor.AppointmentsFlexibilizedScopeVisitor {

    /* generated by template core.Attribute*/
 protected  de.monticore.symboltable.serialization.JsonPrinter printer = new de.monticore.symboltable.serialization.JsonPrinter();



    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedSymbolTablePrinter getRealThis ()  {
      return this;
}

    /* generated by template core.Method*/
 public  String getSerializedString ()  {
      return this.printer.getContent();
}

    /* generated by template core.Method*/
 protected  List<appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope> filterRelevantSubScopes (List<? extends appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope> subScopes)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.FilterRelevantSubScopes*/

  List<appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope> result = new ArrayList<>();
  for (appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope scope : subScopes) {
    if(hasSymbolsInSubScopes(scope)) {
      result.add(scope);
    }
  }
  return result;
}

    /* generated by template core.Method*/
 protected  boolean hasSymbolsInSubScopes (appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope scope)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.HasSymbolsInSubScopes*/

  boolean hasSymbolsInSubScopes = false;
  for (appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope subScope : scope.getSubScopes()) {
    hasSymbolsInSubScopes |= hasSymbolsInSubScopes(subScope);
  if (hasSymbolsInSubScopes) return true;
  }
  return hasSymbolsInSubScopes | scope.getSymbolsSize()>0;
}

    /* generated by template core.Method*/
 protected  void addScopeSpanningSymbol (de.monticore.symboltable.IScopeSpanningSymbol spanningSymbol)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.AddScopeSpanningSymbol*/
  if (null != spanningSymbol) {
    printer.beginObject(de.monticore.symboltable.serialization.JsonConstants.SCOPE_SPANNING_SYMBOL);
    printer.member(de.monticore.symboltable.serialization.JsonConstants.KIND, spanningSymbol.getClass().getName());
    printer.member(de.monticore.symboltable.serialization.JsonConstants.NAME, spanningSymbol.getName());
    printer.endObject();
  }
}

    /* generated by template core.Method*/
 protected  void serializeRelevantSubScopes (appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope node)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.SerializeRelevantSubScopes*/

  List<appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope> subScopes = filterRelevantSubScopes(node.getSubScopes());
  if (!subScopes.isEmpty()) {
    printer.beginArray(de.monticore.symboltable.serialization.JsonConstants.SUBSCOPES);
    subScopes.stream().forEach(s -> s.accept(getRealThis()));
    printer.endArray();
  }
}

    /* generated by template core.Method*/
 protected  void serializeLocalSymbols (appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope node)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.SerializeLocalSymbols*/


}

    /* generated by template core.Method*/
 public  void visit (appointmentsflexibilized._symboltable.AppointmentsFlexibilizedScope node)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.VisitScope*/

  printer.beginObject();
  printer.member(de.monticore.symboltable.serialization.JsonConstants.KIND, "appointmentsflexibilized._symboltable.AppointmentsFlexibilizedScope");
  printer.member(de.monticore.symboltable.serialization.JsonConstants.NAME, node.getName());
  printer.member(de.monticore.symboltable.serialization.JsonConstants.IS_SHADOWING_SCOPE, node.isShadowing());
  printer.member(de.monticore.symboltable.serialization.JsonConstants.EXPORTS_SYMBOLS, node.isExportingSymbols());
  if (node.isPresentSpanningSymbol()) {
    addScopeSpanningSymbol(node.getSpanningSymbol());
  }
  serializeLocalSymbols(node);
  serializeAdditionalScopeAttributes(node);
}

    /* generated by template core.Method*/
 public  void endVisit (appointmentsflexibilized._symboltable.AppointmentsFlexibilizedScope node)  {
      printer.endObject();
}

    /* generated by template core.Method*/
 public  void traverse (appointmentsflexibilized._symboltable.AppointmentsFlexibilizedScope node)  {
      serializeRelevantSubScopes(node);
}

    /* generated by template core.Method*/
 protected  void serializeAdditionalScopeAttributes (appointmentsflexibilized._symboltable.AppointmentsFlexibilizedScope node)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.SerializeSymbol*/


}

    /* generated by template core.Method*/
 public  void visit (appointmentsflexibilized._symboltable.AppointmentsFlexibilizedArtifactScope node)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.VisitArtifactScope*/

  printer.beginObject();
  printer.member(de.monticore.symboltable.serialization.JsonConstants.KIND, "appointmentsflexibilized._symboltable.AppointmentsFlexibilizedArtifactScope");
  printer.member(de.monticore.symboltable.serialization.JsonConstants.NAME, node.getName());
  printer.member(de.monticore.symboltable.serialization.JsonConstants.PACKAGE, node.getPackageName());
  printer.member(de.monticore.symboltable.serialization.JsonConstants.EXPORTS_SYMBOLS, node.isExportingSymbols());
  printer.beginArray(de.monticore.symboltable.serialization.JsonConstants.IMPORTS);
  node.getImportList().forEach(x -> printer.value(x.toString()));
  printer.endArray();
  if (node.isPresentSpanningSymbol()) {
    addScopeSpanningSymbol(node.getSpanningSymbol());
  }
  serializeLocalSymbols(node);
  serializeAdditionalScopeAttributes(node);
}

    /* generated by template core.Method*/
 public  void endVisit (appointmentsflexibilized._symboltable.AppointmentsFlexibilizedArtifactScope node)  {
      printer.endObject();
}

    /* generated by template core.Method*/
 public  void traverse (appointmentsflexibilized._symboltable.AppointmentsFlexibilizedArtifactScope node)  {
      traverse((appointmentsflexibilized._symboltable.AppointmentsFlexibilizedScope) node);
}

}
