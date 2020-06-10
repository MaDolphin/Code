/* generated from model AppointmentsFlexibilized */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package appointmentsflexibilized._ast;

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


 public  class ASTParticipants extends ASTCNode  implements appointmentsflexibilized._ast.ASTI,appointmentsflexibilized._ast.ASTAppointmentsFlexibilizedNode {

    /* generated by template core.Attribute*/
 protected  java.util.List<String> strings = new java.util.ArrayList<>();

    /* generated by template core.Attribute*/
 protected  appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope enclosingScope ;


    /* generated by template core.Constructor*/
 protected  ASTParticipants()  {
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

      ASTParticipants comp;
    if ((o instanceof ASTParticipants)) {
      comp = (ASTParticipants) o;
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

      ASTParticipants comp;
    if ((o instanceof ASTParticipants)) {
      comp = (ASTParticipants) o;
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

      ASTParticipants comp;
    if ((o instanceof ASTParticipants)) {
      comp = (ASTParticipants) o;
    } else {
      return false;
    }
	// comparing strings 
    if ( (this.strings == null && comp.strings != null) 
      || (this.strings != null && !this.strings.equals(comp.strings)) ) {
      return false;
    }
    return true;


}

    /* generated by template core.Method*/
 public  boolean equalsWithComments (Object o)  {
      /* generated by template data.EqualsWithComments*/

      ASTParticipants comp;
    if ((o instanceof ASTParticipants)) {
      comp = (ASTParticipants) o;
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
 public  ASTParticipants deepClone ()  {
          return deepClone(_construct());
}

    /* generated by template core.Method*/
 public  ASTParticipants deepClone (ASTParticipants result)  {
      /* generated by template data.DeepCloneWithParameters*/

    super.deepClone(result);

      for ( int i = 0; i < this.getStringList().size() ; i++ ) {
      result.addString(getString(i));
      }
      result.setEnclosingScope(getEnclosingScope());
    
    return result;

}

    /* generated by template core.Method*/
 public  boolean containsString (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().contains(element);

}

    /* generated by template core.Method*/
 public  boolean containsAllStrings (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().containsAll(collection);

}

    /* generated by template core.Method*/
 public  boolean isEmptyStrings ()  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().isEmpty();

}

    /* generated by template core.Method*/
 public  Iterator<String> iteratorStrings ()  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().iterator();

}

    /* generated by template core.Method*/
 public  int sizeStrings ()  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().size();

}

    /* generated by template core.Method*/
 public  String[] toArrayStrings (String[] array)  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().toArray(array);

}

    /* generated by template core.Method*/
 public  Object[] toArrayStrings ()  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().toArray();

}

    /* generated by template core.Method*/
 public  Spliterator<String> spliteratorStrings ()  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().spliterator();

}

    /* generated by template core.Method*/
 public  Stream<String> streamStrings ()  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().stream();

}

    /* generated by template core.Method*/
 public  Stream<String> parallelStreamStrings ()  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().parallelStream();

}

    /* generated by template core.Method*/
 public  String getString (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().get(index);

}

    /* generated by template core.Method*/
 public  int indexOfString (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().indexOf(element);

}

    /* generated by template core.Method*/
 public  int lastIndexOfString (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().lastIndexOf(element);

}

    /* generated by template core.Method*/
 public  boolean equalsStrings (Object o)  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().equals(o);

}

    /* generated by template core.Method*/
 public  int hashCodeStrings ()  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().hashCode();

}

    /* generated by template core.Method*/
 public  ListIterator<String> listIteratorStrings ()  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().listIterator();

}

    /* generated by template core.Method*/
 public  ListIterator<String> listIteratorStrings (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().listIterator(index);

}

    /* generated by template core.Method*/
 public  List<String> subListStrings (int start,int end)  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().subList(start, end);

}

    /* generated by template core.Method*/
 public  List<String> getStringList ()  {
      /* generated by template methods.Get*/

return this.strings;

}

    /* generated by template core.Method*/
 public  void clearStrings ()  {
      /* generated by template methods.MethodDelegate*/

this.getStringList().clear();

}

    /* generated by template core.Method*/
 public  boolean addString (String element)  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().add(element);

}

    /* generated by template core.Method*/
 public  boolean addAllStrings (Collection<? extends String> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().addAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeString (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().remove(element);

}

    /* generated by template core.Method*/
 public  boolean removeAllStrings (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().removeAll(collection);

}

    /* generated by template core.Method*/
 public  boolean retainAllStrings (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().retainAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeIfString (Predicate<? super String> filter)  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().removeIf(filter);

}

    /* generated by template core.Method*/
 public  void forEachStrings (Consumer<? super String> action)  {
      /* generated by template methods.MethodDelegate*/

this.getStringList().forEach(action);

}

    /* generated by template core.Method*/
 public  void addString (int index,String element)  {
      /* generated by template methods.MethodDelegate*/

this.getStringList().add(index, element);

}

    /* generated by template core.Method*/
 public  boolean addAllStrings (int index,Collection<? extends String> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().addAll(index, collection);

}

    /* generated by template core.Method*/
 public  String removeString (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().remove(index);

}

    /* generated by template core.Method*/
 public  String setString (int index,String element)  {
      /* generated by template methods.MethodDelegate*/

return this.getStringList().set(index, element);

}

    /* generated by template core.Method*/
 public  void replaceAllStrings (UnaryOperator<String> operator)  {
      /* generated by template methods.MethodDelegate*/

this.getStringList().replaceAll(operator);

}

    /* generated by template core.Method*/
 public  void sortStrings (Comparator<? super String> comparator)  {
      /* generated by template methods.MethodDelegate*/

this.getStringList().sort(comparator);

}

    /* generated by template core.Method*/
 public  void setStringList (List<String> strings)  {
      /* generated by template methods.Set*/

this.strings = strings;

}

    /* generated by template core.Method*/
 public  void accept (appointmentsflexibilized._visitor.AppointmentsFlexibilizedVisitor visitor)  {
      /* generated by template _ast.ast_class.Accept*/

      visitor.handle(this);

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof appointmentsflexibilized._visitor.AppointmentsFlexibilizedVisitor) {
    accept((appointmentsflexibilized._visitor.AppointmentsFlexibilizedVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x452 AST node type ASTParticipants expected a visitor of type appointmentsflexibilized._visitor.AppointmentsFlexibilizedVisitor, but got de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.mcbasics._visitor.MCBasicsVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof appointmentsflexibilized._visitor.AppointmentsFlexibilizedVisitor) {
    accept((appointmentsflexibilized._visitor.AppointmentsFlexibilizedVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x452 AST node type ASTParticipants expected a visitor of type appointmentsflexibilized._visitor.AppointmentsFlexibilizedVisitor, but got de.monticore.mcbasics._visitor.MCBasicsVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof appointmentsflexibilized._visitor.AppointmentsFlexibilizedVisitor) {
    accept((appointmentsflexibilized._visitor.AppointmentsFlexibilizedVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x452 AST node type ASTParticipants expected a visitor of type appointmentsflexibilized._visitor.AppointmentsFlexibilizedVisitor, but got de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 protected  ASTParticipants _construct ()  {
      return appointmentsflexibilized._ast.AppointmentsFlexibilizedNodeFactory.createASTParticipants();
}

    /* generated by template core.Method*/
 public  Collection<de.monticore.ast.ASTNode> get_Children ()  {
      /* generated by template _ast.ast_class.GetChildren*/

    java.util.LinkedList<de.monticore.ast.ASTNode> result = new java.util.LinkedList<de.monticore.ast.ASTNode>();
    return result;

}

    /* generated by template core.Method*/
 public  appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope getEnclosingScope ()  {
      /* generated by template methods.Get*/

return this.enclosingScope;

}

    /* generated by template core.Method*/
 public  void setEnclosingScope (appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope enclosingScope)  {
      /* generated by template methods.Set*/

this.enclosingScope = enclosingScope;

}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope){
    this.enclosingScope = (appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x998The EnclosingScope form type de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope could not be casted to the type appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope. Please call the Method setEnclosingScope with a parameter form type appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.mcbasics._symboltable.IMCBasicsScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope){
    this.enclosingScope = (appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x565The EnclosingScope form type de.monticore.mcbasics._symboltable.IMCBasicsScope could not be casted to the type appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope. Please call the Method setEnclosingScope with a parameter form type appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope){
    this.enclosingScope = (appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x325The EnclosingScope form type de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope could not be casted to the type appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope. Please call the Method setEnclosingScope with a parameter form type appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope");
  }
}

}