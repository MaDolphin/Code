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


 abstract  public  class ASTAutomatonTOP extends ASTCNode  implements automata._ast.ASTAutomataNode {

    /* generated by template core.Attribute*/
 protected  String name ;

    /* generated by template core.Attribute*/
 protected  java.util.List<automata._ast.ASTState> states = new java.util.ArrayList<>();

    /* generated by template core.Attribute*/
 protected  java.util.List<automata._ast.ASTTransition> transitions = new java.util.ArrayList<>();

    /* generated by template core.Attribute*/
 protected  Optional<automata._symboltable.AutomatonSymbol> symbol = Optional.empty();

    /* generated by template core.Attribute*/
 protected  automata._symboltable.IAutomataScope spannedScope ;

    /* generated by template core.Attribute*/
 protected  automata._symboltable.IAutomataScope enclosingScope ;


    /* generated by template core.Constructor*/
 protected  ASTAutomatonTOP()  {
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

      ASTAutomaton comp;
    if ((o instanceof ASTAutomaton)) {
      comp = (ASTAutomaton) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    // comparing states
    if (this.states.size() != comp.states.size()) {
      return false;
    } else {
      if (forceSameOrder) {
        Iterator<automata._ast.ASTState> it1 = this.states.iterator();
        Iterator<automata._ast.ASTState> it2 = comp.states.iterator();
        while (it1.hasNext() && it2.hasNext()) {
          if (!it1.next().deepEquals(it2.next(), forceSameOrder)) {
            return false;
          }
        }
      } else {
        java.util.Iterator<automata._ast.ASTState> it1 = this.states.iterator();
        while (it1.hasNext()) {
          automata._ast.ASTState oneNext = it1.next();
          boolean matchFound = false;
          java.util.Iterator<automata._ast.ASTState> it2 = comp.states.iterator();
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
    // comparing transitions
    if (this.transitions.size() != comp.transitions.size()) {
      return false;
    } else {
      if (forceSameOrder) {
        Iterator<automata._ast.ASTTransition> it1 = this.transitions.iterator();
        Iterator<automata._ast.ASTTransition> it2 = comp.transitions.iterator();
        while (it1.hasNext() && it2.hasNext()) {
          if (!it1.next().deepEquals(it2.next(), forceSameOrder)) {
            return false;
          }
        }
      } else {
        java.util.Iterator<automata._ast.ASTTransition> it1 = this.transitions.iterator();
        while (it1.hasNext()) {
          automata._ast.ASTTransition oneNext = it1.next();
          boolean matchFound = false;
          java.util.Iterator<automata._ast.ASTTransition> it2 = comp.transitions.iterator();
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

      ASTAutomaton comp;
    if ((o instanceof ASTAutomaton)) {
      comp = (ASTAutomaton) o;
    } else {
      return false;
    }
    if (!equalsWithComments(comp)) {
      return false;
    }
    // comparing states
    if (this.states.size() != comp.states.size()) {
      return false;
    } else {
      if (forceSameOrder) {
        Iterator<automata._ast.ASTState> it1 = this.states.iterator();
        Iterator<automata._ast.ASTState> it2 = comp.states.iterator();
        while (it1.hasNext() && it2.hasNext()) {
          if (!it1.next().deepEqualsWithComments(it2.next(), forceSameOrder)) {
            return false;
          }
        }
      } else {
        java.util.Iterator<automata._ast.ASTState> it1 = this.states.iterator();
        while (it1.hasNext()) {
          automata._ast.ASTState oneNext = it1.next();
          boolean matchFound = false;
          java.util.Iterator<automata._ast.ASTState> it2 = comp.states.iterator();
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
    // comparing transitions
    if (this.transitions.size() != comp.transitions.size()) {
      return false;
    } else {
      if (forceSameOrder) {
        Iterator<automata._ast.ASTTransition> it1 = this.transitions.iterator();
        Iterator<automata._ast.ASTTransition> it2 = comp.transitions.iterator();
        while (it1.hasNext() && it2.hasNext()) {
          if (!it1.next().deepEqualsWithComments(it2.next(), forceSameOrder)) {
            return false;
          }
        }
      } else {
        java.util.Iterator<automata._ast.ASTTransition> it1 = this.transitions.iterator();
        while (it1.hasNext()) {
          automata._ast.ASTTransition oneNext = it1.next();
          boolean matchFound = false;
          java.util.Iterator<automata._ast.ASTTransition> it2 = comp.transitions.iterator();
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

      ASTAutomaton comp;
    if ((o instanceof ASTAutomaton)) {
      comp = (ASTAutomaton) o;
    } else {
      return false;
    }
	// comparing name 
    if ( (this.name == null && comp.name != null) 
      || (this.name != null && !this.name.equals(comp.name)) ) {
      return false;
    }
    return true;


}

    /* generated by template core.Method*/
 public  boolean equalsWithComments (Object o)  {
      /* generated by template data.EqualsWithComments*/

      ASTAutomaton comp;
    if ((o instanceof ASTAutomaton)) {
      comp = (ASTAutomaton) o;
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
 public  ASTAutomaton deepClone ()  {
          return deepClone(_construct());
}

    /* generated by template core.Method*/
 public  ASTAutomaton deepClone (ASTAutomaton result)  {
      /* generated by template data.DeepCloneWithParameters*/

    super.deepClone(result);

      result.setName(getName());
      getStateList().forEach(s -> result.states.add(s.deepClone()));
      getTransitionList().forEach(s -> result.transitions.add(s.deepClone()));
    if (isPresentSymbol()){
      result.setSymbol(getSymbol());
    } else {
      result.setSymbolAbsent();
    }
      result.setSpannedScope(getSpannedScope());
      result.setEnclosingScope(getEnclosingScope());
    
    return result;

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
 public  boolean containsTransition (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().contains(element);

}

    /* generated by template core.Method*/
 public  boolean containsAllTransitions (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().containsAll(collection);

}

    /* generated by template core.Method*/
 public  boolean isEmptyTransitions ()  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().isEmpty();

}

    /* generated by template core.Method*/
 public  Iterator<automata._ast.ASTTransition> iteratorTransitions ()  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().iterator();

}

    /* generated by template core.Method*/
 public  int sizeTransitions ()  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().size();

}

    /* generated by template core.Method*/
 public  automata._ast.ASTTransition[] toArrayTransitions (automata._ast.ASTTransition[] array)  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().toArray(array);

}

    /* generated by template core.Method*/
 public  Object[] toArrayTransitions ()  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().toArray();

}

    /* generated by template core.Method*/
 public  Spliterator<automata._ast.ASTTransition> spliteratorTransitions ()  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().spliterator();

}

    /* generated by template core.Method*/
 public  Stream<automata._ast.ASTTransition> streamTransitions ()  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().stream();

}

    /* generated by template core.Method*/
 public  Stream<automata._ast.ASTTransition> parallelStreamTransitions ()  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().parallelStream();

}

    /* generated by template core.Method*/
 public  automata._ast.ASTTransition getTransition (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().get(index);

}

    /* generated by template core.Method*/
 public  int indexOfTransition (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().indexOf(element);

}

    /* generated by template core.Method*/
 public  int lastIndexOfTransition (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().lastIndexOf(element);

}

    /* generated by template core.Method*/
 public  boolean equalsTransitions (Object o)  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().equals(o);

}

    /* generated by template core.Method*/
 public  int hashCodeTransitions ()  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().hashCode();

}

    /* generated by template core.Method*/
 public  ListIterator<automata._ast.ASTTransition> listIteratorTransitions ()  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().listIterator();

}

    /* generated by template core.Method*/
 public  ListIterator<automata._ast.ASTTransition> listIteratorTransitions (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().listIterator(index);

}

    /* generated by template core.Method*/
 public  List<automata._ast.ASTTransition> subListTransitions (int start,int end)  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().subList(start, end);

}

    /* generated by template core.Method*/
 public  List<automata._ast.ASTTransition> getTransitionList ()  {
      /* generated by template methods.Get*/

return this.transitions;

}

    /* generated by template core.Method*/
 public  void setName (String name)  {
      /* generated by template methods.Set*/

this.name = name;

}

    /* generated by template core.Method*/
 public  void clearStates ()  {
      /* generated by template methods.MethodDelegate*/

this.getStateList().clear();

}

    /* generated by template core.Method*/
 public  boolean addState (automata._ast.ASTState element)  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().add(element);

}

    /* generated by template core.Method*/
 public  boolean addAllStates (Collection<? extends automata._ast.ASTState> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().addAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeState (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().remove(element);

}

    /* generated by template core.Method*/
 public  boolean removeAllStates (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().removeAll(collection);

}

    /* generated by template core.Method*/
 public  boolean retainAllStates (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().retainAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeIfState (Predicate<? super automata._ast.ASTState> filter)  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().removeIf(filter);

}

    /* generated by template core.Method*/
 public  void forEachStates (Consumer<? super automata._ast.ASTState> action)  {
      /* generated by template methods.MethodDelegate*/

this.getStateList().forEach(action);

}

    /* generated by template core.Method*/
 public  void addState (int index,automata._ast.ASTState element)  {
      /* generated by template methods.MethodDelegate*/

this.getStateList().add(index, element);

}

    /* generated by template core.Method*/
 public  boolean addAllStates (int index,Collection<? extends automata._ast.ASTState> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().addAll(index, collection);

}

    /* generated by template core.Method*/
 public  automata._ast.ASTState removeState (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().remove(index);

}

    /* generated by template core.Method*/
 public  automata._ast.ASTState setState (int index,automata._ast.ASTState element)  {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().set(index, element);

}

    /* generated by template core.Method*/
 public  void replaceAllStates (UnaryOperator<automata._ast.ASTState> operator)  {
      /* generated by template methods.MethodDelegate*/

this.getStateList().replaceAll(operator);

}

    /* generated by template core.Method*/
 public  void sortStates (Comparator<? super automata._ast.ASTState> comparator)  {
      /* generated by template methods.MethodDelegate*/

this.getStateList().sort(comparator);

}

    /* generated by template core.Method*/
 public  void setStateList (List<automata._ast.ASTState> states)  {
      /* generated by template methods.Set*/

this.states = states;

}

    /* generated by template core.Method*/
 public  void clearTransitions ()  {
      /* generated by template methods.MethodDelegate*/

this.getTransitionList().clear();

}

    /* generated by template core.Method*/
 public  boolean addTransition (automata._ast.ASTTransition element)  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().add(element);

}

    /* generated by template core.Method*/
 public  boolean addAllTransitions (Collection<? extends automata._ast.ASTTransition> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().addAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeTransition (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().remove(element);

}

    /* generated by template core.Method*/
 public  boolean removeAllTransitions (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().removeAll(collection);

}

    /* generated by template core.Method*/
 public  boolean retainAllTransitions (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().retainAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeIfTransition (Predicate<? super automata._ast.ASTTransition> filter)  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().removeIf(filter);

}

    /* generated by template core.Method*/
 public  void forEachTransitions (Consumer<? super automata._ast.ASTTransition> action)  {
      /* generated by template methods.MethodDelegate*/

this.getTransitionList().forEach(action);

}

    /* generated by template core.Method*/
 public  void addTransition (int index,automata._ast.ASTTransition element)  {
      /* generated by template methods.MethodDelegate*/

this.getTransitionList().add(index, element);

}

    /* generated by template core.Method*/
 public  boolean addAllTransitions (int index,Collection<? extends automata._ast.ASTTransition> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().addAll(index, collection);

}

    /* generated by template core.Method*/
 public  automata._ast.ASTTransition removeTransition (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().remove(index);

}

    /* generated by template core.Method*/
 public  automata._ast.ASTTransition setTransition (int index,automata._ast.ASTTransition element)  {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().set(index, element);

}

    /* generated by template core.Method*/
 public  void replaceAllTransitions (UnaryOperator<automata._ast.ASTTransition> operator)  {
      /* generated by template methods.MethodDelegate*/

this.getTransitionList().replaceAll(operator);

}

    /* generated by template core.Method*/
 public  void sortTransitions (Comparator<? super automata._ast.ASTTransition> comparator)  {
      /* generated by template methods.MethodDelegate*/

this.getTransitionList().sort(comparator);

}

    /* generated by template core.Method*/
 public  void setTransitionList (List<automata._ast.ASTTransition> transitions)  {
      /* generated by template methods.Set*/

this.transitions = transitions;

}

    /* generated by template core.Method*/
 public  void accept (automata._visitor.AutomataVisitor visitor)  {
      /* generated by template _ast.ast_class.Accept*/

    // We allow a down cast here, because the subclass ASTAutomaton must exist
    // and only this subclass may exist in the AST and hence, only this class may
    // be handled by a visitor. All other cases are invalid an throw an exception!
    // This decision was made during MC Sprint Review on 16.03.2015.
    if (this instanceof ASTAutomaton) {
      visitor.handle((ASTAutomaton) this);
    } else {
      throw new UnsupportedOperationException("0xA7010x679 Only handwritten class ASTAutomaton is supported for the visitor");
    }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.mcbasics._visitor.MCBasicsVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof automata._visitor.AutomataVisitor) {
    accept((automata._visitor.AutomataVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x278 AST node type ASTAutomaton expected a visitor of type automata._visitor.AutomataVisitor, but got de.monticore.mcbasics._visitor.MCBasicsVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 protected  ASTAutomaton _construct ()  {
      return automata._ast.AutomataNodeFactory.createASTAutomaton();
}

    /* generated by template core.Method*/
 public  Collection<de.monticore.ast.ASTNode> get_Children ()  {
      /* generated by template _ast.ast_class.GetChildren*/

    java.util.LinkedList<de.monticore.ast.ASTNode> result = new java.util.LinkedList<de.monticore.ast.ASTNode>();
        result.addAll(getStateList());
        result.addAll(getTransitionList());
    return result;

}

    /* generated by template core.Method*/
 public  automata._symboltable.AutomatonSymbol getSymbol ()  {
      /* generated by template methods.opt.Get*/

if (isPresentSymbol()) {
return this.symbol.get();
}
Log.error("0xA7003x808 Symbol can't return a value. It is empty.");
// Normally this statement is not reachable
throw new IllegalStateException();

}

    /* generated by template core.Method*/
 public  boolean isPresentSymbol ()  {
      /* generated by template methods.opt.IsPresent*/

return this.symbol.isPresent();

}

    /* generated by template core.Method*/
 public  void setSymbol (automata._symboltable.AutomatonSymbol symbol)  {
      /* generated by template methods.opt.Set*/

this.symbol = Optional.ofNullable(symbol);

}

    /* generated by template core.Method*/
 public  void setSymbolAbsent ()  {
      /* generated by template methods.opt.SetAbsent*/

this.symbol = Optional.empty();

}

    /* generated by template core.Method*/
 public  automata._symboltable.IAutomataScope getSpannedScope ()  {
      /* generated by template methods.Get*/

return this.spannedScope;

}

    /* generated by template core.Method*/
 public  void setSpannedScope (automata._symboltable.IAutomataScope spannedScope)  {
      /* generated by template methods.Set*/

this.spannedScope = spannedScope;

}

    /* generated by template core.Method*/
 public  automata._symboltable.IAutomataScope getEnclosingScope ()  {
      /* generated by template methods.Get*/

return this.enclosingScope;

}

    /* generated by template core.Method*/
 public  void setEnclosingScope (automata._symboltable.IAutomataScope enclosingScope)  {
      /* generated by template methods.Set*/

this.enclosingScope = enclosingScope;

}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.mcbasics._symboltable.IMCBasicsScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof automata._symboltable.IAutomataScope){
    this.enclosingScope = (automata._symboltable.IAutomataScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x177The EnclosingScope form type de.monticore.mcbasics._symboltable.IMCBasicsScope could not be casted to the type automata._symboltable.IAutomataScope. Please call the Method setEnclosingScope with a parameter form type automata._symboltable.IAutomataScope");
  }
}

}
