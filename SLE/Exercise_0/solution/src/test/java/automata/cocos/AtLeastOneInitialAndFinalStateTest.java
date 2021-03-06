/* (c) https://github.com/MontiCore/monticore */
package automata.cocos;

import automata._ast.ASTAutomaton;
import automata.lang.AbstractTest;
import de.monticore.cocos.helper.Assert;
import de.se_rwth.commons.SourcePosition;
import de.se_rwth.commons.logging.Finding;
import de.se_rwth.commons.logging.Log;
import de.se_rwth.commons.logging.LogStub;
import org.antlr.v4.runtime.RecognitionException;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;

public class AtLeastOneInitialAndFinalStateTest extends AbstractTest {
  
  @BeforeClass
  public static void init() {
    Log.enableFailQuick(false);
  }
  
  @Before
  public void setUp() throws RecognitionException, IOException {
    LogStub.init();
    Log.getFindings().clear();
  }
  
  @Test
  public void testValid() {
    ASTAutomaton automaton = parseModel("src/test/resources/automata/cocos/valid/A.aut");
    
    AtLeastOneInitialAndFinalState coco = new AtLeastOneInitialAndFinalState();
    coco.check(automaton);
    
    assertTrue(Log.getFindings().isEmpty());
  }
  
  @Test
  public void testMissingInitialState() throws IOException {
    ASTAutomaton automaton = parseModel("src/test/resources/automata/cocos/invalid/MissingInitialState.aut");
    
    AtLeastOneInitialAndFinalState coco = new AtLeastOneInitialAndFinalState();
    coco.check(automaton);
    
    Collection<Finding> expectedErrors = Arrays.asList(
        Finding.error("0xA0114 An automata must have at least one initial and one final state.",
            new SourcePosition(3, 0))
        );
    
    Assert.assertErrors(expectedErrors, Log.getFindings());
  }
  
}
