/* generated from model Automata */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package automata._ast;

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


 public  class AutomataNodeFactory  {

    /* generated by template core.Attribute*/
 protected  static  AutomataNodeFactory factory ;

    /* generated by template core.Attribute*/
 protected  static  AutomataNodeFactory factoryASTAutomaton ;

    /* generated by template core.Attribute*/
 protected  static  AutomataNodeFactory factoryASTState ;

    /* generated by template core.Attribute*/
 protected  static  AutomataNodeFactory factoryASTTransition ;


    /* generated by template core.Constructor*/
 protected  AutomataNodeFactory()  {
    /* generated by template core.EmptyBody*/
// empty body

}


    /* generated by template core.Method*/
 private  static  AutomataNodeFactory getFactory ()  {
      /* generated by template _ast.nodefactory.GetFactory*/

  if (factory == null) {
    factory = new AutomataNodeFactory();
  }
  return factory;

}

    /* generated by template core.Method*/
 public  static  ASTAutomaton createASTAutomaton ()  {
      /* generated by template _ast.nodefactory.Create*/

  {
    if (factoryASTAutomaton == null) {
      factoryASTAutomaton = getFactory();
    }
    return factoryASTAutomaton.doCreateASTAutomaton();
  }

}

    /* generated by template core.Method*/
 protected  ASTAutomaton doCreateASTAutomaton ()  {
      /* generated by template _ast.nodefactory.DoCreate*/

  {
    return new ASTAutomaton();
  }

}

    /* generated by template core.Method*/
 public  static  ASTState createASTState ()  {
      /* generated by template _ast.nodefactory.Create*/

  {
    if (factoryASTState == null) {
      factoryASTState = getFactory();
    }
    return factoryASTState.doCreateASTState();
  }

}

    /* generated by template core.Method*/
 protected  ASTState doCreateASTState ()  {
      /* generated by template _ast.nodefactory.DoCreate*/

  {
    return new ASTState();
  }

}

    /* generated by template core.Method*/
 public  static  ASTTransition createASTTransition ()  {
      /* generated by template _ast.nodefactory.Create*/

  {
    if (factoryASTTransition == null) {
      factoryASTTransition = getFactory();
    }
    return factoryASTTransition.doCreateASTTransition();
  }

}

    /* generated by template core.Method*/
 protected  ASTTransition doCreateASTTransition ()  {
      /* generated by template _ast.nodefactory.DoCreate*/

  {
    return new ASTTransition();
  }

}

}
