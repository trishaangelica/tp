package seedu.duke.parser;

import seedu.duke.commands.Command;
import seedu.duke.commands.ExitCommand;
import seedu.duke.commands.ResetBudgetCommand;
import seedu.duke.data.Budget;

import static seedu.duke.Duke.myBudget;

public class Parser {
    /**
     * Parses user input into command for execution.
     *
     * @param userInput full user input string
     * @return the command based on the user input
     */
    public Command parseCommand(String userInput) {

        switch (commandWord) {

        case AddCommand.COMMAND_WORD:
            return prepareAdd(arguments);

        case DeleteCommand.COMMAND_WORD:
            return prepareDelete(arguments);

        case ClearCommand.COMMAND_WORD:
            return new ClearCommand();

        case ListCommand.COMMAND_WORD:
            return new ListCommand();

        case ResetBudgetCommand.COMMAND_WORD:
            return new ResetBudgetCommand();
            break;

        case "bye":
            return new ExitCommand();

        case HelpCommand.COMMAND_WORD: // Fallthrough
        default:
            return new HelpCommand();
        }
    }
}
