/* generated by template parser.Parser*/


/* generated by template parser.ParserHeader*/
grammar TravelCostsAntlr;
@parser::header {
package travelcosts._parser;
import de.monticore.antlr4.MCParser;
}
@lexer::header {
package travelcosts._parser;
}
options {
superClass=MCParser;
}

@parser::members

{

  // convert function for Name
private String convertName(Token t)  {
    return t.getText();
}

  // convert function for NEWLINE
private String convertNEWLINE(Token t)  {
    return t.getText();
}

  // convert function for WS
private String convertWS(Token t)  {
    return t.getText();
}

  // convert function for SL_COMMENT
private String convertSL_COMMENT(Token t)  {
    return t.getText();
}

  // convert function for ML_COMMENT
private String convertML_COMMENT(Token t)  {
    return t.getText();
}

  // convert function for Digits
private String convertDigits(Token t)  {
    return t.getText();
}

  // convert function for Digit
private String convertDigit(Token t)  {
    return t.getText();
}

  // convert function for Char
private String convertChar(Token t)  {
    return t.getText();
}

  // convert function for SingleCharacter
private String convertSingleCharacter(Token t)  {
    return t.getText();
}

  // convert function for String
private String convertString(Token t)  {
    return t.getText();
}

  // convert function for StringCharacters
private String convertStringCharacters(Token t)  {
    return t.getText();
}

  // convert function for StringCharacter
private String convertStringCharacter(Token t)  {
    return t.getText();
}

  // convert function for EscapeSequence
private String convertEscapeSequence(Token t)  {
    return t.getText();
}

  // convert function for OctalEscape
private String convertOctalEscape(Token t)  {
    return t.getText();
}

  // convert function for UnicodeEscape
private String convertUnicodeEscape(Token t)  {
    return t.getText();
}

  // convert function for ZeroToThree
private String convertZeroToThree(Token t)  {
    return t.getText();
}

  // convert function for HexDigit
private String convertHexDigit(Token t)  {
    return t.getText();
}

  // convert function for OctalDigit
private String convertOctalDigit(Token t)  {
    return t.getText();
}

}

/* generated by template parser.LexerMember*/


@lexer::members {



private TravelCostsAntlrParser _monticore_parser;

protected TravelCostsAntlrParser getCompiler() {
   return _monticore_parser;
}

public void setMCParser(TravelCostsAntlrParser in) {
  this._monticore_parser = in;
}

protected void storeComment(){
  if (getCompiler() != null) {
    de.monticore.ast.Comment _comment = new de.monticore.ast.Comment(getText());
    de.se_rwth.commons.SourcePosition startPos = new de.se_rwth.commons.SourcePosition(_tokenStartLine, _tokenStartCharPositionInLine);
    _comment.set_SourcePositionStart(startPos);
    _comment.set_SourcePositionEnd(getCompiler().computeEndPosition(startPos, getText()));
    getCompiler().addComment(_comment);
  }
}
}


  
 // Start of 'ASTClassProd NullLiteral'


nullLiteral_eof returns [de.monticore.literals.mccommonliterals._ast.ASTNullLiteral ret = null] :
  tmp = nullLiteral {$ret = $tmp.ret;} EOF ;


  nullLiteral returns [de.monticore.literals.mccommonliterals._ast.ASTNullLiteral ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
de.monticore.literals.mccommonliterals._ast.ASTNullLiteral _aNode = null;
_aNode=de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsNodeFactory.createASTNullLiteral();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  
 // Start of 'ASTTerminal null'
'null'// End of 'ASTTerminal'

  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd BooleanLiteral'


booleanLiteral_eof returns [de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteral ret = null] :
  tmp = booleanLiteral {$ret = $tmp.ret;} EOF ;


  booleanLiteral returns [de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteral ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteral _aNode = null;
_aNode=de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsNodeFactory.createASTBooleanLiteral();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  
 // Start of 'ASTConstantGroup'
('true'{
_aNode.setSource(de.monticore.literals.mccommonliterals._ast.ASTConstantsMCCommonLiterals.TRUE);
}|
'false'{
_aNode.setSource(de.monticore.literals.mccommonliterals._ast.ASTConstantsMCCommonLiterals.FALSE);
})// End of 'ASTConstantGroup'

  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd CharLiteral'


charLiteral_eof returns [de.monticore.literals.mccommonliterals._ast.ASTCharLiteral ret = null] :
  tmp = charLiteral {$ret = $tmp.ret;} EOF ;


  charLiteral returns [de.monticore.literals.mccommonliterals._ast.ASTCharLiteral ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
de.monticore.literals.mccommonliterals._ast.ASTCharLiteral _aNode = null;
_aNode=de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsNodeFactory.createASTCharLiteral();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  (tmp0=Char{_aNode.setSource(convertChar($tmp0));}

  ) 
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd StringLiteral'


stringLiteral_eof returns [de.monticore.literals.mccommonliterals._ast.ASTStringLiteral ret = null] :
  tmp = stringLiteral {$ret = $tmp.ret;} EOF ;


  stringLiteral returns [de.monticore.literals.mccommonliterals._ast.ASTStringLiteral ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
de.monticore.literals.mccommonliterals._ast.ASTStringLiteral _aNode = null;
_aNode=de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsNodeFactory.createASTStringLiteral();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  (tmp0=String{_aNode.setSource(convertString($tmp0));}

  ) 
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd NatLiteral'


natLiteral_eof returns [de.monticore.literals.mccommonliterals._ast.ASTNatLiteral ret = null] :
  tmp = natLiteral {$ret = $tmp.ret;} EOF ;


  natLiteral returns [de.monticore.literals.mccommonliterals._ast.ASTNatLiteral ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
de.monticore.literals.mccommonliterals._ast.ASTNatLiteral _aNode = null;
_aNode=de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsNodeFactory.createASTNatLiteral();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  (tmp0=Digits{_aNode.setDigits(convertDigits($tmp0));}

  ) 
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd SignedNatLiteral'


signedNatLiteral_eof returns [de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteral ret = null] :
  tmp = signedNatLiteral {$ret = $tmp.ret;} EOF ;


  signedNatLiteral returns [de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteral ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteral _aNode = null;
_aNode=de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsNodeFactory.createASTSignedNatLiteral();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  (
  
  
 // Start of 'ASTConstantGroup'
(MINUS{
_aNode.setNegative(true);
})// End of 'ASTConstantGroup'

  
)?
  (tmp0=Digits{_aNode.setDigits(convertDigits($tmp0));}

  ) 
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd BasicLongLiteral'


basicLongLiteral_eof returns [de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteral ret = null] :
  tmp = basicLongLiteral {$ret = $tmp.ret;} EOF ;


  basicLongLiteral returns [de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteral ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteral _aNode = null;
_aNode=de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsNodeFactory.createASTBasicLongLiteral();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  (tmp0=Digits{_aNode.setDigits(convertDigits($tmp0));}

  ) 
  
  (tmp1=Name{_aNode.setName(convertName($tmp1));}

  ) 
  
  {is("l","L")}?
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd SignedBasicLongLiteral'


signedBasicLongLiteral_eof returns [de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteral ret = null] :
  tmp = signedBasicLongLiteral {$ret = $tmp.ret;} EOF ;


  signedBasicLongLiteral returns [de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteral ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteral _aNode = null;
_aNode=de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsNodeFactory.createASTSignedBasicLongLiteral();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  (
  
  
 // Start of 'ASTConstantGroup'
(MINUS{
_aNode.setNegative(true);
})// End of 'ASTConstantGroup'

  
)?
  (tmp0=Digits{_aNode.setDigits(convertDigits($tmp0));}

  ) 
  
  (tmp1=Name{_aNode.setName(convertName($tmp1));}

  ) 
  
  {is("l","L")}?
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd BasicFloatLiteral'


basicFloatLiteral_eof returns [de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteral ret = null] :
  tmp = basicFloatLiteral {$ret = $tmp.ret;} EOF ;


  basicFloatLiteral returns [de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteral ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteral _aNode = null;
_aNode=de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsNodeFactory.createASTBasicFloatLiteral();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  (tmp0=Digits{_aNode.setPre(convertDigits($tmp0));}

  ) 
  
  
 // Start of 'ASTTerminal .'
POINT// End of 'ASTTerminal'

  (tmp1=Digits{_aNode.setPost(convertDigits($tmp1));}

  ) 
  
  (tmp2=Name{_aNode.setName(convertName($tmp2));}

  ) 
  
  {is("f","F")}?
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd SignedBasicFloatLiteral'


signedBasicFloatLiteral_eof returns [de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteral ret = null] :
  tmp = signedBasicFloatLiteral {$ret = $tmp.ret;} EOF ;


  signedBasicFloatLiteral returns [de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteral ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteral _aNode = null;
_aNode=de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsNodeFactory.createASTSignedBasicFloatLiteral();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  (
  
  
 // Start of 'ASTConstantGroup'
(MINUS{
_aNode.setNegative(true);
})// End of 'ASTConstantGroup'

  
)?
  (tmp0=Digits{_aNode.setPre(convertDigits($tmp0));}

  ) 
  
  
 // Start of 'ASTTerminal .'
POINT// End of 'ASTTerminal'

  (tmp1=Digits{_aNode.setPost(convertDigits($tmp1));}

  ) 
  
  (tmp2=Name{_aNode.setName(convertName($tmp2));}

  ) 
  
  {is("f","F")}?
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd BasicDoubleLiteral'


basicDoubleLiteral_eof returns [de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteral ret = null] :
  tmp = basicDoubleLiteral {$ret = $tmp.ret;} EOF ;


  basicDoubleLiteral returns [de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteral ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteral _aNode = null;
_aNode=de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsNodeFactory.createASTBasicDoubleLiteral();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  (tmp0=Digits{_aNode.setPre(convertDigits($tmp0));}

  ) 
  
  
 // Start of 'ASTTerminal .'
POINT// End of 'ASTTerminal'

  (tmp1=Digits{_aNode.setPost(convertDigits($tmp1));}

  ) 
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd SignedBasicDoubleLiteral'


signedBasicDoubleLiteral_eof returns [de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteral ret = null] :
  tmp = signedBasicDoubleLiteral {$ret = $tmp.ret;} EOF ;


  signedBasicDoubleLiteral returns [de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteral ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteral _aNode = null;
_aNode=de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsNodeFactory.createASTSignedBasicDoubleLiteral();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  (
  
  
 // Start of 'ASTConstantGroup'
(MINUS{
_aNode.setNegative(true);
})// End of 'ASTConstantGroup'

  
)?
  (tmp0=Digits{_aNode.setPre(convertDigits($tmp0));}

  ) 
  
  
 // Start of 'ASTTerminal .'
POINT// End of 'ASTTerminal'

  (tmp1=Digits{_aNode.setPost(convertDigits($tmp1));}

  ) 
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd TravelExpenseReport'


travelExpenseReport_eof returns [travelcosts._ast.ASTTravelExpenseReport ret = null] :
  tmp = travelExpenseReport {$ret = $tmp.ret;} EOF ;


  travelExpenseReport returns [travelcosts._ast.ASTTravelExpenseReport ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
travelcosts._ast.ASTTravelExpenseReport _aNode = null;
_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTTravelExpenseReport();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  
 // Start of 'ASTTerminal Dienstreise'
'Dienstreise'// End of 'ASTTerminal'

  (tmp0=Name{_aNode.setName(convertName($tmp0));}

  ) 
  
  
 // Start of 'ASTTerminal {'
LCURLY// End of 'ASTTerminal'

  ( tmp1=travelNumber{_aNode.setTravelNumber(_localctx.tmp1.ret);}) ? 
  
   tmp2=arrival{_aNode.setArrival(_localctx.tmp2.ret);}  
  
  (
  
   tmp3=allWorkDays{_aNode.setAllWorkDays(_localctx.tmp3.ret);}  
  
  |
  ( tmp4=workDay{addToIteratedAttributeIfNotNull(_aNode.getWorkDayList(), _localctx.tmp4.ret);}) + 
  
  
)
   tmp5=departure{_aNode.setDeparture(_localctx.tmp5.ret);}  
  
   tmp6=costItems{_aNode.setCostItems(_localctx.tmp6.ret);}  
  
  
 // Start of 'ASTTerminal }'
RCURLY// End of 'ASTTerminal'

  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd TravelNumber'


travelNumber_eof returns [travelcosts._ast.ASTTravelNumber ret = null] :
  tmp = travelNumber {$ret = $tmp.ret;} EOF ;


  travelNumber returns [travelcosts._ast.ASTTravelNumber ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
travelcosts._ast.ASTTravelNumber _aNode = null;
_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTTravelNumber();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  
 // Start of 'ASTTerminal Reisenummer'
'Reisenummer'// End of 'ASTTerminal'

   tmp0=natLiteral{_aNode.setTravelNo(_localctx.tmp0.ret);}  
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd Arrival'


arrival_eof returns [travelcosts._ast.ASTArrival ret = null] :
  tmp = arrival {$ret = $tmp.ret;} EOF ;


  arrival returns [travelcosts._ast.ASTArrival ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
travelcosts._ast.ASTArrival _aNode = null;
_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTArrival();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  
 // Start of 'ASTTerminal Anreise'
'Anreise'// End of 'ASTTerminal'

   tmp0=duration{_aNode.setDuration(_localctx.tmp0.ret);}  
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd WorkDay'


workDay_eof returns [travelcosts._ast.ASTWorkDay ret = null] :
  tmp = workDay {$ret = $tmp.ret;} EOF ;


  workDay returns [travelcosts._ast.ASTWorkDay ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
travelcosts._ast.ASTWorkDay _aNode = null;
_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTWorkDay();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  
 // Start of 'ASTTerminal Arbeitstag'
'Arbeitstag'// End of 'ASTTerminal'

   tmp0=duration{_aNode.setDuration(_localctx.tmp0.ret);}  
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd AllWorkDays'


allWorkDays_eof returns [travelcosts._ast.ASTAllWorkDays ret = null] :
  tmp = allWorkDays {$ret = $tmp.ret;} EOF ;


  allWorkDays returns [travelcosts._ast.ASTAllWorkDays ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
travelcosts._ast.ASTAllWorkDays _aNode = null;
_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTAllWorkDays();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  
 // Start of 'ASTTerminal Arbeitstage'
'Arbeitstage'// End of 'ASTTerminal'

   tmp0=time{_aNode.setBeginTime(_localctx.tmp0.ret);}  
  
  
 // Start of 'ASTTerminal -'
MINUS// End of 'ASTTerminal'

   tmp1=time{_aNode.setEndTime(_localctx.tmp1.ret);}  
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd Departure'


departure_eof returns [travelcosts._ast.ASTDeparture ret = null] :
  tmp = departure {$ret = $tmp.ret;} EOF ;


  departure returns [travelcosts._ast.ASTDeparture ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
travelcosts._ast.ASTDeparture _aNode = null;
_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTDeparture();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  
 // Start of 'ASTTerminal Abreise'
'Abreise'// End of 'ASTTerminal'

   tmp0=duration{_aNode.setDuration(_localctx.tmp0.ret);}  
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd CostItems'


costItems_eof returns [travelcosts._ast.ASTCostItems ret = null] :
  tmp = costItems {$ret = $tmp.ret;} EOF ;


  costItems returns [travelcosts._ast.ASTCostItems ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
travelcosts._ast.ASTCostItems _aNode = null;
_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTCostItems();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  
 // Start of 'ASTTerminal Kosten'
'Kosten'// End of 'ASTTerminal'

  
 // Start of 'ASTTerminal {'
LCURLY// End of 'ASTTerminal'

  ( tmp0=costItem{addToIteratedAttributeIfNotNull(_aNode.getCostItemList(), _localctx.tmp0.ret);}) + 
  
  
 // Start of 'ASTTerminal }'
RCURLY// End of 'ASTTerminal'

  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd CostItem'


costItem_eof returns [travelcosts._ast.ASTCostItem ret = null] :
  tmp = costItem {$ret = $tmp.ret;} EOF ;


  costItem returns [travelcosts._ast.ASTCostItem ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
travelcosts._ast.ASTCostItem _aNode = null;
_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTCostItem();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  (
  
   tmp0=natLiteral{_aNode.setId(_localctx.tmp0.ret);}  
  
  
 // Start of 'ASTTerminal )'
RPAREN// End of 'ASTTerminal'

  
)?
   tmp1=numericLiteral{_aNode.setAmount(_localctx.tmp1.ret);}  
  
  
 // Start of 'ASTConstantGroup'
('€'{
_aNode.setCurrency(travelcosts._ast.ASTConstantsTravelCosts.EURO);
}|
'$'{
_aNode.setCurrency(travelcosts._ast.ASTConstantsTravelCosts.DOLLAR);
}|
MINUS{
_aNode.setCurrency(travelcosts._ast.ASTConstantsTravelCosts.ELSE);
})// End of 'ASTConstantGroup'

   tmp2=cost{_aNode.setCost(_localctx.tmp2.ret);}  
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd HotelCost'


hotelCost_eof returns [travelcosts._ast.ASTHotelCost ret = null] :
  tmp = hotelCost {$ret = $tmp.ret;} EOF ;


  hotelCost returns [travelcosts._ast.ASTHotelCost ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
travelcosts._ast.ASTHotelCost _aNode = null;
_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTHotelCost();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  
 // Start of 'ASTTerminal Hotel'
'Hotel'// End of 'ASTTerminal'

  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd TransportCost'


transportCost_eof returns [travelcosts._ast.ASTTransportCost ret = null] :
  tmp = transportCost {$ret = $tmp.ret;} EOF ;


  transportCost returns [travelcosts._ast.ASTTransportCost ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
travelcosts._ast.ASTTransportCost _aNode = null;
_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTTransportCost();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  
 // Start of 'ASTTerminal Fahrt'
'Fahrt'// End of 'ASTTerminal'

   tmp0=travelMeans{_aNode.setTravelMeans(_localctx.tmp0.ret);}  
  
  (
  
   tmp1=description{_aNode.setDescription(_localctx.tmp1.ret);}  
  
  
)?
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd ExtraCost'


extraCost_eof returns [travelcosts._ast.ASTExtraCost ret = null] :
  tmp = extraCost {$ret = $tmp.ret;} EOF ;


  extraCost returns [travelcosts._ast.ASTExtraCost ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
travelcosts._ast.ASTExtraCost _aNode = null;
_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTExtraCost();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  
 // Start of 'ASTTerminal Nebenkosten'
'Nebenkosten'// End of 'ASTTerminal'

   tmp0=description{_aNode.setDescription(_localctx.tmp0.ret);}  
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd Description'


description_eof returns [travelcosts._ast.ASTDescription ret = null] :
  tmp = description {$ret = $tmp.ret;} EOF ;


  description returns [travelcosts._ast.ASTDescription ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
travelcosts._ast.ASTDescription _aNode = null;
_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTDescription();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  (
  
  (tmp0=Name{_aNode.setShort(convertName($tmp0));}

  ) 
  
  |
   tmp1=stringLiteral{_aNode.setLong(_localctx.tmp1.ret);}  
  
  
)
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd ISODate'


iSODate_eof returns [travelcosts._ast.ASTISODate ret = null] :
  tmp = iSODate {$ret = $tmp.ret;} EOF ;


  iSODate returns [travelcosts._ast.ASTISODate ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
travelcosts._ast.ASTISODate _aNode = null;
_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTISODate();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  (
  
   tmp0=natLiteral{_aNode.setYear(_localctx.tmp0.ret);}  
  
  
 // Start of 'ASTTerminal -'
MINUS// End of 'ASTTerminal'

  
)?
   tmp1=natLiteral{_aNode.setMonth(_localctx.tmp1.ret);}  
  
  
 // Start of 'ASTTerminal -'
MINUS// End of 'ASTTerminal'

   tmp2=natLiteral{_aNode.setDay(_localctx.tmp2.ret);}  
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd Time'


time_eof returns [travelcosts._ast.ASTTime ret = null] :
  tmp = time {$ret = $tmp.ret;} EOF ;


  time returns [travelcosts._ast.ASTTime ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
travelcosts._ast.ASTTime _aNode = null;
_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTTime();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  ( tmp0=natLiteral{_aNode.setLeadingZero(_localctx.tmp0.ret);}) ? 
  
   tmp1=natLiteral{_aNode.setHours(_localctx.tmp1.ret);}  
  
  (
  
  
 // Start of 'ASTTerminal :'
COLON// End of 'ASTTerminal'

   tmp2=natLiteral{_aNode.setMinutes(_localctx.tmp2.ret);}  
  
  
)?
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd Duration'


duration_eof returns [travelcosts._ast.ASTDuration ret = null] :
  tmp = duration {$ret = $tmp.ret;} EOF ;


  duration returns [travelcosts._ast.ASTDuration ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
travelcosts._ast.ASTDuration _aNode = null;
_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTDuration();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
   tmp0=iSODate{_aNode.setStartDate(_localctx.tmp0.ret);}  
  
   tmp1=time{_aNode.setStartTime(_localctx.tmp1.ret);}  
  
  (
  
  
 // Start of 'ASTTerminal -'
MINUS// End of 'ASTTerminal'

  (
  
   tmp2=iSODate{_aNode.setEndDate(_localctx.tmp2.ret);}  
  
  
)?
   tmp3=time{_aNode.setEndTime(_localctx.tmp3.ret);}  
  
  
)?
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTEnumProd TravelMeans'
travelMeans returns [travelcosts._ast.ASTTravelMeans ret = null] 
: 
'Zug'
{$ret = travelcosts._ast.ASTTravelMeans.TRAIN;}|
'Flug'
{$ret = travelcosts._ast.ASTTravelMeans.PLANE;}|
'ÖPNV'
{$ret = travelcosts._ast.ASTTravelMeans.PUBLICTRANSPORT;}|
'Taxi'
{$ret = travelcosts._ast.ASTTravelMeans.CAB;};
// End of 'ASTEnumProd'


  
 // Start of 'Literal'


literal_eof returns [de.monticore.literals.mcliteralsbasis._ast.ASTLiteral ret = null] :
  tmp = literal {$ret = $tmp.ret;} EOF ;


  literal
   returns [de.monticore.literals.mcliteralsbasis._ast.ASTLiteral ret]
  : 
  
  tmp0=nullLiteral
{$ret=$tmp0.ret;}
  |
  tmp1=booleanLiteral
{$ret=$tmp1.ret;}
  |
  tmp2=charLiteral
{$ret=$tmp2.ret;}
  |
  tmp3=stringLiteral
{$ret=$tmp3.ret;}
  |
  tmp4=numericLiteral
{$ret=$tmp4.ret;}
  ;
  
 // Start of 'SignedLiteral'


signedLiteral_eof returns [de.monticore.literals.mccommonliterals._ast.ASTSignedLiteral ret = null] :
  tmp = signedLiteral {$ret = $tmp.ret;} EOF ;


  signedLiteral
   returns [de.monticore.literals.mccommonliterals._ast.ASTSignedLiteral ret]
  : 
  
  tmp0=nullLiteral
{$ret=$tmp0.ret;}
  |
  tmp1=booleanLiteral
{$ret=$tmp1.ret;}
  |
  tmp2=charLiteral
{$ret=$tmp2.ret;}
  |
  tmp3=stringLiteral
{$ret=$tmp3.ret;}
  |
  tmp5=signedNumericLiteral
{$ret=$tmp5.ret;}
  ;
  
 // Start of 'NumericLiteral'


numericLiteral_eof returns [de.monticore.literals.mccommonliterals._ast.ASTNumericLiteral ret = null] :
  tmp = numericLiteral {$ret = $tmp.ret;} EOF ;


  numericLiteral
   returns [de.monticore.literals.mccommonliterals._ast.ASTNumericLiteral ret]
  : 
  
  tmp6=natLiteral
{$ret=$tmp6.ret;}
  |
  tmp7=basicLongLiteral
{$ret=$tmp7.ret;}
  |
  tmp8=basicFloatLiteral
{$ret=$tmp8.ret;}
  |
  tmp9=basicDoubleLiteral
{$ret=$tmp9.ret;}
  ;
  
 // Start of 'SignedNumericLiteral'


signedNumericLiteral_eof returns [de.monticore.literals.mccommonliterals._ast.ASTSignedNumericLiteral ret = null] :
  tmp = signedNumericLiteral {$ret = $tmp.ret;} EOF ;


  signedNumericLiteral
   returns [de.monticore.literals.mccommonliterals._ast.ASTSignedNumericLiteral ret]
  : 
  
  tmp10=signedNatLiteral
{$ret=$tmp10.ret;}
  |
  tmp11=signedBasicLongLiteral
{$ret=$tmp11.ret;}
  |
  tmp12=signedBasicFloatLiteral
{$ret=$tmp12.ret;}
  |
  tmp13=signedBasicDoubleLiteral
{$ret=$tmp13.ret;}
  ;
  
 // Start of 'Cost'


cost_eof returns [travelcosts._ast.ASTCost ret = null] :
  tmp = cost {$ret = $tmp.ret;} EOF ;


  cost
   returns [travelcosts._ast.ASTCost ret]
  : 
  
  tmp14=hotelCost
{$ret=$tmp14.ret;}
  |
  tmp15=transportCost
{$ret=$tmp15.ret;}
  |
  tmp16=extraCost
{$ret=$tmp16.ret;}
  ;
 
  RPAREN : ')';
  COLON : ':';
  LCURLY : '{';
  MINUS : '-';
  RCURLY : '}';
  POINT : '.';
 
  
 // Start of 'ASTLexProd Name'
Name 
  
:
  
  (
  
  'a'..'z'  
  |
  'A'..'Z'  
  |
  '_' 
  |
  '$' 
  )

  (
  
  'a'..'z'  
  |
  'A'..'Z'  
  |
  '_' 
  |
  '0'..'9'  
  |
  '$' 
  )
*
  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd NEWLINE'
fragment NEWLINE 
  
:
  
  (
  
  '\r' 
  '\n' 
  |
  '\r' 
  |
  '\n' 
  )

  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd WS'
WS 
  
:
  
  (
  
  ' ' 
  |
  '\t' 
  |
  '\r' 
  |
  '\n' 
  )

  {_channel=HIDDEN;

};// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd SL_COMMENT'
SL_COMMENT 
  
:
  
  '//' 
  (
  
  ~(
  
  '\n' 
  |
  '\r' 
  )

  )
*
  {storeComment();

}->skip
;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd ML_COMMENT'
ML_COMMENT 
  
:
  
  '/*' 
  (
  
  {_input.LA(2) != '/'}?
  '*' 
  |
   NEWLINE 
  |
  ~(
  
  '*' 
  |
  '\n' 
  |
  '\r' 
  )

  )
*
  '*/' 
  {storeComment();

}->skip
;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd Digits'
Digits 
  
:
  
  (
   Digit 
  )
+
  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd Digit'
fragment Digit 
  
:
  
  '0'..'9'  
  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd Char'
Char 
  
:
  
  '\'' 
  (
  
   SingleCharacter 
  |
   EscapeSequence 
  )

  '\'' 
  {setText(getText().substring(1,getText().length() - 1));

};// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd SingleCharacter'
fragment SingleCharacter 
  
:
  
  ~(
  
  '\'' 
  )

  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd String'
String 
  
:
  
  '"' 
  (
  
   StringCharacters 
  )
?
  '"' 
  {setText(getText().substring(1,getText().length() - 1));

};// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd StringCharacters'
fragment StringCharacters 
  
:
  
  (
  
   StringCharacter 
  )
+
  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd StringCharacter'
fragment StringCharacter 
  
:
  
  ~(
  
  '"' 
  |
  '\\' 
  )

  |
   EscapeSequence 
  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd EscapeSequence'
fragment EscapeSequence 
  
:
  
  '\\' 
  (
  
  'b' 
  |
  't' 
  |
  'n' 
  |
  'f' 
  |
  'r' 
  |
  '"' 
  |
  '\'' 
  |
  '\\' 
  )

  |
   OctalEscape 
  |
   UnicodeEscape 
  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd OctalEscape'
fragment OctalEscape 
  
:
  
  '\\' 
   OctalDigit 
  |
  '\\' 
   OctalDigit 
   OctalDigit 
  |
  '\\' 
   ZeroToThree 
   OctalDigit 
   OctalDigit 
  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd UnicodeEscape'
fragment UnicodeEscape 
  
:
  
  '\\' 
  'u' 
   HexDigit 
   HexDigit 
   HexDigit 
   HexDigit 
  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd ZeroToThree'
fragment ZeroToThree 
  
:
  
  '0'..'3'  
  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd HexDigit'
fragment HexDigit 
  
:
  
  '0'..'9'  
  |
  'a'..'f'  
  |
  'A'..'F'  
  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd OctalDigit'
fragment OctalDigit 
  
:
  
  '0'..'7'  
  ;// End of 'ASTLexProd'


