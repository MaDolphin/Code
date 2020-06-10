/* generated from model Calendars */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package calendars._symboltable;

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


 public  class CalendarsModelLoader  implements de.monticore.modelloader.IModelLoader<calendars._ast.ASTCalendars,calendars._symboltable.ICalendarsGlobalScope> {

    /* generated by template core.Attribute*/
 protected  final  calendars._symboltable.CalendarsLanguage modelingLanguage ;

    /* generated by template core.Attribute*/
 protected  de.monticore.modelloader.AstProvider<calendars._ast.ASTCalendars> astProvider ;


    /* generated by template core.Constructor*/
 public  CalendarsModelLoader(calendars._symboltable.CalendarsLanguage language)  {
    /* generated by template _symboltable.modelloader.Constructor*/
  this.modelingLanguage = language;
  this.astProvider = new de.monticore.modelloader.ParserBasedAstProvider<>(language);
}


    /* generated by template core.Method*/
 public  calendars._symboltable.CalendarsLanguage getModelingLanguage ()  {
      /* generated by template methods.Get*/

return this.modelingLanguage;

}

    /* generated by template core.Method*/
 public  void createSymbolTableFromAST (calendars._ast.ASTCalendars ast,String modelName,calendars._symboltable.ICalendarsGlobalScope enclosingScope)  {
      /* generated by template _symboltable.modelloader.CreateSymbolTableFromAST*/

  final calendars._symboltable.CalendarsSymbolTableCreatorDelegator symbolTableCreator =
        getModelingLanguage().getSymbolTableCreator(enclosingScope);

  if (symbolTableCreator != null) {
    Log.debug("Start creation of symbol table for model \"" + modelName + "\".",
    CalendarsModelLoader.class.getSimpleName());
    final calendars._symboltable.ICalendarsScope scope = symbolTableCreator.createFromAST(ast);

    if (!(scope instanceof calendars._symboltable.CalendarsArtifactScope)) {
      Log.warn("0xA7001x050 Top scope of model " + modelName + " is expected to be an artifact scope, but"
                + " is scope \"" + (scope.isPresentName() ? scope.getName() : "") + "\"");
    }

    Log.debug("Created symbol table for model \"" + modelName + "\".", CalendarsModelLoader.class.getSimpleName());
  }
  else {
    Log.warn("0xA7002x050 No symbol created, because '" + getModelingLanguage().getName()
              + "' does not define a symbol table creator.");
  }
}

    /* generated by template core.Method*/
 public  List<calendars._ast.ASTCalendars> loadModelsIntoScope (String qualifiedModelName,de.monticore.io.paths.ModelPath modelPath,calendars._symboltable.ICalendarsGlobalScope enclosingScope)  {
      /* generated by template _symboltable.modelloader.LoadModelsIntoScope*/

  if (!loadSymbolsIntoScope(qualifiedModelName, modelPath, enclosingScope)) {
    final List<calendars._ast.ASTCalendars> asts = loadModels(qualifiedModelName, modelPath);
    for (calendars._ast.ASTCalendars ast : asts) {
      createSymbolTableFromAST(ast, qualifiedModelName, enclosingScope);
    }
    showWarningIfParsedModels(asts, qualifiedModelName);
    return asts;
  }
  return new ArrayList<>();
}

    /* generated by template core.Method*/
 public  List<calendars._ast.ASTCalendars> loadModels (String qualifiedModelName,de.monticore.io.paths.ModelPath modelPath)  {
      /* generated by template _symboltable.modelloader.LoadModels*/

  com.google.common.base.Preconditions.checkArgument(!com.google.common.base.Strings.isNullOrEmpty(qualifiedModelName));

  final List<calendars._ast.ASTCalendars> foundModels = new ArrayList<>();

  final de.monticore.io.paths.ModelCoordinate resolvedCoordinate = resolve(qualifiedModelName, modelPath);
  if (resolvedCoordinate.hasLocation()) {
    final calendars._ast.ASTCalendars ast = astProvider.getRootNode(resolvedCoordinate);
    de.monticore.generating.templateengine.reporting.Reporting.reportOpenInputFile(Optional.of(resolvedCoordinate.getParentDirectoryPath()),
    resolvedCoordinate.getQualifiedPath());
    foundModels.add(ast);
  }

  return foundModels;
}

    /* generated by template core.Method*/
 public  boolean loadSymbolsIntoScope (String qualifiedModelName,de.monticore.io.paths.ModelPath modelPath,calendars._symboltable.ICalendarsGlobalScope enclosingScope)  {
      /* generated by template _symboltable.modelloader.LoadSymbolsIntoScope*/

  final de.monticore.io.paths.ModelCoordinate resolvedCoordinate = resolveSymbol(qualifiedModelName, modelPath);
  if (resolvedCoordinate.hasLocation()) {
    calendars._symboltable.ICalendarsScope deser  = new calendars._symboltable.serialization.CalendarsScopeDeSer().load(resolvedCoordinate.getLocation(), enclosingScope);
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