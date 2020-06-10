/* generated from model Automata */
/* generated by template core.Interface*/

/* (c) https://github.com/MontiCore/monticore */
package automata._symboltable;

/* generated by template core.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.monticore.ast.ASTNode;
import de.monticore.ast.Comment;
import de.se_rwth.commons.SourcePosition;
import de.monticore.symboltable.*;


 public  interface IAutomataGlobalScope extends automata._symboltable.IAutomataScope,de.monticore.symboltable.IGlobalScope {



  /* generated by template core.Method*/
 abstract  public  AutomataLanguage getAutomataLanguage () ;
  /* generated by template core.Method*/
 abstract  public  void cache (String calculatedModelName) ;
  default /* generated by template core.Method*/
 public  boolean checkIfContinueAsSubScope (String symbolName)  {
      return false;
}

  /* generated by template core.Method*/
 abstract  public  boolean continueWithModelLoader (String calculatedModelName,AutomataModelLoader modelLoader) ;
  default /* generated by template core.Method*/
 public  IAutomataGlobalScope getRealThis ()  {
      return this;
}

  default /* generated by template core.Method*/
 public  List<automata._symboltable.AutomatonSymbol> resolveAutomatonMany (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<automata._symboltable.AutomatonSymbol> predicate)  {
      /* generated by template _symboltable.iglobalscope.ResolveMany*/

  // First, try to resolve the symbol in the current scope and its sub scopes.
  List<automata._symboltable.AutomatonSymbol> resolvedSymbol = resolveAutomatonDownMany(foundSymbols, name,  modifier, predicate);

  if (!resolvedSymbol.isEmpty()) {
    return resolvedSymbol;
  }

  // Symbol not found: try to load corresponding model and build its symbol table
  loadModelsForAutomaton(name);

  // Maybe the symbol now exists in this scope (or its sub scopes). So, resolve down, again.
  resolvedSymbol = resolveAutomatonDownMany(false, name, modifier, predicate);
  foundSymbols = foundSymbols  | resolvedSymbol.size() > 0;
  if (!foundSymbols && !isAutomatonSymbolsAlreadyResolved()){
    setAutomatonSymbolsAlreadyResolved(true);
    resolvedSymbol.addAll(resolveAdaptedAutomaton(foundSymbols, name, modifier, predicate));
  }
  setAutomatonSymbolsAlreadyResolved(false);
  return resolvedSymbol;
}

  default /* generated by template core.Method*/
 public  List<automata._symboltable.AutomatonSymbol> resolveAdaptedAutomaton (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<automata._symboltable.AutomatonSymbol> predicate)  {
      return com.google.common.collect.Lists.newArrayList();
}

  default /* generated by template core.Method*/
 public  void loadModelsForAutomaton (String name)  {
      /* generated by template _symboltable.iglobalscope.LoadModelsFor*/

  AutomataModelLoader modelLoader = getAutomataLanguage().getModelLoader();
  Set<String> calculatedModelNames = getAutomataLanguage().calculateModelNamesForAutomaton(name);

  for (String calculatedModelName : calculatedModelNames) {
    if (continueWithModelLoader(calculatedModelName, modelLoader)) {
      modelLoader.loadModelsIntoScope(calculatedModelName, getModelPath(), getRealThis());
      cache(calculatedModelNames.iterator().next());
    } else {
      Log.debug("Already tried to load model for '" + name + "'. If model exists, continue with cached version.",
        AutomataGlobalScope.class.getSimpleName());
    }
  }
}

  default /* generated by template core.Method*/
 public  List<automata._symboltable.StateSymbol> resolveStateMany (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<automata._symboltable.StateSymbol> predicate)  {
      /* generated by template _symboltable.iglobalscope.ResolveMany*/

  // First, try to resolve the symbol in the current scope and its sub scopes.
  List<automata._symboltable.StateSymbol> resolvedSymbol = resolveStateDownMany(foundSymbols, name,  modifier, predicate);

  if (!resolvedSymbol.isEmpty()) {
    return resolvedSymbol;
  }

  // Symbol not found: try to load corresponding model and build its symbol table
  loadModelsForState(name);

  // Maybe the symbol now exists in this scope (or its sub scopes). So, resolve down, again.
  resolvedSymbol = resolveStateDownMany(false, name, modifier, predicate);
  foundSymbols = foundSymbols  | resolvedSymbol.size() > 0;
  if (!foundSymbols && !isStateSymbolsAlreadyResolved()){
    setStateSymbolsAlreadyResolved(true);
    resolvedSymbol.addAll(resolveAdaptedState(foundSymbols, name, modifier, predicate));
  }
  setStateSymbolsAlreadyResolved(false);
  return resolvedSymbol;
}

  default /* generated by template core.Method*/
 public  List<automata._symboltable.StateSymbol> resolveAdaptedState (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<automata._symboltable.StateSymbol> predicate)  {
      return com.google.common.collect.Lists.newArrayList();
}

  default /* generated by template core.Method*/
 public  void loadModelsForState (String name)  {
      /* generated by template _symboltable.iglobalscope.LoadModelsFor*/

  AutomataModelLoader modelLoader = getAutomataLanguage().getModelLoader();
  Set<String> calculatedModelNames = getAutomataLanguage().calculateModelNamesForState(name);

  for (String calculatedModelName : calculatedModelNames) {
    if (continueWithModelLoader(calculatedModelName, modelLoader)) {
      modelLoader.loadModelsIntoScope(calculatedModelName, getModelPath(), getRealThis());
      cache(calculatedModelNames.iterator().next());
    } else {
      Log.debug("Already tried to load model for '" + name + "'. If model exists, continue with cached version.",
        AutomataGlobalScope.class.getSimpleName());
    }
  }
}

}
