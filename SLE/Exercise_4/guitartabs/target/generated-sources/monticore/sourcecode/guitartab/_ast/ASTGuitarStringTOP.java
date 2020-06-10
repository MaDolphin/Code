/* generated from model GuitarTab */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package guitartab._ast;

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


 abstract  public  class ASTGuitarStringTOP extends ASTCNode  implements guitartab._ast.ASTGuitarTabNode {

    /* generated by template core.Attribute*/
 protected  java.util.List<String> contents = new java.util.ArrayList<>();

    /* generated by template core.Attribute*/
 protected  guitartab._symboltable.IGuitarTabScope enclosingScope ;


    /* generated by template core.Constructor*/
 protected  ASTGuitarStringTOP()  {
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

      ASTGuitarString comp;
    if ((o instanceof ASTGuitarString)) {
      comp = (ASTGuitarString) o;
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

      ASTGuitarString comp;
    if ((o instanceof ASTGuitarString)) {
      comp = (ASTGuitarString) o;
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

      ASTGuitarString comp;
    if ((o instanceof ASTGuitarString)) {
      comp = (ASTGuitarString) o;
    } else {
      return false;
    }
	// comparing contents 
    if ( (this.contents == null && comp.contents != null) 
      || (this.contents != null && !this.contents.equals(comp.contents)) ) {
      return false;
    }
    return true;


}

    /* generated by template core.Method*/
 public  boolean equalsWithComments (Object o)  {
      /* generated by template data.EqualsWithComments*/

      ASTGuitarString comp;
    if ((o instanceof ASTGuitarString)) {
      comp = (ASTGuitarString) o;
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
 public  ASTGuitarString deepClone ()  {
          return deepClone(_construct());
}

    /* generated by template core.Method*/
 public  ASTGuitarString deepClone (ASTGuitarString result)  {
      /* generated by template data.DeepCloneWithParameters*/

    super.deepClone(result);

      for ( int i = 0; i < this.getContentList().size() ; i++ ) {
      result.addContent(getContent(i));
      }
      result.setEnclosingScope(getEnclosingScope());
    
    return result;

}

    /* generated by template core.Method*/
 public  boolean containsContent (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().contains(element);

}

    /* generated by template core.Method*/
 public  boolean containsAllContents (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().containsAll(collection);

}

    /* generated by template core.Method*/
 public  boolean isEmptyContents ()  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().isEmpty();

}

    /* generated by template core.Method*/
 public  Iterator<String> iteratorContents ()  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().iterator();

}

    /* generated by template core.Method*/
 public  int sizeContents ()  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().size();

}

    /* generated by template core.Method*/
 public  String[] toArrayContents (String[] array)  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().toArray(array);

}

    /* generated by template core.Method*/
 public  Object[] toArrayContents ()  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().toArray();

}

    /* generated by template core.Method*/
 public  Spliterator<String> spliteratorContents ()  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().spliterator();

}

    /* generated by template core.Method*/
 public  Stream<String> streamContents ()  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().stream();

}

    /* generated by template core.Method*/
 public  Stream<String> parallelStreamContents ()  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().parallelStream();

}

    /* generated by template core.Method*/
 public  String getContent (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().get(index);

}

    /* generated by template core.Method*/
 public  int indexOfContent (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().indexOf(element);

}

    /* generated by template core.Method*/
 public  int lastIndexOfContent (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().lastIndexOf(element);

}

    /* generated by template core.Method*/
 public  boolean equalsContents (Object o)  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().equals(o);

}

    /* generated by template core.Method*/
 public  int hashCodeContents ()  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().hashCode();

}

    /* generated by template core.Method*/
 public  ListIterator<String> listIteratorContents ()  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().listIterator();

}

    /* generated by template core.Method*/
 public  ListIterator<String> listIteratorContents (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().listIterator(index);

}

    /* generated by template core.Method*/
 public  List<String> subListContents (int start,int end)  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().subList(start, end);

}

    /* generated by template core.Method*/
 public  List<String> getContentList ()  {
      /* generated by template methods.Get*/

return this.contents;

}

    /* generated by template core.Method*/
 public  void clearContents ()  {
      /* generated by template methods.MethodDelegate*/

this.getContentList().clear();

}

    /* generated by template core.Method*/
 public  boolean addContent (String element)  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().add(element);

}

    /* generated by template core.Method*/
 public  boolean addAllContents (Collection<? extends String> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().addAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeContent (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().remove(element);

}

    /* generated by template core.Method*/
 public  boolean removeAllContents (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().removeAll(collection);

}

    /* generated by template core.Method*/
 public  boolean retainAllContents (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().retainAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeIfContent (Predicate<? super String> filter)  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().removeIf(filter);

}

    /* generated by template core.Method*/
 public  void forEachContents (Consumer<? super String> action)  {
      /* generated by template methods.MethodDelegate*/

this.getContentList().forEach(action);

}

    /* generated by template core.Method*/
 public  void addContent (int index,String element)  {
      /* generated by template methods.MethodDelegate*/

this.getContentList().add(index, element);

}

    /* generated by template core.Method*/
 public  boolean addAllContents (int index,Collection<? extends String> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().addAll(index, collection);

}

    /* generated by template core.Method*/
 public  String removeContent (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().remove(index);

}

    /* generated by template core.Method*/
 public  String setContent (int index,String element)  {
      /* generated by template methods.MethodDelegate*/

return this.getContentList().set(index, element);

}

    /* generated by template core.Method*/
 public  void replaceAllContents (UnaryOperator<String> operator)  {
      /* generated by template methods.MethodDelegate*/

this.getContentList().replaceAll(operator);

}

    /* generated by template core.Method*/
 public  void sortContents (Comparator<? super String> comparator)  {
      /* generated by template methods.MethodDelegate*/

this.getContentList().sort(comparator);

}

    /* generated by template core.Method*/
 public  void setContentList (List<String> contents)  {
      /* generated by template methods.Set*/

this.contents = contents;

}

    /* generated by template core.Method*/
 public  void accept (guitartab._visitor.GuitarTabVisitor visitor)  {
      /* generated by template _ast.ast_class.Accept*/

    // We allow a down cast here, because the subclass ASTGuitarString must exist
    // and only this subclass may exist in the AST and hence, only this class may
    // be handled by a visitor. All other cases are invalid an throw an exception!
    // This decision was made during MC Sprint Review on 16.03.2015.
    if (this instanceof ASTGuitarString) {
      visitor.handle((ASTGuitarString) this);
    } else {
      throw new UnsupportedOperationException("0xA7010x905 Only handwritten class ASTGuitarString is supported for the visitor");
    }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.mcbasics._visitor.MCBasicsVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof guitartab._visitor.GuitarTabVisitor) {
    accept((guitartab._visitor.GuitarTabVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x510 AST node type ASTGuitarString expected a visitor of type guitartab._visitor.GuitarTabVisitor, but got de.monticore.mcbasics._visitor.MCBasicsVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 protected  ASTGuitarString _construct ()  {
      return guitartab._ast.GuitarTabNodeFactory.createASTGuitarString();
}

    /* generated by template core.Method*/
 public  Collection<de.monticore.ast.ASTNode> get_Children ()  {
      /* generated by template _ast.ast_class.GetChildren*/

    java.util.LinkedList<de.monticore.ast.ASTNode> result = new java.util.LinkedList<de.monticore.ast.ASTNode>();
    return result;

}

    /* generated by template core.Method*/
 public  guitartab._symboltable.IGuitarTabScope getEnclosingScope ()  {
      /* generated by template methods.Get*/

return this.enclosingScope;

}

    /* generated by template core.Method*/
 public  void setEnclosingScope (guitartab._symboltable.IGuitarTabScope enclosingScope)  {
      /* generated by template methods.Set*/

this.enclosingScope = enclosingScope;

}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.mcbasics._symboltable.IMCBasicsScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof guitartab._symboltable.IGuitarTabScope){
    this.enclosingScope = (guitartab._symboltable.IGuitarTabScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x683The EnclosingScope form type de.monticore.mcbasics._symboltable.IMCBasicsScope could not be casted to the type guitartab._symboltable.IGuitarTabScope. Please call the Method setEnclosingScope with a parameter form type guitartab._symboltable.IGuitarTabScope");
  }
}

}
