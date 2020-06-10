/* generated from model GuitarTab */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package guitartab._symboltable;

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


 public  class GuitarTabSymbolTableCreatorDelegator extends guitartab._visitor.GuitarTabDelegatorVisitor  {

    /* generated by template core.Attribute*/
 protected  Deque<guitartab._symboltable.IGuitarTabScope> scopeStack = new java.util.ArrayDeque<>();

    /* generated by template core.Attribute*/
 protected  final  GuitarTabSymbolTableCreator symbolTable ;

    /* generated by template core.Attribute*/
 protected  guitartab._symboltable.IGuitarTabGlobalScope globalScope ;


    /* generated by template core.Constructor*/
 public  GuitarTabSymbolTableCreatorDelegator(guitartab._symboltable.IGuitarTabGlobalScope globalScope)  {
    /* generated by template _symboltable.symboltablecreatordelegator.Constructor*/

  this.scopeStack.push(globalScope);
  this.globalScope = globalScope;
  symbolTable = new GuitarTabSymbolTableCreator(scopeStack);
  setGuitarTabVisitor(symbolTable);
}


    /* generated by template core.Method*/
 public  guitartab._symboltable.GuitarTabArtifactScope createFromAST (guitartab._ast.ASTTab rootNode)  {
      /* generated by template _symboltable.symboltablecreatordelegator.CreateFromAST*/

  guitartab._symboltable.GuitarTabArtifactScope as =  symbolTable.createFromAST(rootNode);
  if (as.isPresentName()){
    if (!as.getPackageName().isEmpty()){
      globalScope.cache(as.getPackageName() + "." + as.getName());
    } else {
      globalScope.cache(as.getName());
    }
  }
  return as;
}

}
