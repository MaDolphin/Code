/* (c) https://github.com/MontiCore/monticore */
package automata.parser;

import automata._ast.ASTState;
import automata._parser.AutomataParser;
import automata._ast.ASTAutomaton;
import automata.lang.AbstractTest;
import org.antlr.v4.runtime.RecognitionException;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class AutomatonParserTest extends AbstractTest {
  
  @Test
  public void testPingPong() {
    ASTAutomaton a = parseModel("src/test/resources/automata/parser/PingPong.aut");
    assertNotNull(a);
  }
  
 
  
  @Test
  public void testState() throws RecognitionException, IOException {
    AutomataParser parser = new AutomataParser();
    Optional<ASTState> state = parser.parseState(
            new StringReader("state Ping;"));
    assertFalse(parser.hasErrors());
    assertTrue(state.isPresent());
  }
  

}
