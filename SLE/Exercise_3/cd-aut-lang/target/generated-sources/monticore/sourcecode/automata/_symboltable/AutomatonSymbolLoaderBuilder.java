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


 public  class AutomatonSymbolLoaderBuilder  {

    /* generated by template core.Attribute*/
 protected  AutomatonSymbolLoaderBuilder realBuilder ;

    /* generated by template core.Attribute*/
 protected  String name ;

    /* generated by template core.Attribute*/
 protected  automata._symboltable.IAutomataScope enclosingScope ;


    /* generated by template core.Constructor*/
 protected  AutomatonSymbolLoaderBuilder()  {
    this.realBuilder = (AutomatonSymbolLoaderBuilder) this;
}


    /* generated by template core.Method*/
 public  String getName ()  {
      /* generated by template methods.Get*/

return this.name;

}

    /* generated by template core.Method*/
 public  AutomatonSymbolLoaderBuilder setName (String name)  {
      /* generated by template _ast.builder.Set*/

    this.name = name;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  automata._symboltable.IAutomataScope getEnclosingScope ()  {
      /* generated by template methods.Get*/

return this.enclosingScope;

}

    /* generated by template core.Method*/
 public  AutomatonSymbolLoaderBuilder setEnclosingScope (automata._symboltable.IAutomataScope enclosingScope)  {
      /* generated by template _ast.builder.Set*/

    this.enclosingScope = enclosingScope;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomatonSymbolLoader build ()  {
      /* generated by template _symboltable.symbolloader.Build*/

  AutomatonSymbolLoader symbolReference = new AutomatonSymbolLoader(name, enclosingScope);
  return symbolReference;
}

}