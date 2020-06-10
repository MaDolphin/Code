/* generated from model Automata */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package automata._symboltable;

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


 public  class AutomataArtifactScopeBuilder  {

    /* generated by template core.Attribute*/
 protected  AutomataArtifactScopeBuilder realBuilder ;

    /* generated by template core.Attribute*/
 protected  String packageName ;

    /* generated by template core.Attribute*/
 protected  List<de.monticore.symboltable.ImportStatement> imports = new java.util.ArrayList<>();

    /* generated by template core.Attribute*/
 protected  Optional<automata._symboltable.IAutomataScope> enclosingScope = Optional.empty();


    /* generated by template core.Constructor*/
 protected  AutomataArtifactScopeBuilder()  {
    this.realBuilder = (AutomataArtifactScopeBuilder) this;
}


    /* generated by template core.Method*/
 public  AutomataArtifactScope build ()  {
      /* generated by template _symboltable.artifactscope.Build*/

AutomataArtifactScope scope;
  if (!enclosingScope.isPresent()) {
    scope = new AutomataArtifactScope(packageName, imports);
  } else {
    scope = new AutomataArtifactScope(enclosingScope, packageName, imports);
  }
  return scope;
}

    /* generated by template core.Method*/
 public  boolean isValid ()  {
      /* generated by template _ast.builder.IsValidMethod*/

        if (packageName == null) {
            return false;
        }
        return true;

}

    /* generated by template core.Method*/
 public  String getPackageName ()  {
      /* generated by template methods.Get*/

return this.packageName;

}

    /* generated by template core.Method*/
 public  boolean containsImport (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().contains(element);

}

    /* generated by template core.Method*/
 public  boolean containsAllImports (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().containsAll(collection);

}

    /* generated by template core.Method*/
 public  boolean isEmptyImports ()  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().isEmpty();

}

    /* generated by template core.Method*/
 public  Iterator<de.monticore.symboltable.ImportStatement> iteratorImports ()  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().iterator();

}

    /* generated by template core.Method*/
 public  int sizeImports ()  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().size();

}

    /* generated by template core.Method*/
 public  de.monticore.symboltable.ImportStatement[] toArrayImports (de.monticore.symboltable.ImportStatement[] array)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().toArray(array);

}

    /* generated by template core.Method*/
 public  Object[] toArrayImports ()  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().toArray();

}

    /* generated by template core.Method*/
 public  Spliterator<de.monticore.symboltable.ImportStatement> spliteratorImports ()  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().spliterator();

}

    /* generated by template core.Method*/
 public  Stream<de.monticore.symboltable.ImportStatement> streamImports ()  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().stream();

}

    /* generated by template core.Method*/
 public  Stream<de.monticore.symboltable.ImportStatement> parallelStreamImports ()  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().parallelStream();

}

    /* generated by template core.Method*/
 public  de.monticore.symboltable.ImportStatement getImport (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().get(index);

}

    /* generated by template core.Method*/
 public  int indexOfImport (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().indexOf(element);

}

    /* generated by template core.Method*/
 public  int lastIndexOfImport (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().lastIndexOf(element);

}

    /* generated by template core.Method*/
 public  boolean equalsImports (Object o)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().equals(o);

}

    /* generated by template core.Method*/
 public  int hashCodeImports ()  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().hashCode();

}

    /* generated by template core.Method*/
 public  ListIterator<de.monticore.symboltable.ImportStatement> listIteratorImports ()  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().listIterator();

}

    /* generated by template core.Method*/
 public  ListIterator<de.monticore.symboltable.ImportStatement> listIteratorImports (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().listIterator(index);

}

    /* generated by template core.Method*/
 public  List<de.monticore.symboltable.ImportStatement> subListImports (int start,int end)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().subList(start, end);

}

    /* generated by template core.Method*/
 public  List<de.monticore.symboltable.ImportStatement> getImportList ()  {
      /* generated by template methods.Get*/

return this.imports;

}

    /* generated by template core.Method*/
 public  AutomataArtifactScopeBuilder setPackageName (String packageName)  {
      /* generated by template _ast.builder.Set*/

    this.packageName = packageName;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataArtifactScopeBuilder clearImports ()  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getImportList().clear();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataArtifactScopeBuilder addImport (de.monticore.symboltable.ImportStatement element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getImportList().add(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataArtifactScopeBuilder addAllImports (Collection<? extends de.monticore.symboltable.ImportStatement> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getImportList().addAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataArtifactScopeBuilder removeImport (Object element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getImportList().remove(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataArtifactScopeBuilder removeAllImports (Collection<?> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getImportList().removeAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataArtifactScopeBuilder retainAllImports (Collection<?> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getImportList().retainAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataArtifactScopeBuilder removeIfImport (Predicate<? super de.monticore.symboltable.ImportStatement> filter)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getImportList().removeIf(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataArtifactScopeBuilder forEachImports (Consumer<? super de.monticore.symboltable.ImportStatement> action)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getImportList().forEach(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataArtifactScopeBuilder addImport (int index,de.monticore.symboltable.ImportStatement element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getImportList().add(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataArtifactScopeBuilder addAllImports (int index,Collection<? extends de.monticore.symboltable.ImportStatement> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getImportList().addAll(index, collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataArtifactScopeBuilder removeImport (int index)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getImportList().remove(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataArtifactScopeBuilder setImport (int index,de.monticore.symboltable.ImportStatement element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getImportList().set(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataArtifactScopeBuilder replaceAllImports (UnaryOperator<de.monticore.symboltable.ImportStatement> operator)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getImportList().replaceAll(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataArtifactScopeBuilder sortImports (Comparator<? super de.monticore.symboltable.ImportStatement> comparator)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getImportList().sort(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataArtifactScopeBuilder setImportList (List<de.monticore.symboltable.ImportStatement> imports)  {
      /* generated by template _ast.builder.Set*/

    this.imports = imports;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataArtifactScopeBuilder setEnclosingScope (automata._symboltable.IAutomataScope enclosingScope)  {
      /* generated by template _ast.builder.opt.Set*/

    this.enclosingScope = Optional.ofNullable(enclosingScope);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataArtifactScopeBuilder setEnclosingScopeAbsent ()  {
      /* generated by template _ast.builder.opt.SetAbsent*/

    this.enclosingScope = Optional.empty();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  automata._symboltable.IAutomataScope getEnclosingScope ()  {
      /* generated by template methods.opt.Get*/

if (isPresentEnclosingScope()) {
return this.enclosingScope.get();
}
Log.error("0xA7003x559 EnclosingScope can't return a value. It is empty.");
// Normally this statement is not reachable
throw new IllegalStateException();

}

    /* generated by template core.Method*/
 public  boolean isPresentEnclosingScope ()  {
      /* generated by template methods.opt.IsPresent*/

return this.enclosingScope.isPresent();

}

}