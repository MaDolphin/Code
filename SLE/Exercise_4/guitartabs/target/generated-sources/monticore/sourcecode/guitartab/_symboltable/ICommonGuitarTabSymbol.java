/* generated from model GuitarTab */
/* generated by template core.Interface*/

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


 public  interface ICommonGuitarTabSymbol extends de.monticore.symboltable.ISymbol {



  /* generated by template core.Method*/
 abstract  public  void accept (guitartab._visitor.GuitarTabSymbolVisitor visitor) ;
  /* generated by template core.Method*/
 abstract  public  guitartab._symboltable.IGuitarTabScope getEnclosingScope () ;
  /* generated by template core.Method*/
 abstract  public  void setEnclosingScope (guitartab._symboltable.IGuitarTabScope enclosingScope) ;
}
