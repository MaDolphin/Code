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


 public  class AppointmentsFlexibilizedScope  implements appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope {

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
 public  AppointmentsFlexibilizedScope()  {
    super();
    this.name = Optional.empty();
}

    /* generated by template core.Constructor*/
 public  AppointmentsFlexibilizedScope(boolean shadowing)  {
    this.shadowing = shadowing;
    this.name = Optional.empty();
}

    /* generated by template core.Constructor*/
 public  AppointmentsFlexibilizedScope(appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope enclosingScope)  {
    this(enclosingScope, false);
}

    /* generated by template core.Constructor*/
 public  AppointmentsFlexibilizedScope(appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope enclosingScope,boolean shadowing)  {
    this.setEnclosingScope(enclosingScope);
    this.shadowing = shadowing; 
    this.name = Optional.empty();
}


    /* generated by template core.Method*/
 public  int getSymbolsSize ()  {
      return 0;
}

    /* generated by template core.Method*/
 public  appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope getEnclosingScope ()  {
      /* generated by template methods.Get*/

return this.enclosingScope;

}

    /* generated by template core.Method*/
 public  void setEnclosingScope (appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope enclosingScope)  {
      /* generated by template _symboltable.scope.SetEnclosingScope*/
if (this.enclosingScope != null && enclosingScope != null) {
if (this.enclosingScope == enclosingScope) {
      return;
    }
    Log.warn("0xA1042 Scope \"" + getName() + "\" has already an enclosing scope.");
  }

  // remove this scope from current (old) enclosing scope, if exists.
if (this.enclosingScope != null) {
this.enclosingScope.removeSubScope(this);
  }

  // add this scope to new enclosing scope, if exists.
if (enclosingScope != null) {
enclosingScope.addSubScope(this);
  }

  // set new enclosing scope (or empty)
  this.enclosingScope = enclosingScope;
}

    /* generated by template core.Method*/
 public  de.monticore.symboltable.IScopeSpanningSymbol getSpanningSymbol ()  {
      /* generated by template methods.opt.Get*/

if (isPresentSpanningSymbol()) {
return this.spanningSymbol.get();
}
Log.error("0xA7003x801 SpanningSymbol can't return a value. It is empty.");
// Normally this statement is not reachable
throw new IllegalStateException();

}

    /* generated by template core.Method*/
 public  boolean isPresentSpanningSymbol ()  {
      /* generated by template methods.opt.IsPresent*/

return this.spanningSymbol.isPresent();

}

    /* generated by template core.Method*/
 public  void setSpanningSymbol (de.monticore.symboltable.IScopeSpanningSymbol spanningSymbol)  {
      /* generated by template _symboltable.scope.SetSpanningSymbol*/

  /* generated by template methods.opt.Set*/

this.spanningSymbol = Optional.ofNullable(spanningSymbol);

  setName(spanningSymbol.getName());
}

    /* generated by template core.Method*/
 public  void setSpanningSymbolAbsent ()  {
      /* generated by template _symboltable.scope.SetSpanningSymbolAbsent*/

  /* generated by template methods.opt.SetAbsent*/

this.spanningSymbol = Optional.empty();

  setNameAbsent();
}

    /* generated by template core.Method*/
 public  boolean isShadowing ()  {
      /* generated by template methods.Get*/

return this.shadowing;

}

    /* generated by template core.Method*/
 public  void setShadowing (boolean shadowing)  {
      /* generated by template methods.Set*/

this.shadowing = shadowing;

}

    /* generated by template core.Method*/
 public  boolean isExportingSymbols ()  {
      /* generated by template methods.Get*/

return this.exportingSymbols;

}

    /* generated by template core.Method*/
 public  void setExportingSymbols (boolean exportingSymbols)  {
      /* generated by template methods.Set*/

this.exportingSymbols = exportingSymbols;

}

    /* generated by template core.Method*/
 public  String getName ()  {
      /* generated by template methods.opt.Get*/

if (isPresentName()) {
return this.name.get();
}
Log.error("0xA7003x306 Name can't return a value. It is empty.");
// Normally this statement is not reachable
throw new IllegalStateException();

}

    /* generated by template core.Method*/
 public  boolean isPresentName ()  {
      /* generated by template methods.opt.IsPresent*/

return this.name.isPresent();

}

    /* generated by template core.Method*/
 public  void setName (String name)  {
      /* generated by template methods.opt.Set*/

this.name = Optional.ofNullable(name);

}

    /* generated by template core.Method*/
 public  void setNameAbsent ()  {
      /* generated by template methods.opt.SetAbsent*/

this.name = Optional.empty();

}

    /* generated by template core.Method*/
 public  de.monticore.ast.ASTNode getAstNode ()  {
      /* generated by template methods.opt.Get*/

if (isPresentAstNode()) {
return this.astNode.get();
}
Log.error("0xA7003x157 AstNode can't return a value. It is empty.");
// Normally this statement is not reachable
throw new IllegalStateException();

}

    /* generated by template core.Method*/
 public  boolean isPresentAstNode ()  {
      /* generated by template methods.opt.IsPresent*/

return this.astNode.isPresent();

}

    /* generated by template core.Method*/
 public  void setAstNode (de.monticore.ast.ASTNode astNode)  {
      /* generated by template methods.opt.Set*/

this.astNode = Optional.ofNullable(astNode);

}

    /* generated by template core.Method*/
 public  void setAstNodeAbsent ()  {
      /* generated by template methods.opt.SetAbsent*/

this.astNode = Optional.empty();

}

    /* generated by template core.Method*/
 public  void addSubScope (appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope subScope)  {
      /* generated by template _symboltable.scope.AddSubScope*/
  if (!this.subScopes.contains(subScope)) {
    this.subScopes.add(subScope);
    subScope.setEnclosingScope(this);
  }
}

    /* generated by template core.Method*/
 public  void removeSubScope (appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope subScope)  {
      /* generated by template _symboltable.scope.RemoveSubScope*/
  this.subScopes.remove(subScope);
if (subScope.getEnclosingScope() != null && subScope.getEnclosingScope() == this) {
    subScope.setEnclosingScope(null);
  }
}

    /* generated by template core.Method*/
 public  List<appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope> getSubScopes ()  {
      /* generated by template _symboltable.scope.GetSubScopes*/
  return com.google.common.collect.ImmutableList.copyOf(subScopes);
}

    /* generated by template core.Method*/
 public  void setSubScopes (List<appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope> subScopes)  {
      /* generated by template _symboltable.scope.SetSubScopes*/
  this.subScopes.forEach(this::removeSubScope);
  subScopes.forEach(this::addSubScope);
}

    /* generated by template core.Method*/
 public  void accept (appointmentsflexibilized._visitor.AppointmentsFlexibilizedScopeVisitor visitor)  {
      visitor.handle(this);
}

    /* generated by template core.Method*/
 public  void accept (de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsScopeVisitor visitor)  {
      /* generated by template _symboltable.scope.Accept*/

  if (visitor instanceof appointmentsflexibilized._visitor.AppointmentsFlexibilizedScopeVisitor) {
    accept((appointmentsflexibilized._visitor.AppointmentsFlexibilizedScopeVisitor) visitor);
  } else {
    throw new UnsupportedOperationException("0xA7010x331 Scope node type AppointmentsFlexibilizedScope expected a visitor of type appointmentsflexibilized._visitor.AppointmentsFlexibilizedScopeVisitor, but got de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsScopeVisitor.");
  }
}

    /* generated by template core.Method*/
 public  void accept (de.monticore.mcbasics._visitor.MCBasicsScopeVisitor visitor)  {
      /* generated by template _symboltable.scope.Accept*/

  if (visitor instanceof appointmentsflexibilized._visitor.AppointmentsFlexibilizedScopeVisitor) {
    accept((appointmentsflexibilized._visitor.AppointmentsFlexibilizedScopeVisitor) visitor);
  } else {
    throw new UnsupportedOperationException("0xA7010x973 Scope node type AppointmentsFlexibilizedScope expected a visitor of type appointmentsflexibilized._visitor.AppointmentsFlexibilizedScopeVisitor, but got de.monticore.mcbasics._visitor.MCBasicsScopeVisitor.");
  }
}

    /* generated by template core.Method*/
 public  void accept (de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisScopeVisitor visitor)  {
      /* generated by template _symboltable.scope.Accept*/

  if (visitor instanceof appointmentsflexibilized._visitor.AppointmentsFlexibilizedScopeVisitor) {
    accept((appointmentsflexibilized._visitor.AppointmentsFlexibilizedScopeVisitor) visitor);
  } else {
    throw new UnsupportedOperationException("0xA7010x959 Scope node type AppointmentsFlexibilizedScope expected a visitor of type appointmentsflexibilized._visitor.AppointmentsFlexibilizedScopeVisitor, but got de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisScopeVisitor.");
  }
}

    /* generated by template core.Method*/
 public  void addSubScope (de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope subScope)  {
      this.addSubScope((appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope) subScope);
}

    /* generated by template core.Method*/
 public  void removeSubScope (de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope subScope)  {
      this.removeSubScope((appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope) subScope);
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope newEnclosingScope)  {
      this.setEnclosingScope((appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope) newEnclosingScope);
}

    /* generated by template core.Method*/
 public  void addSubScope (de.monticore.mcbasics._symboltable.IMCBasicsScope subScope)  {
      this.addSubScope((appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope) subScope);
}

    /* generated by template core.Method*/
 public  void removeSubScope (de.monticore.mcbasics._symboltable.IMCBasicsScope subScope)  {
      this.removeSubScope((appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope) subScope);
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.mcbasics._symboltable.IMCBasicsScope newEnclosingScope)  {
      this.setEnclosingScope((appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope) newEnclosingScope);
}

    /* generated by template core.Method*/
 public  void addSubScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope subScope)  {
      this.addSubScope((appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope) subScope);
}

    /* generated by template core.Method*/
 public  void removeSubScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope subScope)  {
      this.removeSubScope((appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope) subScope);
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope newEnclosingScope)  {
      this.setEnclosingScope((appointmentsflexibilized._symboltable.IAppointmentsFlexibilizedScope) newEnclosingScope);
}

}
