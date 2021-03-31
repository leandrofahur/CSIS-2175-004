package P300326045;

import java.util.Locale;
import java.util.Scanner;

public class RecursionMain {
    /*
     * @Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
     * @Input: the nth term of the sequence.
     * @Output: the fibonacci nth value of the sequence
     */
    public static int FibonacciSequence(int n) {
        // Algorithm by induction:
        // fib(0) = 0
        // fib(1) = 1
        // fib(2) = 1, because fib(0) + fib(1)
        // fib(3) = 2, because fib(1) + fib(2)
        // fib(4) = 3, because fib(2) + fib(3)
        // fib(5) = 5, because fib(3) + fib(4)
        // ...
        // By induction, the equation can be solved as:
        // f(n) = f(n-1) + f(n-2) for all n > 2

        // fib(0) = 0 | fib(1) = 1 | fib(2) = 1
        if(n < 2) {
            return n;
        } else {
            return FibonacciSequence(n-1) + FibonacciSequence(n-2);
        }
    }

    /*
     * @Factorial: n! = n * n-1 * n- 2 *  ... * 1
     * @Input: the product of the nth term
     * @Output: the factorial value of the nth value
     */
    public static int Factorial(int n) {
        // Algorithm by induction:
        // fac(0) = 0! = 1.
        // fac(1) = 1! = 1 = fac(0) * fac(1)
        // fac(2) = 2! = 2 = fac(0) + fac(1) * fac(2)
        // fac(3) = 3! = 6 = fac(0) + fac(1) * fac(2) * fac(3)
        // fac(4) = 4! = 24 = fac(0) + fac(1) * fac(2) * fac(3) * fac(4)
        // ...
        // By induction, the equation can be solved as:
        // f(n) = f(n) * f(n-1) for all n > 0

        // if n = 0, the factorial of zero by definition is 1
        if(n == 0) {
            return 1;
        } else {
            return Factorial(n-1) * n;
        }

    }

    // Practice for recursion pdf:
    // Q01:
    public static void Letters(char c) {
        // Algorithm by induction: (the | symbol is to help the visualization)
        // letter(A) = A
        // letter(B) = A | B |A
        // letter(C) = ABA | C | ABA
        // letter(D) = ABACABA | D | ABACABA
        // letter(E) = ABACABADABACABA | E | ABACABADABACABA
        // ...
        // By induction, the equation can be solved as:
        // letter(c) = letter(c-1) c letter(c-1)
        // where c-1 indicates the previous letter.

        // Precondition: c is one of the characters 'A' through 'Z'.
        // Postcondition: The method has printed a pattern of letters
        // 1. If the parameter c is 'A', then the output is 'A'.
        if(c == 'A') {
            System.out.print("A");
        } else {
            //  -- the output for the previous letter (c-1);
            Letters((char)(c-1));
            // -- followed by the letter c itself;
            System.out.print(c);
            //  -- followed by a second copy of the output for the previous letter.
            Letters((char) (c-1));
        }
    }

    // Q02:
    public static boolean Bears (int n) {

        // objective is n = 42:
        if(n == 42) {
            return true;
        }

        // 1. If n is even, then you may give back exactly n/2 bears.
        if (n%2 == 0) {
            return Bears((int)(n/2));

        }

        // 2. If n is divisible by 3 or 4, then you may multiply the last two digits of n and give
        // back this many bears. (By the way, the last digit of n is n%10, and the next-to-last
        // digit is ((n%100)/10).
        if(n%3 == 0 && n%4 == 0) {
            return Bears((int)(n%10 * n%100));
        }

        // 3. If n is divisible by 5, then you may give back exactly 42 bears.
        if(n%5 == 0) {
            return Bears(42);
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert the number of the element you want from the Fibonacci Sequence >> ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(FibonacciSequence(i));
            System.out.print(" ");
        }

        System.out.print("\n");
        System.out.print(Factorial(n));

        System.out.print("\n");
        System.out.print("Please insert a char  >> ");
        char c = scanner.next().toUpperCase().charAt(0);
        Letters(c);

        System.out.print("\n");
        int[] numbers = new int[] {250, 42, 84, 53, 41};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Bears(numbers[i]));
        }
    }
}
