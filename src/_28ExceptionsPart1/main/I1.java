package _28ExceptionsPart1.main;

import _28ExceptionsPart1.exceptions.MyRuntimeException;
import _28ExceptionsPart1.exceptions.TooMuchMoneyException;

public interface I1 {

    void m() throws MyRuntimeException;
    // sometimes you throw runtime exception for document purposes
}
