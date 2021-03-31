package P300326045;

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
        // fib(2) = 1, because f(0) + f(1)
        // fib(3) = 2, because f(1) + f(2)
        // fib(4) = 3, because f(2) + f(3)
        // fib(5) = 5, because f(3) + f(4)
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert the number of the element you want from the Fibonacci Sequence >> ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(FibonacciSequence(i));
            System.out.print(" ");
        }
    }
}
