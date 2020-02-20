package sg.edu.nus.comp.cs4218.impl.parser;

import org.junit.jupiter.api.*;
import sg.edu.nus.comp.cs4218.exception.InvalidArgsException;
import static org.junit.jupiter.api.Assertions.*;

class ArgsParserTest {

    private ArgsParser parser;

    @BeforeEach
    void setParser(){
        parser = new ArgsParser();
        parser.legalFlags.add('a');
    }

    @Test
    void parseNonFlagArgs() {
        assertDoesNotThrow(()->{
            parser.parse("echo","\"hello world\"");
        });
    }

    @Test
    void parseValidFlagArgs() {
        assertDoesNotThrow(()->{
            parser.parse("-a");
        });
    }

    @Test
    void parseInvalidFlagArgs() {
        assertThrows(InvalidArgsException.class, ()->{
            parser.parse("-b");
        });
    }

}