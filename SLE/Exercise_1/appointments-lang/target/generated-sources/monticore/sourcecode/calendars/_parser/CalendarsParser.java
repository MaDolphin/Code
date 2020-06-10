/* generated by template parser.MCParser*/



package calendars._parser;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

import java.util.Optional;
import de.monticore.antlr4.MCConcreteParser;
import de.monticore.antlr4.MCErrorListener;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class CalendarsParser extends MCConcreteParser {

  protected CalendarsAntlrParser create(String filename) throws IOException {
    CalendarsAntlrLexer lexer = new CalendarsAntlrLexer(new  ANTLRFileStream(filename, StandardCharsets.UTF_8.name()));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    CalendarsAntlrParser parser = new CalendarsAntlrParser(tokens);
    lexer.setMCParser(parser);  
    lexer.removeErrorListeners();
    lexer.addErrorListener(new MCErrorListener(parser));
    parser.setFilename(filename);
    setError(false);
    return parser;
  }
  
  protected CalendarsAntlrParser create(Reader reader) throws IOException {
    CalendarsAntlrLexer lexer = new CalendarsAntlrLexer(new ANTLRInputStream(reader));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    CalendarsAntlrParser parser = new CalendarsAntlrParser(tokens);
    lexer.setMCParser(parser);  
    lexer.removeErrorListeners();
    lexer.addErrorListener(new MCErrorListener(parser));
    parser.setFilename("StringReader");
    setError(false);
    return parser;
  }
  
  /**
   * @see de.monticore.antlr4.MCConcreteParser#parse(java.lang.String)
   */
  @Override
  public Optional<calendars._ast.ASTCalendars> parse(String fileName) throws IOException {
    return parseCalendars(fileName);
  }
  
  /**
   * @see de.monticore.antlr4.MCConcreteParser#parse(java.io.Reader)
   */
  @Override
  public Optional<calendars._ast.ASTCalendars> parse(Reader reader) throws IOException {
    return parseCalendars(reader);
  }
  
  public Optional<calendars._ast.ASTCalendars> parse_String(String str) throws IOException {
    return parse_StringCalendars(str);
  }
 
    /* generated by template parser.MCParserMethods*/


  /** Parses a file. 
   * 
   * @param filename Name of file to parse
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the file
   */
  public Optional<de.monticore.literals.mcliteralsbasis._ast.ASTLiteral> parseLiteral(String filename) throws IOException {   
    CalendarsAntlrParser parser = create(filename);    
	de.monticore.literals.mcliteralsbasis._ast.ASTLiteral ast;
    ast = parser.literal_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mcliteralsbasis._ast.ASTLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }

  /** Parses content of a Reader.
   * 
   * @param reader Reader to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the content of the reader
   * */
  public  Optional<de.monticore.literals.mcliteralsbasis._ast.ASTLiteral> parseLiteral(Reader reader) throws IOException {
 	CalendarsAntlrParser parser = create(reader);
	de.monticore.literals.mcliteralsbasis._ast.ASTLiteral ast;
    ast = parser.literal_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mcliteralsbasis._ast.ASTLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a String.
   * 
   * @param str String to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the string
   * */
  public  Optional<de.monticore.literals.mcliteralsbasis._ast.ASTLiteral> parse_StringLiteral(String str) throws IOException {
    return parseLiteral(new StringReader(str));
  }
  

    /* generated by template parser.MCParserMethods*/


  /** Parses a file. 
   * 
   * @param filename Name of file to parse
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the file
   */
  public Optional<de.monticore.literals.mccommonliterals._ast.ASTNullLiteral> parseNullLiteral(String filename) throws IOException {   
    CalendarsAntlrParser parser = create(filename);    
	de.monticore.literals.mccommonliterals._ast.ASTNullLiteral ast;
    ast = parser.nullLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTNullLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }

  /** Parses content of a Reader.
   * 
   * @param reader Reader to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the content of the reader
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTNullLiteral> parseNullLiteral(Reader reader) throws IOException {
 	CalendarsAntlrParser parser = create(reader);
	de.monticore.literals.mccommonliterals._ast.ASTNullLiteral ast;
    ast = parser.nullLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTNullLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a String.
   * 
   * @param str String to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the string
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTNullLiteral> parse_StringNullLiteral(String str) throws IOException {
    return parseNullLiteral(new StringReader(str));
  }
  

    /* generated by template parser.MCParserMethods*/


  /** Parses a file. 
   * 
   * @param filename Name of file to parse
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the file
   */
  public Optional<de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteral> parseBooleanLiteral(String filename) throws IOException {   
    CalendarsAntlrParser parser = create(filename);    
	de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteral ast;
    ast = parser.booleanLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }

  /** Parses content of a Reader.
   * 
   * @param reader Reader to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the content of the reader
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteral> parseBooleanLiteral(Reader reader) throws IOException {
 	CalendarsAntlrParser parser = create(reader);
	de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteral ast;
    ast = parser.booleanLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a String.
   * 
   * @param str String to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the string
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteral> parse_StringBooleanLiteral(String str) throws IOException {
    return parseBooleanLiteral(new StringReader(str));
  }
  

    /* generated by template parser.MCParserMethods*/


  /** Parses a file. 
   * 
   * @param filename Name of file to parse
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the file
   */
  public Optional<de.monticore.literals.mccommonliterals._ast.ASTCharLiteral> parseCharLiteral(String filename) throws IOException {   
    CalendarsAntlrParser parser = create(filename);    
	de.monticore.literals.mccommonliterals._ast.ASTCharLiteral ast;
    ast = parser.charLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTCharLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }

  /** Parses content of a Reader.
   * 
   * @param reader Reader to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the content of the reader
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTCharLiteral> parseCharLiteral(Reader reader) throws IOException {
 	CalendarsAntlrParser parser = create(reader);
	de.monticore.literals.mccommonliterals._ast.ASTCharLiteral ast;
    ast = parser.charLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTCharLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a String.
   * 
   * @param str String to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the string
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTCharLiteral> parse_StringCharLiteral(String str) throws IOException {
    return parseCharLiteral(new StringReader(str));
  }
  

    /* generated by template parser.MCParserMethods*/


  /** Parses a file. 
   * 
   * @param filename Name of file to parse
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the file
   */
  public Optional<de.monticore.literals.mccommonliterals._ast.ASTStringLiteral> parseStringLiteral(String filename) throws IOException {   
    CalendarsAntlrParser parser = create(filename);    
	de.monticore.literals.mccommonliterals._ast.ASTStringLiteral ast;
    ast = parser.stringLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTStringLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }

  /** Parses content of a Reader.
   * 
   * @param reader Reader to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the content of the reader
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTStringLiteral> parseStringLiteral(Reader reader) throws IOException {
 	CalendarsAntlrParser parser = create(reader);
	de.monticore.literals.mccommonliterals._ast.ASTStringLiteral ast;
    ast = parser.stringLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTStringLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a String.
   * 
   * @param str String to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the string
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTStringLiteral> parse_StringStringLiteral(String str) throws IOException {
    return parseStringLiteral(new StringReader(str));
  }
  

    /* generated by template parser.MCParserMethods*/


  /** Parses a file. 
   * 
   * @param filename Name of file to parse
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the file
   */
  public Optional<de.monticore.literals.mccommonliterals._ast.ASTNatLiteral> parseNatLiteral(String filename) throws IOException {   
    CalendarsAntlrParser parser = create(filename);    
	de.monticore.literals.mccommonliterals._ast.ASTNatLiteral ast;
    ast = parser.natLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTNatLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }

  /** Parses content of a Reader.
   * 
   * @param reader Reader to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the content of the reader
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTNatLiteral> parseNatLiteral(Reader reader) throws IOException {
 	CalendarsAntlrParser parser = create(reader);
	de.monticore.literals.mccommonliterals._ast.ASTNatLiteral ast;
    ast = parser.natLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTNatLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a String.
   * 
   * @param str String to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the string
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTNatLiteral> parse_StringNatLiteral(String str) throws IOException {
    return parseNatLiteral(new StringReader(str));
  }
  

    /* generated by template parser.MCParserMethods*/


  /** Parses a file. 
   * 
   * @param filename Name of file to parse
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the file
   */
  public Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteral> parseSignedNatLiteral(String filename) throws IOException {   
    CalendarsAntlrParser parser = create(filename);    
	de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteral ast;
    ast = parser.signedNatLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }

  /** Parses content of a Reader.
   * 
   * @param reader Reader to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the content of the reader
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteral> parseSignedNatLiteral(Reader reader) throws IOException {
 	CalendarsAntlrParser parser = create(reader);
	de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteral ast;
    ast = parser.signedNatLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a String.
   * 
   * @param str String to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the string
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteral> parse_StringSignedNatLiteral(String str) throws IOException {
    return parseSignedNatLiteral(new StringReader(str));
  }
  

    /* generated by template parser.MCParserMethods*/


  /** Parses a file. 
   * 
   * @param filename Name of file to parse
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the file
   */
  public Optional<de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteral> parseBasicLongLiteral(String filename) throws IOException {   
    CalendarsAntlrParser parser = create(filename);    
	de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteral ast;
    ast = parser.basicLongLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }

  /** Parses content of a Reader.
   * 
   * @param reader Reader to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the content of the reader
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteral> parseBasicLongLiteral(Reader reader) throws IOException {
 	CalendarsAntlrParser parser = create(reader);
	de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteral ast;
    ast = parser.basicLongLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a String.
   * 
   * @param str String to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the string
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteral> parse_StringBasicLongLiteral(String str) throws IOException {
    return parseBasicLongLiteral(new StringReader(str));
  }
  

    /* generated by template parser.MCParserMethods*/


  /** Parses a file. 
   * 
   * @param filename Name of file to parse
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the file
   */
  public Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteral> parseSignedBasicLongLiteral(String filename) throws IOException {   
    CalendarsAntlrParser parser = create(filename);    
	de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteral ast;
    ast = parser.signedBasicLongLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }

  /** Parses content of a Reader.
   * 
   * @param reader Reader to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the content of the reader
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteral> parseSignedBasicLongLiteral(Reader reader) throws IOException {
 	CalendarsAntlrParser parser = create(reader);
	de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteral ast;
    ast = parser.signedBasicLongLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a String.
   * 
   * @param str String to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the string
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteral> parse_StringSignedBasicLongLiteral(String str) throws IOException {
    return parseSignedBasicLongLiteral(new StringReader(str));
  }
  

    /* generated by template parser.MCParserMethods*/


  /** Parses a file. 
   * 
   * @param filename Name of file to parse
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the file
   */
  public Optional<de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteral> parseBasicFloatLiteral(String filename) throws IOException {   
    CalendarsAntlrParser parser = create(filename);    
	de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteral ast;
    ast = parser.basicFloatLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }

  /** Parses content of a Reader.
   * 
   * @param reader Reader to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the content of the reader
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteral> parseBasicFloatLiteral(Reader reader) throws IOException {
 	CalendarsAntlrParser parser = create(reader);
	de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteral ast;
    ast = parser.basicFloatLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a String.
   * 
   * @param str String to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the string
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteral> parse_StringBasicFloatLiteral(String str) throws IOException {
    return parseBasicFloatLiteral(new StringReader(str));
  }
  

    /* generated by template parser.MCParserMethods*/


  /** Parses a file. 
   * 
   * @param filename Name of file to parse
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the file
   */
  public Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteral> parseSignedBasicFloatLiteral(String filename) throws IOException {   
    CalendarsAntlrParser parser = create(filename);    
	de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteral ast;
    ast = parser.signedBasicFloatLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }

  /** Parses content of a Reader.
   * 
   * @param reader Reader to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the content of the reader
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteral> parseSignedBasicFloatLiteral(Reader reader) throws IOException {
 	CalendarsAntlrParser parser = create(reader);
	de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteral ast;
    ast = parser.signedBasicFloatLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a String.
   * 
   * @param str String to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the string
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteral> parse_StringSignedBasicFloatLiteral(String str) throws IOException {
    return parseSignedBasicFloatLiteral(new StringReader(str));
  }
  

    /* generated by template parser.MCParserMethods*/


  /** Parses a file. 
   * 
   * @param filename Name of file to parse
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the file
   */
  public Optional<de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteral> parseBasicDoubleLiteral(String filename) throws IOException {   
    CalendarsAntlrParser parser = create(filename);    
	de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteral ast;
    ast = parser.basicDoubleLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }

  /** Parses content of a Reader.
   * 
   * @param reader Reader to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the content of the reader
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteral> parseBasicDoubleLiteral(Reader reader) throws IOException {
 	CalendarsAntlrParser parser = create(reader);
	de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteral ast;
    ast = parser.basicDoubleLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a String.
   * 
   * @param str String to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the string
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteral> parse_StringBasicDoubleLiteral(String str) throws IOException {
    return parseBasicDoubleLiteral(new StringReader(str));
  }
  

    /* generated by template parser.MCParserMethods*/


  /** Parses a file. 
   * 
   * @param filename Name of file to parse
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the file
   */
  public Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteral> parseSignedBasicDoubleLiteral(String filename) throws IOException {   
    CalendarsAntlrParser parser = create(filename);    
	de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteral ast;
    ast = parser.signedBasicDoubleLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }

  /** Parses content of a Reader.
   * 
   * @param reader Reader to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the content of the reader
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteral> parseSignedBasicDoubleLiteral(Reader reader) throws IOException {
 	CalendarsAntlrParser parser = create(reader);
	de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteral ast;
    ast = parser.signedBasicDoubleLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a String.
   * 
   * @param str String to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the string
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteral> parse_StringSignedBasicDoubleLiteral(String str) throws IOException {
    return parseSignedBasicDoubleLiteral(new StringReader(str));
  }
  

    /* generated by template parser.MCParserMethods*/


  /** Parses a file. 
   * 
   * @param filename Name of file to parse
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the file
   */
  public Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedLiteral> parseSignedLiteral(String filename) throws IOException {   
    CalendarsAntlrParser parser = create(filename);    
	de.monticore.literals.mccommonliterals._ast.ASTSignedLiteral ast;
    ast = parser.signedLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTSignedLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }

  /** Parses content of a Reader.
   * 
   * @param reader Reader to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the content of the reader
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedLiteral> parseSignedLiteral(Reader reader) throws IOException {
 	CalendarsAntlrParser parser = create(reader);
	de.monticore.literals.mccommonliterals._ast.ASTSignedLiteral ast;
    ast = parser.signedLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTSignedLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a String.
   * 
   * @param str String to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the string
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedLiteral> parse_StringSignedLiteral(String str) throws IOException {
    return parseSignedLiteral(new StringReader(str));
  }
  

    /* generated by template parser.MCParserMethods*/


  /** Parses a file. 
   * 
   * @param filename Name of file to parse
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the file
   */
  public Optional<de.monticore.literals.mccommonliterals._ast.ASTNumericLiteral> parseNumericLiteral(String filename) throws IOException {   
    CalendarsAntlrParser parser = create(filename);    
	de.monticore.literals.mccommonliterals._ast.ASTNumericLiteral ast;
    ast = parser.numericLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTNumericLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }

  /** Parses content of a Reader.
   * 
   * @param reader Reader to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the content of the reader
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTNumericLiteral> parseNumericLiteral(Reader reader) throws IOException {
 	CalendarsAntlrParser parser = create(reader);
	de.monticore.literals.mccommonliterals._ast.ASTNumericLiteral ast;
    ast = parser.numericLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTNumericLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a String.
   * 
   * @param str String to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the string
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTNumericLiteral> parse_StringNumericLiteral(String str) throws IOException {
    return parseNumericLiteral(new StringReader(str));
  }
  

    /* generated by template parser.MCParserMethods*/


  /** Parses a file. 
   * 
   * @param filename Name of file to parse
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the file
   */
  public Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedNumericLiteral> parseSignedNumericLiteral(String filename) throws IOException {   
    CalendarsAntlrParser parser = create(filename);    
	de.monticore.literals.mccommonliterals._ast.ASTSignedNumericLiteral ast;
    ast = parser.signedNumericLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTSignedNumericLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }

  /** Parses content of a Reader.
   * 
   * @param reader Reader to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the content of the reader
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedNumericLiteral> parseSignedNumericLiteral(Reader reader) throws IOException {
 	CalendarsAntlrParser parser = create(reader);
	de.monticore.literals.mccommonliterals._ast.ASTSignedNumericLiteral ast;
    ast = parser.signedNumericLiteral_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<de.monticore.literals.mccommonliterals._ast.ASTSignedNumericLiteral> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a String.
   * 
   * @param str String to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the string
   * */
  public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedNumericLiteral> parse_StringSignedNumericLiteral(String str) throws IOException {
    return parseSignedNumericLiteral(new StringReader(str));
  }
  

    /* generated by template parser.MCParserMethods*/


  /** Parses a file. 
   * 
   * @param filename Name of file to parse
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the file
   */
  public Optional<calendars._ast.ASTCalendars> parseCalendars(String filename) throws IOException {   
    CalendarsAntlrParser parser = create(filename);    
	calendars._ast.ASTCalendars ast;
    ast = parser.calendars_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<calendars._ast.ASTCalendars> empty();
    }
    return Optional.ofNullable(ast);
  }

  /** Parses content of a Reader.
   * 
   * @param reader Reader to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the content of the reader
   * */
  public  Optional<calendars._ast.ASTCalendars> parseCalendars(Reader reader) throws IOException {
 	CalendarsAntlrParser parser = create(reader);
	calendars._ast.ASTCalendars ast;
    ast = parser.calendars_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<calendars._ast.ASTCalendars> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a String.
   * 
   * @param str String to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the string
   * */
  public  Optional<calendars._ast.ASTCalendars> parse_StringCalendars(String str) throws IOException {
    return parseCalendars(new StringReader(str));
  }
  


}
