package seedu.duke.commands;

public class SetBudgetCommand extends Command {

    private double amount;

    public static final String COMMAND_WORD = "SET";

    public static final String SET_BUDGET_MESSAGE = "Setting budget to ";

    public SetBudgetCommand(double amount) {
        super();
        this.amount = amount;
    }

    @Override
    public CommandResult execute() {
        myBudget.setBudget(amount);
        String feedback = SET_BUDGET_MESSAGE + "$" + amount;
        return new CommandResult(feedback);
    }
}