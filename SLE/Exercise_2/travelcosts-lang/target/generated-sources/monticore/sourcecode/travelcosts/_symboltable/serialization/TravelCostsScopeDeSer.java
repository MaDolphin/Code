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

 public  class TravelCostsScopeDeSer  implements de.monticore.symboltable.serialization.IDeSer<travelcosts._symboltable.ITravelCostsScope,travelcosts._symboltable.ITravelCostsScope> {



    /* generated by template core.Method*/
 public  void store (travelcosts._symboltable.TravelCostsArtifactScope as,travelcosts._symboltable.TravelCostsLanguage lang,String symbolPath)  {
      store(as, java.nio.file.Paths.get(symbolPath, as.getFilePath(lang).toString()));
}

    /* generated by template core.Method*/
 public  String getSerializedKind ()  {
      return "travelcosts._symboltable.TravelCostsScope";
}

    /* generated by template core.Method*/
 public  String getSerializedASKind ()  {
      return "travelcosts._symboltable.TravelCostsArtifactScope";
}

    /* generated by template core.Method*/
 public  String serialize (travelcosts._symboltable.ITravelCostsScope toSerialize)  {
      /* generated by template _symboltable.serialization.symbolDeSer.Serialize*/

  travelcosts._symboltable.serialization.TravelCostsSymbolTablePrinter symbolTablePrinter = new travelcosts._symboltable.serialization.TravelCostsSymbolTablePrinter();
  toSerialize.accept(symbolTablePrinter);
  return symbolTablePrinter.getSerializedString();
}

    /* generated by template core.Method*/
 public  travelcosts._symboltable.ITravelCostsScope deserialize (String serialized,travelcosts._symboltable.ITravelCostsScope enclosingScope)  {
      /* generated by template _symboltable.serialization.symbolDeSer.DeserializeString*/
  de.monticore.symboltable.serialization.json.JsonObject symbol =
    de.monticore.symboltable.serialization.JsonParser.parseJsonObject(serialized);
  return deserialize(symbol,enclosingScope);
}

    /* generated by template core.Method*/
 public  travelcosts._symboltable.ITravelCostsScope deserialize (de.monticore.symboltable.serialization.json.JsonObject scopeJson,travelcosts._symboltable.ITravelCostsScope enclosingScope)  {
      /* generated by template _symboltable.serialization.scopeDeSer.DeserializeJsonObject*/

  String kind = scopeJson.getStringMember(de.monticore.symboltable.serialization.JsonConstants.KIND);
  if (this.getSerializedKind().equals(kind)) {
    return deserializeTravelCostsScope(scopeJson,enclosingScope);
  }
  else if (this.getSerializedASKind().equals(kind)) {
    return deserializeTravelCostsArtifactScope(scopeJson,enclosingScope);
  }
  Log.error("Cannot deserialize \""+scopeJson+"\" with DeSer for kind \""+this.getSerializedKind()+"\"!");
  return null;
}

    /* generated by template core.Method*/
 protected  travelcosts._symboltable.TravelCostsScope deserializeTravelCostsScope (de.monticore.symboltable.serialization.json.JsonObject scopeJson,travelcosts._symboltable.ITravelCostsScope enclosingScope)  {
      /* generated by template _symboltable.serialization.scopeDeSer.DeserializeScope*/

  boolean isShadowingScope = false;
  if (scopeJson.hasBooleanMember(de.monticore.symboltable.serialization.JsonConstants.IS_SHADOWING_SCOPE)) {
    isShadowingScope = scopeJson.getBooleanMember(de.monticore.symboltable.serialization.JsonConstants.IS_SHADOWING_SCOPE);
  }
  boolean exportsSymbols = true;
  if (scopeJson.hasBooleanMember(de.monticore.symboltable.serialization.JsonConstants.EXPORTS_SYMBOLS)) { 
    exportsSymbols = scopeJson.getBooleanMember(de.monticore.symboltable.serialization.JsonConstants.EXPORTS_SYMBOLS);
  }  

  travelcosts._symboltable.TravelCostsScope scope = new travelcosts._symboltable.TravelCostsScope(isShadowingScope);
  if (scopeJson.hasStringMember(de.monticore.symboltable.serialization.JsonConstants.NAME)) {
    scope.setName(scopeJson.getStringMember(de.monticore.symboltable.serialization.JsonConstants.NAME));
  }
  scope.setExportingSymbols(exportsSymbols);

  addSymbols(scopeJson, scope);
  addAndLinkSubScopes(scopeJson, scope);
  deserializeAdditionalAttributes(scope,scopeJson,enclosingScope);
  return scope;
}

    /* generated by template core.Method*/
 protected  travelcosts._symboltable.TravelCostsArtifactScope deserializeTravelCostsArtifactScope (de.monticore.symboltable.serialization.json.JsonObject scopeJson,travelcosts._symboltable.ITravelCostsScope enclosingScope)  {
      /* generated by template _symboltable.serialization.scopeDeSer.DeserializeArtifactScope*/

  String name = scopeJson.getStringMember(de.monticore.symboltable.serialization.JsonConstants.NAME);
  String packageName = scopeJson.getStringMember(de.monticore.symboltable.serialization.JsonConstants.PACKAGE);
  List<de.monticore.symboltable.ImportStatement> imports = de.monticore.symboltable.serialization.JsonUtil.deserializeImports(scopeJson);
  boolean exportsSymbols = scopeJson.getBooleanMember(de.monticore.symboltable.serialization.JsonConstants.EXPORTS_SYMBOLS);

  travelcosts._symboltable.TravelCostsArtifactScope scope = new travelcosts._symboltable.TravelCostsArtifactScope(packageName, imports);
  scope.setName(name);
  scope.setExportingSymbols(exportsSymbols);
  addSymbols(scopeJson, scope);
  addAndLinkSubScopes(scopeJson, scope);
  deserializeAdditionalAttributes(scope,scopeJson, enclosingScope);
  return scope;
}

    /* generated by template core.Method*/
 protected  void deserializeAdditionalAttributes (travelcosts._symboltable.ITravelCostsScope scope,de.monticore.symboltable.serialization.json.JsonObject scopeJson,travelcosts._symboltable.ITravelCostsScope enclosingScope)  {
      /* generated by template core.EmptyBody*/
// empty body

}

    /* generated by template core.Method*/
 protected  void addSymbols (de.monticore.symboltable.serialization.json.JsonObject scopeJson,travelcosts._symboltable.TravelCostsScope scope)  {
      /* generated by template _symboltable.serialization.scopeDeSer.AddSymbols*/


}

    /* generated by template core.Method*/
 protected  void addAndLinkSubScopes (de.monticore.symboltable.serialization.json.JsonObject scopeJson,travelcosts._symboltable.TravelCostsScope scope)  {
      /* generated by template _symboltable.serialization.scopeDeSer.AddAndLinkSubScopes*/

  if (scopeJson.hasMember(de.monticore.symboltable.serialization.JsonConstants.SUBSCOPES)) {
    List<de.monticore.symboltable.serialization.json.JsonElement> elements = scopeJson.getArrayMember(de.monticore.symboltable.serialization.JsonConstants.SUBSCOPES);
    for (de.monticore.symboltable.serialization.json.JsonElement subScopeJson : elements) {
  de.monticore.symboltable.serialization.json.JsonObject s = subScopeJson.getAsJsonObject();
      travelcosts._symboltable.ITravelCostsScope subScope = deserialize(s, scope);
      addAndLinkSpanningSymbol(s, subScope, scope);
      subScope.setEnclosingScope(scope);
      scope.addSubScope(subScope);
    }
  }
}

    /* generated by template core.Method*/
 protected  void addAndLinkSpanningSymbol (de.monticore.symboltable.serialization.json.JsonObject subScopeJson,travelcosts._symboltable.ITravelCostsScope subScope,travelcosts._symboltable.TravelCostsScope scope)  {
      /* generated by template _symboltable.serialization.scopeDeSer.AddAndLinkSpanningSymbol*/

  if (subScopeJson.hasMember(de.monticore.symboltable.serialization.JsonConstants.SCOPE_SPANNING_SYMBOL)) {
de.monticore.symboltable.serialization.json.JsonObject symbolRef = subScopeJson.getObjectMember(de.monticore.symboltable.serialization.JsonConstants.SCOPE_SPANNING_SYMBOL);
    String spanningSymbolName = symbolRef.getStringMember(de.monticore.symboltable.serialization.JsonConstants.NAME);
    String spanningSymbolKind = symbolRef.getStringMember(de.monticore.symboltable.serialization.JsonConstants.KIND);
  } else {
    Log.error("Unknown kind of scope spanning symbol: "+de.monticore.symboltable.serialization.JsonConstants.SCOPE_SPANNING_SYMBOL);
  }
}

}
