/* generated from model Appointments */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package appointments._symboltable;

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


 public  class AppointmentsModelLoader  implements de.monticore.modelloader.IModelLoader<appointments._ast.ASTAppointment,appointments._symboltable.IAppointmentsGlobalScope> {

    /* generated by template core.Attribute*/
 protected  final  appointments._symboltable.AppointmentsLanguage modelingLanguage ;

    /* generated by template core.Attribute*/
 protected  de.monticore.modelloader.AstProvider<appointments._ast.ASTAppointment> astProvider ;


    /* generated by template core.Constructor*/
 public  AppointmentsModelLoader(appointments._symboltable.AppointmentsLanguage language)  {
    /* generated by template _symboltable.modelloader.Constructor*/
  this.modelingLanguage = language;
  this.astProvider = new de.monticore.modelloader.ParserBasedAstProvider<>(language);
}


    /* generated by template core.Method*/
 public  appointments._symboltable.AppointmentsLanguage getModelingLanguage ()  {
      /* generated by template methods.Get*/

return this.modelingLanguage;

}

    /* generated by template core.Method*/
 public  void createSymbolTableFromAST (appointments._ast.ASTAppointment ast,String modelName,appointments._symboltable.IAppointmentsGlobalScope enclosingScope)  {
      /* generated by template _symboltable.modelloader.CreateSymbolTableFromAST*/

  final appointments._symboltable.AppointmentsSymbolTableCreatorDelegator symbolTableCreator =
        getModelingLanguage().getSymbolTableCreator(enclosingScope);

  if (symbolTableCreator != null) {
    Log.debug("Start creation of symbol table for model \"" + modelName + "\".",
    AppointmentsModelLoader.class.getSimpleName());
    final appointments._symboltable.IAppointmentsScope scope = symbolTableCreator.createFromAST(ast);

    if (!(scope instanceof appointments._symboltable.AppointmentsArtifactScope)) {
      Log.warn("0xA7001x050 Top scope of model " + modelName + " is expected to be an artifact scope, but"
                + " is scope \"" + (scope.isPresentName() ? scope.getName() : "") + "\"");
    }

    Log.debug("Created symbol table for model \"" + modelName + "\".", AppointmentsModelLoader.class.getSimpleName());
  }
  else {
    Log.warn("0xA7002x050 No symbol created, because '" + getModelingLanguage().getName()
              + "' does not define a symbol table creator.");
  }
}

    /* generated by template core.Method*/
 public  List<appointments._ast.ASTAppointment> loadModelsIntoScope (String qualifiedModelName,de.monticore.io.paths.ModelPath modelPath,appointments._symboltable.IAppointmentsGlobalScope enclosingScope)  {
      /* generated by template _symboltable.modelloader.LoadModelsIntoScope*/

  if (!loadSymbolsIntoScope(qualifiedModelName, modelPath, enclosingScope)) {
    final List<appointments._ast.ASTAppointment> asts = loadModels(qualifiedModelName, modelPath);
    for (appointments._ast.ASTAppointment ast : asts) {
      createSymbolTableFromAST(ast, qualifiedModelName, enclosingScope);
    }
    showWarningIfParsedModels(asts, qualifiedModelName);
    return asts;
  }
  return new ArrayList<>();
}

    /* generated by template core.Method*/
 public  List<appointments._ast.ASTAppointment> loadModels (String qualifiedModelName,de.monticore.io.paths.ModelPath modelPath)  {
      /* generated by template _symboltable.modelloader.LoadModels*/

  com.google.common.base.Preconditions.checkArgument(!com.google.common.base.Strings.isNullOrEmpty(qualifiedModelName));

  final List<appointments._ast.ASTAppointment> foundModels = new ArrayList<>();

  final de.monticore.io.paths.ModelCoordinate resolvedCoordinate = resolve(qualifiedModelName, modelPath);
  if (resolvedCoordinate.hasLocation()) {
    final appointments._ast.ASTAppointment ast = astProvider.getRootNode(resolvedCoordinate);
    de.monticore.generating.templateengine.reporting.Reporting.reportOpenInputFile(Optional.of(resolvedCoordinate.getParentDirectoryPath()),
    resolvedCoordinate.getQualifiedPath());
    foundModels.add(ast);
  }

  return foundModels;
}

    /* generated by template core.Method*/
 public  boolean loadSymbolsIntoScope (String qualifiedModelName,de.monticore.io.paths.ModelPath modelPath,appointments._symboltable.IAppointmentsGlobalScope enclosingScope)  {
      /* generated by template _symboltable.modelloader.LoadSymbolsIntoScope*/

  final de.monticore.io.paths.ModelCoordinate resolvedCoordinate = resolveSymbol(qualifiedModelName, modelPath);
  if (resolvedCoordinate.hasLocation()) {
    appointments._symboltable.IAppointmentsScope deser  = new appointments._symboltable.serialization.AppointmentsScopeDeSer().load(resolvedCoordinate.getLocation(), enclosingScope);
    enclosingScope.addSubScope(deser);
    return true;
  }
  return false;
}

    /* generated by template core.Method*/
 private  de.monticore.io.paths.ModelCoordinate resolve (String qualifiedModelName,de.monticore.io.paths.ModelPath modelPath)  {
      /* generated by template _symboltable.modelloader.Resolve*/
  String simpleName = de.monticore.utils.Names.getSimpleName(qualifiedModelName);
  java.nio.file.Path qualifiedPath = java.nio.file.Paths.get(
  de.monticore.utils.Names.getPathFromQualifiedName(qualifiedModelName)).resolve(
      simpleName + "." + getModelingLanguage().getFileExtension());
  de.monticore.io.paths.ModelCoordinate qualifiedModel = de.monticore.io.paths.ModelCoordinates.createQualifiedCoordinate(qualifiedPath);

  return modelPath.resolveModel(qualifiedModel);
}

    /* generated by template core.Method*/
 protected  de.monticore.io.paths.ModelCoordinate resolveSymbol (String qualifiedModelName,de.monticore.io.paths.ModelPath modelPath)  {
      /* generated by template _symboltable.modelloader.ResolveSymbol*/
  String simpleName = de.monticore.utils.Names.getSimpleName(qualifiedModelName);
  java.nio.file.Path qualifiedPath = java.nio.file.Paths.get(
            de.monticore.utils.Names.getPathFromQualifiedName(qualifiedModelName)).resolve(
            simpleName + "." + getModelingLanguage().getSymbolFileExtension());
  de.monticore.io.paths.ModelCoordinate qualifiedModel = de.monticore.io.paths.ModelCoordinates.createQualifiedCoordinate(qualifiedPath);

  return modelPath.resolveModel(qualifiedModel);
}

    /* generated by template core.Method*/
 protected  void showWarningIfParsedModels (List<?> asts,String modelName)  {
      /* generated by template _symboltable.modelloader.ShowWarningIfParsedModels*/
  if(!asts.isEmpty()) {
    Log.warn("Symbol for model \""+modelName+"\" found in a model file that has not been translated yet. This works for compatibility reasons, but is deprecated and will be removed soon. Please adjust your building process.");
  }
}

}
