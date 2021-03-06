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


 abstract  public  class GuitarTabLanguage  implements de.monticore.IModelingLanguage<GuitarTabModelLoader> {

    /* generated by template core.Attribute*/
 private  GuitarTabModelLoader modelLoader ;

    /* generated by template core.Attribute*/
 private  String name ;

    /* generated by template core.Attribute*/
 private  String fileExtension ;


    /* generated by template core.Constructor*/
 public  GuitarTabLanguage(String langName,String fileEnding)  {
    /* generated by template _symboltable.language.Constructor*/
  this.name = langName;
  this.fileExtension = fileEnding;
  this.modelLoader = provideModelLoader();
}


    /* generated by template core.Method*/
 public  GuitarTabModelLoader getModelLoader ()  {
      /* generated by template methods.Get*/

return this.modelLoader;

}

    /* generated by template core.Method*/
 public  String getName ()  {
      /* generated by template methods.Get*/

return this.name;

}

    /* generated by template core.Method*/
 public  String getFileExtension ()  {
      /* generated by template methods.Get*/

return this.fileExtension;

}

    /* generated by template core.Method*/
 public  guitartab._symboltable.GuitarTabSymbolTableCreatorDelegator getSymbolTableCreator (guitartab._symboltable.IGuitarTabGlobalScope enclosingScope)  {
       return new guitartab._symboltable.GuitarTabSymbolTableCreatorDelegator(enclosingScope);
}

    /* generated by template core.Method*/
 protected  GuitarTabModelLoader provideModelLoader ()  {
      return new GuitarTabModelLoader(this);
}

    /* generated by template core.Method*/
 public  guitartab._parser.GuitarTabParser getParser ()  {
      return new guitartab._parser.GuitarTabParser();
}

}
