package P300326046;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q2Test {

    @Test
    public void countEven() {
        CountEven countEven = new CountEven();
        Assertions.assertEquals(2, countEven.Count(1234));
    }
}