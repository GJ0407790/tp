package seedu.smartlib.logic.parser;

import static seedu.smartlib.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.smartlib.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.smartlib.logic.parser.CommandParserTestUtil.assertParseSuccess;
import static seedu.smartlib.testutil.TypicalIndexes.INDEX_FIRST_READER;

import org.junit.jupiter.api.Test;

import seedu.smartlib.logic.commands.DeleteReaderCommand;

/**
 * As we are only doing white-box testing, our test cases do not cover path variations
 * outside of the DeleteReaderCommand code. For example, inputs "1" and "1 abc" take the
 * same path through the DeleteReaderCommand, and therefore we test only one of them.
 * The path variation for those two cases occur inside the ParserUtil, and
 * therefore should be covered by the ParserUtilTest.
 */
public class DeleteReaderCommandParserTest {

    private DeleteReaderCommandParser parser = new DeleteReaderCommandParser();

    @Test
    public void parse_validArgs_returnsDeleteCommand() {
        assertParseSuccess(parser, "1", new DeleteReaderCommand(INDEX_FIRST_READER));
    }

    @Test
    public void parse_invalidArgs_throwsParseException() {
        assertParseFailure(parser, "a",
                String.format(MESSAGE_INVALID_COMMAND_FORMAT, DeleteReaderCommand.MESSAGE_USAGE));
    }
}
