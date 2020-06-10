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


 public  class ASTStateBuilder extends de.monticore.ast.ASTNodeBuilder<ASTStateBuilder>  {

    /* generated by template core.Attribute*/
 protected  ASTStateBuilder realBuilder ;

    /* generated by template core.Attribute*/
 protected  String name ;

    /* generated by template core.Attribute*/
 protected  java.util.List<automata._ast.ASTState> states = new java.util.ArrayList<>();

    /* generated by template core.Attribute*/
 protected  boolean initial ;

    /* generated by template core.Attribute*/
 protected  boolean r__final ;


    /* generated by template core.Constructor*/
 protected  ASTStateBuilder()  {
    this.realBuilder = (ASTStateBuilder) this;
}


    /* generated by template core.Method*/
 public  ASTState build ()  {
      /* generated by template _ast.builder.BuildMethod*/

        if (!isValid()) {
            if (name == null) {
                Log.error("0xA7222 name of type String must not be null");
            }
          throw new IllegalStateException();
        }
        ASTState value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTState();
    value.setName(this.name);
    value.setStateList(this.states);
    value.setInitial(this.initial);
    value.setFinal(this.r__final);
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

        if (name == null) {
            return false;
        }
        return true;

}

    /* generated by template core.Method*/
 public  String getName ()  {
      /* generated by template methods.Get*/

return this.name;

}

    /* generated by template core.Method*/
 public  boolean containsState (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().contains(element);

}

    /* generated by template core.Method*/
 public  boolean containsAllStates (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().containsAll(collection);

}

    /* generated by template core.Method*/
 public  boolean isEmptyStates ()  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().isEmpty();

}

    /* generated by template core.Method*/
 public  Iterator<automata._ast.ASTState> iteratorStates ()  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().iterator();

}

    /* generated by template core.Method*/
 public  int sizeStates ()  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().size();

}

    /* generated by template core.Method*/
 public  automata._ast.ASTState[] toArrayStates (automata._ast.ASTState[] array)  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().toArray(array);

}

    /* generated by template core.Method*/
 public  Object[] toArrayStates ()  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().toArray();

}

    /* generated by template core.Method*/
 public  Spliterator<automata._ast.ASTState> spliteratorStates ()  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().spliterator();

}

    /* generated by template core.Method*/
 public  Stream<automata._ast.ASTState> streamStates ()  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().stream();

}

    /* generated by template core.Method*/
 public  Stream<automata._ast.ASTState> parallelStreamStates ()  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().parallelStream();

}

    /* generated by template core.Method*/
 public  automata._ast.ASTState getState (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().get(index);

}

    /* generated by template core.Method*/
 public  int indexOfState (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().indexOf(element);

}

    /* generated by template core.Method*/
 public  int lastIndexOfState (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().lastIndexOf(element);

}

    /* generated by template core.Method*/
 public  boolean equalsStates (Object o)  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().equals(o);

}

    /* generated by template core.Method*/
 public  int hashCodeStates ()  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().hashCode();

}

    /* generated by template core.Method*/
 public  ListIterator<automata._ast.ASTState> listIteratorStates ()  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().listIterator();

}

    /* generated by template core.Method*/
 public  ListIterator<automata._ast.ASTState> listIteratorStates (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().listIterator(index);

}

    /* generated by template core.Method*/
 public  List<automata._ast.ASTState> subListStates (int start,int end)  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().subList(start, end);

}

    /* generated by template core.Method*/
 public  List<automata._ast.ASTState> getStateList ()  {
      /* generated by template methods.Get*/

return this.states;

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
 public  ASTStateBuilder setName (String name)  {
      /* generated by template _ast.builder.Set*/

    this.name = name;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder clearStates ()  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getStateList().clear();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder addState (automata._ast.ASTState element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getStateList().add(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder addAllStates (Collection<? extends automata._ast.ASTState> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getStateList().addAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder removeState (Object element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getStateList().remove(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder removeAllStates (Collection<?> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getStateList().removeAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder retainAllStates (Collection<?> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getStateList().retainAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder removeIfState (Predicate<? super automata._ast.ASTState> filter)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getStateList().removeIf(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder forEachStates (Consumer<? super automata._ast.ASTState> action)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getStateList().forEach(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder addState (int index,automata._ast.ASTState element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getStateList().add(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder addAllStates (int index,Collection<? extends automata._ast.ASTState> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getStateList().addAll(index, collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder removeState (int index)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getStateList().remove(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder setState (int index,automata._ast.ASTState element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getStateList().set(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder replaceAllStates (UnaryOperator<automata._ast.ASTState> operator)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getStateList().replaceAll(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder sortStates (Comparator<? super automata._ast.ASTState> comparator)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getStateList().sort(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder setStateList (List<automata._ast.ASTState> states)  {
      /* generated by template _ast.builder.Set*/

    this.states = states;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder setInitial (boolean initial)  {
      /* generated by template _ast.builder.Set*/

    this.initial = initial;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder setFinal (boolean r__final)  {
      /* generated by template _ast.builder.Set*/

    this.r__final = r__final;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder set_SourcePositionEnd (SourcePosition end)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEnd(end);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder set_SourcePositionEndAbsent ()  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEndAbsent();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder set_SourcePositionStart (SourcePosition start)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStart(start);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder set_SourcePositionStartAbsent ()  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStartAbsent();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder clear_PreComments ()  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PreComments();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder add_PreComment (Comment precomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder add_PreComment (int index,Comment precomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder addAll_PreComments (Collection<Comment> precomments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(precomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder addAll_PreComments (int index,Collection<Comment> precomments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(index, precomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder remove_PreComment (Object element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder remove_PreComment (int index)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder removeAll_PreComments (Collection<?> element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder retainAll_PreComments (Collection<?> element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder removeIf_PreComment (Predicate<? super Comment> filter)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PreComment(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder forEach_PreComments (Consumer<? super Comment> action)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PreComments(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder replaceAll_PreComments (UnaryOperator<Comment> operator)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PreComments(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder sort_PreComments (Comparator<? super Comment> comparator)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PreComments(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder set_PreCommentList (List<Comment> preComments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreCommentList(preComments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder set_PreComment (int index,Comment precomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder clear_PostComments ()  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PostComments();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder add_PostComment (Comment postcomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(postcomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder add_PostComment (int index,Comment postcomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder addAll_PostComments (Collection<Comment> postcomments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(postcomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder addAll_PostComments (int index,Collection<Comment> postcomments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(index, postcomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder remove_PostComment (Object element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder remove_PostComment (int index)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder removeAll_PostComments (Collection<?> element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder retainAll_PostComments (Collection<?> element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder removeIf_PostComment (Predicate<? super Comment> filter)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PostComment(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder forEach_PostComments (Consumer<? super Comment> action)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PostComments(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder replaceAll_PostComments (UnaryOperator<Comment> operator)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PostComments(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder sort_PostComments (Comparator<? super Comment> comparator)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PostComments(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder set_PostCommentList (List<Comment> postComments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostCommentList(postComments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder set_PostComment (int index,Comment postcomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostComment(index, postcomment);
    return this.realBuilder;

}

}