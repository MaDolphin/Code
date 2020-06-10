/* generated from model TravelCosts */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package travelcosts._ast;

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


 public  class ASTTravelNumber extends ASTCNode  implements travelcosts._ast.ASTTravelCostsNode {

    /* generated by template core.Attribute*/
 protected  de.monticore.literals.mccommonliterals._ast.ASTNatLiteral travelNo ;

    /* generated by template core.Attribute*/
 protected  travelcosts._symboltable.ITravelCostsScope enclosingScope ;


    /* generated by template core.Constructor*/
 protected  ASTTravelNumber()  {
    /* generated by template core.EmptyBody*/
// empty body

}


    /* generated by template core.Method*/
 public  boolean deepEquals (Object o)  {
           return deepEquals(o, true);
}

    /* generated by template core.Method*/
 public  boolean deepEquals (Object o,boolean forceSameOrder)  {
      /* generated by template data.DeepEqualsWithOrder*/

      ASTTravelNumber comp;
    if ((o instanceof ASTTravelNumber)) {
      comp = (ASTTravelNumber) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
     // comparing travelNo
     if ( (this.travelNo == null && comp.travelNo != null) ||
        (this.travelNo != null && !this.travelNo.deepEquals(comp.travelNo, forceSameOrder)) ) {
        return false;
     }
    return true;     


}

    /* generated by template core.Method*/
 public  boolean deepEqualsWithComments (Object o)  {
           return deepEqualsWithComments(o, true);
}

    /* generated by template core.Method*/
 public  boolean deepEqualsWithComments (Object o,boolean forceSameOrder)  {
      /* generated by template data.DeepEqualsWithComments*/

      ASTTravelNumber comp;
    if ((o instanceof ASTTravelNumber)) {
      comp = (ASTTravelNumber) o;
    } else {
      return false;
    }
    if (!equalsWithComments(comp)) {
      return false;
    }
      // comparing travelNo
      if ( (this.travelNo == null && comp.travelNo != null) ||
        (this.travelNo != null && !this.travelNo.deepEqualsWithComments(comp.travelNo, forceSameOrder)) ) {
        return false;
      }
    return true;     

}

    /* generated by template core.Method*/
 public  boolean equalAttributes (Object o)  {
      /* generated by template data.EqualAttributes*/

    return o instanceof ASTTravelNumber;


}

    /* generated by template core.Method*/
 public  boolean equalsWithComments (Object o)  {
      /* generated by template data.EqualsWithComments*/

      ASTTravelNumber comp;
    if ((o instanceof ASTTravelNumber)) {
      comp = (ASTTravelNumber) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    // comparing comments
    if (get_PreCommentList().size() == comp.get_PreCommentList().size()) {
      java.util.Iterator<de.monticore.ast.Comment> one = get_PreCommentList().iterator();
      java.util.Iterator<de.monticore.ast.Comment> two = comp.get_PreCommentList().iterator();
      while (one.hasNext()) {
        if (!one.next().equals(two.next())) {
          return false;
        }
      }
    } else {
      return false;
    }
    
    if (get_PostCommentList().size() == comp.get_PostCommentList().size()) {
      java.util.Iterator<de.monticore.ast.Comment> one = get_PostCommentList().iterator();
      java.util.Iterator<de.monticore.ast.Comment> two = comp.get_PostCommentList().iterator();
      while (one.hasNext()) {
        if (!one.next().equals(two.next())) {
          return false;
        }
      }
    } else {
      return false;
    }
    return true;

}

    /* generated by template core.Method*/
 public  ASTTravelNumber deepClone ()  {
          return deepClone(_construct());
}

    /* generated by template core.Method*/
 public  ASTTravelNumber deepClone (ASTTravelNumber result)  {
      /* generated by template data.DeepCloneWithParameters*/

    super.deepClone(result);

    result.setTravelNo(getTravelNo().deepClone());
      result.setEnclosingScope(getEnclosingScope());
    
    return result;

}

    /* generated by template core.Method*/
 public  de.monticore.literals.mccommonliterals._ast.ASTNatLiteral getTravelNo ()  {
      /* generated by template methods.Get*/

return this.travelNo;

}

    /* generated by template core.Method*/
 public  void setTravelNo (de.monticore.literals.mccommonliterals._ast.ASTNatLiteral travelNo)  {
      /* generated by template methods.Set*/

this.travelNo = travelNo;

}

    /* generated by template core.Method*/
 public  void accept (travelcosts._visitor.TravelCostsVisitor visitor)  {
      /* generated by template _ast.ast_class.Accept*/

      visitor.handle(this);

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof travelcosts._visitor.TravelCostsVisitor) {
    accept((travelcosts._visitor.TravelCostsVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x502 AST node type ASTTravelNumber expected a visitor of type travelcosts._visitor.TravelCostsVisitor, but got de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.mcbasics._visitor.MCBasicsVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof travelcosts._visitor.TravelCostsVisitor) {
    accept((travelcosts._visitor.TravelCostsVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x502 AST node type ASTTravelNumber expected a visitor of type travelcosts._visitor.TravelCostsVisitor, but got de.monticore.mcbasics._visitor.MCBasicsVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof travelcosts._visitor.TravelCostsVisitor) {
    accept((travelcosts._visitor.TravelCostsVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x502 AST node type ASTTravelNumber expected a visitor of type travelcosts._visitor.TravelCostsVisitor, but got de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 protected  ASTTravelNumber _construct ()  {
      return travelcosts._ast.TravelCostsNodeFactory.createASTTravelNumber();
}

    /* generated by template core.Method*/
 public  Collection<de.monticore.ast.ASTNode> get_Children ()  {
      /* generated by template _ast.ast_class.GetChildren*/

    java.util.LinkedList<de.monticore.ast.ASTNode> result = new java.util.LinkedList<de.monticore.ast.ASTNode>();
        if ( getTravelNo() != null ) {
          result.add(getTravelNo());
        }
    return result;

}

    /* generated by template core.Method*/
 public  travelcosts._symboltable.ITravelCostsScope getEnclosingScope ()  {
      /* generated by template methods.Get*/

return this.enclosingScope;

}

    /* generated by template core.Method*/
 public  void setEnclosingScope (travelcosts._symboltable.ITravelCostsScope enclosingScope)  {
      /* generated by template methods.Set*/

this.enclosingScope = enclosingScope;

}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof travelcosts._symboltable.ITravelCostsScope){
    this.enclosingScope = (travelcosts._symboltable.ITravelCostsScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x687The EnclosingScope form type de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope could not be casted to the type travelcosts._symboltable.ITravelCostsScope. Please call the Method setEnclosingScope with a parameter form type travelcosts._symboltable.ITravelCostsScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.mcbasics._symboltable.IMCBasicsScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof travelcosts._symboltable.ITravelCostsScope){
    this.enclosingScope = (travelcosts._symboltable.ITravelCostsScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x985The EnclosingScope form type de.monticore.mcbasics._symboltable.IMCBasicsScope could not be casted to the type travelcosts._symboltable.ITravelCostsScope. Please call the Method setEnclosingScope with a parameter form type travelcosts._symboltable.ITravelCostsScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof travelcosts._symboltable.ITravelCostsScope){
    this.enclosingScope = (travelcosts._symboltable.ITravelCostsScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x807The EnclosingScope form type de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope could not be casted to the type travelcosts._symboltable.ITravelCostsScope. Please call the Method setEnclosingScope with a parameter form type travelcosts._symboltable.ITravelCostsScope");
  }
}

}