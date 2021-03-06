/* generated from model TravelCosts */
/* generated by template core.Interface*/

/* (c) https://github.com/MontiCore/monticore */
package travelcosts._symboltable;

/* generated by template core.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.monticore.ast.ASTNode;
import de.monticore.ast.Comment;
import de.se_rwth.commons.SourcePosition;
import de.monticore.symboltable.*;


 public  interface ITravelCostsGlobalScope extends travelcosts._symboltable.ITravelCostsScope,de.monticore.symboltable.IGlobalScope {



  /* generated by template core.Method*/
 abstract  public  TravelCostsLanguage getTravelCostsLanguage () ;
  /* generated by template core.Method*/
 abstract  public  void cache (String calculatedModelName) ;
  default /* generated by template core.Method*/
 public  boolean checkIfContinueAsSubScope (String symbolName)  {
      return false;
}

  /* generated by template core.Method*/
 abstract  public  boolean continueWithModelLoader (String calculatedModelName,TravelCostsModelLoader modelLoader) ;
  default /* generated by template core.Method*/
 public  ITravelCostsGlobalScope getRealThis ()  {
      return this;
}

}
