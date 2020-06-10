/* generated from model Automata */
/* generated by template core.Class*/

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
import de.monticore.ast.ASTCNode;


 public  class TypeSymbolsSTCForAutomata extends de.monticore.types.typesymbols._symboltable.TypeSymbolsSymbolTableCreator  {


    /* generated by template core.Constructor*/
 public  TypeSymbolsSTCForAutomata(Deque<? extends de.monticore.types.typesymbols._symboltable.ITypeSymbolsScope> scopeStack)  {
    super(scopeStack);
}


    /* generated by template core.Method*/
 public  automata._symboltable.IAutomataScope createScope (boolean shadowing)  {
      /* generated by template _symboltable.symboltablecreator.CreateScope*/

  automata._symboltable.IAutomataScope scope = automata._symboltable.AutomataSymTabMill.automataScopeBuilder().build();
  scope.setShadowing(shadowing);
  return scope;
}

}
