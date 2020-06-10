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


 public  class ASTDateBuilder extends de.monticore.ast.ASTNodeBuilder<ASTDateBuilder>  {

    /* generated by template core.Attribute*/
 protected  ASTDateBuilder realBuilder ;

    /* generated by template core.Attribute*/
 protected  java.util.List<String> digitss = new java.util.ArrayList<>();


    /* generated by template core.Constructor*/
 protected  ASTDateBuilder()  {
    this.realBuilder = (ASTDateBuilder) this;
}


    /* generated by template core.Method*/
 public  ASTDate build ()  {
      /* generated by template _ast.builder.BuildMethod*/

        if (!isValid()) {
          throw new IllegalStateException();
        }
        ASTDate value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTDate();
    value.setDigitsList(this.digitss);
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
 public  ASTDateBuilder clearDigitss ()  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getDigitsList().clear();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder addDigits (String element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getDigitsList().add(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder addAllDigitss (Collection<? extends String> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getDigitsList().addAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder removeDigits (Object element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getDigitsList().remove(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder removeAllDigitss (Collection<?> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getDigitsList().removeAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder retainAllDigitss (Collection<?> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getDigitsList().retainAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder removeIfDigits (Predicate<? super String> filter)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getDigitsList().removeIf(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder forEachDigitss (Consumer<? super String> action)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getDigitsList().forEach(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder addDigits (int index,String element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getDigitsList().add(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder addAllDigitss (int index,Collection<? extends String> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getDigitsList().addAll(index, collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder removeDigits (int index)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getDigitsList().remove(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder setDigits (int index,String element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getDigitsList().set(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder replaceAllDigitss (UnaryOperator<String> operator)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getDigitsList().replaceAll(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder sortDigitss (Comparator<? super String> comparator)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getDigitsList().sort(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder setDigitsList (List<String> digitss)  {
      /* generated by template _ast.builder.Set*/

    this.digitss = digitss;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder set_SourcePositionEnd (SourcePosition end)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEnd(end);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder set_SourcePositionEndAbsent ()  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEndAbsent();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder set_SourcePositionStart (SourcePosition start)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStart(start);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder set_SourcePositionStartAbsent ()  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStartAbsent();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder clear_PreComments ()  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PreComments();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder add_PreComment (Comment precomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder add_PreComment (int index,Comment precomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder addAll_PreComments (Collection<Comment> precomments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(precomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder addAll_PreComments (int index,Collection<Comment> precomments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(index, precomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder remove_PreComment (Object element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder remove_PreComment (int index)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder removeAll_PreComments (Collection<?> element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder retainAll_PreComments (Collection<?> element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder removeIf_PreComment (Predicate<? super Comment> filter)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PreComment(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder forEach_PreComments (Consumer<? super Comment> action)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PreComments(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder replaceAll_PreComments (UnaryOperator<Comment> operator)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PreComments(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder sort_PreComments (Comparator<? super Comment> comparator)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PreComments(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder set_PreCommentList (List<Comment> preComments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreCommentList(preComments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder set_PreComment (int index,Comment precomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder clear_PostComments ()  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PostComments();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder add_PostComment (Comment postcomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(postcomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder add_PostComment (int index,Comment postcomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder addAll_PostComments (Collection<Comment> postcomments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(postcomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder addAll_PostComments (int index,Collection<Comment> postcomments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(index, postcomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder remove_PostComment (Object element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder remove_PostComment (int index)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder removeAll_PostComments (Collection<?> element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder retainAll_PostComments (Collection<?> element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder removeIf_PostComment (Predicate<? super Comment> filter)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PostComment(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder forEach_PostComments (Consumer<? super Comment> action)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PostComments(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder replaceAll_PostComments (UnaryOperator<Comment> operator)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PostComments(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder sort_PostComments (Comparator<? super Comment> comparator)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PostComments(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder set_PostCommentList (List<Comment> postComments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostCommentList(postComments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDateBuilder set_PostComment (int index,Comment postcomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostComment(index, postcomment);
    return this.realBuilder;

}

}
