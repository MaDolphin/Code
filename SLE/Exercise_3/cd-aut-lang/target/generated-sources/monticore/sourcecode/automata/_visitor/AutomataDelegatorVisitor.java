/* generated from model Automata */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package automata._visitor;

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

/* generated by template core.Annotations*/
// empty template

 public  class AutomataDelegatorVisitor  implements AutomataInheritanceVisitor {

    /* generated by template core.Attribute*/
 private  AutomataDelegatorVisitor realThis = (AutomataDelegatorVisitor) this;;

    /* generated by template core.Attribute*/
 private  Optional<de.monticore.types.mcbasictypes._visitor.MCBasicTypesVisitor> mCBasicTypesVisitor = Optional.empty();;

    /* generated by template core.Attribute*/
 private  Optional<de.monticore.mcbasics._visitor.MCBasicsVisitor> mCBasicsVisitor = Optional.empty();;

    /* generated by template core.Attribute*/
 private  Optional<de.monticore.types.typesymbols._visitor.TypeSymbolsVisitor> typeSymbolsVisitor = Optional.empty();;

    /* generated by template core.Attribute*/
 private  Optional<automata._visitor.AutomataVisitor> automataVisitor = Optional.empty();;



    /* generated by template core.Method*/
 public  AutomataDelegatorVisitor getRealThis ()  {
      return realThis;
}

    /* generated by template core.Method*/
 public  void setRealThis (automata._visitor.AutomataVisitor realThis)  {
      /* generated by template _visitor.delegator.SetRealThis*/

if (this.realThis != realThis) {
  if (!(realThis instanceof AutomataDelegatorVisitor)) {
  Log.error("0xA7111x046 realThis of AutomataDelegatorVisitor must be AutomataDelegatorVisitor itself.");
  }
  this.realThis = (AutomataDelegatorVisitor) realThis;
  // register the known delegates to the realThis (and therby also set their new realThis)
  if (this.automataVisitor.isPresent()) {
    this.setAutomataVisitor(automataVisitor.get());
  }
  if (this.mCBasicTypesVisitor.isPresent()) {
    this.setMCBasicTypesVisitor(mCBasicTypesVisitor.get());
  }

}
}

    /* generated by template core.Method*/
 public  void setMCBasicTypesVisitor (de.monticore.types.mcbasictypes._visitor.MCBasicTypesVisitor mCBasicTypesVisitor)  {
      /* generated by template _visitor.delegator.SetVisitor*/

  this.mCBasicTypesVisitor = Optional.ofNullable(mCBasicTypesVisitor);
  if (this.mCBasicTypesVisitor.isPresent()) {
    this.mCBasicTypesVisitor.get().setRealThis(getRealThis());
  }
  // register the MCBasicTypesVisitor also to realThis if not this
  if (getRealThis() != this) {
    // to prevent recursion we must differentiate between realThis being
    // the current this or another instance.
    getRealThis().setMCBasicTypesVisitor(mCBasicTypesVisitor);
  }
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.types.mcbasictypes._visitor.MCBasicTypesVisitor> getMCBasicTypesVisitor ()  {
      return mCBasicTypesVisitor;
}

    /* generated by template core.Method*/
 public  void setMCBasicsVisitor (de.monticore.mcbasics._visitor.MCBasicsVisitor mCBasicsVisitor)  {
      /* generated by template _visitor.delegator.SetVisitor*/

  this.mCBasicsVisitor = Optional.ofNullable(mCBasicsVisitor);
  if (this.mCBasicsVisitor.isPresent()) {
    this.mCBasicsVisitor.get().setRealThis(getRealThis());
  }
  // register the MCBasicsVisitor also to realThis if not this
  if (getRealThis() != this) {
    // to prevent recursion we must differentiate between realThis being
    // the current this or another instance.
    getRealThis().setMCBasicsVisitor(mCBasicsVisitor);
  }
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.mcbasics._visitor.MCBasicsVisitor> getMCBasicsVisitor ()  {
      return mCBasicsVisitor;
}

    /* generated by template core.Method*/
 public  void setTypeSymbolsVisitor (de.monticore.types.typesymbols._visitor.TypeSymbolsVisitor typeSymbolsVisitor)  {
      /* generated by template _visitor.delegator.SetVisitor*/

  this.typeSymbolsVisitor = Optional.ofNullable(typeSymbolsVisitor);
  if (this.typeSymbolsVisitor.isPresent()) {
    this.typeSymbolsVisitor.get().setRealThis(getRealThis());
  }
  // register the TypeSymbolsVisitor also to realThis if not this
  if (getRealThis() != this) {
    // to prevent recursion we must differentiate between realThis being
    // the current this or another instance.
    getRealThis().setTypeSymbolsVisitor(typeSymbolsVisitor);
  }
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.types.typesymbols._visitor.TypeSymbolsVisitor> getTypeSymbolsVisitor ()  {
      return typeSymbolsVisitor;
}

    /* generated by template core.Method*/
 public  void setAutomataVisitor (automata._visitor.AutomataVisitor automataVisitor)  {
      /* generated by template _visitor.delegator.SetVisitor*/

  this.automataVisitor = Optional.ofNullable(automataVisitor);
  if (this.automataVisitor.isPresent()) {
    this.automataVisitor.get().setRealThis(getRealThis());
  }
  // register the AutomataVisitor also to realThis if not this
  if (getRealThis() != this) {
    // to prevent recursion we must differentiate between realThis being
    // the current this or another instance.
    getRealThis().setAutomataVisitor(automataVisitor);
  }
}

    /* generated by template core.Method*/
 public  Optional<automata._visitor.AutomataVisitor> getAutomataVisitor ()  {
      return automataVisitor;
}

    /* generated by template core.Method*/
 public  void visit (automata._ast.ASTAutomaton node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getAutomataVisitor().isPresent()) {
    getRealThis().getAutomataVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (automata._ast.ASTAutomaton node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getAutomataVisitor().isPresent()) {
    getRealThis().getAutomataVisitor().get().endVisit(node);
  }

}

    /* generated by template core.Method*/
 public  void handle (automata._ast.ASTAutomaton node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getAutomataVisitor().isPresent()) {
    getRealThis().getAutomataVisitor().get().handle(node);
  }

}

    /* generated by template core.Method*/
 public  void traverse (automata._ast.ASTAutomaton node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getAutomataVisitor().isPresent()) {
    getRealThis().getAutomataVisitor().get().traverse(node);
  }

}

    /* generated by template core.Method*/
 public  void visit (automata._ast.ASTState node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getAutomataVisitor().isPresent()) {
    getRealThis().getAutomataVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (automata._ast.ASTState node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getAutomataVisitor().isPresent()) {
    getRealThis().getAutomataVisitor().get().endVisit(node);
  }

}

    /* generated by template core.Method*/
 public  void handle (automata._ast.ASTState node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getAutomataVisitor().isPresent()) {
    getRealThis().getAutomataVisitor().get().handle(node);
  }

}

    /* generated by template core.Method*/
 public  void traverse (automata._ast.ASTState node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getAutomataVisitor().isPresent()) {
    getRealThis().getAutomataVisitor().get().traverse(node);
  }

}

    /* generated by template core.Method*/
 public  void visit (automata._ast.ASTTransition node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getAutomataVisitor().isPresent()) {
    getRealThis().getAutomataVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (automata._ast.ASTTransition node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getAutomataVisitor().isPresent()) {
    getRealThis().getAutomataVisitor().get().endVisit(node);
  }

}

    /* generated by template core.Method*/
 public  void handle (automata._ast.ASTTransition node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getAutomataVisitor().isPresent()) {
    getRealThis().getAutomataVisitor().get().handle(node);
  }

}

    /* generated by template core.Method*/
 public  void traverse (automata._ast.ASTTransition node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getAutomataVisitor().isPresent()) {
    getRealThis().getAutomataVisitor().get().traverse(node);
  }

}

    /* generated by template core.Method*/
 public  void visit (automata._ast.ASTAutomataNode node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getAutomataVisitor().isPresent()) {
    getRealThis().getAutomataVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (automata._ast.ASTAutomataNode node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getAutomataVisitor().isPresent()) {
    getRealThis().getAutomataVisitor().get().endVisit(node);
  }

}

    /* generated by template core.Method*/
 public  void handle (automata._ast.ASTAutomataNode node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getAutomataVisitor().isPresent()) {
    getRealThis().getAutomataVisitor().get().handle(node);
  }

}

    /* generated by template core.Method*/
 public  void visit (de.monticore.types.mcbasictypes._ast.ASTMCQualifiedName node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (de.monticore.types.mcbasictypes._ast.ASTMCQualifiedName node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().endVisit(node);
  }

}

    /* generated by template core.Method*/
 public  void handle (de.monticore.types.mcbasictypes._ast.ASTMCQualifiedName node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().handle(node);
  }

}

    /* generated by template core.Method*/
 public  void traverse (de.monticore.types.mcbasictypes._ast.ASTMCQualifiedName node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().traverse(node);
  }

}

    /* generated by template core.Method*/
 public  void visit (de.monticore.types.mcbasictypes._ast.ASTMCImportStatement node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (de.monticore.types.mcbasictypes._ast.ASTMCImportStatement node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().endVisit(node);
  }

}

    /* generated by template core.Method*/
 public  void handle (de.monticore.types.mcbasictypes._ast.ASTMCImportStatement node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().handle(node);
  }

}

    /* generated by template core.Method*/
 public  void traverse (de.monticore.types.mcbasictypes._ast.ASTMCImportStatement node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().traverse(node);
  }

}

    /* generated by template core.Method*/
 public  void visit (de.monticore.types.mcbasictypes._ast.ASTMCPrimitiveType node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (de.monticore.types.mcbasictypes._ast.ASTMCPrimitiveType node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().endVisit(node);
  }

}

    /* generated by template core.Method*/
 public  void handle (de.monticore.types.mcbasictypes._ast.ASTMCPrimitiveType node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().handle(node);
  }

}

    /* generated by template core.Method*/
 public  void traverse (de.monticore.types.mcbasictypes._ast.ASTMCPrimitiveType node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().traverse(node);
  }

}

    /* generated by template core.Method*/
 public  void visit (de.monticore.types.mcbasictypes._ast.ASTMCQualifiedType node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (de.monticore.types.mcbasictypes._ast.ASTMCQualifiedType node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().endVisit(node);
  }

}

    /* generated by template core.Method*/
 public  void handle (de.monticore.types.mcbasictypes._ast.ASTMCQualifiedType node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().handle(node);
  }

}

    /* generated by template core.Method*/
 public  void traverse (de.monticore.types.mcbasictypes._ast.ASTMCQualifiedType node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().traverse(node);
  }

}

    /* generated by template core.Method*/
 public  void visit (de.monticore.types.mcbasictypes._ast.ASTMCReturnType node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (de.monticore.types.mcbasictypes._ast.ASTMCReturnType node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().endVisit(node);
  }

}

    /* generated by template core.Method*/
 public  void handle (de.monticore.types.mcbasictypes._ast.ASTMCReturnType node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().handle(node);
  }

}

    /* generated by template core.Method*/
 public  void traverse (de.monticore.types.mcbasictypes._ast.ASTMCReturnType node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().traverse(node);
  }

}

    /* generated by template core.Method*/
 public  void visit (de.monticore.types.mcbasictypes._ast.ASTMCVoidType node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (de.monticore.types.mcbasictypes._ast.ASTMCVoidType node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().endVisit(node);
  }

}

    /* generated by template core.Method*/
 public  void handle (de.monticore.types.mcbasictypes._ast.ASTMCVoidType node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().handle(node);
  }

}

    /* generated by template core.Method*/
 public  void traverse (de.monticore.types.mcbasictypes._ast.ASTMCVoidType node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().traverse(node);
  }

}

    /* generated by template core.Method*/
 public  void visit (de.monticore.types.mcbasictypes._ast.ASTMCType node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (de.monticore.types.mcbasictypes._ast.ASTMCType node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().endVisit(node);
  }

}

    /* generated by template core.Method*/
 public  void handle (de.monticore.types.mcbasictypes._ast.ASTMCType node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().handle(node);
  }

}

    /* generated by template core.Method*/
 public  void visit (de.monticore.types.mcbasictypes._ast.ASTMCObjectType node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (de.monticore.types.mcbasictypes._ast.ASTMCObjectType node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().endVisit(node);
  }

}

    /* generated by template core.Method*/
 public  void handle (de.monticore.types.mcbasictypes._ast.ASTMCObjectType node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().handle(node);
  }

}

    /* generated by template core.Method*/
 public  void visit (de.monticore.types.mcbasictypes._ast.ASTMCBasicTypesNode node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (de.monticore.types.mcbasictypes._ast.ASTMCBasicTypesNode node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().endVisit(node);
  }

}

    /* generated by template core.Method*/
 public  void handle (de.monticore.types.mcbasictypes._ast.ASTMCBasicTypesNode node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().handle(node);
  }

}

    /* generated by template core.Method*/
 public  void visit (de.monticore.mcbasics._ast.ASTMCBasicsNode node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicsVisitor().isPresent()) {
    getRealThis().getMCBasicsVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (de.monticore.mcbasics._ast.ASTMCBasicsNode node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicsVisitor().isPresent()) {
    getRealThis().getMCBasicsVisitor().get().endVisit(node);
  }

}

    /* generated by template core.Method*/
 public  void handle (de.monticore.mcbasics._ast.ASTMCBasicsNode node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicsVisitor().isPresent()) {
    getRealThis().getMCBasicsVisitor().get().handle(node);
  }

}

    /* generated by template core.Method*/
 public  void visit (de.monticore.types.typesymbols._ast.ASTType node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getTypeSymbolsVisitor().isPresent()) {
    getRealThis().getTypeSymbolsVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (de.monticore.types.typesymbols._ast.ASTType node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getTypeSymbolsVisitor().isPresent()) {
    getRealThis().getTypeSymbolsVisitor().get().endVisit(node);
  }

}

    /* generated by template core.Method*/
 public  void handle (de.monticore.types.typesymbols._ast.ASTType node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getTypeSymbolsVisitor().isPresent()) {
    getRealThis().getTypeSymbolsVisitor().get().handle(node);
  }

}

    /* generated by template core.Method*/
 public  void visit (de.monticore.types.typesymbols._ast.ASTTypeVar node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getTypeSymbolsVisitor().isPresent()) {
    getRealThis().getTypeSymbolsVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (de.monticore.types.typesymbols._ast.ASTTypeVar node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getTypeSymbolsVisitor().isPresent()) {
    getRealThis().getTypeSymbolsVisitor().get().endVisit(node);
  }

}

    /* generated by template core.Method*/
 public  void handle (de.monticore.types.typesymbols._ast.ASTTypeVar node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getTypeSymbolsVisitor().isPresent()) {
    getRealThis().getTypeSymbolsVisitor().get().handle(node);
  }

}

    /* generated by template core.Method*/
 public  void visit (de.monticore.types.typesymbols._ast.ASTField node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getTypeSymbolsVisitor().isPresent()) {
    getRealThis().getTypeSymbolsVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (de.monticore.types.typesymbols._ast.ASTField node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getTypeSymbolsVisitor().isPresent()) {
    getRealThis().getTypeSymbolsVisitor().get().endVisit(node);
  }

}

    /* generated by template core.Method*/
 public  void handle (de.monticore.types.typesymbols._ast.ASTField node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getTypeSymbolsVisitor().isPresent()) {
    getRealThis().getTypeSymbolsVisitor().get().handle(node);
  }

}

    /* generated by template core.Method*/
 public  void visit (de.monticore.types.typesymbols._ast.ASTMethod node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getTypeSymbolsVisitor().isPresent()) {
    getRealThis().getTypeSymbolsVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (de.monticore.types.typesymbols._ast.ASTMethod node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getTypeSymbolsVisitor().isPresent()) {
    getRealThis().getTypeSymbolsVisitor().get().endVisit(node);
  }

}

    /* generated by template core.Method*/
 public  void handle (de.monticore.types.typesymbols._ast.ASTMethod node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getTypeSymbolsVisitor().isPresent()) {
    getRealThis().getTypeSymbolsVisitor().get().handle(node);
  }

}

    /* generated by template core.Method*/
 public  void visit (de.monticore.types.typesymbols._ast.ASTTypeSymbolsNode node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getTypeSymbolsVisitor().isPresent()) {
    getRealThis().getTypeSymbolsVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (de.monticore.types.typesymbols._ast.ASTTypeSymbolsNode node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getTypeSymbolsVisitor().isPresent()) {
    getRealThis().getTypeSymbolsVisitor().get().endVisit(node);
  }

}

    /* generated by template core.Method*/
 public  void handle (de.monticore.types.typesymbols._ast.ASTTypeSymbolsNode node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getTypeSymbolsVisitor().isPresent()) {
    getRealThis().getTypeSymbolsVisitor().get().handle(node);
  }

}

    /* generated by template core.Method*/
 public  void visit (de.monticore.ast.ASTNode node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getAutomataVisitor().isPresent()) {
    getRealThis().getAutomataVisitor().get().visit(node);
  }
  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().visit(node);
  }
  if (getRealThis().getMCBasicsVisitor().isPresent()) {
    getRealThis().getMCBasicsVisitor().get().visit(node);
  }
  if (getRealThis().getTypeSymbolsVisitor().isPresent()) {
    getRealThis().getTypeSymbolsVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (de.monticore.ast.ASTNode node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getTypeSymbolsVisitor().isPresent()) {
    getRealThis().getTypeSymbolsVisitor().get().endVisit(node);
  }
  if (getRealThis().getMCBasicsVisitor().isPresent()) {
    getRealThis().getMCBasicsVisitor().get().endVisit(node);
  }
  if (getRealThis().getMCBasicTypesVisitor().isPresent()) {
    getRealThis().getMCBasicTypesVisitor().get().endVisit(node);
  }
  if (getRealThis().getAutomataVisitor().isPresent()) {
    getRealThis().getAutomataVisitor().get().endVisit(node);
  }

}

}
