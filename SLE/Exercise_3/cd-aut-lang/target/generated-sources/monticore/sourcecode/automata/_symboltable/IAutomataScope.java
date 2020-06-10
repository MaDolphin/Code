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


 public  interface IAutomataScope extends de.monticore.types.mcbasictypes._symboltable.IMCBasicTypesScope,de.monticore.mcbasics._symboltable.IMCBasicsScope,de.monticore.types.typesymbols._symboltable.ITypeSymbolsScope {



  /* generated by template core.Method*/
 abstract  public  boolean isAutomatonSymbolsAlreadyResolved () ;
  /* generated by template core.Method*/
 abstract  public  void setAutomatonSymbolsAlreadyResolved (boolean symbolAlreadyResolved) ;
  default /* generated by template core.Method*/
 public  Optional<automata._symboltable.AutomatonSymbol> resolveAutomaton (String name)  {
      /* generated by template _symboltable.iscope.ResolveDelegate*/

  return getResolvedOrThrowException(resolveAutomatonMany(name ));
}

  default /* generated by template core.Method*/
 public  Optional<automata._symboltable.AutomatonSymbol> resolveAutomaton (String name,de.monticore.symboltable.modifiers.AccessModifier modifier)  {
      /* generated by template _symboltable.iscope.ResolveDelegate*/

  return getResolvedOrThrowException(resolveAutomatonMany(name, modifier ));
}

  default /* generated by template core.Method*/
 public  Optional<automata._symboltable.AutomatonSymbol> resolveAutomaton (String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<automata._symboltable.AutomatonSymbol> predicate)  {
      /* generated by template _symboltable.iscope.ResolveDelegate*/

  return getResolvedOrThrowException(resolveAutomatonMany(name, modifier, predicate ));
}

  default /* generated by template core.Method*/
 public  Optional<automata._symboltable.AutomatonSymbol> resolveAutomaton (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier)  {
      /* generated by template _symboltable.iscope.ResolveDelegate*/

  return getResolvedOrThrowException(resolveAutomatonMany(foundSymbols, name, modifier ));
}

  default /* generated by template core.Method*/
 public  Optional<automata._symboltable.AutomatonSymbol> resolveAutomatonDown (String name)  {
      /* generated by template _symboltable.iscope.ResolveDelegate*/

  return getResolvedOrThrowException(resolveAutomatonDownMany(name ));
}

  default /* generated by template core.Method*/
 public  Optional<automata._symboltable.AutomatonSymbol> resolveAutomatonDown (String name,de.monticore.symboltable.modifiers.AccessModifier modifier)  {
      /* generated by template _symboltable.iscope.ResolveDelegate*/

  return getResolvedOrThrowException(resolveAutomatonDownMany(name, modifier ));
}

  default /* generated by template core.Method*/
 public  Optional<automata._symboltable.AutomatonSymbol> resolveAutomatonDown (String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<automata._symboltable.AutomatonSymbol> predicate)  {
      /* generated by template _symboltable.iscope.ResolveDelegate*/

  return getResolvedOrThrowException(resolveAutomatonDownMany(name, modifier, predicate ));
}

  default /* generated by template core.Method*/
 public  List<automata._symboltable.AutomatonSymbol> resolveAutomatonDownMany (String name)  {
      return this.resolveAutomatonDownMany(false,name,de.monticore.symboltable.modifiers.AccessModifier.ALL_INCLUSION,x -> true);
}

  default /* generated by template core.Method*/
 public  List<automata._symboltable.AutomatonSymbol> resolveAutomatonDownMany (String name,de.monticore.symboltable.modifiers.AccessModifier modifier)  {
      return this.resolveAutomatonDownMany(false,name,modifier,x -> true);
}

  default /* generated by template core.Method*/
 public  List<automata._symboltable.AutomatonSymbol> resolveAutomatonDownMany (String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<automata._symboltable.AutomatonSymbol> predicate)  {
      return this.resolveAutomatonDownMany(false,name,modifier,predicate);
}

  default /* generated by template core.Method*/
 public  List<automata._symboltable.AutomatonSymbol> resolveAutomatonDownMany (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<automata._symboltable.AutomatonSymbol> predicate)  {
      /* generated by template _symboltable.iscope.ResolveDownMany*/

  if (!isAutomatonSymbolsAlreadyResolved()) {
    setAutomatonSymbolsAlreadyResolved(true);
  } else {
    return new ArrayList<>();
  }

  // 1. Conduct search locally in the current scope
  final List<automata._symboltable.AutomatonSymbol> resolved = this.resolveAutomatonLocallyMany(foundSymbols, name, modifier, predicate);

  foundSymbols = foundSymbols | resolved.size() > 0;

  final String resolveCall = "resolveDownMany(\"" + name + "\", \"" + "AutomatonSymbol"
    + "\") in scope \"" + (isPresentName() ? getName() : "") + "\"";
  Log.trace("START " + resolveCall + ". Found #" + resolved.size() + " (local)", "");
  // If no matching symbols have been found...
  if (resolved.isEmpty()) {
    // 2. Continue search in sub scopes and ...
    for (automata._symboltable.IAutomataScope subScope : getSubScopes()) {
      final List<automata._symboltable.AutomatonSymbol> resolvedFromSub = subScope
        .continueAsAutomatonSubScope(foundSymbols, name, modifier, predicate);
      foundSymbols = foundSymbols | resolved.size() > 0;
      // 3. unify results
      resolved.addAll(resolvedFromSub);
    }
  }
  Log.trace("END " + resolveCall + ". Found #" + resolved.size(), "");
  setAutomatonSymbolsAlreadyResolved(false);
  return resolved;
}

  default /* generated by template core.Method*/
 public  Optional<automata._symboltable.AutomatonSymbol> resolveAutomatonLocally (String name)  {
       return getResolvedOrThrowException(this.resolveAutomatonLocallyMany(false,name,de.monticore.symboltable.modifiers.AccessModifier.ALL_INCLUSION,x -> true));
}

  default /* generated by template core.Method*/
 public  List<automata._symboltable.AutomatonSymbol> resolveAutomatonLocallyMany (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<automata._symboltable.AutomatonSymbol> predicate)  {
      /* generated by template _symboltable.iscope.ResolveManyLocally*/

  final List<automata._symboltable.AutomatonSymbol> resolvedSymbols = new ArrayList<>();

  try {
    Optional<automata._symboltable.AutomatonSymbol> resolvedSymbol = filterAutomaton(name, getAutomatonSymbols());
    if (resolvedSymbol.isPresent()) {
      resolvedSymbols.add(resolvedSymbol.get());
    }
  } catch (de.monticore.symboltable.resolving.ResolvedSeveralEntriesForSymbolException e) {
    resolvedSymbols.addAll(e.getSymbols());
  }

  // filter out symbols that are not included within the access modifier
  List<automata._symboltable.AutomatonSymbol> filteredSymbols = filterSymbolsByAccessModifier(modifier, resolvedSymbols);
  filteredSymbols = new ArrayList<>(filteredSymbols.stream().filter(predicate).collect(java.util.stream.Collectors.toList()));

  // if no symbols found try to find adapted one
  if (filteredSymbols.isEmpty()) {
    filteredSymbols.addAll(resolveAdaptedAutomatonLocallyMany(foundSymbols, name, modifier, predicate));
    filteredSymbols = filterSymbolsByAccessModifier(modifier, filteredSymbols);
    filteredSymbols = new ArrayList<>(filteredSymbols.stream().filter(predicate).collect(java.util.stream.Collectors.toList()));
  }
  return filteredSymbols;
}

  default /* generated by template core.Method*/
 public  Optional<automata._symboltable.AutomatonSymbol> resolveAutomatonImported (String name)  {
      return this.resolveAutomatonLocally(name);
}

  default /* generated by template core.Method*/
 public  List<automata._symboltable.AutomatonSymbol> resolveAutomatonMany (String name)  {
      return this.resolveAutomatonMany(name,de.monticore.symboltable.modifiers.AccessModifier.ALL_INCLUSION);
}

  default /* generated by template core.Method*/
 public  List<automata._symboltable.AutomatonSymbol> resolveAutomatonMany (String name,de.monticore.symboltable.modifiers.AccessModifier modifier)  {
      return this.resolveAutomatonMany(name,modifier,x -> true);
}

  default /* generated by template core.Method*/
 public  List<automata._symboltable.AutomatonSymbol> resolveAutomatonMany (String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<automata._symboltable.AutomatonSymbol> predicate)  {
      return this.resolveAutomatonMany(false,name,modifier,predicate);
}

  default /* generated by template core.Method*/
 public  List<automata._symboltable.AutomatonSymbol> resolveAutomatonMany (String name,java.util.function.Predicate<automata._symboltable.AutomatonSymbol> predicate)  {
      return this.resolveAutomatonMany(false,name,de.monticore.symboltable.modifiers.AccessModifier.ALL_INCLUSION,predicate);
}

  default /* generated by template core.Method*/
 public  List<automata._symboltable.AutomatonSymbol> resolveAutomatonMany (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier)  {
      return this.resolveAutomatonMany(foundSymbols,name,modifier,x -> true);
}

  default /* generated by template core.Method*/
 public  List<automata._symboltable.AutomatonSymbol> resolveAutomatonMany (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<automata._symboltable.AutomatonSymbol> predicate)  {
      /* generated by template _symboltable.iscope.ResolveMany*/

  if (!isAutomatonSymbolsAlreadyResolved()) {
    setAutomatonSymbolsAlreadyResolved(true);
  } else {
    return new ArrayList<>();
  }

  final List<automata._symboltable.AutomatonSymbol> resolvedSymbols = this.resolveAutomatonLocallyMany(foundSymbols, name, modifier, predicate);
  if (!resolvedSymbols.isEmpty()) {
    setAutomatonSymbolsAlreadyResolved(false);
    return resolvedSymbols;
  }
  final List<automata._symboltable.AutomatonSymbol> resolvedFromEnclosing = continueAutomatonWithEnclosingScope((foundSymbols | resolvedSymbols.size() > 0), name, modifier, predicate);
  resolvedSymbols.addAll(resolvedFromEnclosing);
  setAutomatonSymbolsAlreadyResolved(false);
  return resolvedSymbols;
}

  default /* generated by template core.Method*/
 public  List<automata._symboltable.AutomatonSymbol> resolveAdaptedAutomatonLocallyMany (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<automata._symboltable.AutomatonSymbol> predicate)  {
      return new java.util.ArrayList<>();
}

  default /* generated by template core.Method*/
 public  Optional<automata._symboltable.AutomatonSymbol> filterAutomaton (String name,com.google.common.collect.LinkedListMultimap<String,automata._symboltable.AutomatonSymbol> symbols)  {
      /* generated by template _symboltable.iscope.Filter*/

  final Set<automata._symboltable.AutomatonSymbol> resolvedSymbols = new LinkedHashSet<>();

  final String simpleName = de.se_rwth.commons.Names.getSimpleName(name);

  if (symbols.containsKey(simpleName)) {
    for (automata._symboltable.AutomatonSymbol symbol : symbols.get(simpleName)) {
      if (symbol.getName().equals(name) || symbol.getFullName().equals(name)) {
        resolvedSymbols.add(symbol);
      }
    }
  }

  return getResolvedOrThrowException(resolvedSymbols);
}

  default /* generated by template core.Method*/
 public  List<automata._symboltable.AutomatonSymbol> continueAutomatonWithEnclosingScope (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<automata._symboltable.AutomatonSymbol> predicate)  {
      /* generated by template _symboltable.iscope.ContinueWithEnclosingScope*/

if (checkIfContinueWithEnclosingScope(foundSymbols) && (getEnclosingScope() != null)) {
    return getEnclosingScope().resolveAutomatonMany(foundSymbols, name, modifier, predicate);
  }
  return new ArrayList<>();
}

  default /* generated by template core.Method*/
 public  List<automata._symboltable.AutomatonSymbol> continueAsAutomatonSubScope (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<automata._symboltable.AutomatonSymbol> predicate)  {
      /* generated by template _symboltable.iscope.ContinueAsSubScope*/

  setAutomatonSymbolsAlreadyResolved(false);
  if (checkIfContinueAsSubScope(name)) {
    final String remainingSymbolName = getRemainingNameForResolveDown(name);
    return this.resolveAutomatonDownMany(foundSymbols, remainingSymbolName, modifier, predicate);
  }
  return new ArrayList<>();
}

  /* generated by template core.Method*/
 abstract  public  com.google.common.collect.LinkedListMultimap<String,automata._symboltable.AutomatonSymbol> getAutomatonSymbols () ;
  default /* generated by template core.Method*/
 public  List<automata._symboltable.AutomatonSymbol> getLocalAutomatonSymbols ()  {
      return getAutomatonSymbols().values();
}

  /* generated by template core.Method*/
 abstract  public  void add (automata._symboltable.AutomatonSymbol symbol) ;
  /* generated by template core.Method*/
 abstract  public  void remove (automata._symboltable.AutomatonSymbol symbol) ;
  /* generated by template core.Method*/
 abstract  public  List<? extends IAutomataScope> getSubScopes () ;
  default /* generated by template core.Method*/
 public  void addSubScope (IAutomataScope subScope)  {
      Log.error("0xA7013x558 The method \"addSubScope\" of interface \"IAutomataScope\" is not implemented.");
}

  default /* generated by template core.Method*/
 public  void removeSubScope (IAutomataScope subScope)  {
      Log.error("0xA7013x558 The method \"removeSubScope\" of interface \"IAutomataScope\" is not implemented.");
}

  /* generated by template core.Method*/
 abstract  public  IAutomataScope getEnclosingScope () ;
  /* generated by template core.Method*/
 abstract  public  void setEnclosingScope (IAutomataScope enclosingScope) ;
  /* generated by template core.Method*/
 abstract  public  void accept (automata._visitor.AutomataScopeVisitor visitor) ;
}
