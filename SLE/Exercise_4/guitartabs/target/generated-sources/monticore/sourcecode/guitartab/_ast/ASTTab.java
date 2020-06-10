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


 public  class ASTTab extends ASTCNode  implements guitartab._ast.ASTGuitarTabNode {

    /* generated by template core.Attribute*/
 protected  java.util.List<guitartab._ast.ASTComment> comments = new java.util.ArrayList<>();

    /* generated by template core.Attribute*/
 protected  java.util.List<guitartab._ast.ASTSixStrings> sixStringss = new java.util.ArrayList<>();

    /* generated by template core.Attribute*/
 protected  java.util.List<String> linebreaks = new java.util.ArrayList<>();

    /* generated by template core.Attribute*/
 protected  guitartab._symboltable.IGuitarTabScope enclosingScope ;


    /* generated by template core.Constructor*/
 protected  ASTTab()  {
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

      ASTTab comp;
    if ((o instanceof ASTTab)) {
      comp = (ASTTab) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    // comparing comments
    if (this.comments.size() != comp.comments.size()) {
      return false;
    } else {
      if (forceSameOrder) {
        Iterator<guitartab._ast.ASTComment> it1 = this.comments.iterator();
        Iterator<guitartab._ast.ASTComment> it2 = comp.comments.iterator();
        while (it1.hasNext() && it2.hasNext()) {
          if (!it1.next().deepEquals(it2.next(), forceSameOrder)) {
            return false;
          }
        }
      } else {
        java.util.Iterator<guitartab._ast.ASTComment> it1 = this.comments.iterator();
        while (it1.hasNext()) {
          guitartab._ast.ASTComment oneNext = it1.next();
          boolean matchFound = false;
          java.util.Iterator<guitartab._ast.ASTComment> it2 = comp.comments.iterator();
          while (it2.hasNext()) {
            if (oneNext.deepEquals(it2.next(), forceSameOrder)) {
              matchFound = true;
              break;
            }
          }
          if (!matchFound) {
            return false;
          }
        }
      }
    }
    // comparing sixStringss
    if (this.sixStringss.size() != comp.sixStringss.size()) {
      return false;
    } else {
      if (forceSameOrder) {
        Iterator<guitartab._ast.ASTSixStrings> it1 = this.sixStringss.iterator();
        Iterator<guitartab._ast.ASTSixStrings> it2 = comp.sixStringss.iterator();
        while (it1.hasNext() && it2.hasNext()) {
          if (!it1.next().deepEquals(it2.next(), forceSameOrder)) {
            return false;
          }
        }
      } else {
        java.util.Iterator<guitartab._ast.ASTSixStrings> it1 = this.sixStringss.iterator();
        while (it1.hasNext()) {
          guitartab._ast.ASTSixStrings oneNext = it1.next();
          boolean matchFound = false;
          java.util.Iterator<guitartab._ast.ASTSixStrings> it2 = comp.sixStringss.iterator();
          while (it2.hasNext()) {
            if (oneNext.deepEquals(it2.next(), forceSameOrder)) {
              matchFound = true;
              break;
            }
          }
          if (!matchFound) {
            return false;
          }
        }
      }
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

      ASTTab comp;
    if ((o instanceof ASTTab)) {
      comp = (ASTTab) o;
    } else {
      return false;
    }
    if (!equalsWithComments(comp)) {
      return false;
    }
    // comparing comments
    if (this.comments.size() != comp.comments.size()) {
      return false;
    } else {
      if (forceSameOrder) {
        Iterator<guitartab._ast.ASTComment> it1 = this.comments.iterator();
        Iterator<guitartab._ast.ASTComment> it2 = comp.comments.iterator();
        while (it1.hasNext() && it2.hasNext()) {
          if (!it1.next().deepEqualsWithComments(it2.next(), forceSameOrder)) {
            return false;
          }
        }
      } else {
        java.util.Iterator<guitartab._ast.ASTComment> it1 = this.comments.iterator();
        while (it1.hasNext()) {
          guitartab._ast.ASTComment oneNext = it1.next();
          boolean matchFound = false;
          java.util.Iterator<guitartab._ast.ASTComment> it2 = comp.comments.iterator();
          while (it2.hasNext()) {
            if (oneNext.deepEqualsWithComments(it2.next(), forceSameOrder)) {
              matchFound = true;
              break;
            }
          }
          if (!matchFound) {
            return false;
          }
        }
      }
    }
    // comparing sixStringss
    if (this.sixStringss.size() != comp.sixStringss.size()) {
      return false;
    } else {
      if (forceSameOrder) {
        Iterator<guitartab._ast.ASTSixStrings> it1 = this.sixStringss.iterator();
        Iterator<guitartab._ast.ASTSixStrings> it2 = comp.sixStringss.iterator();
        while (it1.hasNext() && it2.hasNext()) {
          if (!it1.next().deepEqualsWithComments(it2.next(), forceSameOrder)) {
            return false;
          }
        }
      } else {
        java.util.Iterator<guitartab._ast.ASTSixStrings> it1 = this.sixStringss.iterator();
        while (it1.hasNext()) {
          guitartab._ast.ASTSixStrings oneNext = it1.next();
          boolean matchFound = false;
          java.util.Iterator<guitartab._ast.ASTSixStrings> it2 = comp.sixStringss.iterator();
          while (it2.hasNext()) {
            if (oneNext.deepEqualsWithComments(it2.next(), forceSameOrder)) {
              matchFound = true;
              break;
            }
          }
          if (!matchFound) {
            return false;
          }
        }
      }
    }
    return true;     

}

    /* generated by template core.Method*/
 public  boolean equalAttributes (Object o)  {
      /* generated by template data.EqualAttributes*/

      ASTTab comp;
    if ((o instanceof ASTTab)) {
      comp = (ASTTab) o;
    } else {
      return false;
    }
	// comparing linebreaks 
    if ( (this.linebreaks == null && comp.linebreaks != null) 
      || (this.linebreaks != null && !this.linebreaks.equals(comp.linebreaks)) ) {
      return false;
    }
    return true;


}

    /* generated by template core.Method*/
 public  boolean equalsWithComments (Object o)  {
      /* generated by template data.EqualsWithComments*/

      ASTTab comp;
    if ((o instanceof ASTTab)) {
      comp = (ASTTab) o;
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
 public  ASTTab deepClone ()  {
          return deepClone(_construct());
}

    /* generated by template core.Method*/
 public  ASTTab deepClone (ASTTab result)  {
      /* generated by template data.DeepCloneWithParameters*/

    super.deepClone(result);

      getCommentList().forEach(s -> result.comments.add(s.deepClone()));
      getSixStringsList().forEach(s -> result.sixStringss.add(s.deepClone()));
      for ( int i = 0; i < this.getLinebreakList().size() ; i++ ) {
      result.addLinebreak(getLinebreak(i));
      }
      result.setEnclosingScope(getEnclosingScope());
    
    return result;

}

    /* generated by template core.Method*/
 public  boolean containsComment (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().contains(element);

}

    /* generated by template core.Method*/
 public  boolean containsAllComments (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().containsAll(collection);

}

    /* generated by template core.Method*/
 public  boolean isEmptyComments ()  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().isEmpty();

}

    /* generated by template core.Method*/
 public  Iterator<guitartab._ast.ASTComment> iteratorComments ()  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().iterator();

}

    /* generated by template core.Method*/
 public  int sizeComments ()  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().size();

}

    /* generated by template core.Method*/
 public  guitartab._ast.ASTComment[] toArrayComments (guitartab._ast.ASTComment[] array)  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().toArray(array);

}

    /* generated by template core.Method*/
 public  Object[] toArrayComments ()  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().toArray();

}

    /* generated by template core.Method*/
 public  Spliterator<guitartab._ast.ASTComment> spliteratorComments ()  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().spliterator();

}

    /* generated by template core.Method*/
 public  Stream<guitartab._ast.ASTComment> streamComments ()  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().stream();

}

    /* generated by template core.Method*/
 public  Stream<guitartab._ast.ASTComment> parallelStreamComments ()  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().parallelStream();

}

    /* generated by template core.Method*/
 public  guitartab._ast.ASTComment getComment (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().get(index);

}

    /* generated by template core.Method*/
 public  int indexOfComment (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().indexOf(element);

}

    /* generated by template core.Method*/
 public  int lastIndexOfComment (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().lastIndexOf(element);

}

    /* generated by template core.Method*/
 public  boolean equalsComments (Object o)  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().equals(o);

}

    /* generated by template core.Method*/
 public  int hashCodeComments ()  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().hashCode();

}

    /* generated by template core.Method*/
 public  ListIterator<guitartab._ast.ASTComment> listIteratorComments ()  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().listIterator();

}

    /* generated by template core.Method*/
 public  ListIterator<guitartab._ast.ASTComment> listIteratorComments (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().listIterator(index);

}

    /* generated by template core.Method*/
 public  List<guitartab._ast.ASTComment> subListComments (int start,int end)  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().subList(start, end);

}

    /* generated by template core.Method*/
 public  List<guitartab._ast.ASTComment> getCommentList ()  {
      /* generated by template methods.Get*/

return this.comments;

}

    /* generated by template core.Method*/
 public  boolean containsSixStrings (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().contains(element);

}

    /* generated by template core.Method*/
 public  boolean containsAllSixStringss (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().containsAll(collection);

}

    /* generated by template core.Method*/
 public  boolean isEmptySixStringss ()  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().isEmpty();

}

    /* generated by template core.Method*/
 public  Iterator<guitartab._ast.ASTSixStrings> iteratorSixStringss ()  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().iterator();

}

    /* generated by template core.Method*/
 public  int sizeSixStringss ()  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().size();

}

    /* generated by template core.Method*/
 public  guitartab._ast.ASTSixStrings[] toArraySixStringss (guitartab._ast.ASTSixStrings[] array)  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().toArray(array);

}

    /* generated by template core.Method*/
 public  Object[] toArraySixStringss ()  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().toArray();

}

    /* generated by template core.Method*/
 public  Spliterator<guitartab._ast.ASTSixStrings> spliteratorSixStringss ()  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().spliterator();

}

    /* generated by template core.Method*/
 public  Stream<guitartab._ast.ASTSixStrings> streamSixStringss ()  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().stream();

}

    /* generated by template core.Method*/
 public  Stream<guitartab._ast.ASTSixStrings> parallelStreamSixStringss ()  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().parallelStream();

}

    /* generated by template core.Method*/
 public  guitartab._ast.ASTSixStrings getSixStrings (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().get(index);

}

    /* generated by template core.Method*/
 public  int indexOfSixStrings (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().indexOf(element);

}

    /* generated by template core.Method*/
 public  int lastIndexOfSixStrings (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().lastIndexOf(element);

}

    /* generated by template core.Method*/
 public  boolean equalsSixStringss (Object o)  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().equals(o);

}

    /* generated by template core.Method*/
 public  int hashCodeSixStringss ()  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().hashCode();

}

    /* generated by template core.Method*/
 public  ListIterator<guitartab._ast.ASTSixStrings> listIteratorSixStringss ()  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().listIterator();

}

    /* generated by template core.Method*/
 public  ListIterator<guitartab._ast.ASTSixStrings> listIteratorSixStringss (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().listIterator(index);

}

    /* generated by template core.Method*/
 public  List<guitartab._ast.ASTSixStrings> subListSixStringss (int start,int end)  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().subList(start, end);

}

    /* generated by template core.Method*/
 public  List<guitartab._ast.ASTSixStrings> getSixStringsList ()  {
      /* generated by template methods.Get*/

return this.sixStringss;

}

    /* generated by template core.Method*/
 public  boolean containsLinebreak (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().contains(element);

}

    /* generated by template core.Method*/
 public  boolean containsAllLinebreaks (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().containsAll(collection);

}

    /* generated by template core.Method*/
 public  boolean isEmptyLinebreaks ()  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().isEmpty();

}

    /* generated by template core.Method*/
 public  Iterator<String> iteratorLinebreaks ()  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().iterator();

}

    /* generated by template core.Method*/
 public  int sizeLinebreaks ()  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().size();

}

    /* generated by template core.Method*/
 public  String[] toArrayLinebreaks (String[] array)  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().toArray(array);

}

    /* generated by template core.Method*/
 public  Object[] toArrayLinebreaks ()  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().toArray();

}

    /* generated by template core.Method*/
 public  Spliterator<String> spliteratorLinebreaks ()  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().spliterator();

}

    /* generated by template core.Method*/
 public  Stream<String> streamLinebreaks ()  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().stream();

}

    /* generated by template core.Method*/
 public  Stream<String> parallelStreamLinebreaks ()  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().parallelStream();

}

    /* generated by template core.Method*/
 public  String getLinebreak (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().get(index);

}

    /* generated by template core.Method*/
 public  int indexOfLinebreak (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().indexOf(element);

}

    /* generated by template core.Method*/
 public  int lastIndexOfLinebreak (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().lastIndexOf(element);

}

    /* generated by template core.Method*/
 public  boolean equalsLinebreaks (Object o)  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().equals(o);

}

    /* generated by template core.Method*/
 public  int hashCodeLinebreaks ()  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().hashCode();

}

    /* generated by template core.Method*/
 public  ListIterator<String> listIteratorLinebreaks ()  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().listIterator();

}

    /* generated by template core.Method*/
 public  ListIterator<String> listIteratorLinebreaks (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().listIterator(index);

}

    /* generated by template core.Method*/
 public  List<String> subListLinebreaks (int start,int end)  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().subList(start, end);

}

    /* generated by template core.Method*/
 public  List<String> getLinebreakList ()  {
      /* generated by template methods.Get*/

return this.linebreaks;

}

    /* generated by template core.Method*/
 public  void clearComments ()  {
      /* generated by template methods.MethodDelegate*/

this.getCommentList().clear();

}

    /* generated by template core.Method*/
 public  boolean addComment (guitartab._ast.ASTComment element)  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().add(element);

}

    /* generated by template core.Method*/
 public  boolean addAllComments (Collection<? extends guitartab._ast.ASTComment> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().addAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeComment (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().remove(element);

}

    /* generated by template core.Method*/
 public  boolean removeAllComments (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().removeAll(collection);

}

    /* generated by template core.Method*/
 public  boolean retainAllComments (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().retainAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeIfComment (Predicate<? super guitartab._ast.ASTComment> filter)  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().removeIf(filter);

}

    /* generated by template core.Method*/
 public  void forEachComments (Consumer<? super guitartab._ast.ASTComment> action)  {
      /* generated by template methods.MethodDelegate*/

this.getCommentList().forEach(action);

}

    /* generated by template core.Method*/
 public  void addComment (int index,guitartab._ast.ASTComment element)  {
      /* generated by template methods.MethodDelegate*/

this.getCommentList().add(index, element);

}

    /* generated by template core.Method*/
 public  boolean addAllComments (int index,Collection<? extends guitartab._ast.ASTComment> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().addAll(index, collection);

}

    /* generated by template core.Method*/
 public  guitartab._ast.ASTComment removeComment (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().remove(index);

}

    /* generated by template core.Method*/
 public  guitartab._ast.ASTComment setComment (int index,guitartab._ast.ASTComment element)  {
      /* generated by template methods.MethodDelegate*/

return this.getCommentList().set(index, element);

}

    /* generated by template core.Method*/
 public  void replaceAllComments (UnaryOperator<guitartab._ast.ASTComment> operator)  {
      /* generated by template methods.MethodDelegate*/

this.getCommentList().replaceAll(operator);

}

    /* generated by template core.Method*/
 public  void sortComments (Comparator<? super guitartab._ast.ASTComment> comparator)  {
      /* generated by template methods.MethodDelegate*/

this.getCommentList().sort(comparator);

}

    /* generated by template core.Method*/
 public  void setCommentList (List<guitartab._ast.ASTComment> comments)  {
      /* generated by template methods.Set*/

this.comments = comments;

}

    /* generated by template core.Method*/
 public  void clearSixStringss ()  {
      /* generated by template methods.MethodDelegate*/

this.getSixStringsList().clear();

}

    /* generated by template core.Method*/
 public  boolean addSixStrings (guitartab._ast.ASTSixStrings element)  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().add(element);

}

    /* generated by template core.Method*/
 public  boolean addAllSixStringss (Collection<? extends guitartab._ast.ASTSixStrings> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().addAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeSixStrings (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().remove(element);

}

    /* generated by template core.Method*/
 public  boolean removeAllSixStringss (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().removeAll(collection);

}

    /* generated by template core.Method*/
 public  boolean retainAllSixStringss (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().retainAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeIfSixStrings (Predicate<? super guitartab._ast.ASTSixStrings> filter)  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().removeIf(filter);

}

    /* generated by template core.Method*/
 public  void forEachSixStringss (Consumer<? super guitartab._ast.ASTSixStrings> action)  {
      /* generated by template methods.MethodDelegate*/

this.getSixStringsList().forEach(action);

}

    /* generated by template core.Method*/
 public  void addSixStrings (int index,guitartab._ast.ASTSixStrings element)  {
      /* generated by template methods.MethodDelegate*/

this.getSixStringsList().add(index, element);

}

    /* generated by template core.Method*/
 public  boolean addAllSixStringss (int index,Collection<? extends guitartab._ast.ASTSixStrings> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().addAll(index, collection);

}

    /* generated by template core.Method*/
 public  guitartab._ast.ASTSixStrings removeSixStrings (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().remove(index);

}

    /* generated by template core.Method*/
 public  guitartab._ast.ASTSixStrings setSixStrings (int index,guitartab._ast.ASTSixStrings element)  {
      /* generated by template methods.MethodDelegate*/

return this.getSixStringsList().set(index, element);

}

    /* generated by template core.Method*/
 public  void replaceAllSixStringss (UnaryOperator<guitartab._ast.ASTSixStrings> operator)  {
      /* generated by template methods.MethodDelegate*/

this.getSixStringsList().replaceAll(operator);

}

    /* generated by template core.Method*/
 public  void sortSixStringss (Comparator<? super guitartab._ast.ASTSixStrings> comparator)  {
      /* generated by template methods.MethodDelegate*/

this.getSixStringsList().sort(comparator);

}

    /* generated by template core.Method*/
 public  void setSixStringsList (List<guitartab._ast.ASTSixStrings> sixStringss)  {
      /* generated by template methods.Set*/

this.sixStringss = sixStringss;

}

    /* generated by template core.Method*/
 public  void clearLinebreaks ()  {
      /* generated by template methods.MethodDelegate*/

this.getLinebreakList().clear();

}

    /* generated by template core.Method*/
 public  boolean addLinebreak (String element)  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().add(element);

}

    /* generated by template core.Method*/
 public  boolean addAllLinebreaks (Collection<? extends String> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().addAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeLinebreak (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().remove(element);

}

    /* generated by template core.Method*/
 public  boolean removeAllLinebreaks (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().removeAll(collection);

}

    /* generated by template core.Method*/
 public  boolean retainAllLinebreaks (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().retainAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeIfLinebreak (Predicate<? super String> filter)  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().removeIf(filter);

}

    /* generated by template core.Method*/
 public  void forEachLinebreaks (Consumer<? super String> action)  {
      /* generated by template methods.MethodDelegate*/

this.getLinebreakList().forEach(action);

}

    /* generated by template core.Method*/
 public  void addLinebreak (int index,String element)  {
      /* generated by template methods.MethodDelegate*/

this.getLinebreakList().add(index, element);

}

    /* generated by template core.Method*/
 public  boolean addAllLinebreaks (int index,Collection<? extends String> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().addAll(index, collection);

}

    /* generated by template core.Method*/
 public  String removeLinebreak (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().remove(index);

}

    /* generated by template core.Method*/
 public  String setLinebreak (int index,String element)  {
      /* generated by template methods.MethodDelegate*/

return this.getLinebreakList().set(index, element);

}

    /* generated by template core.Method*/
 public  void replaceAllLinebreaks (UnaryOperator<String> operator)  {
      /* generated by template methods.MethodDelegate*/

this.getLinebreakList().replaceAll(operator);

}

    /* generated by template core.Method*/
 public  void sortLinebreaks (Comparator<? super String> comparator)  {
      /* generated by template methods.MethodDelegate*/

this.getLinebreakList().sort(comparator);

}

    /* generated by template core.Method*/
 public  void setLinebreakList (List<String> linebreaks)  {
      /* generated by template methods.Set*/

this.linebreaks = linebreaks;

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
    de.se_rwth.commons.logging.Log.error("0xA7000x695 AST node type ASTTab expected a visitor of type guitartab._visitor.GuitarTabVisitor, but got de.monticore.mcbasics._visitor.MCBasicsVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 protected  ASTTab _construct ()  {
      return guitartab._ast.GuitarTabNodeFactory.createASTTab();
}

    /* generated by template core.Method*/
 public  Collection<de.monticore.ast.ASTNode> get_Children ()  {
      /* generated by template _ast.ast_class.GetChildren*/

    java.util.LinkedList<de.monticore.ast.ASTNode> result = new java.util.LinkedList<de.monticore.ast.ASTNode>();
        result.addAll(getCommentList());
        result.addAll(getSixStringsList());
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
    de.se_rwth.commons.logging.Log.error("0xA7005x144The EnclosingScope form type de.monticore.mcbasics._symboltable.IMCBasicsScope could not be casted to the type guitartab._symboltable.IGuitarTabScope. Please call the Method setEnclosingScope with a parameter form type guitartab._symboltable.IGuitarTabScope");
  }
}

}
