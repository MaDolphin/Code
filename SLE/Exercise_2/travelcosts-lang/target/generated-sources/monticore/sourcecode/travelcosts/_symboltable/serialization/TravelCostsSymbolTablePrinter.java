/* generated from model TravelCosts */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package travelcosts._symboltable.serialization;

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

 public  class TravelCostsSymbolTablePrinter  implements travelcosts._visitor.TravelCostsSymbolVisitor,travelcosts._visitor.TravelCostsScopeVisitor {

    /* generated by template core.Attribute*/
 protected  de.monticore.symboltable.serialization.JsonPrinter printer = new de.monticore.symboltable.serialization.JsonPrinter();



    /* generated by template core.Method*/
 public  TravelCostsSymbolTablePrinter getRealThis ()  {
      return this;
}

    /* generated by template core.Method*/
 public  String getSerializedString ()  {
      return this.printer.getContent();
}

    /* generated by template core.Method*/
 protected  List<travelcosts._symboltable.ITravelCostsScope> filterRelevantSubScopes (List<? extends travelcosts._symboltable.ITravelCostsScope> subScopes)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.FilterRelevantSubScopes*/

  List<travelcosts._symboltable.ITravelCostsScope> result = new ArrayList<>();
  for (travelcosts._symboltable.ITravelCostsScope scope : subScopes) {
    if(hasSymbolsInSubScopes(scope)) {
      result.add(scope);
    }
  }
  return result;
}

    /* generated by template core.Method*/
 protected  boolean hasSymbolsInSubScopes (travelcosts._symboltable.ITravelCostsScope scope)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.HasSymbolsInSubScopes*/

  boolean hasSymbolsInSubScopes = false;
  for (travelcosts._symboltable.ITravelCostsScope subScope : scope.getSubScopes()) {
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
 protected  void serializeRelevantSubScopes (travelcosts._symboltable.ITravelCostsScope node)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.SerializeRelevantSubScopes*/

  List<travelcosts._symboltable.ITravelCostsScope> subScopes = filterRelevantSubScopes(node.getSubScopes());
  if (!subScopes.isEmpty()) {
    printer.beginArray(de.monticore.symboltable.serialization.JsonConstants.SUBSCOPES);
    subScopes.stream().forEach(s -> s.accept(getRealThis()));
    printer.endArray();
  }
}

    /* generated by template core.Method*/
 protected  void serializeLocalSymbols (travelcosts._symboltable.ITravelCostsScope node)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.SerializeLocalSymbols*/


}

    /* generated by template core.Method*/
 public  void visit (travelcosts._symboltable.TravelCostsScope node)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.VisitScope*/

  printer.beginObject();
  printer.member(de.monticore.symboltable.serialization.JsonConstants.KIND, "travelcosts._symboltable.TravelCostsScope");
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
 public  void endVisit (travelcosts._symboltable.TravelCostsScope node)  {
      printer.endObject();
}

    /* generated by template core.Method*/
 public  void traverse (travelcosts._symboltable.TravelCostsScope node)  {
      serializeRelevantSubScopes(node);
}

    /* generated by template core.Method*/
 protected  void serializeAdditionalScopeAttributes (travelcosts._symboltable.TravelCostsScope node)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.SerializeSymbol*/


}

}
