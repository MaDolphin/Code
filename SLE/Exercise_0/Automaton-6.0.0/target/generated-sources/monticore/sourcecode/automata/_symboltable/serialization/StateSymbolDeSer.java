/* generated from model Automata */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package automata._symboltable.serialization;

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

 public  class StateSymbolDeSer  implements de.monticore.symboltable.serialization.IDeSer<automata._symboltable.StateSymbol,automata._symboltable.IAutomataScope> {



    /* generated by template core.Method*/
 public  String getSerializedKind ()  {
      return "automata._symboltable.StateSymbol";
}

    /* generated by template core.Method*/
 public  String serialize (automata._symboltable.StateSymbol toSerialize)  {
      /* generated by template _symboltable.serialization.symbolDeSer.Serialize*/

  automata._symboltable.serialization.AutomataSymbolTablePrinter symbolTablePrinter = new automata._symboltable.serialization.AutomataSymbolTablePrinter();
  toSerialize.accept(symbolTablePrinter);
  return symbolTablePrinter.getSerializedString();
}

    /* generated by template core.Method*/
 public  automata._symboltable.StateSymbol deserialize (String serialized,automata._symboltable.IAutomataScope enclosingScope)  {
      /* generated by template _symboltable.serialization.symbolDeSer.DeserializeString*/
  de.monticore.symboltable.serialization.json.JsonObject symbol =
    de.monticore.symboltable.serialization.JsonParser.parseJsonObject(serialized);
  return deserialize(symbol,enclosingScope);
}

    /* generated by template core.Method*/
 public  automata._symboltable.StateSymbol deserialize (de.monticore.symboltable.serialization.json.JsonObject symbolJson,automata._symboltable.IAutomataScope enclosingScope)  {
      /* generated by template _symboltable.serialization.symbolDeSer.DeserializeJsonObject*/

  if (de.monticore.symboltable.serialization.JsonUtil.isCorrectDeSerForKind(this, symbolJson)) {
    return deserializeStateSymbol(symbolJson,enclosingScope);
  }
  else {
    Log.error("Unable to deserialize \""+symbolJson+"\" with DeSer for kind "+this.getSerializedKind());
  }
  return null;
}

    /* generated by template core.Method*/
 protected  automata._symboltable.StateSymbol deserializeStateSymbol (de.monticore.symboltable.serialization.json.JsonObject symbolJson,automata._symboltable.IAutomataScope enclosingScope)  {
      /* generated by template _symboltable.serialization.symbolDeSer.DeserializeSymbol*/

  automata._symboltable.StateSymbolBuilder builder = automata._symboltable.AutomataSymTabMill.stateSymbolBuilder();
  builder.setName(symbolJson.getStringMember(de.monticore.symboltable.serialization.JsonConstants.NAME));
  automata._symboltable.StateSymbol symbol = builder.build();
  deserializeAdditionalAttributes(symbol, symbolJson,enclosingScope);
  return symbol;
}

    /* generated by template core.Method*/
 protected  void deserializeAdditionalAttributes (automata._symboltable.StateSymbol symbol,de.monticore.symboltable.serialization.json.JsonObject symbolJson,automata._symboltable.IAutomataScope enclosingScope)  {
      /* generated by template core.EmptyBody*/
// empty body

}

}
