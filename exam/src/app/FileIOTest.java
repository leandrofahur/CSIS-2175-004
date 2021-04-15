package app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;


public class FileIOTest {

    @Test
    public void getArrayListFile() throws FileNotFoundException {
        FileIO fileIO = new FileIO("/Users/leandro/Desktop/le/douglas_college/CSIS_2175/exam/src/app/test.txt");
        fileIO.ReadFile();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("col1,col2,col3,col4");
        Assertions.assertArrayEquals(arrayList.toArray(), fileIO.getArrayListFile().toArray());

    }
}