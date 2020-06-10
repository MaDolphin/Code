/* generated from model GuitarTab */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package guitartab._visitor;

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

 public  class GuitarTabDelegatorVisitor  implements GuitarTabInheritanceVisitor {

    /* generated by template core.Attribute*/
 private  GuitarTabDelegatorVisitor realThis = (GuitarTabDelegatorVisitor) this;;

    /* generated by template core.Attribute*/
 private  Optional<de.monticore.mcbasics._visitor.MCBasicsVisitor> mCBasicsVisitor = Optional.empty();;

    /* generated by template core.Attribute*/
 private  Optional<guitartab._visitor.GuitarTabVisitor> guitarTabVisitor = Optional.empty();;



    /* generated by template core.Method*/
 public  GuitarTabDelegatorVisitor getRealThis ()  {
      return realThis;
}

    /* generated by template core.Method*/
 public  void setRealThis (guitartab._visitor.GuitarTabVisitor realThis)  {
      /* generated by template _visitor.delegator.SetRealThis*/

if (this.realThis != realThis) {
  if (!(realThis instanceof GuitarTabDelegatorVisitor)) {
  Log.error("0xA7111x046 realThis of GuitarTabDelegatorVisitor must be GuitarTabDelegatorVisitor itself.");
  }
  this.realThis = (GuitarTabDelegatorVisitor) realThis;
  // register the known delegates to the realThis (and therby also set their new realThis)
  if (this.guitarTabVisitor.isPresent()) {
    this.setGuitarTabVisitor(guitarTabVisitor.get());
  }
  if (this.mCBasicsVisitor.isPresent()) {
    this.setMCBasicsVisitor(mCBasicsVisitor.get());
  }

}
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
 public  void setGuitarTabVisitor (guitartab._visitor.GuitarTabVisitor guitarTabVisitor)  {
      /* generated by template _visitor.delegator.SetVisitor*/

  this.guitarTabVisitor = Optional.ofNullable(guitarTabVisitor);
  if (this.guitarTabVisitor.isPresent()) {
    this.guitarTabVisitor.get().setRealThis(getRealThis());
  }
  // register the GuitarTabVisitor also to realThis if not this
  if (getRealThis() != this) {
    // to prevent recursion we must differentiate between realThis being
    // the current this or another instance.
    getRealThis().setGuitarTabVisitor(guitarTabVisitor);
  }
}

    /* generated by template core.Method*/
 public  Optional<guitartab._visitor.GuitarTabVisitor> getGuitarTabVisitor ()  {
      return guitarTabVisitor;
}

    /* generated by template core.Method*/
 public  void visit (guitartab._ast.ASTTab node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getGuitarTabVisitor().isPresent()) {
    getRealThis().getGuitarTabVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (guitartab._ast.ASTTab node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getGuitarTabVisitor().isPresent()) {
    getRealThis().getGuitarTabVisitor().get().endVisit(node);
  }

}

    /* generated by template core.Method*/
 public  void handle (guitartab._ast.ASTTab node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getGuitarTabVisitor().isPresent()) {
    getRealThis().getGuitarTabVisitor().get().handle(node);
  }

}

    /* generated by template core.Method*/
 public  void traverse (guitartab._ast.ASTTab node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getGuitarTabVisitor().isPresent()) {
    getRealThis().getGuitarTabVisitor().get().traverse(node);
  }

}

    /* generated by template core.Method*/
 public  void visit (guitartab._ast.ASTComment node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getGuitarTabVisitor().isPresent()) {
    getRealThis().getGuitarTabVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (guitartab._ast.ASTComment node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getGuitarTabVisitor().isPresent()) {
    getRealThis().getGuitarTabVisitor().get().endVisit(node);
  }

}

    /* generated by template core.Method*/
 public  void handle (guitartab._ast.ASTComment node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getGuitarTabVisitor().isPresent()) {
    getRealThis().getGuitarTabVisitor().get().handle(node);
  }

}

    /* generated by template core.Method*/
 public  void traverse (guitartab._ast.ASTComment node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getGuitarTabVisitor().isPresent()) {
    getRealThis().getGuitarTabVisitor().get().traverse(node);
  }

}

    /* generated by template core.Method*/
 public  void visit (guitartab._ast.ASTSixStrings node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getGuitarTabVisitor().isPresent()) {
    getRealThis().getGuitarTabVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (guitartab._ast.ASTSixStrings node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getGuitarTabVisitor().isPresent()) {
    getRealThis().getGuitarTabVisitor().get().endVisit(node);
  }

}

    /* generated by template core.Method*/
 public  void handle (guitartab._ast.ASTSixStrings node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getGuitarTabVisitor().isPresent()) {
    getRealThis().getGuitarTabVisitor().get().handle(node);
  }

}

    /* generated by template core.Method*/
 public  void traverse (guitartab._ast.ASTSixStrings node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getGuitarTabVisitor().isPresent()) {
    getRealThis().getGuitarTabVisitor().get().traverse(node);
  }

}

    /* generated by template core.Method*/
 public  void visit (guitartab._ast.ASTGuitarString node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getGuitarTabVisitor().isPresent()) {
    getRealThis().getGuitarTabVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (guitartab._ast.ASTGuitarString node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getGuitarTabVisitor().isPresent()) {
    getRealThis().getGuitarTabVisitor().get().endVisit(node);
  }

}

    /* generated by template core.Method*/
 public  void handle (guitartab._ast.ASTGuitarString node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getGuitarTabVisitor().isPresent()) {
    getRealThis().getGuitarTabVisitor().get().handle(node);
  }

}

    /* generated by template core.Method*/
 public  void traverse (guitartab._ast.ASTGuitarString node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getGuitarTabVisitor().isPresent()) {
    getRealThis().getGuitarTabVisitor().get().traverse(node);
  }

}

    /* generated by template core.Method*/
 public  void visit (guitartab._ast.ASTLengthLine node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getGuitarTabVisitor().isPresent()) {
    getRealThis().getGuitarTabVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (guitartab._ast.ASTLengthLine node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getGuitarTabVisitor().isPresent()) {
    getRealThis().getGuitarTabVisitor().get().endVisit(node);
  }

}

    /* generated by template core.Method*/
 public  void handle (guitartab._ast.ASTLengthLine node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getGuitarTabVisitor().isPresent()) {
    getRealThis().getGuitarTabVisitor().get().handle(node);
  }

}

    /* generated by template core.Method*/
 public  void traverse (guitartab._ast.ASTLengthLine node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getGuitarTabVisitor().isPresent()) {
    getRealThis().getGuitarTabVisitor().get().traverse(node);
  }

}

    /* generated by template core.Method*/
 public  void visit (guitartab._ast.ASTGuitarTabNode node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getGuitarTabVisitor().isPresent()) {
    getRealThis().getGuitarTabVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (guitartab._ast.ASTGuitarTabNode node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getGuitarTabVisitor().isPresent()) {
    getRealThis().getGuitarTabVisitor().get().endVisit(node);
  }

}

    /* generated by template core.Method*/
 public  void handle (guitartab._ast.ASTGuitarTabNode node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getGuitarTabVisitor().isPresent()) {
    getRealThis().getGuitarTabVisitor().get().handle(node);
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
 public  void visit (de.monticore.ast.ASTNode node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getGuitarTabVisitor().isPresent()) {
    getRealThis().getGuitarTabVisitor().get().visit(node);
  }
  if (getRealThis().getMCBasicsVisitor().isPresent()) {
    getRealThis().getMCBasicsVisitor().get().visit(node);
  }

}

    /* generated by template core.Method*/
 public  void endVisit (de.monticore.ast.ASTNode node)  {
      /* generated by template _visitor.delegator.VisitorMethods*/

  if (getRealThis().getMCBasicsVisitor().isPresent()) {
    getRealThis().getMCBasicsVisitor().get().endVisit(node);
  }
  if (getRealThis().getGuitarTabVisitor().isPresent()) {
    getRealThis().getGuitarTabVisitor().get().endVisit(node);
  }

}

}
