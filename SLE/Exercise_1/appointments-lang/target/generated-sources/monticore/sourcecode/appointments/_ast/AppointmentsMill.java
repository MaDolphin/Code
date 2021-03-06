/* generated from model Appointments */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package appointments._ast;

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


 public  class AppointmentsMill  {

    /* generated by template core.Attribute*/
 protected  static  AppointmentsMill mill ;

    /* generated by template core.Attribute*/
 protected  static  AppointmentsMill millASTAppointment ;

    /* generated by template core.Attribute*/
 protected  static  AppointmentsMill millASTStart ;

    /* generated by template core.Attribute*/
 protected  static  AppointmentsMill millASTEnd ;

    /* generated by template core.Attribute*/
 protected  static  AppointmentsMill millASTDate ;

    /* generated by template core.Attribute*/
 protected  static  AppointmentsMill millASTTime ;

    /* generated by template core.Attribute*/
 protected  static  AppointmentsMill millASTBreak ;


    /* generated by template core.Constructor*/
 protected  AppointmentsMill()  {
    /* generated by template core.EmptyBody*/
// empty body

}


    /* generated by template core.Method*/
 protected  static  AppointmentsMill getMill ()  {
      /* generated by template _ast.mill.GetMillMethod*/

  if (mill == null) {
    mill = new AppointmentsMill();
  }
  return mill;
}

    /* generated by template core.Method*/
 public  static  void initMe (AppointmentsMill a)  {
      /* generated by template _ast.mill.InitMeMethod*/

    mill = a;
    millASTAppointment = a;
    millASTStart = a;
    millASTEnd = a;
    millASTDate = a;
    millASTTime = a;
    millASTBreak = a;

}

    /* generated by template core.Method*/
 public  static  void init ()  {
      /* generated by template _ast.mill.InitMethod*/

    mill = new AppointmentsMill();
    de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsMill.initMe(new MCCommonLiteralsMillForAppointments());
    de.monticore.mcbasics._ast.MCBasicsMill.initMe(new MCBasicsMillForAppointments());
    de.monticore.literals.mcliteralsbasis._ast.MCLiteralsBasisMill.initMe(new MCLiteralsBasisMillForAppointments());

}

    /* generated by template core.Method*/
 public  static  void reset ()  {
      /* generated by template _ast.mill.ResetMethod*/

    mill = null;
    millASTAppointment = null;
    millASTStart = null;
    millASTEnd = null;
    millASTDate = null;
    millASTTime = null;
    millASTBreak = null;
    de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsMill.reset();
    de.monticore.mcbasics._ast.MCBasicsMill.reset();
    de.monticore.literals.mcliteralsbasis._ast.MCLiteralsBasisMill.reset();

}

    /* generated by template core.Method*/
 public  static  ASTAppointmentBuilder appointmentBuilder ()  {
      /* generated by template _ast.mill.BuilderMethod*/

  if (millASTAppointment == null) {
    millASTAppointment = getMill();
  }
  return millASTAppointment._appointmentBuilder();

}

    /* generated by template core.Method*/
 protected  ASTAppointmentBuilder _appointmentBuilder ()  {
      /* generated by template _ast.mill.ProtectedBuilderMethod*/

  return new ASTAppointmentBuilder();
}

    /* generated by template core.Method*/
 public  static  ASTStartBuilder startBuilder ()  {
      /* generated by template _ast.mill.BuilderMethod*/

  if (millASTStart == null) {
    millASTStart = getMill();
  }
  return millASTStart._startBuilder();

}

    /* generated by template core.Method*/
 protected  ASTStartBuilder _startBuilder ()  {
      /* generated by template _ast.mill.ProtectedBuilderMethod*/

  return new ASTStartBuilder();
}

    /* generated by template core.Method*/
 public  static  ASTEndBuilder endBuilder ()  {
      /* generated by template _ast.mill.BuilderMethod*/

  if (millASTEnd == null) {
    millASTEnd = getMill();
  }
  return millASTEnd._endBuilder();

}

    /* generated by template core.Method*/
 protected  ASTEndBuilder _endBuilder ()  {
      /* generated by template _ast.mill.ProtectedBuilderMethod*/

  return new ASTEndBuilder();
}

    /* generated by template core.Method*/
 public  static  ASTDateBuilder dateBuilder ()  {
      /* generated by template _ast.mill.BuilderMethod*/

  if (millASTDate == null) {
    millASTDate = getMill();
  }
  return millASTDate._dateBuilder();

}

    /* generated by template core.Method*/
 protected  ASTDateBuilder _dateBuilder ()  {
      /* generated by template _ast.mill.ProtectedBuilderMethod*/

  return new ASTDateBuilder();
}

    /* generated by template core.Method*/
 public  static  ASTTimeBuilder timeBuilder ()  {
      /* generated by template _ast.mill.BuilderMethod*/

  if (millASTTime == null) {
    millASTTime = getMill();
  }
  return millASTTime._timeBuilder();

}

    /* generated by template core.Method*/
 protected  ASTTimeBuilder _timeBuilder ()  {
      /* generated by template _ast.mill.ProtectedBuilderMethod*/

  return new ASTTimeBuilder();
}

    /* generated by template core.Method*/
 public  static  ASTBreakBuilder breakBuilder ()  {
      /* generated by template _ast.mill.BuilderMethod*/

  if (millASTBreak == null) {
    millASTBreak = getMill();
  }
  return millASTBreak._breakBuilder();

}

    /* generated by template core.Method*/
 protected  ASTBreakBuilder _breakBuilder ()  {
      /* generated by template _ast.mill.ProtectedBuilderMethod*/

  return new ASTBreakBuilder();
}

    /* generated by template core.Method*/
 public  static  de.monticore.literals.mccommonliterals._ast.ASTNullLiteralBuilder nullLiteralBuilder ()  {
      /* generated by template _ast.mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsMill.nullLiteralBuilder();
}

    /* generated by template core.Method*/
 public  static  de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteralBuilder booleanLiteralBuilder ()  {
      /* generated by template _ast.mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsMill.booleanLiteralBuilder();
}

    /* generated by template core.Method*/
 public  static  de.monticore.literals.mccommonliterals._ast.ASTCharLiteralBuilder charLiteralBuilder ()  {
      /* generated by template _ast.mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsMill.charLiteralBuilder();
}

    /* generated by template core.Method*/
 public  static  de.monticore.literals.mccommonliterals._ast.ASTStringLiteralBuilder stringLiteralBuilder ()  {
      /* generated by template _ast.mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsMill.stringLiteralBuilder();
}

    /* generated by template core.Method*/
 public  static  de.monticore.literals.mccommonliterals._ast.ASTNatLiteralBuilder natLiteralBuilder ()  {
      /* generated by template _ast.mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsMill.natLiteralBuilder();
}

    /* generated by template core.Method*/
 public  static  de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteralBuilder signedNatLiteralBuilder ()  {
      /* generated by template _ast.mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsMill.signedNatLiteralBuilder();
}

    /* generated by template core.Method*/
 public  static  de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteralBuilder basicLongLiteralBuilder ()  {
      /* generated by template _ast.mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsMill.basicLongLiteralBuilder();
}

    /* generated by template core.Method*/
 public  static  de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteralBuilder signedBasicLongLiteralBuilder ()  {
      /* generated by template _ast.mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsMill.signedBasicLongLiteralBuilder();
}

    /* generated by template core.Method*/
 public  static  de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteralBuilder basicFloatLiteralBuilder ()  {
      /* generated by template _ast.mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsMill.basicFloatLiteralBuilder();
}

    /* generated by template core.Method*/
 public  static  de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteralBuilder signedBasicFloatLiteralBuilder ()  {
      /* generated by template _ast.mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsMill.signedBasicFloatLiteralBuilder();
}

    /* generated by template core.Method*/
 public  static  de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteralBuilder basicDoubleLiteralBuilder ()  {
      /* generated by template _ast.mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsMill.basicDoubleLiteralBuilder();
}

    /* generated by template core.Method*/
 public  static  de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteralBuilder signedBasicDoubleLiteralBuilder ()  {
      /* generated by template _ast.mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsMill.signedBasicDoubleLiteralBuilder();
}

}
