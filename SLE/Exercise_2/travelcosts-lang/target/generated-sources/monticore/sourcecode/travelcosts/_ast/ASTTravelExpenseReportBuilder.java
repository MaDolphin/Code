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


 public  class ASTTravelExpenseReportBuilder extends de.monticore.ast.ASTNodeBuilder<ASTTravelExpenseReportBuilder>  {

    /* generated by template core.Attribute*/
 protected  ASTTravelExpenseReportBuilder realBuilder ;

    /* generated by template core.Attribute*/
 protected  String name ;

    /* generated by template core.Attribute*/
 protected  Optional<travelcosts._ast.ASTTravelNumber> travelNumber = Optional.empty();

    /* generated by template core.Attribute*/
 protected  travelcosts._ast.ASTArrival arrival ;

    /* generated by template core.Attribute*/
 protected  Optional<travelcosts._ast.ASTAllWorkDays> allWorkDays = Optional.empty();

    /* generated by template core.Attribute*/
 protected  java.util.List<travelcosts._ast.ASTWorkDay> workDays = new java.util.ArrayList<>();

    /* generated by template core.Attribute*/
 protected  travelcosts._ast.ASTDeparture departure ;

    /* generated by template core.Attribute*/
 protected  travelcosts._ast.ASTCostItems costItems ;


    /* generated by template core.Constructor*/
 protected  ASTTravelExpenseReportBuilder()  {
    this.realBuilder = (ASTTravelExpenseReportBuilder) this;
}


    /* generated by template core.Method*/
 public  ASTTravelExpenseReport build ()  {
      /* generated by template _ast.builder.BuildMethod*/

        if (!isValid()) {
            if (name == null) {
                Log.error("0xA7222 name of type String must not be null");
            }
            if (arrival == null) {
                Log.error("0xA7222 arrival of type travelcosts._ast.ASTArrival must not be null");
            }
            if (departure == null) {
                Log.error("0xA7222 departure of type travelcosts._ast.ASTDeparture must not be null");
            }
            if (costItems == null) {
                Log.error("0xA7222 costItems of type travelcosts._ast.ASTCostItems must not be null");
            }
          throw new IllegalStateException();
        }
        ASTTravelExpenseReport value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTTravelExpenseReport();
    value.setName(this.name);
    if (this.travelNumber.isPresent()) {
      value.setTravelNumber(this.travelNumber.get());
    } else {
      value.setTravelNumberAbsent();
    }
    value.setArrival(this.arrival);
    if (this.allWorkDays.isPresent()) {
      value.setAllWorkDays(this.allWorkDays.get());
    } else {
      value.setAllWorkDaysAbsent();
    }
    value.setWorkDayList(this.workDays);
    value.setDeparture(this.departure);
    value.setCostItems(this.costItems);
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
        if (arrival == null) {
            return false;
        }
        if (departure == null) {
            return false;
        }
        if (costItems == null) {
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
 public  travelcosts._ast.ASTTravelNumber getTravelNumber ()  {
      /* generated by template methods.opt.Get*/

if (isPresentTravelNumber()) {
return this.travelNumber.get();
}
Log.error("0xA7003x370 TravelNumber can't return a value. It is empty.");
// Normally this statement is not reachable
throw new IllegalStateException();

}

    /* generated by template core.Method*/
 public  boolean isPresentTravelNumber ()  {
      /* generated by template methods.opt.IsPresent*/

return this.travelNumber.isPresent();

}

    /* generated by template core.Method*/
 public  travelcosts._ast.ASTArrival getArrival ()  {
      /* generated by template methods.Get*/

return this.arrival;

}

    /* generated by template core.Method*/
 public  travelcosts._ast.ASTAllWorkDays getAllWorkDays ()  {
      /* generated by template methods.opt.Get*/

if (isPresentAllWorkDays()) {
return this.allWorkDays.get();
}
Log.error("0xA7003x332 AllWorkDays can't return a value. It is empty.");
// Normally this statement is not reachable
throw new IllegalStateException();

}

    /* generated by template core.Method*/
 public  boolean isPresentAllWorkDays ()  {
      /* generated by template methods.opt.IsPresent*/

return this.allWorkDays.isPresent();

}

    /* generated by template core.Method*/
 public  boolean containsWorkDay (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getWorkDayList().contains(element);

}

    /* generated by template core.Method*/
 public  boolean containsAllWorkDays (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getWorkDayList().containsAll(collection);

}

    /* generated by template core.Method*/
 public  boolean isEmptyWorkDays ()  {
      /* generated by template methods.MethodDelegate*/

return this.getWorkDayList().isEmpty();

}

    /* generated by template core.Method*/
 public  Iterator<travelcosts._ast.ASTWorkDay> iteratorWorkDays ()  {
      /* generated by template methods.MethodDelegate*/

return this.getWorkDayList().iterator();

}

    /* generated by template core.Method*/
 public  int sizeWorkDays ()  {
      /* generated by template methods.MethodDelegate*/

return this.getWorkDayList().size();

}

    /* generated by template core.Method*/
 public  travelcosts._ast.ASTWorkDay[] toArrayWorkDays (travelcosts._ast.ASTWorkDay[] array)  {
      /* generated by template methods.MethodDelegate*/

return this.getWorkDayList().toArray(array);

}

    /* generated by template core.Method*/
 public  Object[] toArrayWorkDays ()  {
      /* generated by template methods.MethodDelegate*/

return this.getWorkDayList().toArray();

}

    /* generated by template core.Method*/
 public  Spliterator<travelcosts._ast.ASTWorkDay> spliteratorWorkDays ()  {
      /* generated by template methods.MethodDelegate*/

return this.getWorkDayList().spliterator();

}

    /* generated by template core.Method*/
 public  Stream<travelcosts._ast.ASTWorkDay> streamWorkDays ()  {
      /* generated by template methods.MethodDelegate*/

return this.getWorkDayList().stream();

}

    /* generated by template core.Method*/
 public  Stream<travelcosts._ast.ASTWorkDay> parallelStreamWorkDays ()  {
      /* generated by template methods.MethodDelegate*/

return this.getWorkDayList().parallelStream();

}

    /* generated by template core.Method*/
 public  travelcosts._ast.ASTWorkDay getWorkDay (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getWorkDayList().get(index);

}

    /* generated by template core.Method*/
 public  int indexOfWorkDay (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getWorkDayList().indexOf(element);

}

    /* generated by template core.Method*/
 public  int lastIndexOfWorkDay (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getWorkDayList().lastIndexOf(element);

}

    /* generated by template core.Method*/
 public  boolean equalsWorkDays (Object o)  {
      /* generated by template methods.MethodDelegate*/

return this.getWorkDayList().equals(o);

}

    /* generated by template core.Method*/
 public  int hashCodeWorkDays ()  {
      /* generated by template methods.MethodDelegate*/

return this.getWorkDayList().hashCode();

}

    /* generated by template core.Method*/
 public  ListIterator<travelcosts._ast.ASTWorkDay> listIteratorWorkDays ()  {
      /* generated by template methods.MethodDelegate*/

return this.getWorkDayList().listIterator();

}

    /* generated by template core.Method*/
 public  ListIterator<travelcosts._ast.ASTWorkDay> listIteratorWorkDays (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getWorkDayList().listIterator(index);

}

    /* generated by template core.Method*/
 public  List<travelcosts._ast.ASTWorkDay> subListWorkDays (int start,int end)  {
      /* generated by template methods.MethodDelegate*/

return this.getWorkDayList().subList(start, end);

}

    /* generated by template core.Method*/
 public  List<travelcosts._ast.ASTWorkDay> getWorkDayList ()  {
      /* generated by template methods.Get*/

return this.workDays;

}

    /* generated by template core.Method*/
 public  travelcosts._ast.ASTDeparture getDeparture ()  {
      /* generated by template methods.Get*/

return this.departure;

}

    /* generated by template core.Method*/
 public  travelcosts._ast.ASTCostItems getCostItems ()  {
      /* generated by template methods.Get*/

return this.costItems;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder setName (String name)  {
      /* generated by template _ast.builder.Set*/

    this.name = name;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder setTravelNumber (travelcosts._ast.ASTTravelNumber travelNumber)  {
      /* generated by template _ast.builder.opt.Set*/

    this.travelNumber = Optional.ofNullable(travelNumber);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder setTravelNumberAbsent ()  {
      /* generated by template _ast.builder.opt.SetAbsent*/

    this.travelNumber = Optional.empty();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder setArrival (travelcosts._ast.ASTArrival arrival)  {
      /* generated by template _ast.builder.Set*/

    this.arrival = arrival;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder setAllWorkDays (travelcosts._ast.ASTAllWorkDays allWorkDays)  {
      /* generated by template _ast.builder.opt.Set*/

    this.allWorkDays = Optional.ofNullable(allWorkDays);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder setAllWorkDaysAbsent ()  {
      /* generated by template _ast.builder.opt.SetAbsent*/

    this.allWorkDays = Optional.empty();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder clearWorkDays ()  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getWorkDayList().clear();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder addWorkDay (travelcosts._ast.ASTWorkDay element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getWorkDayList().add(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder addAllWorkDays (Collection<? extends travelcosts._ast.ASTWorkDay> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getWorkDayList().addAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder removeWorkDay (Object element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getWorkDayList().remove(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder removeAllWorkDays (Collection<?> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getWorkDayList().removeAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder retainAllWorkDays (Collection<?> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getWorkDayList().retainAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder removeIfWorkDay (Predicate<? super travelcosts._ast.ASTWorkDay> filter)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getWorkDayList().removeIf(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder forEachWorkDays (Consumer<? super travelcosts._ast.ASTWorkDay> action)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getWorkDayList().forEach(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder addWorkDay (int index,travelcosts._ast.ASTWorkDay element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getWorkDayList().add(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder addAllWorkDays (int index,Collection<? extends travelcosts._ast.ASTWorkDay> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getWorkDayList().addAll(index, collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder removeWorkDay (int index)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getWorkDayList().remove(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder setWorkDay (int index,travelcosts._ast.ASTWorkDay element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getWorkDayList().set(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder replaceAllWorkDays (UnaryOperator<travelcosts._ast.ASTWorkDay> operator)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getWorkDayList().replaceAll(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder sortWorkDays (Comparator<? super travelcosts._ast.ASTWorkDay> comparator)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getWorkDayList().sort(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder setWorkDayList (List<travelcosts._ast.ASTWorkDay> workDays)  {
      /* generated by template _ast.builder.Set*/

    this.workDays = workDays;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder setDeparture (travelcosts._ast.ASTDeparture departure)  {
      /* generated by template _ast.builder.Set*/

    this.departure = departure;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder setCostItems (travelcosts._ast.ASTCostItems costItems)  {
      /* generated by template _ast.builder.Set*/

    this.costItems = costItems;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder set_SourcePositionEnd (SourcePosition end)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEnd(end);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder set_SourcePositionEndAbsent ()  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEndAbsent();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder set_SourcePositionStart (SourcePosition start)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStart(start);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder set_SourcePositionStartAbsent ()  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStartAbsent();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder clear_PreComments ()  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PreComments();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder add_PreComment (Comment precomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder add_PreComment (int index,Comment precomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder addAll_PreComments (Collection<Comment> precomments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(precomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder addAll_PreComments (int index,Collection<Comment> precomments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(index, precomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder remove_PreComment (Object element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder remove_PreComment (int index)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder removeAll_PreComments (Collection<?> element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder retainAll_PreComments (Collection<?> element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder removeIf_PreComment (Predicate<? super Comment> filter)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PreComment(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder forEach_PreComments (Consumer<? super Comment> action)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PreComments(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder replaceAll_PreComments (UnaryOperator<Comment> operator)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PreComments(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder sort_PreComments (Comparator<? super Comment> comparator)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PreComments(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder set_PreCommentList (List<Comment> preComments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreCommentList(preComments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder set_PreComment (int index,Comment precomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder clear_PostComments ()  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PostComments();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder add_PostComment (Comment postcomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(postcomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder add_PostComment (int index,Comment postcomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder addAll_PostComments (Collection<Comment> postcomments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(postcomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder addAll_PostComments (int index,Collection<Comment> postcomments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(index, postcomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder remove_PostComment (Object element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder remove_PostComment (int index)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder removeAll_PostComments (Collection<?> element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder retainAll_PostComments (Collection<?> element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder removeIf_PostComment (Predicate<? super Comment> filter)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PostComment(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder forEach_PostComments (Consumer<? super Comment> action)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PostComments(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder replaceAll_PostComments (UnaryOperator<Comment> operator)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PostComments(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder sort_PostComments (Comparator<? super Comment> comparator)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PostComments(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder set_PostCommentList (List<Comment> postComments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostCommentList(postComments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTravelExpenseReportBuilder set_PostComment (int index,Comment postcomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostComment(index, postcomment);
    return this.realBuilder;

}

}
