/* generated from model Appointments */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package appointments._symboltable.serialization;

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

 public  class AppointmentsScopeDeSer  implements de.monticore.symboltable.serialization.IDeSer<appointments._symboltable.IAppointmentsScope,appointments._symboltable.IAppointmentsScope> {



    /* generated by template core.Method*/
 public  void store (appointments._symboltable.AppointmentsArtifactScope as,appointments._symboltable.AppointmentsLanguage lang,String symbolPath)  {
      store(as, java.nio.file.Paths.get(symbolPath, as.getFilePath(lang).toString()));
}

    /* generated by template core.Method*/
 public  String getSerializedKind ()  {
      return "appointments._symboltable.AppointmentsScope";
}

    /* generated by template core.Method*/
 public  String getSerializedASKind ()  {
      return "appointments._symboltable.AppointmentsArtifactScope";
}

    /* generated by template core.Method*/
 public  String serialize (appointments._symboltable.IAppointmentsScope toSerialize)  {
      /* generated by template _symboltable.serialization.symbolDeSer.Serialize*/

  appointments._symboltable.serialization.AppointmentsSymbolTablePrinter symbolTablePrinter = new appointments._symboltable.serialization.AppointmentsSymbolTablePrinter();
  toSerialize.accept(symbolTablePrinter);
  return symbolTablePrinter.getSerializedString();
}

    /* generated by template core.Method*/
 public  appointments._symboltable.IAppointmentsScope deserialize (String serialized,appointments._symboltable.IAppointmentsScope enclosingScope)  {
      /* generated by template _symboltable.serialization.symbolDeSer.DeserializeString*/
  de.monticore.symboltable.serialization.json.JsonObject symbol =
    de.monticore.symboltable.serialization.JsonParser.parseJsonObject(serialized);
  return deserialize(symbol,enclosingScope);
}

    /* generated by template core.Method*/
 public  appointments._symboltable.IAppointmentsScope deserialize (de.monticore.symboltable.serialization.json.JsonObject scopeJson,appointments._symboltable.IAppointmentsScope enclosingScope)  {
      /* generated by template _symboltable.serialization.scopeDeSer.DeserializeJsonObject*/

  String kind = scopeJson.getStringMember(de.monticore.symboltable.serialization.JsonConstants.KIND);
  if (this.getSerializedKind().equals(kind)) {
    return deserializeAppointmentsScope(scopeJson,enclosingScope);
  }
  else if (this.getSerializedASKind().equals(kind)) {
    return deserializeAppointmentsArtifactScope(scopeJson,enclosingScope);
  }
  Log.error("Cannot deserialize \""+scopeJson+"\" with DeSer for kind \""+this.getSerializedKind()+"\"!");
  return null;
}

    /* generated by template core.Method*/
 protected  appointments._symboltable.AppointmentsScope deserializeAppointmentsScope (de.monticore.symboltable.serialization.json.JsonObject scopeJson,appointments._symboltable.IAppointmentsScope enclosingScope)  {
      /* generated by template _symboltable.serialization.scopeDeSer.DeserializeScope*/

  boolean isShadowingScope = false;
  if (scopeJson.hasBooleanMember(de.monticore.symboltable.serialization.JsonConstants.IS_SHADOWING_SCOPE)) {
    isShadowingScope = scopeJson.getBooleanMember(de.monticore.symboltable.serialization.JsonConstants.IS_SHADOWING_SCOPE);
  }
  boolean exportsSymbols = true;
  if (scopeJson.hasBooleanMember(de.monticore.symboltable.serialization.JsonConstants.EXPORTS_SYMBOLS)) { 
    exportsSymbols = scopeJson.getBooleanMember(de.monticore.symboltable.serialization.JsonConstants.EXPORTS_SYMBOLS);
  }  

  appointments._symboltable.AppointmentsScope scope = new appointments._symboltable.AppointmentsScope(isShadowingScope);
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
 protected  appointments._symboltable.AppointmentsArtifactScope deserializeAppointmentsArtifactScope (de.monticore.symboltable.serialization.json.JsonObject scopeJson,appointments._symboltable.IAppointmentsScope enclosingScope)  {
      /* generated by template _symboltable.serialization.scopeDeSer.DeserializeArtifactScope*/

  String name = scopeJson.getStringMember(de.monticore.symboltable.serialization.JsonConstants.NAME);
  String packageName = scopeJson.getStringMember(de.monticore.symboltable.serialization.JsonConstants.PACKAGE);
  List<de.monticore.symboltable.ImportStatement> imports = de.monticore.symboltable.serialization.JsonUtil.deserializeImports(scopeJson);
  boolean exportsSymbols = scopeJson.getBooleanMember(de.monticore.symboltable.serialization.JsonConstants.EXPORTS_SYMBOLS);

  appointments._symboltable.AppointmentsArtifactScope scope = new appointments._symboltable.AppointmentsArtifactScope(packageName, imports);
  scope.setName(name);
  scope.setExportingSymbols(exportsSymbols);
  addSymbols(scopeJson, scope);
  addAndLinkSubScopes(scopeJson, scope);
  deserializeAdditionalAttributes(scope,scopeJson, enclosingScope);
  return scope;
}

    /* generated by template core.Method*/
 protected  void deserializeAdditionalAttributes (appointments._symboltable.IAppointmentsScope scope,de.monticore.symboltable.serialization.json.JsonObject scopeJson,appointments._symboltable.IAppointmentsScope enclosingScope)  {
      /* generated by template core.EmptyBody*/
// empty body

}

    /* generated by template core.Method*/
 protected  void addSymbols (de.monticore.symboltable.serialization.json.JsonObject scopeJson,appointments._symboltable.AppointmentsScope scope)  {
      /* generated by template _symboltable.serialization.scopeDeSer.AddSymbols*/


}

    /* generated by template core.Method*/
 protected  void addAndLinkSubScopes (de.monticore.symboltable.serialization.json.JsonObject scopeJson,appointments._symboltable.AppointmentsScope scope)  {
      /* generated by template _symboltable.serialization.scopeDeSer.AddAndLinkSubScopes*/

  if (scopeJson.hasMember(de.monticore.symboltable.serialization.JsonConstants.SUBSCOPES)) {
    List<de.monticore.symboltable.serialization.json.JsonElement> elements = scopeJson.getArrayMember(de.monticore.symboltable.serialization.JsonConstants.SUBSCOPES);
    for (de.monticore.symboltable.serialization.json.JsonElement subScopeJson : elements) {
  de.monticore.symboltable.serialization.json.JsonObject s = subScopeJson.getAsJsonObject();
      appointments._symboltable.IAppointmentsScope subScope = deserialize(s, scope);
      addAndLinkSpanningSymbol(s, subScope, scope);
      subScope.setEnclosingScope(scope);
      scope.addSubScope(subScope);
    }
  }
}

    /* generated by template core.Method*/
 protected  void addAndLinkSpanningSymbol (de.monticore.symboltable.serialization.json.JsonObject subScopeJson,appointments._symboltable.IAppointmentsScope subScope,appointments._symboltable.AppointmentsScope scope)  {
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
