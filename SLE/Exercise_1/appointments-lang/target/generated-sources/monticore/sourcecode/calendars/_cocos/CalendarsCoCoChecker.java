/* generated from model Calendars */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package calendars._cocos;

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

 public  class CalendarsCoCoChecker  implements calendars._visitor.CalendarsInheritanceVisitor {

    /* generated by template core.Attribute*/
 private  calendars._visitor.CalendarsVisitor realThis = this;

    /* generated by template core.Attribute*/
 private  List<calendars._cocos.CalendarsCoCoChecker> calendars__cocos_CalendarsCoCoChecker = new ArrayList<>();

    /* generated by template core.Attribute*/
 private  Collection<calendars._cocos.CalendarsASTCalendarsCoCo> calendars__ast_ASTCalendarsCoCos = new LinkedHashSet<>();

    /* generated by template core.Attribute*/
 private  Collection<calendars._cocos.CalendarsASTAppointmentsCoCo> calendars__ast_ASTAppointmentsCoCos = new LinkedHashSet<>();

    /* generated by template core.Attribute*/
 private  Collection<calendars._cocos.CalendarsASTCalendarsNodeCoCo> calendars__ast_ASTCalendarsNodeCoCos = new LinkedHashSet<>();

    /* generated by template core.Attribute*/
 private  List<de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsCoCoChecker> de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker = new ArrayList<>(Arrays.asList(new de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsCoCoChecker()));

    /* generated by template core.Attribute*/
 private  List<de.monticore.mcbasics._cocos.MCBasicsCoCoChecker> de_monticore_mcbasics__cocos_MCBasicsCoCoChecker = new ArrayList<>(Arrays.asList(new de.monticore.mcbasics._cocos.MCBasicsCoCoChecker()));

    /* generated by template core.Attribute*/
 private  List<de.monticore.literals.mcliteralsbasis._cocos.MCLiteralsBasisCoCoChecker> de_monticore_literals_mcliteralsbasis__cocos_MCLiteralsBasisCoCoChecker = new ArrayList<>(Arrays.asList(new de.monticore.literals.mcliteralsbasis._cocos.MCLiteralsBasisCoCoChecker()));


    /* generated by template core.Constructor*/
 public  CalendarsCoCoChecker()  {
    /* generated by template core.EmptyBody*/
// empty body

}


    /* generated by template core.Method*/
 public  calendars._visitor.CalendarsVisitor getRealThis ()  {
      /* generated by template methods.Get*/

return this.realThis;

}

    /* generated by template core.Method*/
 public  void setRealThis (calendars._visitor.CalendarsVisitor realThis)  {
      /* generated by template methods.Set*/

this.realThis = realThis;

}

    /* generated by template core.Method*/
 public  void addChecker (calendars._cocos.CalendarsCoCoChecker checker)  {
      this.calendars__cocos_CalendarsCoCoChecker.add(checker);
}

    /* generated by template core.Method*/
 public  void checkAll (calendars._ast.ASTCalendarsNode node)  {
      node.accept(getRealThis());
}

    /* generated by template core.Method*/
 public  calendars._cocos.CalendarsCoCoChecker addCoCo (calendars._cocos.CalendarsASTCalendarsCoCo coco)  {
      calendars__ast_ASTCalendarsCoCos.add(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (calendars._ast.ASTCalendars node)  {
      for (calendars._cocos.CalendarsASTCalendarsCoCo coco : calendars__ast_ASTCalendarsCoCos) {
coco.check(node);
}
// and delegate to all registered checkers of the same language as well
calendars__cocos_CalendarsCoCoChecker.stream().forEach(c -> c.visit(node));
}

    /* generated by template core.Method*/
 public  calendars._cocos.CalendarsCoCoChecker addCoCo (calendars._cocos.CalendarsASTAppointmentsCoCo coco)  {
      calendars__ast_ASTAppointmentsCoCos.add(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (calendars._ast.ASTAppointments node)  {
      for (calendars._cocos.CalendarsASTAppointmentsCoCo coco : calendars__ast_ASTAppointmentsCoCos) {
coco.check(node);
}
// and delegate to all registered checkers of the same language as well
calendars__cocos_CalendarsCoCoChecker.stream().forEach(c -> c.visit(node));
}

    /* generated by template core.Method*/
 public  calendars._cocos.CalendarsCoCoChecker addCoCo (calendars._cocos.CalendarsASTCalendarsNodeCoCo coco)  {
      calendars__ast_ASTCalendarsNodeCoCos.add(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (calendars._ast.ASTCalendarsNode node)  {
      for (calendars._cocos.CalendarsASTCalendarsNodeCoCo coco : calendars__ast_ASTCalendarsNodeCoCos) {
coco.check(node);
}
// and delegate to all registered checkers of the same language as well
calendars__cocos_CalendarsCoCoChecker.stream().forEach(c -> c.visit(node));
}

    /* generated by template core.Method*/
 public  void addChecker (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsCoCoChecker checker)  {
      this.de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.add(checker);
}

    /* generated by template core.Method*/
 public  void checkAll (de.monticore.literals.mccommonliterals._ast.ASTMCCommonLiteralsNode node)  {
      node.accept(getRealThis());
}

    /* generated by template core.Method*/
 public  calendars._cocos.CalendarsCoCoChecker addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTNullLiteralCoCo coco)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().findFirst().get().addCoCo(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (de.monticore.literals.mccommonliterals._ast.ASTNullLiteral node)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().forEach(c -> c.visit(node));
}

    /* generated by template core.Method*/
 public  calendars._cocos.CalendarsCoCoChecker addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTBooleanLiteralCoCo coco)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().findFirst().get().addCoCo(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteral node)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().forEach(c -> c.visit(node));
}

    /* generated by template core.Method*/
 public  calendars._cocos.CalendarsCoCoChecker addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTCharLiteralCoCo coco)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().findFirst().get().addCoCo(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (de.monticore.literals.mccommonliterals._ast.ASTCharLiteral node)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().forEach(c -> c.visit(node));
}

    /* generated by template core.Method*/
 public  calendars._cocos.CalendarsCoCoChecker addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTStringLiteralCoCo coco)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().findFirst().get().addCoCo(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (de.monticore.literals.mccommonliterals._ast.ASTStringLiteral node)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().forEach(c -> c.visit(node));
}

    /* generated by template core.Method*/
 public  calendars._cocos.CalendarsCoCoChecker addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTNatLiteralCoCo coco)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().findFirst().get().addCoCo(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (de.monticore.literals.mccommonliterals._ast.ASTNatLiteral node)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().forEach(c -> c.visit(node));
}

    /* generated by template core.Method*/
 public  calendars._cocos.CalendarsCoCoChecker addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTSignedNatLiteralCoCo coco)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().findFirst().get().addCoCo(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteral node)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().forEach(c -> c.visit(node));
}

    /* generated by template core.Method*/
 public  calendars._cocos.CalendarsCoCoChecker addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTBasicLongLiteralCoCo coco)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().findFirst().get().addCoCo(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteral node)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().forEach(c -> c.visit(node));
}

    /* generated by template core.Method*/
 public  calendars._cocos.CalendarsCoCoChecker addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTSignedBasicLongLiteralCoCo coco)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().findFirst().get().addCoCo(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteral node)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().forEach(c -> c.visit(node));
}

    /* generated by template core.Method*/
 public  calendars._cocos.CalendarsCoCoChecker addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTBasicFloatLiteralCoCo coco)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().findFirst().get().addCoCo(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteral node)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().forEach(c -> c.visit(node));
}

    /* generated by template core.Method*/
 public  calendars._cocos.CalendarsCoCoChecker addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTSignedBasicFloatLiteralCoCo coco)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().findFirst().get().addCoCo(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteral node)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().forEach(c -> c.visit(node));
}

    /* generated by template core.Method*/
 public  calendars._cocos.CalendarsCoCoChecker addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTBasicDoubleLiteralCoCo coco)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().findFirst().get().addCoCo(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteral node)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().forEach(c -> c.visit(node));
}

    /* generated by template core.Method*/
 public  calendars._cocos.CalendarsCoCoChecker addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTSignedBasicDoubleLiteralCoCo coco)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().findFirst().get().addCoCo(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteral node)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().forEach(c -> c.visit(node));
}

    /* generated by template core.Method*/
 public  calendars._cocos.CalendarsCoCoChecker addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTSignedLiteralCoCo coco)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().findFirst().get().addCoCo(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (de.monticore.literals.mccommonliterals._ast.ASTSignedLiteral node)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().forEach(c -> c.visit(node));
}

    /* generated by template core.Method*/
 public  calendars._cocos.CalendarsCoCoChecker addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTNumericLiteralCoCo coco)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().findFirst().get().addCoCo(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (de.monticore.literals.mccommonliterals._ast.ASTNumericLiteral node)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().forEach(c -> c.visit(node));
}

    /* generated by template core.Method*/
 public  calendars._cocos.CalendarsCoCoChecker addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTSignedNumericLiteralCoCo coco)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().findFirst().get().addCoCo(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (de.monticore.literals.mccommonliterals._ast.ASTSignedNumericLiteral node)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().forEach(c -> c.visit(node));
}

    /* generated by template core.Method*/
 public  calendars._cocos.CalendarsCoCoChecker addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTMCCommonLiteralsNodeCoCo coco)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().findFirst().get().addCoCo(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (de.monticore.literals.mccommonliterals._ast.ASTMCCommonLiteralsNode node)  {
      de_monticore_literals_mccommonliterals__cocos_MCCommonLiteralsCoCoChecker.stream().forEach(c -> c.visit(node));
}

    /* generated by template core.Method*/
 public  void addChecker (de.monticore.mcbasics._cocos.MCBasicsCoCoChecker checker)  {
      this.de_monticore_mcbasics__cocos_MCBasicsCoCoChecker.add(checker);
}

    /* generated by template core.Method*/
 public  void checkAll (de.monticore.mcbasics._ast.ASTMCBasicsNode node)  {
      node.accept(getRealThis());
}

    /* generated by template core.Method*/
 public  calendars._cocos.CalendarsCoCoChecker addCoCo (de.monticore.mcbasics._cocos.MCBasicsASTMCBasicsNodeCoCo coco)  {
      de_monticore_mcbasics__cocos_MCBasicsCoCoChecker.stream().findFirst().get().addCoCo(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (de.monticore.mcbasics._ast.ASTMCBasicsNode node)  {
      de_monticore_mcbasics__cocos_MCBasicsCoCoChecker.stream().forEach(c -> c.visit(node));
}

    /* generated by template core.Method*/
 public  void addChecker (de.monticore.literals.mcliteralsbasis._cocos.MCLiteralsBasisCoCoChecker checker)  {
      this.de_monticore_literals_mcliteralsbasis__cocos_MCLiteralsBasisCoCoChecker.add(checker);
}

    /* generated by template core.Method*/
 public  void checkAll (de.monticore.literals.mcliteralsbasis._ast.ASTMCLiteralsBasisNode node)  {
      node.accept(getRealThis());
}

    /* generated by template core.Method*/
 public  calendars._cocos.CalendarsCoCoChecker addCoCo (de.monticore.literals.mcliteralsbasis._cocos.MCLiteralsBasisASTLiteralCoCo coco)  {
      de_monticore_literals_mcliteralsbasis__cocos_MCLiteralsBasisCoCoChecker.stream().findFirst().get().addCoCo(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (de.monticore.literals.mcliteralsbasis._ast.ASTLiteral node)  {
      de_monticore_literals_mcliteralsbasis__cocos_MCLiteralsBasisCoCoChecker.stream().forEach(c -> c.visit(node));
}

    /* generated by template core.Method*/
 public  calendars._cocos.CalendarsCoCoChecker addCoCo (de.monticore.literals.mcliteralsbasis._cocos.MCLiteralsBasisASTMCLiteralsBasisNodeCoCo coco)  {
      de_monticore_literals_mcliteralsbasis__cocos_MCLiteralsBasisCoCoChecker.stream().findFirst().get().addCoCo(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (de.monticore.literals.mcliteralsbasis._ast.ASTMCLiteralsBasisNode node)  {
      de_monticore_literals_mcliteralsbasis__cocos_MCLiteralsBasisCoCoChecker.stream().forEach(c -> c.visit(node));
}

}
