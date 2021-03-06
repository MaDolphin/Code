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


 public  class ASTSixStringsBuilder extends de.monticore.ast.ASTNodeBuilder<ASTSixStringsBuilder>  {

    /* generated by template core.Attribute*/
 protected  ASTSixStringsBuilder realBuilder ;

    /* generated by template core.Attribute*/
 protected  java.util.List<guitartab._ast.ASTGuitarString> guitarStrings = new java.util.ArrayList<>();

    /* generated by template core.Attribute*/
 protected  java.util.List<String> linebreaks = new java.util.ArrayList<>();

    /* generated by template core.Attribute*/
 protected  Optional<guitartab._ast.ASTLengthLine> lengthLine = Optional.empty();


    /* generated by template core.Constructor*/
 protected  ASTSixStringsBuilder()  {
    this.realBuilder = (ASTSixStringsBuilder) this;
}


    /* generated by template core.Method*/
 public  ASTSixStrings build ()  {
      /* generated by template _ast.builder.BuildMethod*/

        if (!isValid()) {
          throw new IllegalStateException();
        }
        ASTSixStrings value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTSixStrings();
    value.setGuitarStringList(this.guitarStrings);
    value.setLinebreakList(this.linebreaks);
    if (this.lengthLine.isPresent()) {
      value.setLengthLine(this.lengthLine.get());
    } else {
      value.setLengthLineAbsent();
    }
    if (this.sourcePositionEnd.isPresent()) {
      value.set_SourcePositionEnd(this.sourcePositionEnd.get());
    } else {
      value.set_SourcePositionEndAbsent();
    }
    if (this.sourcePositionStart.isPresent()) {
      value.set_SourcePositionStart(this.sourcePositionStart.get());
    } else {
      value.set_SourcePositionStartAbsent();
    }
    value.set_PreCommentList(this.precomments);
    value.set_PostCommentList(this.postcomments);

        return value;
}

    /* generated by template core.Method*/
 public  boolean isValid ()  {
      /* generated by template _ast.builder.IsValidMethod*/

        return true;

}

    /* generated by template core.Method*/
 public  boolean containsGuitarString (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getGuitarStringList().contains(element);

}

    /* generated by template core.Method*/
 public  boolean containsAllGuitarStrings (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getGuitarStringList().containsAll(collection);

}

    /* generated by template core.Method*/
 public  boolean isEmptyGuitarStrings ()  {
      /* generated by template methods.MethodDelegate*/

return this.getGuitarStringList().isEmpty();

}

    /* generated by template core.Method*/
 public  Iterator<guitartab._ast.ASTGuitarString> iteratorGuitarStrings ()  {
      /* generated by template methods.MethodDelegate*/

return this.getGuitarStringList().iterator();

}

    /* generated by template core.Method*/
 public  int sizeGuitarStrings ()  {
      /* generated by template methods.MethodDelegate*/

return this.getGuitarStringList().size();

}

    /* generated by template core.Method*/
 public  guitartab._ast.ASTGuitarString[] toArrayGuitarStrings (guitartab._ast.ASTGuitarString[] array)  {
      /* generated by template methods.MethodDelegate*/

return this.getGuitarStringList().toArray(array);

}

    /* generated by template core.Method*/
 public  Object[] toArrayGuitarStrings ()  {
      /* generated by template methods.MethodDelegate*/

return this.getGuitarStringList().toArray();

}

    /* generated by template core.Method*/
 public  Spliterator<guitartab._ast.ASTGuitarString> spliteratorGuitarStrings ()  {
      /* generated by template methods.MethodDelegate*/

return this.getGuitarStringList().spliterator();

}

    /* generated by template core.Method*/
 public  Stream<guitartab._ast.ASTGuitarString> streamGuitarStrings ()  {
      /* generated by template methods.MethodDelegate*/

return this.getGuitarStringList().stream();

}

    /* generated by template core.Method*/
 public  Stream<guitartab._ast.ASTGuitarString> parallelStreamGuitarStrings ()  {
      /* generated by template methods.MethodDelegate*/

return this.getGuitarStringList().parallelStream();

}

    /* generated by template core.Method*/
 public  guitartab._ast.ASTGuitarString getGuitarString (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getGuitarStringList().get(index);

}

    /* generated by template core.Method*/
 public  int indexOfGuitarString (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getGuitarStringList().indexOf(element);

}

    /* generated by template core.Method*/
 public  int lastIndexOfGuitarString (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getGuitarStringList().lastIndexOf(element);

}

    /* generated by template core.Method*/
 public  boolean equalsGuitarStrings (Object o)  {
      /* generated by template methods.MethodDelegate*/

return this.getGuitarStringList().equals(o);

}

    /* generated by template core.Method*/
 public  int hashCodeGuitarStrings ()  {
      /* generated by template methods.MethodDelegate*/

return this.getGuitarStringList().hashCode();

}

    /* generated by template core.Method*/
 public  ListIterator<guitartab._ast.ASTGuitarString> listIteratorGuitarStrings ()  {
      /* generated by template methods.MethodDelegate*/

return this.getGuitarStringList().listIterator();

}

    /* generated by template core.Method*/
 public  ListIterator<guitartab._ast.ASTGuitarString> listIteratorGuitarStrings (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getGuitarStringList().listIterator(index);

}

    /* generated by template core.Method*/
 public  List<guitartab._ast.ASTGuitarString> subListGuitarStrings (int start,int end)  {
      /* generated by template methods.MethodDelegate*/

return this.getGuitarStringList().subList(start, end);

}

    /* generated by template core.Method*/
 public  List<guitartab._ast.ASTGuitarString> getGuitarStringList ()  {
      /* generated by template methods.Get*/

return this.guitarStrings;

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
 public  guitartab._ast.ASTLengthLine getLengthLine ()  {
      /* generated by template methods.opt.Get*/

if (isPresentLengthLine()) {
return this.lengthLine.get();
}
Log.error("0xA7003x504 LengthLine can't return a value. It is empty.");
// Normally this statement is not reachable
throw new IllegalStateException();

}

    /* generated by template core.Method*/
 public  boolean isPresentLengthLine ()  {
      /* generated by template methods.opt.IsPresent*/

return this.lengthLine.isPresent();

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder clearGuitarStrings ()  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getGuitarStringList().clear();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder addGuitarString (guitartab._ast.ASTGuitarString element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getGuitarStringList().add(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder addAllGuitarStrings (Collection<? extends guitartab._ast.ASTGuitarString> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getGuitarStringList().addAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder removeGuitarString (Object element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getGuitarStringList().remove(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder removeAllGuitarStrings (Collection<?> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getGuitarStringList().removeAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder retainAllGuitarStrings (Collection<?> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getGuitarStringList().retainAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder removeIfGuitarString (Predicate<? super guitartab._ast.ASTGuitarString> filter)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getGuitarStringList().removeIf(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder forEachGuitarStrings (Consumer<? super guitartab._ast.ASTGuitarString> action)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getGuitarStringList().forEach(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder addGuitarString (int index,guitartab._ast.ASTGuitarString element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getGuitarStringList().add(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder addAllGuitarStrings (int index,Collection<? extends guitartab._ast.ASTGuitarString> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getGuitarStringList().addAll(index, collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder removeGuitarString (int index)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getGuitarStringList().remove(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder setGuitarString (int index,guitartab._ast.ASTGuitarString element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getGuitarStringList().set(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder replaceAllGuitarStrings (UnaryOperator<guitartab._ast.ASTGuitarString> operator)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getGuitarStringList().replaceAll(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder sortGuitarStrings (Comparator<? super guitartab._ast.ASTGuitarString> comparator)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getGuitarStringList().sort(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder setGuitarStringList (List<guitartab._ast.ASTGuitarString> guitarStrings)  {
      /* generated by template _ast.builder.Set*/

    this.guitarStrings = guitarStrings;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder clearLinebreaks ()  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getLinebreakList().clear();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder addLinebreak (String element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getLinebreakList().add(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder addAllLinebreaks (Collection<? extends String> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getLinebreakList().addAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder removeLinebreak (Object element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getLinebreakList().remove(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder removeAllLinebreaks (Collection<?> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getLinebreakList().removeAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder retainAllLinebreaks (Collection<?> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getLinebreakList().retainAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder removeIfLinebreak (Predicate<? super String> filter)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getLinebreakList().removeIf(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder forEachLinebreaks (Consumer<? super String> action)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getLinebreakList().forEach(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder addLinebreak (int index,String element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getLinebreakList().add(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder addAllLinebreaks (int index,Collection<? extends String> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getLinebreakList().addAll(index, collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder removeLinebreak (int index)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getLinebreakList().remove(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder setLinebreak (int index,String element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getLinebreakList().set(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder replaceAllLinebreaks (UnaryOperator<String> operator)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getLinebreakList().replaceAll(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder sortLinebreaks (Comparator<? super String> comparator)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getLinebreakList().sort(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder setLinebreakList (List<String> linebreaks)  {
      /* generated by template _ast.builder.Set*/

    this.linebreaks = linebreaks;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder setLengthLine (guitartab._ast.ASTLengthLine lengthLine)  {
      /* generated by template _ast.builder.opt.Set*/

    this.lengthLine = Optional.ofNullable(lengthLine);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder setLengthLineAbsent ()  {
      /* generated by template _ast.builder.opt.SetAbsent*/

    this.lengthLine = Optional.empty();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder set_SourcePositionEnd (SourcePosition end)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEnd(end);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder set_SourcePositionEndAbsent ()  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEndAbsent();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder set_SourcePositionStart (SourcePosition start)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStart(start);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder set_SourcePositionStartAbsent ()  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStartAbsent();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder clear_PreComments ()  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PreComments();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder add_PreComment (Comment precomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder add_PreComment (int index,Comment precomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder addAll_PreComments (Collection<Comment> precomments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(precomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder addAll_PreComments (int index,Collection<Comment> precomments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(index, precomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder remove_PreComment (Object element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder remove_PreComment (int index)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder removeAll_PreComments (Collection<?> element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder retainAll_PreComments (Collection<?> element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder removeIf_PreComment (Predicate<? super Comment> filter)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PreComment(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder forEach_PreComments (Consumer<? super Comment> action)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PreComments(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder replaceAll_PreComments (UnaryOperator<Comment> operator)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PreComments(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder sort_PreComments (Comparator<? super Comment> comparator)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PreComments(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder set_PreCommentList (List<Comment> preComments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreCommentList(preComments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder set_PreComment (int index,Comment precomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder clear_PostComments ()  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PostComments();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder add_PostComment (Comment postcomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(postcomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder add_PostComment (int index,Comment postcomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder addAll_PostComments (Collection<Comment> postcomments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(postcomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder addAll_PostComments (int index,Collection<Comment> postcomments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(index, postcomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder remove_PostComment (Object element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder remove_PostComment (int index)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder removeAll_PostComments (Collection<?> element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder retainAll_PostComments (Collection<?> element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder removeIf_PostComment (Predicate<? super Comment> filter)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PostComment(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder forEach_PostComments (Consumer<? super Comment> action)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PostComments(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder replaceAll_PostComments (UnaryOperator<Comment> operator)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PostComments(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder sort_PostComments (Comparator<? super Comment> comparator)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PostComments(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder set_PostCommentList (List<Comment> postComments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostCommentList(postComments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTSixStringsBuilder set_PostComment (int index,Comment postcomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostComment(index, postcomment);
    return this.realBuilder;

}

}
