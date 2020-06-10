/* generated from model AppointmentsFlexibilized */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package appointmentsflexibilized._symboltable;

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


 public  class AppointmentsFlexibilizedScopeBuilder  {

    /* generated by template core.Attribute*/
 protected  AppointmentsFlexibilizedScopeBuilder realBuilder ;

    /* generated by template core.Attribute*/
 protected  appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope enclosingScope ;

    /* generated by template core.Attribute*/
 protected  Optional<de.monticore.symboltable.IScopeSpanningSymbol> spanningSymbol = Optional.empty();

    /* generated by template core.Attribute*/
 protected  boolean shadowing ;

    /* generated by template core.Attribute*/
 protected  boolean exportingSymbols = true;

    /* generated by template core.Attribute*/
 protected  Optional<String> name = Optional.empty();

    /* generated by template core.Attribute*/
 protected  Optional<de.monticore.ast.ASTNode> astNode = Optional.empty();

    /* generated by template core.Attribute*/
 protected  List<appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope> subScopes = new java.util.ArrayList<>();


    /* generated by template core.Constructor*/
 protected  AppointmentsFlexibilizedScopeBuilder()  {
    this.realBuilder = (AppointmentsFlexibilizedScopeBuilder) this;
}


    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedScope build ()  {
      /* generated by template _symboltable.scope.Build*/

  AppointmentsFlexibilizedScope scope = new AppointmentsFlexibilizedScope(shadowing);
  this.spanningSymbol.ifPresent(scope::setSpanningSymbol);
  scope.setExportingSymbols(this.exportingSymbols);
scope.setEnclosingScope(this.enclosingScope);
  scope.setSubScopes(this.subScopes);
  if (this.isPresentAstNode()) {
    scope.setAstNode(this.getAstNode());
  } else {
    scope.setAstNodeAbsent();
  }
  this.name.ifPresent(scope::setName);
  this.subScopes.forEach(s -> s.setEnclosingScope(scope));
  return scope;
}

    /* generated by template core.Method*/
 public  boolean isValid ()  {
      /* generated by template _ast.builder.IsValidMethod*/

        if (enclosingScope == null) {
            return false;
        }
        return true;

}

    /* generated by template core.Method*/
 public  appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope getEnclosingScope ()  {
      /* generated by template methods.Get*/

return this.enclosingScope;

}

    /* generated by template core.Method*/
 public  de.monticore.symboltable.IScopeSpanningSymbol getSpanningSymbol ()  {
      /* generated by template methods.opt.Get*/

if (isPresentSpanningSymbol()) {
return this.spanningSymbol.get();
}
Log.error("0xA7003x392 SpanningSymbol can't return a value. It is empty.");
// Normally this statement is not reachable
throw new IllegalStateException();

}

    /* generated by template core.Method*/
 public  boolean isPresentSpanningSymbol ()  {
      /* generated by template methods.opt.IsPresent*/

return this.spanningSymbol.isPresent();

}

    /* generated by template core.Method*/
 public  boolean isShadowing ()  {
      /* generated by template methods.Get*/

return this.shadowing;

}

    /* generated by template core.Method*/
 public  boolean isExportingSymbols ()  {
      /* generated by template methods.Get*/

return this.exportingSymbols;

}

    /* generated by template core.Method*/
 public  String getName ()  {
      /* generated by template methods.opt.Get*/

if (isPresentName()) {
return this.name.get();
}
Log.error("0xA7003x330 Name can't return a value. It is empty.");
// Normally this statement is not reachable
throw new IllegalStateException();

}

    /* generated by template core.Method*/
 public  boolean isPresentName ()  {
      /* generated by template methods.opt.IsPresent*/

return this.name.isPresent();

}

    /* generated by template core.Method*/
 public  de.monticore.ast.ASTNode getAstNode ()  {
      /* generated by template methods.opt.Get*/

if (isPresentAstNode()) {
return this.astNode.get();
}
Log.error("0xA7003x251 AstNode can't return a value. It is empty.");
// Normally this statement is not reachable
throw new IllegalStateException();

}

    /* generated by template core.Method*/
 public  boolean isPresentAstNode ()  {
      /* generated by template methods.opt.IsPresent*/

return this.astNode.isPresent();

}

    /* generated by template core.Method*/
 public  boolean containsSubScope (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getSubScopeList().contains(element);

}

    /* generated by template core.Method*/
 public  boolean containsAllSubScopes (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getSubScopeList().containsAll(collection);

}

    /* generated by template core.Method*/
 public  boolean isEmptySubScopes ()  {
      /* generated by template methods.MethodDelegate*/

return this.getSubScopeList().isEmpty();

}

    /* generated by template core.Method*/
 public  Iterator<appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope> iteratorSubScopes ()  {
      /* generated by template methods.MethodDelegate*/

return this.getSubScopeList().iterator();

}

    /* generated by template core.Method*/
 public  int sizeSubScopes ()  {
      /* generated by template methods.MethodDelegate*/

return this.getSubScopeList().size();

}

    /* generated by template core.Method*/
 public  appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope[] toArraySubScopes (appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope[] array)  {
      /* generated by template methods.MethodDelegate*/

return this.getSubScopeList().toArray(array);

}

    /* generated by template core.Method*/
 public  Object[] toArraySubScopes ()  {
      /* generated by template methods.MethodDelegate*/

return this.getSubScopeList().toArray();

}

    /* generated by template core.Method*/
 public  Spliterator<appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope> spliteratorSubScopes ()  {
      /* generated by template methods.MethodDelegate*/

return this.getSubScopeList().spliterator();

}

    /* generated by template core.Method*/
 public  Stream<appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope> streamSubScopes ()  {
      /* generated by template methods.MethodDelegate*/

return this.getSubScopeList().stream();

}

    /* generated by template core.Method*/
 public  Stream<appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope> parallelStreamSubScopes ()  {
      /* generated by template methods.MethodDelegate*/

return this.getSubScopeList().parallelStream();

}

    /* generated by template core.Method*/
 public  appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope getSubScope (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getSubScopeList().get(index);

}

    /* generated by template core.Method*/
 public  int indexOfSubScope (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getSubScopeList().indexOf(element);

}

    /* generated by template core.Method*/
 public  int lastIndexOfSubScope (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getSubScopeList().lastIndexOf(element);

}

    /* generated by template core.Method*/
 public  boolean equalsSubScopes (Object o)  {
      /* generated by template methods.MethodDelegate*/

return this.getSubScopeList().equals(o);

}

    /* generated by template core.Method*/
 public  int hashCodeSubScopes ()  {
      /* generated by template methods.MethodDelegate*/

return this.getSubScopeList().hashCode();

}

    /* generated by template core.Method*/
 public  ListIterator<appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope> listIteratorSubScopes ()  {
      /* generated by template methods.MethodDelegate*/

return this.getSubScopeList().listIterator();

}

    /* generated by template core.Method*/
 public  ListIterator<appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope> listIteratorSubScopes (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getSubScopeList().listIterator(index);

}

    /* generated by template core.Method*/
 public  List<appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope> subListSubScopes (int start,int end)  {
      /* generated by template methods.MethodDelegate*/

return this.getSubScopeList().subList(start, end);

}

    /* generated by template core.Method*/
 public  List<appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope> getSubScopeList ()  {
      /* generated by template methods.Get*/

return this.subScopes;

}

    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedScopeBuilder setEnclosingScope (appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope enclosingScope)  {
      /* generated by template _ast.builder.Set*/

    this.enclosingScope = enclosingScope;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedScopeBuilder setSpanningSymbol (de.monticore.symboltable.IScopeSpanningSymbol spanningSymbol)  {
      /* generated by template _ast.builder.opt.Set*/

    this.spanningSymbol = Optional.ofNullable(spanningSymbol);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedScopeBuilder setSpanningSymbolAbsent ()  {
      /* generated by template _ast.builder.opt.SetAbsent*/

    this.spanningSymbol = Optional.empty();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedScopeBuilder setShadowing (boolean shadowing)  {
      /* generated by template _ast.builder.Set*/

    this.shadowing = shadowing;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedScopeBuilder setExportingSymbols (boolean exportingSymbols)  {
      /* generated by template _ast.builder.Set*/

    this.exportingSymbols = exportingSymbols;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedScopeBuilder setName (String name)  {
      /* generated by template _ast.builder.opt.Set*/

    this.name = Optional.ofNullable(name);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedScopeBuilder setNameAbsent ()  {
      /* generated by template _ast.builder.opt.SetAbsent*/

    this.name = Optional.empty();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedScopeBuilder setAstNode (de.monticore.ast.ASTNode astNode)  {
      /* generated by template _ast.builder.opt.Set*/

    this.astNode = Optional.ofNullable(astNode);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedScopeBuilder setAstNodeAbsent ()  {
      /* generated by template _ast.builder.opt.SetAbsent*/

    this.astNode = Optional.empty();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedScopeBuilder clearSubScopes ()  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getSubScopeList().clear();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedScopeBuilder addSubScope (appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getSubScopeList().add(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedScopeBuilder addAllSubScopes (Collection<? extends appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getSubScopeList().addAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedScopeBuilder removeSubScope (Object element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getSubScopeList().remove(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedScopeBuilder removeAllSubScopes (Collection<?> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getSubScopeList().removeAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedScopeBuilder retainAllSubScopes (Collection<?> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getSubScopeList().retainAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedScopeBuilder removeIfSubScope (Predicate<? super appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope> filter)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getSubScopeList().removeIf(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedScopeBuilder forEachSubScopes (Consumer<? super appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope> action)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getSubScopeList().forEach(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedScopeBuilder addSubScope (int index,appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getSubScopeList().add(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedScopeBuilder addAllSubScopes (int index,Collection<? extends appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getSubScopeList().addAll(index, collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedScopeBuilder removeSubScope (int index)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getSubScopeList().remove(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedScopeBuilder setSubScope (int index,appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getSubScopeList().set(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedScopeBuilder replaceAllSubScopes (UnaryOperator<appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope> operator)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getSubScopeList().replaceAll(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedScopeBuilder sortSubScopes (Comparator<? super appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope> comparator)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getSubScopeList().sort(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AppointmentsFlexibilizedScopeBuilder setSubScopeList (List<appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope> subScopes)  {
      /* generated by template _ast.builder.Set*/

    this.subScopes = subScopes;
    return this.realBuilder;

}

}