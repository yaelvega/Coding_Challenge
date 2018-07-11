package factorial;

import org.junit.Test;

import static factorial.Factorial.factorial;

public class FactorialTest {

    @Test
    public void factorialTest () {
        assert (factorial(2) == 2);
        assert (factorial(5) == 120);
        assert (factorial(factorial(3)) == 720);
        assert (factorial(4+3+1) == 40320);
    }
}
