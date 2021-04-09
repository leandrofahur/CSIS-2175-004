package app;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayZaoTest {
    @Test
    public void sum() {
        ArrayZao arrayZao = new ArrayZao();
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int acc = arrayZao.sum(arrayList);
        Assert.assertEquals(20, acc);
    }
}