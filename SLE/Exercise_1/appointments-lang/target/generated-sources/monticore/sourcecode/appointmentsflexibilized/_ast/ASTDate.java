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


 public  class ASTDate extends ASTCNode  implements appointmentsflexibilized._ast.ASTI,appointmentsflexibilized._ast.ASTAppointmentsFlexibilizedNode {

    /* generated by template core.Attribute*/
 protected  java.util.List<String> digitss = new java.util.ArrayList<>();

    /* generated by template core.Attribute*/
 protected  appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope enclosingScope ;


    /* generated by template core.Constructor*/
 protected  ASTDate()  {
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

      ASTDate comp;
    if ((o instanceof ASTDate)) {
      comp = (ASTDate) o;
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

      ASTDate comp;
    if ((o instanceof ASTDate)) {
      comp = (ASTDate) o;
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

      ASTDate comp;
    if ((o instanceof ASTDate)) {
      comp = (ASTDate) o;
    } else {
      return false;
    }
	// comparing digitss 
    if ( (this.digitss == null && comp.digitss != null) 
      || (this.digitss != null && !this.digitss.equals(comp.digitss)) ) {
      return false;
    }
    return true;


}

    /* generated by template core.Method*/
 public  boolean equalsWithComments (Object o)  {
      /* generated by template data.EqualsWithComments*/

      ASTDate comp;
    if ((o instanceof ASTDate)) {
      comp = (ASTDate) o;
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
 public  ASTDate deepClone ()  {
          return deepClone(_construct());
}

    /* generated by template core.Method*/
 public  ASTDate deepClone (ASTDate result)  {
      /* generated by template data.DeepCloneWithParameters*/

    super.deepClone(result);

      for ( int i = 0; i < this.getDigitsList().size() ; i++ ) {
      result.addDigits(getDigits(i));
      }
      result.setEnclosingScope(getEnclosingScope());
    
    return result;

}

    /* generated by template core.Method*/
 public  boolean containsDigits (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().contains(element);

}

    /* generated by template core.Method*/
 public  boolean containsAllDigitss (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().containsAll(collection);

}

    /* generated by template core.Method*/
 public  boolean isEmptyDigitss ()  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().isEmpty();

}

    /* generated by template core.Method*/
 public  Iterator<String> iteratorDigitss ()  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().iterator();

}

    /* generated by template core.Method*/
 public  int sizeDigitss ()  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().size();

}

    /* generated by template core.Method*/
 public  String[] toArrayDigitss (String[] array)  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().toArray(array);

}

    /* generated by template core.Method*/
 public  Object[] toArrayDigitss ()  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().toArray();

}

    /* generated by template core.Method*/
 public  Spliterator<String> spliteratorDigitss ()  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().spliterator();

}

    /* generated by template core.Method*/
 public  Stream<String> streamDigitss ()  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().stream();

}

    /* generated by template core.Method*/
 public  Stream<String> parallelStreamDigitss ()  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().parallelStream();

}

    /* generated by template core.Method*/
 public  String getDigits (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().get(index);

}

    /* generated by template core.Method*/
 public  int indexOfDigits (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().indexOf(element);

}

    /* generated by template core.Method*/
 public  int lastIndexOfDigits (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().lastIndexOf(element);

}

    /* generated by template core.Method*/
 public  boolean equalsDigitss (Object o)  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().equals(o);

}

    /* generated by template core.Method*/
 public  int hashCodeDigitss ()  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().hashCode();

}

    /* generated by template core.Method*/
 public  ListIterator<String> listIteratorDigitss ()  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().listIterator();

}

    /* generated by template core.Method*/
 public  ListIterator<String> listIteratorDigitss (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().listIterator(index);

}

    /* generated by template core.Method*/
 public  List<String> subListDigitss (int start,int end)  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().subList(start, end);

}

    /* generated by template core.Method*/
 public  List<String> getDigitsList ()  {
      /* generated by template methods.Get*/

return this.digitss;

}

    /* generated by template core.Method*/
 public  void clearDigitss ()  {
      /* generated by template methods.MethodDelegate*/

this.getDigitsList().clear();

}

    /* generated by template core.Method*/
 public  boolean addDigits (String element)  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().add(element);

}

    /* generated by template core.Method*/
 public  boolean addAllDigitss (Collection<? extends String> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().addAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeDigits (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().remove(element);

}

    /* generated by template core.Method*/
 public  boolean removeAllDigitss (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().removeAll(collection);

}

    /* generated by template core.Method*/
 public  boolean retainAllDigitss (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().retainAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeIfDigits (Predicate<? super String> filter)  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().removeIf(filter);

}

    /* generated by template core.Method*/
 public  void forEachDigitss (Consumer<? super String> action)  {
      /* generated by template methods.MethodDelegate*/

this.getDigitsList().forEach(action);

}

    /* generated by template core.Method*/
 public  void addDigits (int index,String element)  {
      /* generated by template methods.MethodDelegate*/

this.getDigitsList().add(index, element);

}

    /* generated by template core.Method*/
 public  boolean addAllDigitss (int index,Collection<? extends String> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().addAll(index, collection);

}

    /* generated by template core.Method*/
 public  String removeDigits (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().remove(index);

}

    /* generated by template core.Method*/
 public  String setDigits (int index,String element)  {
      /* generated by template methods.MethodDelegate*/

return this.getDigitsList().set(index, element);

}

    /* generated by template core.Method*/
 public  void replaceAllDigitss (UnaryOperator<String> operator)  {
      /* generated by template methods.MethodDelegate*/

this.getDigitsList().replaceAll(operator);

}

    /* generated by template core.Method*/
 public  void sortDigitss (Comparator<? super String> comparator)  {
      /* generated by template methods.MethodDelegate*/

this.getDigitsList().sort(comparator);

}

    /* generated by template core.Method*/
 public  void setDigitsList (List<String> digitss)  {
      /* generated by template methods.Set*/

this.digitss = digitss;

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
    de.se_rwth.commons.logging.Log.error("0xA7000x219 AST node type ASTDate expected a visitor of type appointmentsflexibilized._visitor.AppointmentsFlexibilizedVisitor, but got de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.mcbasics._visitor.MCBasicsVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof appointmentsflexibilized._visitor.AppointmentsFlexibilizedVisitor) {
    accept((appointmentsflexibilized._visitor.AppointmentsFlexibilizedVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x219 AST node type ASTDate expected a visitor of type appointmentsflexibilized._visitor.AppointmentsFlexibilizedVisitor, but got de.monticore.mcbasics._visitor.MCBasicsVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof appointmentsflexibilized._visitor.AppointmentsFlexibilizedVisitor) {
    accept((appointmentsflexibilized._visitor.AppointmentsFlexibilizedVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x219 AST node type ASTDate expected a visitor of type appointmentsflexibilized._visitor.AppointmentsFlexibilizedVisitor, but got de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 protected  ASTDate _construct ()  {
      return appointmentsflexibilized._ast.AppointmentsFlexibilizedNodeFactory.createASTDate();
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
    de.se_rwth.commons.logging.Log.error("0xA7005x100The EnclosingScope form type de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope could not be casted to the type appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope. Please call the Method setEnclosingScope with a parameter form type appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.mcbasics._symboltable.IMCBasicsScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope){
    this.enclosingScope = (appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x114The EnclosingScope form type de.monticore.mcbasics._symboltable.IMCBasicsScope could not be casted to the type appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope. Please call the Method setEnclosingScope with a parameter form type appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope){
    this.enclosingScope = (appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x552The EnclosingScope form type de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope could not be casted to the type appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope. Please call the Method setEnclosingScope with a parameter form type appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope");
  }
}

}
