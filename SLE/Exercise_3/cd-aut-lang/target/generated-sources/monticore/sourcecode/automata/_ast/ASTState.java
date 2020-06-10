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


 public  class ASTState extends ASTCNode  implements automata._ast.ASTAutomataNode {

    /* generated by template core.Attribute*/
 protected  String name ;

    /* generated by template core.Attribute*/
 protected  boolean initial ;

    /* generated by template core.Attribute*/
 protected  boolean r__final ;

    /* generated by template core.Attribute*/
 protected  automata._symboltable.IAutomataScope enclosingScope ;


    /* generated by template core.Constructor*/
 protected  ASTState()  {
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

      ASTState comp;
    if ((o instanceof ASTState)) {
      comp = (ASTState) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
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

      ASTState comp;
    if ((o instanceof ASTState)) {
      comp = (ASTState) o;
    } else {
      return false;
    }
    if (!equalsWithComments(comp)) {
      return false;
    }
    return true;     

}

    /* generated by template core.Method*/
 public  boolean equalAttributes (Object o)  {
      /* generated by template data.EqualAttributes*/

      ASTState comp;
    if ((o instanceof ASTState)) {
      comp = (ASTState) o;
    } else {
      return false;
    }
	// comparing name 
    if ( (this.name == null && comp.name != null) 
      || (this.name != null && !this.name.equals(comp.name)) ) {
      return false;
    }
	// comparing initial 
    if (!(this.initial == comp.initial)) {
      return false;
    }
	// comparing r__final 
    if (!(this.r__final == comp.r__final)) {
      return false;
    }
    return true;


}

    /* generated by template core.Method*/
 public  boolean equalsWithComments (Object o)  {
      /* generated by template data.EqualsWithComments*/

      ASTState comp;
    if ((o instanceof ASTState)) {
      comp = (ASTState) o;
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
 public  ASTState deepClone ()  {
          return deepClone(_construct());
}

    /* generated by template core.Method*/
 public  ASTState deepClone (ASTState result)  {
      /* generated by template data.DeepCloneWithParameters*/

    super.deepClone(result);

      result.setName(getName());
    result.setInitial(isInitial());
    result.setFinal(isFinal());
      result.setEnclosingScope(getEnclosingScope());
    
    return result;

}

    /* generated by template core.Method*/
 public  String getName ()  {
      /* generated by template methods.Get*/

return this.name;

}

    /* generated by template core.Method*/
 public  boolean isInitial ()  {
      /* generated by template methods.Get*/

return this.initial;

}

    /* generated by template core.Method*/
 public  boolean isFinal ()  {
      /* generated by template methods.Get*/

return this.r__final;

}

    /* generated by template core.Method*/
 public  void setName (String name)  {
      /* generated by template methods.Set*/

this.name = name;

}

    /* generated by template core.Method*/
 public  void setInitial (boolean initial)  {
      /* generated by template methods.Set*/

this.initial = initial;

}

    /* generated by template core.Method*/
 public  void setFinal (boolean r__final)  {
      /* generated by template methods.Set*/

this.r__final = r__final;

}

    /* generated by template core.Method*/
 public  void accept (automata._visitor.AutomataVisitor visitor)  {
      /* generated by template _ast.ast_class.Accept*/

      visitor.handle(this);

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.types.mcbasictypes._visitor.MCBasicTypesVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof automata._visitor.AutomataVisitor) {
    accept((automata._visitor.AutomataVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x124 AST node type ASTState expected a visitor of type automata._visitor.AutomataVisitor, but got de.monticore.types.mcbasictypes._visitor.MCBasicTypesVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.mcbasics._visitor.MCBasicsVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof automata._visitor.AutomataVisitor) {
    accept((automata._visitor.AutomataVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x124 AST node type ASTState expected a visitor of type automata._visitor.AutomataVisitor, but got de.monticore.mcbasics._visitor.MCBasicsVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.types.typesymbols._visitor.TypeSymbolsVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof automata._visitor.AutomataVisitor) {
    accept((automata._visitor.AutomataVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x124 AST node type ASTState expected a visitor of type automata._visitor.AutomataVisitor, but got de.monticore.types.typesymbols._visitor.TypeSymbolsVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 protected  ASTState _construct ()  {
      return automata._ast.AutomataNodeFactory.createASTState();
}

    /* generated by template core.Method*/
 public  Collection<de.monticore.ast.ASTNode> get_Children ()  {
      /* generated by template _ast.ast_class.GetChildren*/

    java.util.LinkedList<de.monticore.ast.ASTNode> result = new java.util.LinkedList<de.monticore.ast.ASTNode>();
    return result;

}

    /* generated by template core.Method*/
 public  automata._symboltable.IAutomataScope getEnclosingScope ()  {
      /* generated by template methods.Get*/

return this.enclosingScope;

}

    /* generated by template core.Method*/
 public  void setEnclosingScope (automata._symboltable.IAutomataScope enclosingScope)  {
      /* generated by template methods.Set*/

this.enclosingScope = enclosingScope;

}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.types.mcbasictypes._symboltable.IMCBasicTypesScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof automata._symboltable.IAutomataScope){
    this.enclosingScope = (automata._symboltable.IAutomataScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x333The EnclosingScope form type de.monticore.types.mcbasictypes._symboltable.IMCBasicTypesScope could not be casted to the type automata._symboltable.IAutomataScope. Please call the Method setEnclosingScope with a parameter form type automata._symboltable.IAutomataScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.mcbasics._symboltable.IMCBasicsScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof automata._symboltable.IAutomataScope){
    this.enclosingScope = (automata._symboltable.IAutomataScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x829The EnclosingScope form type de.monticore.mcbasics._symboltable.IMCBasicsScope could not be casted to the type automata._symboltable.IAutomataScope. Please call the Method setEnclosingScope with a parameter form type automata._symboltable.IAutomataScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.types.typesymbols._symboltable.ITypeSymbolsScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof automata._symboltable.IAutomataScope){
    this.enclosingScope = (automata._symboltable.IAutomataScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x064The EnclosingScope form type de.monticore.types.typesymbols._symboltable.ITypeSymbolsScope could not be casted to the type automata._symboltable.IAutomataScope. Please call the Method setEnclosingScope with a parameter form type automata._symboltable.IAutomataScope");
  }
}

}
