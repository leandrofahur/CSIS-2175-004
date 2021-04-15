package P300326046;

public class CountEven {
    public CountEven() {
        // ...
    }

    public int Count(int num) {
        // f(0) = 0:
        // f(1) = 1;
        // f(2) = 0;
        //...
        // f(10) = 1;
        // f(11) = 2;
        // f(12) = 1;
        // ...
        // f(abc) = 100*f(a) + 10*f(b0) + 1*f(c)


        // stop case:
        if (num == 0) {
            return 0;
        }

        // get last digit by %10
        int decimal = num % 10;

        // leftMostDigit is the result of /10
        int leftMostDigit = num / 10;

        // check if odd:
        if (leftMostDigit % 2 == 0) {
            return 1 + Count(leftMostDigit);
        } else {
            return 0 + Count(leftMostDigit);
        }
    }
}
