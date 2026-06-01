package Problems.Splitwise.Expense;

import Problems.Splitwise.BalanceSheetController;
import Problems.Splitwise.Split.ExpenseSplit;
import Problems.Splitwise.Split.ExpenseSplitType;
import Problems.Splitwise.Split.Split;
import Problems.Splitwise.Split.SplitFactory;
import Problems.Splitwise.User.User;

import java.util.List;

public class ExpenseController {
    BalanceSheetController balanceSheetController;

    public ExpenseController() {
        balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, ExpenseSplitType splitType, User paidByUser) {

        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(splitType);
        expenseSplit.validateSplitRequest(splitDetails, expenseAmount);

        Expense expense = new Expense(expenseId, expenseAmount, description, paidByUser, splitType, splitDetails);

        balanceSheetController.updateUserExpenseBalanceSheet(paidByUser, splitDetails, expenseAmount);

        return expense;
    }
}
