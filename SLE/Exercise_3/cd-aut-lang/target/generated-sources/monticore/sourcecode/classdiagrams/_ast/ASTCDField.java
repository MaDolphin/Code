/* generated from model ClassDiagrams */
/* generated by template core.Interface*/

/* (c) https://github.com/MontiCore/monticore */
package classdiagrams._ast;

/* generated by template core.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.monticore.ast.ASTNode;
import de.monticore.ast.Comment;
import de.se_rwth.commons.SourcePosition;
import de.monticore.symboltable.*;


 public  interface ASTCDField extends de.monticore.ast.ASTNode,classdiagrams._ast.ASTClassDiagramsNode {



  /* generated by template core.Method*/
 abstract  public  boolean deepEquals (Object o) ;
  /* generated by template core.Method*/
 abstract  public  boolean deepEquals (Object o,boolean forceSameOrder) ;
  /* generated by template core.Method*/
 abstract  public  boolean deepEqualsWithComments (Object o) ;
  /* generated by template core.Method*/
 abstract  public  boolean deepEqualsWithComments (Object o,boolean forceSameOrder) ;
  /* generated by template core.Method*/
 abstract  public  boolean equalAttributes (Object o) ;
  /* generated by template core.Method*/
 abstract  public  boolean equalsWithComments (Object o) ;
  /* generated by template core.Method*/
 abstract  public  ASTCDField deepClone () ;
  /* generated by template core.Method*/
 abstract  public  String getName () ;
  /* generated by template core.Method*/
 abstract  public  void setName (String name) ;
  /* generated by template core.Method*/
 abstract  public  void accept (classdiagrams._visitor.ClassDiagramsVisitor visitor) ;
  /* generated by template core.Method*/
 abstract  public  classdiagrams._symboltable.IClassDiagramsScope getEnclosingScope () ;
  /* generated by template core.Method*/
 abstract  public  void setEnclosingScope (classdiagrams._symboltable.IClassDiagramsScope enclosingScope) ;
  /* generated by template core.Method*/
 abstract  public  void setEnclosingScope (de.monticore.types.mcsimplegenerictypes._symboltable.IMCSimpleGenericTypesScope enclosingScope) ;
  /* generated by template core.Method*/
 abstract  public  void setEnclosingScope (de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope enclosingScope) ;
  /* generated by template core.Method*/
 abstract  public  void setEnclosingScope (de.monticore.types.mccollectiontypes._symboltable.IMCCollectionTypesScope enclosingScope) ;
  /* generated by template core.Method*/
 abstract  public  void setEnclosingScope (de.monticore.types.mcbasictypes._symboltable.IMCBasicTypesScope enclosingScope) ;
  /* generated by template core.Method*/
 abstract  public  void setEnclosingScope (de.monticore.mcbasics._symboltable.IMCBasicsScope enclosingScope) ;
  /* generated by template core.Method*/
 abstract  public  void setEnclosingScope (de.monticore.types.typesymbols._symboltable.ITypeSymbolsScope enclosingScope) ;
  /* generated by template core.Method*/
 abstract  public  void setEnclosingScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope enclosingScope) ;
}
