package P300326045;

public class Calculator {
    public int evaluate(String expression) {
        int sum = 0;
        for (String summand: expression.split("\\+"))
            sum += Integer.valueOf(summand);
        return sum;
    }

    public double divide(double x, double y) {
        return x/y;
    }
}
