/* generated from model ClassDiagrams */
/* generated by template core.Class*/

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
import de.monticore.ast.ASTCNode;


 public  class ASTCDAttribute extends ASTCNode  implements classdiagrams._ast.ASTCDField,classdiagrams._ast.ASTClassDiagramsNode {

    /* generated by template core.Attribute*/
 protected  Optional<classdiagrams._ast.ASTModifier> modifier = Optional.empty();

    /* generated by template core.Attribute*/
 protected  de.monticore.types.mcbasictypes._ast.ASTMCType mCType ;

    /* generated by template core.Attribute*/
 protected  String name ;

    /* generated by template core.Attribute*/
 protected  classdiagrams._symboltable.IClassDiagramsScope enclosingScope ;


    /* generated by template core.Constructor*/
 protected  ASTCDAttribute()  {
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

      ASTCDAttribute comp;
    if ((o instanceof ASTCDAttribute)) {
      comp = (ASTCDAttribute) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    // comparing modifier   
    if ( this.modifier.isPresent() != comp.modifier.isPresent() ||
      (this.modifier.isPresent() && !this.modifier.get().deepEquals(comp.modifier.get(), forceSameOrder)) ) {
      return false;
    }
     // comparing mCType
     if ( (this.mCType == null && comp.mCType != null) ||
        (this.mCType != null && !this.mCType.deepEquals(comp.mCType, forceSameOrder)) ) {
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

      ASTCDAttribute comp;
    if ((o instanceof ASTCDAttribute)) {
      comp = (ASTCDAttribute) o;
    } else {
      return false;
    }
    if (!equalsWithComments(comp)) {
      return false;
    }
    // comparing modifier
    if ( this.modifier.isPresent() != comp.modifier.isPresent() ||
      (this.modifier.isPresent() && !this.modifier.get().deepEqualsWithComments(comp.modifier.get(), forceSameOrder)) ) {
      return false;
    }
      // comparing mCType
      if ( (this.mCType == null && comp.mCType != null) ||
        (this.mCType != null && !this.mCType.deepEqualsWithComments(comp.mCType, forceSameOrder)) ) {
        return false;
      }
    return true;     

}

    /* generated by template core.Method*/
 public  boolean equalAttributes (Object o)  {
      /* generated by template data.EqualAttributes*/

      ASTCDAttribute comp;
    if ((o instanceof ASTCDAttribute)) {
      comp = (ASTCDAttribute) o;
    } else {
      return false;
    }
	// comparing name 
    if ( (this.name == null && comp.name != null) 
      || (this.name != null && !this.name.equals(comp.name)) ) {
      return false;
    }
    return true;


}

    /* generated by template core.Method*/
 public  boolean equalsWithComments (Object o)  {
      /* generated by template data.EqualsWithComments*/

      ASTCDAttribute comp;
    if ((o instanceof ASTCDAttribute)) {
      comp = (ASTCDAttribute) o;
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
 public  ASTCDAttribute deepClone ()  {
          return deepClone(_construct());
}

    /* generated by template core.Method*/
 public  ASTCDAttribute deepClone (ASTCDAttribute result)  {
      /* generated by template data.DeepCloneWithParameters*/

    super.deepClone(result);

    if (isPresentModifier()){
      result.setModifier(getModifier().deepClone());
    } else {
      result.setModifierAbsent();
    }
    result.setMCType(getMCType().deepClone());
      result.setName(getName());
      result.setEnclosingScope(getEnclosingScope());
    
    return result;

}

    /* generated by template core.Method*/
 public  classdiagrams._ast.ASTModifier getModifier ()  {
      /* generated by template methods.opt.Get*/

if (isPresentModifier()) {
return this.modifier.get();
}
Log.error("0xA7003x765 Modifier can't return a value. It is empty.");
// Normally this statement is not reachable
throw new IllegalStateException();

}

    /* generated by template core.Method*/
 public  boolean isPresentModifier ()  {
      /* generated by template methods.opt.IsPresent*/

return this.modifier.isPresent();

}

    /* generated by template core.Method*/
 public  de.monticore.types.mcbasictypes._ast.ASTMCType getMCType ()  {
      /* generated by template methods.Get*/

return this.mCType;

}

    /* generated by template core.Method*/
 public  String getName ()  {
      /* generated by template methods.Get*/

return this.name;

}

    /* generated by template core.Method*/
 public  void setModifier (classdiagrams._ast.ASTModifier modifier)  {
      /* generated by template methods.opt.Set*/

this.modifier = Optional.ofNullable(modifier);

}

    /* generated by template core.Method*/
 public  void setModifierAbsent ()  {
      /* generated by template methods.opt.SetAbsent*/

this.modifier = Optional.empty();

}

    /* generated by template core.Method*/
 public  void setMCType (de.monticore.types.mcbasictypes._ast.ASTMCType mCType)  {
      /* generated by template methods.Set*/

this.mCType = mCType;

}

    /* generated by template core.Method*/
 public  void setName (String name)  {
      /* generated by template methods.Set*/

this.name = name;

}

    /* generated by template core.Method*/
 public  void accept (classdiagrams._visitor.ClassDiagramsVisitor visitor)  {
      /* generated by template _ast.ast_class.Accept*/

      visitor.handle(this);

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.types.mcsimplegenerictypes._visitor.MCSimpleGenericTypesVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof classdiagrams._visitor.ClassDiagramsVisitor) {
    accept((classdiagrams._visitor.ClassDiagramsVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x131 AST node type ASTCDAttribute expected a visitor of type classdiagrams._visitor.ClassDiagramsVisitor, but got de.monticore.types.mcsimplegenerictypes._visitor.MCSimpleGenericTypesVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof classdiagrams._visitor.ClassDiagramsVisitor) {
    accept((classdiagrams._visitor.ClassDiagramsVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x131 AST node type ASTCDAttribute expected a visitor of type classdiagrams._visitor.ClassDiagramsVisitor, but got de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.types.mccollectiontypes._visitor.MCCollectionTypesVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof classdiagrams._visitor.ClassDiagramsVisitor) {
    accept((classdiagrams._visitor.ClassDiagramsVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x131 AST node type ASTCDAttribute expected a visitor of type classdiagrams._visitor.ClassDiagramsVisitor, but got de.monticore.types.mccollectiontypes._visitor.MCCollectionTypesVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.types.mcbasictypes._visitor.MCBasicTypesVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof classdiagrams._visitor.ClassDiagramsVisitor) {
    accept((classdiagrams._visitor.ClassDiagramsVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x131 AST node type ASTCDAttribute expected a visitor of type classdiagrams._visitor.ClassDiagramsVisitor, but got de.monticore.types.mcbasictypes._visitor.MCBasicTypesVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.mcbasics._visitor.MCBasicsVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof classdiagrams._visitor.ClassDiagramsVisitor) {
    accept((classdiagrams._visitor.ClassDiagramsVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x131 AST node type ASTCDAttribute expected a visitor of type classdiagrams._visitor.ClassDiagramsVisitor, but got de.monticore.mcbasics._visitor.MCBasicsVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.types.typesymbols._visitor.TypeSymbolsVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof classdiagrams._visitor.ClassDiagramsVisitor) {
    accept((classdiagrams._visitor.ClassDiagramsVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x131 AST node type ASTCDAttribute expected a visitor of type classdiagrams._visitor.ClassDiagramsVisitor, but got de.monticore.types.typesymbols._visitor.TypeSymbolsVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof classdiagrams._visitor.ClassDiagramsVisitor) {
    accept((classdiagrams._visitor.ClassDiagramsVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x131 AST node type ASTCDAttribute expected a visitor of type classdiagrams._visitor.ClassDiagramsVisitor, but got de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 protected  ASTCDAttribute _construct ()  {
      return classdiagrams._ast.ClassDiagramsNodeFactory.createASTCDAttribute();
}

    /* generated by template core.Method*/
 public  Collection<de.monticore.ast.ASTNode> get_Children ()  {
      /* generated by template _ast.ast_class.GetChildren*/

    java.util.LinkedList<de.monticore.ast.ASTNode> result = new java.util.LinkedList<de.monticore.ast.ASTNode>();
        if (isPresentModifier()) {
          result.add(getModifier());
        }
        if ( getMCType() != null ) {
          result.add(getMCType());
        }
    return result;

}

    /* generated by template core.Method*/
 public  classdiagrams._symboltable.IClassDiagramsScope getEnclosingScope ()  {
      /* generated by template methods.Get*/

return this.enclosingScope;

}

    /* generated by template core.Method*/
 public  void setEnclosingScope (classdiagrams._symboltable.IClassDiagramsScope enclosingScope)  {
      /* generated by template methods.Set*/

this.enclosingScope = enclosingScope;

}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.types.mcsimplegenerictypes._symboltable.IMCSimpleGenericTypesScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof classdiagrams._symboltable.IClassDiagramsScope){
    this.enclosingScope = (classdiagrams._symboltable.IClassDiagramsScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x399The EnclosingScope form type de.monticore.types.mcsimplegenerictypes._symboltable.IMCSimpleGenericTypesScope could not be casted to the type classdiagrams._symboltable.IClassDiagramsScope. Please call the Method setEnclosingScope with a parameter form type classdiagrams._symboltable.IClassDiagramsScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof classdiagrams._symboltable.IClassDiagramsScope){
    this.enclosingScope = (classdiagrams._symboltable.IClassDiagramsScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x658The EnclosingScope form type de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope could not be casted to the type classdiagrams._symboltable.IClassDiagramsScope. Please call the Method setEnclosingScope with a parameter form type classdiagrams._symboltable.IClassDiagramsScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.types.mccollectiontypes._symboltable.IMCCollectionTypesScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof classdiagrams._symboltable.IClassDiagramsScope){
    this.enclosingScope = (classdiagrams._symboltable.IClassDiagramsScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x861The EnclosingScope form type de.monticore.types.mccollectiontypes._symboltable.IMCCollectionTypesScope could not be casted to the type classdiagrams._symboltable.IClassDiagramsScope. Please call the Method setEnclosingScope with a parameter form type classdiagrams._symboltable.IClassDiagramsScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.types.mcbasictypes._symboltable.IMCBasicTypesScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof classdiagrams._symboltable.IClassDiagramsScope){
    this.enclosingScope = (classdiagrams._symboltable.IClassDiagramsScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x004The EnclosingScope form type de.monticore.types.mcbasictypes._symboltable.IMCBasicTypesScope could not be casted to the type classdiagrams._symboltable.IClassDiagramsScope. Please call the Method setEnclosingScope with a parameter form type classdiagrams._symboltable.IClassDiagramsScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.mcbasics._symboltable.IMCBasicsScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof classdiagrams._symboltable.IClassDiagramsScope){
    this.enclosingScope = (classdiagrams._symboltable.IClassDiagramsScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x501The EnclosingScope form type de.monticore.mcbasics._symboltable.IMCBasicsScope could not be casted to the type classdiagrams._symboltable.IClassDiagramsScope. Please call the Method setEnclosingScope with a parameter form type classdiagrams._symboltable.IClassDiagramsScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.types.typesymbols._symboltable.ITypeSymbolsScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof classdiagrams._symboltable.IClassDiagramsScope){
    this.enclosingScope = (classdiagrams._symboltable.IClassDiagramsScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x949The EnclosingScope form type de.monticore.types.typesymbols._symboltable.ITypeSymbolsScope could not be casted to the type classdiagrams._symboltable.IClassDiagramsScope. Please call the Method setEnclosingScope with a parameter form type classdiagrams._symboltable.IClassDiagramsScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof classdiagrams._symboltable.IClassDiagramsScope){
    this.enclosingScope = (classdiagrams._symboltable.IClassDiagramsScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x723The EnclosingScope form type de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope could not be casted to the type classdiagrams._symboltable.IClassDiagramsScope. Please call the Method setEnclosingScope with a parameter form type classdiagrams._symboltable.IClassDiagramsScope");
  }
}

}
