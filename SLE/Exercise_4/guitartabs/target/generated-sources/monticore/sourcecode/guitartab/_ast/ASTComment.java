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


 public  class ASTComment extends ASTCNode  implements guitartab._ast.ASTGuitarTabNode {

    /* generated by template core.Attribute*/
 protected  java.util.List<String> names = new java.util.ArrayList<>();

    /* generated by template core.Attribute*/
 protected  java.util.List<String> wSs = new java.util.ArrayList<>();

    /* generated by template core.Attribute*/
 protected  String linebreak ;

    /* generated by template core.Attribute*/
 protected  guitartab._symboltable.IGuitarTabScope enclosingScope ;


    /* generated by template core.Constructor*/
 protected  ASTComment()  {
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

      ASTComment comp;
    if ((o instanceof ASTComment)) {
      comp = (ASTComment) o;
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

      ASTComment comp;
    if ((o instanceof ASTComment)) {
      comp = (ASTComment) o;
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

      ASTComment comp;
    if ((o instanceof ASTComment)) {
      comp = (ASTComment) o;
    } else {
      return false;
    }
	// comparing names 
    if ( (this.names == null && comp.names != null) 
      || (this.names != null && !this.names.equals(comp.names)) ) {
      return false;
    }
	// comparing wSs 
    if ( (this.wSs == null && comp.wSs != null) 
      || (this.wSs != null && !this.wSs.equals(comp.wSs)) ) {
      return false;
    }
	// comparing linebreak 
    if ( (this.linebreak == null && comp.linebreak != null) 
      || (this.linebreak != null && !this.linebreak.equals(comp.linebreak)) ) {
      return false;
    }
    return true;


}

    /* generated by template core.Method*/
 public  boolean equalsWithComments (Object o)  {
      /* generated by template data.EqualsWithComments*/

      ASTComment comp;
    if ((o instanceof ASTComment)) {
      comp = (ASTComment) o;
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
 public  ASTComment deepClone ()  {
          return deepClone(_construct());
}

    /* generated by template core.Method*/
 public  ASTComment deepClone (ASTComment result)  {
      /* generated by template data.DeepCloneWithParameters*/

    super.deepClone(result);

      for ( int i = 0; i < this.getNameList().size() ; i++ ) {
      result.addName(getName(i));
      }
      for ( int i = 0; i < this.getWSList().size() ; i++ ) {
      result.addWS(getWS(i));
      }
      result.setLinebreak(getLinebreak());
      result.setEnclosingScope(getEnclosingScope());
    
    return result;

}

    /* generated by template core.Method*/
 public  boolean containsName (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().contains(element);

}

    /* generated by template core.Method*/
 public  boolean containsAllNames (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().containsAll(collection);

}

    /* generated by template core.Method*/
 public  boolean isEmptyNames ()  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().isEmpty();

}

    /* generated by template core.Method*/
 public  Iterator<String> iteratorNames ()  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().iterator();

}

    /* generated by template core.Method*/
 public  int sizeNames ()  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().size();

}

    /* generated by template core.Method*/
 public  String[] toArrayNames (String[] array)  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().toArray(array);

}

    /* generated by template core.Method*/
 public  Object[] toArrayNames ()  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().toArray();

}

    /* generated by template core.Method*/
 public  Spliterator<String> spliteratorNames ()  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().spliterator();

}

    /* generated by template core.Method*/
 public  Stream<String> streamNames ()  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().stream();

}

    /* generated by template core.Method*/
 public  Stream<String> parallelStreamNames ()  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().parallelStream();

}

    /* generated by template core.Method*/
 public  String getName (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().get(index);

}

    /* generated by template core.Method*/
 public  int indexOfName (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().indexOf(element);

}

    /* generated by template core.Method*/
 public  int lastIndexOfName (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().lastIndexOf(element);

}

    /* generated by template core.Method*/
 public  boolean equalsNames (Object o)  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().equals(o);

}

    /* generated by template core.Method*/
 public  int hashCodeNames ()  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().hashCode();

}

    /* generated by template core.Method*/
 public  ListIterator<String> listIteratorNames ()  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().listIterator();

}

    /* generated by template core.Method*/
 public  ListIterator<String> listIteratorNames (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().listIterator(index);

}

    /* generated by template core.Method*/
 public  List<String> subListNames (int start,int end)  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().subList(start, end);

}

    /* generated by template core.Method*/
 public  List<String> getNameList ()  {
      /* generated by template methods.Get*/

return this.names;

}

    /* generated by template core.Method*/
 public  boolean containsWS (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().contains(element);

}

    /* generated by template core.Method*/
 public  boolean containsAllWSs (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().containsAll(collection);

}

    /* generated by template core.Method*/
 public  boolean isEmptyWSs ()  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().isEmpty();

}

    /* generated by template core.Method*/
 public  Iterator<String> iteratorWSs ()  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().iterator();

}

    /* generated by template core.Method*/
 public  int sizeWSs ()  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().size();

}

    /* generated by template core.Method*/
 public  String[] toArrayWSs (String[] array)  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().toArray(array);

}

    /* generated by template core.Method*/
 public  Object[] toArrayWSs ()  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().toArray();

}

    /* generated by template core.Method*/
 public  Spliterator<String> spliteratorWSs ()  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().spliterator();

}

    /* generated by template core.Method*/
 public  Stream<String> streamWSs ()  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().stream();

}

    /* generated by template core.Method*/
 public  Stream<String> parallelStreamWSs ()  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().parallelStream();

}

    /* generated by template core.Method*/
 public  String getWS (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().get(index);

}

    /* generated by template core.Method*/
 public  int indexOfWS (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().indexOf(element);

}

    /* generated by template core.Method*/
 public  int lastIndexOfWS (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().lastIndexOf(element);

}

    /* generated by template core.Method*/
 public  boolean equalsWSs (Object o)  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().equals(o);

}

    /* generated by template core.Method*/
 public  int hashCodeWSs ()  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().hashCode();

}

    /* generated by template core.Method*/
 public  ListIterator<String> listIteratorWSs ()  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().listIterator();

}

    /* generated by template core.Method*/
 public  ListIterator<String> listIteratorWSs (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().listIterator(index);

}

    /* generated by template core.Method*/
 public  List<String> subListWSs (int start,int end)  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().subList(start, end);

}

    /* generated by template core.Method*/
 public  List<String> getWSList ()  {
      /* generated by template methods.Get*/

return this.wSs;

}

    /* generated by template core.Method*/
 public  String getLinebreak ()  {
      /* generated by template methods.Get*/

return this.linebreak;

}

    /* generated by template core.Method*/
 public  void clearNames ()  {
      /* generated by template methods.MethodDelegate*/

this.getNameList().clear();

}

    /* generated by template core.Method*/
 public  boolean addName (String element)  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().add(element);

}

    /* generated by template core.Method*/
 public  boolean addAllNames (Collection<? extends String> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().addAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeName (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().remove(element);

}

    /* generated by template core.Method*/
 public  boolean removeAllNames (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().removeAll(collection);

}

    /* generated by template core.Method*/
 public  boolean retainAllNames (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().retainAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeIfName (Predicate<? super String> filter)  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().removeIf(filter);

}

    /* generated by template core.Method*/
 public  void forEachNames (Consumer<? super String> action)  {
      /* generated by template methods.MethodDelegate*/

this.getNameList().forEach(action);

}

    /* generated by template core.Method*/
 public  void addName (int index,String element)  {
      /* generated by template methods.MethodDelegate*/

this.getNameList().add(index, element);

}

    /* generated by template core.Method*/
 public  boolean addAllNames (int index,Collection<? extends String> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().addAll(index, collection);

}

    /* generated by template core.Method*/
 public  String removeName (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().remove(index);

}

    /* generated by template core.Method*/
 public  String setName (int index,String element)  {
      /* generated by template methods.MethodDelegate*/

return this.getNameList().set(index, element);

}

    /* generated by template core.Method*/
 public  void replaceAllNames (UnaryOperator<String> operator)  {
      /* generated by template methods.MethodDelegate*/

this.getNameList().replaceAll(operator);

}

    /* generated by template core.Method*/
 public  void sortNames (Comparator<? super String> comparator)  {
      /* generated by template methods.MethodDelegate*/

this.getNameList().sort(comparator);

}

    /* generated by template core.Method*/
 public  void setNameList (List<String> names)  {
      /* generated by template methods.Set*/

this.names = names;

}

    /* generated by template core.Method*/
 public  void clearWSs ()  {
      /* generated by template methods.MethodDelegate*/

this.getWSList().clear();

}

    /* generated by template core.Method*/
 public  boolean addWS (String element)  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().add(element);

}

    /* generated by template core.Method*/
 public  boolean addAllWSs (Collection<? extends String> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().addAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeWS (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().remove(element);

}

    /* generated by template core.Method*/
 public  boolean removeAllWSs (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().removeAll(collection);

}

    /* generated by template core.Method*/
 public  boolean retainAllWSs (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().retainAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeIfWS (Predicate<? super String> filter)  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().removeIf(filter);

}

    /* generated by template core.Method*/
 public  void forEachWSs (Consumer<? super String> action)  {
      /* generated by template methods.MethodDelegate*/

this.getWSList().forEach(action);

}

    /* generated by template core.Method*/
 public  void addWS (int index,String element)  {
      /* generated by template methods.MethodDelegate*/

this.getWSList().add(index, element);

}

    /* generated by template core.Method*/
 public  boolean addAllWSs (int index,Collection<? extends String> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().addAll(index, collection);

}

    /* generated by template core.Method*/
 public  String removeWS (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().remove(index);

}

    /* generated by template core.Method*/
 public  String setWS (int index,String element)  {
      /* generated by template methods.MethodDelegate*/

return this.getWSList().set(index, element);

}

    /* generated by template core.Method*/
 public  void replaceAllWSs (UnaryOperator<String> operator)  {
      /* generated by template methods.MethodDelegate*/

this.getWSList().replaceAll(operator);

}

    /* generated by template core.Method*/
 public  void sortWSs (Comparator<? super String> comparator)  {
      /* generated by template methods.MethodDelegate*/

this.getWSList().sort(comparator);

}

    /* generated by template core.Method*/
 public  void setWSList (List<String> wSs)  {
      /* generated by template methods.Set*/

this.wSs = wSs;

}

    /* generated by template core.Method*/
 public  void setLinebreak (String linebreak)  {
      /* generated by template methods.Set*/

this.linebreak = linebreak;

}

    /* generated by template core.Method*/
 public  void accept (guitartab._visitor.GuitarTabVisitor visitor)  {
      /* generated by template _ast.ast_class.Accept*/

      visitor.handle(this);

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.mcbasics._visitor.MCBasicsVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof guitartab._visitor.GuitarTabVisitor) {
    accept((guitartab._visitor.GuitarTabVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x362 AST node type ASTComment expected a visitor of type guitartab._visitor.GuitarTabVisitor, but got de.monticore.mcbasics._visitor.MCBasicsVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 protected  ASTComment _construct ()  {
      return guitartab._ast.GuitarTabNodeFactory.createASTComment();
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
    de.se_rwth.commons.logging.Log.error("0xA7005x376The EnclosingScope form type de.monticore.mcbasics._symboltable.IMCBasicsScope could not be casted to the type guitartab._symboltable.IGuitarTabScope. Please call the Method setEnclosingScope with a parameter form type guitartab._symboltable.IGuitarTabScope");
  }
}

}
