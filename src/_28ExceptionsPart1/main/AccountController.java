package _28ExceptionsPart1.main;

import _28ExceptionsPart1.exceptions.TooMuchMoneyException;

public class AccountController {
    private static final double MAX_AMOUNT = 100;

    public void withdraw(double amount)
            throws TooMuchMoneyException {

        if(amount > MAX_AMOUNT) {
            throw new TooMuchMoneyException();
        }

        // do something
    }
}
