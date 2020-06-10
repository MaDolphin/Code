/* generated from model ClassDiagrams */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package classdiagrams._symboltable;

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


 public  class CDDefinitionSymbolLoader  implements de.monticore.symboltable.ISymbolLoader {

    /* generated by template core.Attribute*/
 protected  Optional<classdiagrams._symboltable.CDDefinitionSymbol> loadedSymbol = Optional.empty();

    /* generated by template core.Attribute*/
 protected  String name ;

    /* generated by template core.Attribute*/
 protected  classdiagrams._symboltable.IClassDiagramsScope enclosingScope ;

    /* generated by template core.Attribute*/
 private  boolean isAlreadyLoaded ;


    /* generated by template core.Constructor*/
 public  CDDefinitionSymbolLoader(String name,classdiagrams._symboltable.IClassDiagramsScope enclosingScope)  {
    /* generated by template _symboltable.symbolloader.Constructor*/
  this.name = name;
  this.enclosingScope = enclosingScope;
}


    /* generated by template core.Method*/
 public  classdiagrams._symboltable.CDDefinitionSymbol getLoadedSymbol ()  {
      /* generated by template _symboltable.symbolloader.GetSymbol*/

  if (!isAlreadyLoaded) {
    loadedSymbol = loadSymbol();
  }

  if (!loadedSymbol.isPresent()) {
    Log.error("0xA1038 " + CDDefinitionSymbolLoader.class.getSimpleName() + " Could not load full information of '" +
    name + "' (Kind " + "CDDefinitionSymbol" + ").");
  }

  return loadedSymbol.get();
}

    /* generated by template core.Method*/
 public  String getName ()  {
      /* generated by template methods.Get*/

return this.name;

}

    /* generated by template core.Method*/
 public  void setName (String name)  {
      /* generated by template _symboltable.symbolloader.Set*/

  /* generated by template methods.Set*/

this.name = name;

  this.loadedSymbol = Optional.empty();
  this.isAlreadyLoaded = false;

}

    /* generated by template core.Method*/
 public  classdiagrams._symboltable.IClassDiagramsScope getEnclosingScope ()  {
      /* generated by template methods.Get*/

return this.enclosingScope;

}

    /* generated by template core.Method*/
 public  void setEnclosingScope (classdiagrams._symboltable.IClassDiagramsScope enclosingScope)  {
      /* generated by template _symboltable.symbolloader.Set*/

  /* generated by template methods.Set*/

this.enclosingScope = enclosingScope;

  this.loadedSymbol = Optional.empty();
  this.isAlreadyLoaded = false;

}

    /* generated by template core.Method*/
 public  boolean isSymbolLoaded ()  {
      /* generated by template _symboltable.symbolloader.IsSymbolLoaded*/
  if (!isAlreadyLoaded) {
    loadSymbol();
  }
  return loadedSymbol.isPresent();
}

    /* generated by template core.Method*/
 public  Optional<classdiagrams._symboltable.CDDefinitionSymbol> loadSymbol ()  {
      /* generated by template _symboltable.symbolloader.LoadSymbol*/

  com.google.common.base.Preconditions.checkArgument(!com.google.common.base.Strings.isNullOrEmpty(name), " 0xA4070 Symbol name may not be null or empty.");

  Log.debug("Load full information of '" + name + "' (Kind " + "classdiagrams._symboltable.CDDefinitionSymbol" + ").", CDDefinitionSymbolLoader.class.getSimpleName());
  isAlreadyLoaded = true;
  Optional<classdiagrams._symboltable.CDDefinitionSymbol> resolvedSymbol = enclosingScope.resolveCDDefinition(name);

  if (resolvedSymbol.isPresent()) {
    Log.debug("Loaded full information of '" + name + "' successfully.",
    CDDefinitionSymbolLoader.class.getSimpleName());
    loadedSymbol = Optional.of(resolvedSymbol.get());
  } else {
    Log.debug("Cannot load full information of '" + name, CDDefinitionSymbolLoader.class.getSimpleName());
  }
  return resolvedSymbol;
}

}
