/* generated from model Appointments */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package appointments._ast;

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


 public  class ASTBreak extends ASTCNode  implements appointments._ast.ASTAppointmentsNode {

    /* generated by template core.Attribute*/
 protected  appointments._ast.ASTStart start ;

    /* generated by template core.Attribute*/
 protected  appointments._ast.ASTEnd end ;

    /* generated by template core.Attribute*/
 protected  appointments._symboltable.IAppointmentsScope enclosingScope ;


    /* generated by template core.Constructor*/
 protected  ASTBreak()  {
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

      ASTBreak comp;
    if ((o instanceof ASTBreak)) {
      comp = (ASTBreak) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
     // comparing start
     if ( (this.start == null && comp.start != null) ||
        (this.start != null && !this.start.deepEquals(comp.start, forceSameOrder)) ) {
        return false;
     }
     // comparing end
     if ( (this.end == null && comp.end != null) ||
        (this.end != null && !this.end.deepEquals(comp.end, forceSameOrder)) ) {
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

      ASTBreak comp;
    if ((o instanceof ASTBreak)) {
      comp = (ASTBreak) o;
    } else {
      return false;
    }
    if (!equalsWithComments(comp)) {
      return false;
    }
      // comparing start
      if ( (this.start == null && comp.start != null) ||
        (this.start != null && !this.start.deepEqualsWithComments(comp.start, forceSameOrder)) ) {
        return false;
      }
      // comparing end
      if ( (this.end == null && comp.end != null) ||
        (this.end != null && !this.end.deepEqualsWithComments(comp.end, forceSameOrder)) ) {
        return false;
      }
    return true;     

}

    /* generated by template core.Method*/
 public  boolean equalAttributes (Object o)  {
      /* generated by template data.EqualAttributes*/

    return o instanceof ASTBreak;


}

    /* generated by template core.Method*/
 public  boolean equalsWithComments (Object o)  {
      /* generated by template data.EqualsWithComments*/

      ASTBreak comp;
    if ((o instanceof ASTBreak)) {
      comp = (ASTBreak) o;
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
 public  ASTBreak deepClone ()  {
          return deepClone(_construct());
}

    /* generated by template core.Method*/
 public  ASTBreak deepClone (ASTBreak result)  {
      /* generated by template data.DeepCloneWithParameters*/

    super.deepClone(result);

    result.setStart(getStart().deepClone());
    result.setEnd(getEnd().deepClone());
      result.setEnclosingScope(getEnclosingScope());
    
    return result;

}

    /* generated by template core.Method*/
 public  appointments._ast.ASTStart getStart ()  {
      /* generated by template methods.Get*/

return this.start;

}

    /* generated by template core.Method*/
 public  appointments._ast.ASTEnd getEnd ()  {
      /* generated by template methods.Get*/

return this.end;

}

    /* generated by template core.Method*/
 public  void setStart (appointments._ast.ASTStart start)  {
      /* generated by template methods.Set*/

this.start = start;

}

    /* generated by template core.Method*/
 public  void setEnd (appointments._ast.ASTEnd end)  {
      /* generated by template methods.Set*/

this.end = end;

}

    /* generated by template core.Method*/
 public  void accept (appointments._visitor.AppointmentsVisitor visitor)  {
      /* generated by template _ast.ast_class.Accept*/

      visitor.handle(this);

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof appointments._visitor.AppointmentsVisitor) {
    accept((appointments._visitor.AppointmentsVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x022 AST node type ASTBreak expected a visitor of type appointments._visitor.AppointmentsVisitor, but got de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.mcbasics._visitor.MCBasicsVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof appointments._visitor.AppointmentsVisitor) {
    accept((appointments._visitor.AppointmentsVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x022 AST node type ASTBreak expected a visitor of type appointments._visitor.AppointmentsVisitor, but got de.monticore.mcbasics._visitor.MCBasicsVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof appointments._visitor.AppointmentsVisitor) {
    accept((appointments._visitor.AppointmentsVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x022 AST node type ASTBreak expected a visitor of type appointments._visitor.AppointmentsVisitor, but got de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 protected  ASTBreak _construct ()  {
      return appointments._ast.AppointmentsNodeFactory.createASTBreak();
}

    /* generated by template core.Method*/
 public  Collection<de.monticore.ast.ASTNode> get_Children ()  {
      /* generated by template _ast.ast_class.GetChildren*/

    java.util.LinkedList<de.monticore.ast.ASTNode> result = new java.util.LinkedList<de.monticore.ast.ASTNode>();
        if ( getStart() != null ) {
          result.add(getStart());
        }
        if ( getEnd() != null ) {
          result.add(getEnd());
        }
    return result;

}

    /* generated by template core.Method*/
 public  appointments._symboltable.IAppointmentsScope getEnclosingScope ()  {
      /* generated by template methods.Get*/

return this.enclosingScope;

}

    /* generated by template core.Method*/
 public  void setEnclosingScope (appointments._symboltable.IAppointmentsScope enclosingScope)  {
      /* generated by template methods.Set*/

this.enclosingScope = enclosingScope;

}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof appointments._symboltable.IAppointmentsScope){
    this.enclosingScope = (appointments._symboltable.IAppointmentsScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x363The EnclosingScope form type de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope could not be casted to the type appointments._symboltable.IAppointmentsScope. Please call the Method setEnclosingScope with a parameter form type appointments._symboltable.IAppointmentsScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.mcbasics._symboltable.IMCBasicsScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof appointments._symboltable.IAppointmentsScope){
    this.enclosingScope = (appointments._symboltable.IAppointmentsScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x176The EnclosingScope form type de.monticore.mcbasics._symboltable.IMCBasicsScope could not be casted to the type appointments._symboltable.IAppointmentsScope. Please call the Method setEnclosingScope with a parameter form type appointments._symboltable.IAppointmentsScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof appointments._symboltable.IAppointmentsScope){
    this.enclosingScope = (appointments._symboltable.IAppointmentsScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x203The EnclosingScope form type de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope could not be casted to the type appointments._symboltable.IAppointmentsScope. Please call the Method setEnclosingScope with a parameter form type appointments._symboltable.IAppointmentsScope");
  }
}

}