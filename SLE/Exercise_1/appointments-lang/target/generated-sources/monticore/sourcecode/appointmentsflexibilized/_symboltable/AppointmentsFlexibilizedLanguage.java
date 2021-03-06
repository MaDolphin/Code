/* generated from model AppointmentsFlexibilized */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package appointmentsflexibilized._symboltable;

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


 abstract  public  class AppointmentsFlexibilizedLanguage  implements de.monticore.IModelingLanguage<AppointmentsFlexibilizedModelLoader> {

    /* generated by template core.Attribute*/
 private  AppointmentsFlexibilizedModelLoader modelLoader ;

    /* generated by template core.Attribute*/
 private  String name ;

    /* generated by template core.Attribute*/
 private  String fileExtension ;


    /* generated by template core.Constructor*/
 public  AppointmentsFlexibilizedLanguage(String langName,String fileEnding)  {
    /* generated by template _symboltable.language.Constructor*/
  this.name = langName;
  this.fileExtension = fileEnding;
  this.modelLoader = provideModelLoader();
}


    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedModelLoader getModelLoader ()  {
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
 public  appointmentsflexibilized._symboltable.AppointmentsFlexibilizedSymbolTableCreatorDelegator getSymbolTableCreator (appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedGlobalScope enclosingScope)  {
       return new appointmentsflexibilized._symboltable.AppointmentsFlexibilizedSymbolTableCreatorDelegator(enclosingScope);
}

    /* generated by template core.Method*/
 protected  AppointmentsFlexibilizedModelLoader provideModelLoader ()  {
      return new AppointmentsFlexibilizedModelLoader(this);
}

    /* generated by template core.Method*/
 public  appointmentsflexibilized._parser.AppointmentsFlexibilizedParser getParser ()  {
      return new appointmentsflexibilized._parser.AppointmentsFlexibilizedParser();
}

}
