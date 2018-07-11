package factorial;

public class Factorial {

    static int factorial(int n) {
        throw new UnsupportedOperationException("Waiting to be implemented");
    }

    public static void main(String[] args) {

        System.out.println(factorial(2));
        System.out.println(factorial(5));
        System.out.println(factorial(factorial(3)));
    }
}

