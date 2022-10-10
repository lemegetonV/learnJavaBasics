package _28ExceptionsPart1.main;

import _28ExceptionsPart1.exceptions.MyCheckedException;
import _28ExceptionsPart1.exceptions.MyRuntimeException;
import _28ExceptionsPart1.exceptions.TooMuchMoneyException;

public class Main {
    /*
    Throwable
        Exception
            RuntimeException

        Error
            OutOfMemoryError
            StackOverflowError

      -> checked exception
      -> unchecked exceptions (runtime) -> RuntimeException

     */
    public static void main(String[] args) {

//        AccountController c = new AccountController();

        //c.withdraw(101); // try-catch-finally

        I1 i = new C();
        i.m(); // one might want to treat this exception here
//        i.m();
    }
}
