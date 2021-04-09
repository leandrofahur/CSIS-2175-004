package app;

import java.util.ArrayList;

public class ArrayZao {
    private ArrayList<Integer> arrayListInt;

    public ArrayList<Integer> getArrayListInt() {
        return arrayListInt;
    }

    public void setArrayListInt(ArrayList<Integer> arrayListInt) {
        this.arrayListInt = arrayListInt;
    }

    public Integer sum(ArrayList<Integer> arr) {
        return arr.stream().mapToInt(num -> num).sum();
    }
}
