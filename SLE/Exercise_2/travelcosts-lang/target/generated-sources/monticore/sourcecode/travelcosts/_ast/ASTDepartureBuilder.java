/* generated from model TravelCosts */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package travelcosts._ast;

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


 public  class ASTDepartureBuilder extends de.monticore.ast.ASTNodeBuilder<ASTDepartureBuilder>  {

    /* generated by template core.Attribute*/
 protected  ASTDepartureBuilder realBuilder ;

    /* generated by template core.Attribute*/
 protected  travelcosts._ast.ASTDuration duration ;


    /* generated by template core.Constructor*/
 protected  ASTDepartureBuilder()  {
    this.realBuilder = (ASTDepartureBuilder) this;
}


    /* generated by template core.Method*/
 public  ASTDeparture build ()  {
      /* generated by template _ast.builder.BuildMethod*/

        if (!isValid()) {
            if (duration == null) {
                Log.error("0xA7222 duration of type travelcosts._ast.ASTDuration must not be null");
            }
          throw new IllegalStateException();
        }
        ASTDeparture value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTDeparture();
    value.setDuration(this.duration);
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

        if (duration == null) {
            return false;
        }
        return true;

}

    /* generated by template core.Method*/
 public  travelcosts._ast.ASTDuration getDuration ()  {
      /* generated by template methods.Get*/

return this.duration;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder setDuration (travelcosts._ast.ASTDuration duration)  {
      /* generated by template _ast.builder.Set*/

    this.duration = duration;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder set_SourcePositionEnd (SourcePosition end)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEnd(end);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder set_SourcePositionEndAbsent ()  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEndAbsent();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder set_SourcePositionStart (SourcePosition start)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStart(start);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder set_SourcePositionStartAbsent ()  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStartAbsent();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder clear_PreComments ()  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PreComments();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder add_PreComment (Comment precomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder add_PreComment (int index,Comment precomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder addAll_PreComments (Collection<Comment> precomments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(precomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder addAll_PreComments (int index,Collection<Comment> precomments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(index, precomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder remove_PreComment (Object element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder remove_PreComment (int index)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder removeAll_PreComments (Collection<?> element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder retainAll_PreComments (Collection<?> element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder removeIf_PreComment (Predicate<? super Comment> filter)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PreComment(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder forEach_PreComments (Consumer<? super Comment> action)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PreComments(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder replaceAll_PreComments (UnaryOperator<Comment> operator)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PreComments(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder sort_PreComments (Comparator<? super Comment> comparator)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PreComments(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder set_PreCommentList (List<Comment> preComments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreCommentList(preComments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder set_PreComment (int index,Comment precomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder clear_PostComments ()  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PostComments();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder add_PostComment (Comment postcomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(postcomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder add_PostComment (int index,Comment postcomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder addAll_PostComments (Collection<Comment> postcomments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(postcomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder addAll_PostComments (int index,Collection<Comment> postcomments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(index, postcomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder remove_PostComment (Object element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder remove_PostComment (int index)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder removeAll_PostComments (Collection<?> element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder retainAll_PostComments (Collection<?> element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder removeIf_PostComment (Predicate<? super Comment> filter)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PostComment(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder forEach_PostComments (Consumer<? super Comment> action)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PostComments(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder replaceAll_PostComments (UnaryOperator<Comment> operator)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PostComments(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder sort_PostComments (Comparator<? super Comment> comparator)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PostComments(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder set_PostCommentList (List<Comment> postComments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostCommentList(postComments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTDepartureBuilder set_PostComment (int index,Comment postcomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostComment(index, postcomment);
    return this.realBuilder;

}

}
