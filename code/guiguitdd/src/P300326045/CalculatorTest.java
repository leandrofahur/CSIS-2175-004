package P300326045;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {
    @Test
    public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+3");
        Assertions.assertEquals(6,sum);
    }

    @Test
    public void divide() {
        Calculator calculator = new Calculator();
        double div = calculator.divide(4,2);
        Assertions.assertEquals(2,div);
    }
}