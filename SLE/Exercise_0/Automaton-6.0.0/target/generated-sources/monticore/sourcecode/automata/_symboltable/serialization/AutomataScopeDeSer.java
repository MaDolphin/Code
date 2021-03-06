/* generated from model Automata */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package automata._symboltable.serialization;

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

 public  class AutomataScopeDeSer  implements de.monticore.symboltable.serialization.IDeSer<automata._symboltable.IAutomataScope,automata._symboltable.IAutomataScope> {

    /* generated by template core.Attribute*/
 AutomatonSymbolDeSer automatonSymbolDeSer = new AutomatonSymbolDeSer();

    /* generated by template core.Attribute*/
 StateSymbolDeSer stateSymbolDeSer = new StateSymbolDeSer();



    /* generated by template core.Method*/
 public  void store (automata._symboltable.AutomataArtifactScope as,automata._symboltable.AutomataLanguage lang,String symbolPath)  {
      store(as, java.nio.file.Paths.get(symbolPath, as.getFilePath(lang).toString()));
}

    /* generated by template core.Method*/
 public  String getSerializedKind ()  {
      return "automata._symboltable.AutomataScope";
}

    /* generated by template core.Method*/
 public  String getSerializedASKind ()  {
      return "automata._symboltable.AutomataArtifactScope";
}

    /* generated by template core.Method*/
 public  String serialize (automata._symboltable.IAutomataScope toSerialize)  {
      /* generated by template _symboltable.serialization.symbolDeSer.Serialize*/

  automata._symboltable.serialization.AutomataSymbolTablePrinter symbolTablePrinter = new automata._symboltable.serialization.AutomataSymbolTablePrinter();
  toSerialize.accept(symbolTablePrinter);
  return symbolTablePrinter.getSerializedString();
}

    /* generated by template core.Method*/
 public  automata._symboltable.IAutomataScope deserialize (String serialized,automata._symboltable.IAutomataScope enclosingScope)  {
      /* generated by template _symboltable.serialization.symbolDeSer.DeserializeString*/
  de.monticore.symboltable.serialization.json.JsonObject symbol =
    de.monticore.symboltable.serialization.JsonParser.parseJsonObject(serialized);
  return deserialize(symbol,enclosingScope);
}

    /* generated by template core.Method*/
 public  automata._symboltable.IAutomataScope deserialize (de.monticore.symboltable.serialization.json.JsonObject scopeJson,automata._symboltable.IAutomataScope enclosingScope)  {
      /* generated by template _symboltable.serialization.scopeDeSer.DeserializeJsonObject*/

  String kind = scopeJson.getStringMember(de.monticore.symboltable.serialization.JsonConstants.KIND);
  if (this.getSerializedKind().equals(kind)) {
    return deserializeAutomataScope(scopeJson,enclosingScope);
  }
  else if (this.getSerializedASKind().equals(kind)) {
    return deserializeAutomataArtifactScope(scopeJson,enclosingScope);
  }
  Log.error("Cannot deserialize \""+scopeJson+"\" with DeSer for kind \""+this.getSerializedKind()+"\"!");
  return null;
}

    /* generated by template core.Method*/
 protected  automata._symboltable.AutomataScope deserializeAutomataScope (de.monticore.symboltable.serialization.json.JsonObject scopeJson,automata._symboltable.IAutomataScope enclosingScope)  {
      /* generated by template _symboltable.serialization.scopeDeSer.DeserializeScope*/

  boolean isShadowingScope = false;
  if (scopeJson.hasBooleanMember(de.monticore.symboltable.serialization.JsonConstants.IS_SHADOWING_SCOPE)) {
    isShadowingScope = scopeJson.getBooleanMember(de.monticore.symboltable.serialization.JsonConstants.IS_SHADOWING_SCOPE);
  }
  boolean exportsSymbols = true;
  if (scopeJson.hasBooleanMember(de.monticore.symboltable.serialization.JsonConstants.EXPORTS_SYMBOLS)) { 
    exportsSymbols = scopeJson.getBooleanMember(de.monticore.symboltable.serialization.JsonConstants.EXPORTS_SYMBOLS);
  }  

  automata._symboltable.AutomataScope scope = new automata._symboltable.AutomataScope(isShadowingScope);
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
 protected  automata._symboltable.AutomataArtifactScope deserializeAutomataArtifactScope (de.monticore.symboltable.serialization.json.JsonObject scopeJson,automata._symboltable.IAutomataScope enclosingScope)  {
      /* generated by template _symboltable.serialization.scopeDeSer.DeserializeArtifactScope*/

  String name = scopeJson.getStringMember(de.monticore.symboltable.serialization.JsonConstants.NAME);
  String packageName = scopeJson.getStringMember(de.monticore.symboltable.serialization.JsonConstants.PACKAGE);
  List<de.monticore.symboltable.ImportStatement> imports = de.monticore.symboltable.serialization.JsonUtil.deserializeImports(scopeJson);
  boolean exportsSymbols = scopeJson.getBooleanMember(de.monticore.symboltable.serialization.JsonConstants.EXPORTS_SYMBOLS);

  automata._symboltable.AutomataArtifactScope scope = new automata._symboltable.AutomataArtifactScope(packageName, imports);
  scope.setName(name);
  scope.setExportingSymbols(exportsSymbols);
  addSymbols(scopeJson, scope);
  addAndLinkSubScopes(scopeJson, scope);
  deserializeAdditionalAttributes(scope,scopeJson, enclosingScope);
  return scope;
}

    /* generated by template core.Method*/
 protected  void deserializeAdditionalAttributes (automata._symboltable.IAutomataScope scope,de.monticore.symboltable.serialization.json.JsonObject scopeJson,automata._symboltable.IAutomataScope enclosingScope)  {
      /* generated by template core.EmptyBody*/
// empty body

}

    /* generated by template core.Method*/
 protected  void addSymbols (de.monticore.symboltable.serialization.json.JsonObject scopeJson,automata._symboltable.AutomataScope scope)  {
      /* generated by template _symboltable.serialization.scopeDeSer.AddSymbols*/

  if (scopeJson.hasMember("automatonSymbols")) {
    List<de.monticore.symboltable.serialization.json.JsonElement> automatonSymbols = scopeJson.getArrayMember("automatonSymbols");
    for (de.monticore.symboltable.serialization.json.JsonElement automatonSymbol : automatonSymbols) {
      deserializeAutomatonSymbol(automatonSymbol.getAsJsonObject(), scope);
    }
  }
  if (scopeJson.hasMember("stateSymbols")) {
    List<de.monticore.symboltable.serialization.json.JsonElement> stateSymbols = scopeJson.getArrayMember("stateSymbols");
    for (de.monticore.symboltable.serialization.json.JsonElement stateSymbol : stateSymbols) {
      deserializeStateSymbol(stateSymbol.getAsJsonObject(), scope);
    }
  }

}

    /* generated by template core.Method*/
 protected  void addAndLinkSubScopes (de.monticore.symboltable.serialization.json.JsonObject scopeJson,automata._symboltable.AutomataScope scope)  {
      /* generated by template _symboltable.serialization.scopeDeSer.AddAndLinkSubScopes*/

  if (scopeJson.hasMember(de.monticore.symboltable.serialization.JsonConstants.SUBSCOPES)) {
    List<de.monticore.symboltable.serialization.json.JsonElement> elements = scopeJson.getArrayMember(de.monticore.symboltable.serialization.JsonConstants.SUBSCOPES);
    for (de.monticore.symboltable.serialization.json.JsonElement subScopeJson : elements) {
  de.monticore.symboltable.serialization.json.JsonObject s = subScopeJson.getAsJsonObject();
      automata._symboltable.IAutomataScope subScope = deserialize(s, scope);
      addAndLinkSpanningSymbol(s, subScope, scope);
      subScope.setEnclosingScope(scope);
      scope.addSubScope(subScope);
    }
  }
}

    /* generated by template core.Method*/
 protected  void addAndLinkSpanningSymbol (de.monticore.symboltable.serialization.json.JsonObject subScopeJson,automata._symboltable.IAutomataScope subScope,automata._symboltable.AutomataScope scope)  {
      /* generated by template _symboltable.serialization.scopeDeSer.AddAndLinkSpanningSymbol*/

  if (subScopeJson.hasMember(de.monticore.symboltable.serialization.JsonConstants.SCOPE_SPANNING_SYMBOL)) {
de.monticore.symboltable.serialization.json.JsonObject symbolRef = subScopeJson.getObjectMember(de.monticore.symboltable.serialization.JsonConstants.SCOPE_SPANNING_SYMBOL);
    String spanningSymbolName = symbolRef.getStringMember(de.monticore.symboltable.serialization.JsonConstants.NAME);
    String spanningSymbolKind = symbolRef.getStringMember(de.monticore.symboltable.serialization.JsonConstants.KIND);
    if (spanningSymbolKind.equals(automatonSymbolDeSer.getSerializedKind())) {
      Optional<automata._symboltable.AutomatonSymbol> spanningSymbol = scope.resolveAutomatonLocally(spanningSymbolName);
      if (spanningSymbol.isPresent()) {
        subScope.setSpanningSymbol(spanningSymbol.get());
      }
      else {
        Log.error("Spanning symbol of scope "+subScopeJson+" could not be found during deserialization!");
      }
    }
    if (spanningSymbolKind.equals(stateSymbolDeSer.getSerializedKind())) {
      Optional<automata._symboltable.StateSymbol> spanningSymbol = scope.resolveStateLocally(spanningSymbolName);
      if (spanningSymbol.isPresent()) {
        subScope.setSpanningSymbol(spanningSymbol.get());
      }
      else {
        Log.error("Spanning symbol of scope "+subScopeJson+" could not be found during deserialization!");
      }
    }
  } else {
    Log.error("Unknown kind of scope spanning symbol: "+de.monticore.symboltable.serialization.JsonConstants.SCOPE_SPANNING_SYMBOL);
  }
}

    /* generated by template core.Method*/
 protected  void deserializeAutomatonSymbol (de.monticore.symboltable.serialization.json.JsonObject symbolJson,automata._symboltable.AutomataScope scope)  {
      /* generated by template _symboltable.serialization.scopeDeSer.DeserializeSymbol*/

  automata._symboltable.AutomatonSymbol symbol = automatonSymbolDeSer.deserialize(symbolJson, scope);
  scope.add(symbol);
}

    /* generated by template core.Method*/
 protected  void deserializeStateSymbol (de.monticore.symboltable.serialization.json.JsonObject symbolJson,automata._symboltable.AutomataScope scope)  {
      /* generated by template _symboltable.serialization.scopeDeSer.DeserializeSymbol*/

  automata._symboltable.StateSymbol symbol = stateSymbolDeSer.deserialize(symbolJson, scope);
  scope.add(symbol);
}

}
