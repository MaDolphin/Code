/* generated from model GuitarTab */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package guitartab._symboltable.serialization;

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

 public  class GuitarTabSymbolTablePrinter  implements guitartab._visitor.GuitarTabSymbolVisitor,guitartab._visitor.GuitarTabScopeVisitor {

    /* generated by template core.Attribute*/
 protected  de.monticore.symboltable.serialization.JsonPrinter printer = new de.monticore.symboltable.serialization.JsonPrinter();



    /* generated by template core.Method*/
 public  GuitarTabSymbolTablePrinter getRealThis ()  {
      return this;
}

    /* generated by template core.Method*/
 public  String getSerializedString ()  {
      return this.printer.getContent();
}

    /* generated by template core.Method*/
 protected  List<guitartab._symboltable.IGuitarTabScope> filterRelevantSubScopes (List<? extends guitartab._symboltable.IGuitarTabScope> subScopes)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.FilterRelevantSubScopes*/

  List<guitartab._symboltable.IGuitarTabScope> result = new ArrayList<>();
  for (guitartab._symboltable.IGuitarTabScope scope : subScopes) {
    if(hasSymbolsInSubScopes(scope)) {
      result.add(scope);
    }
  }
  return result;
}

    /* generated by template core.Method*/
 protected  boolean hasSymbolsInSubScopes (guitartab._symboltable.IGuitarTabScope scope)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.HasSymbolsInSubScopes*/

  boolean hasSymbolsInSubScopes = false;
  for (guitartab._symboltable.IGuitarTabScope subScope : scope.getSubScopes()) {
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
 protected  void serializeRelevantSubScopes (guitartab._symboltable.IGuitarTabScope node)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.SerializeRelevantSubScopes*/

  List<guitartab._symboltable.IGuitarTabScope> subScopes = filterRelevantSubScopes(node.getSubScopes());
  if (!subScopes.isEmpty()) {
    printer.beginArray(de.monticore.symboltable.serialization.JsonConstants.SUBSCOPES);
    subScopes.stream().forEach(s -> s.accept(getRealThis()));
    printer.endArray();
  }
}

    /* generated by template core.Method*/
 protected  void serializeLocalSymbols (guitartab._symboltable.IGuitarTabScope node)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.SerializeLocalSymbols*/


}

    /* generated by template core.Method*/
 public  void visit (guitartab._symboltable.GuitarTabScope node)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.VisitScope*/

  printer.beginObject();
  printer.member(de.monticore.symboltable.serialization.JsonConstants.KIND, "guitartab._symboltable.GuitarTabScope");
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
 public  void endVisit (guitartab._symboltable.GuitarTabScope node)  {
      printer.endObject();
}

    /* generated by template core.Method*/
 public  void traverse (guitartab._symboltable.GuitarTabScope node)  {
      serializeRelevantSubScopes(node);
}

    /* generated by template core.Method*/
 protected  void serializeAdditionalScopeAttributes (guitartab._symboltable.GuitarTabScope node)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.SerializeSymbol*/


}

}
