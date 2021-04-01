package P300326045;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingMain {

    public static void main(String[] args) {

        // YOU CAN USE THE GENERAL "EXCEPTION" TO ANY KIND OF EXCEPTION!

        // Logger:
        try {
            Logger logger = new Logger("/Users/leandro/Desktop/le/douglas_college/CSIS_2175/code/recursion_exception/src/P300326045/log.txt");


            /*
             *  @Exception: ArrayIndexOutOfBoundsException
             *  @Description: The program tries to access an index out of bounds from the array.
             */
            try {
                int[] arr = new int[]{0, 1, 4, 9, 16};

                // added +1 to arr.length to force access to a position that does not exists!
                for (int i = 0; i < arr.length + 1; i++) {
                    System.out.println("Array[" + i + "] = " + arr[i]);
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                // Prints the message of the error:
                System.out.println(ex.getMessage());
                try {
                    logger.WriteLog(ex.getMessage());
                } catch (IOException IOex) {
                    System.out.println(IOex.getMessage());
                }

            }

            System.out.println();

            /*
             *  @Exception: FileNotFoundException
             *  @Description: The program tries to read() or close() a FileReader object that does not exist.
             */
            try {
                File file = new File("c://i_do_not_exist.txt");
                FileReader fileReader = new FileReader(file);

            } catch (FileNotFoundException ex) {
                // Prints the message of the error:
                System.out.println(ex.getMessage());
                try {
                    logger.WriteLog(ex.getMessage());
                } catch (IOException IOex) {
                    System.out.println(IOex.getMessage());
                }
            }

            System.out.println();

//            try {
//                Logger loggerFail = new Logger("c://i_do_not_exist.txt");
//            } catch (FileNotFoundException ex) {
//                System.out.println(ex.getMessage());
//                try {
//                    logger.WriteLog(ex.getMessage());
//                } catch (IOException IOex) {
//                    System.out.println(IOex.getMessage());
//                }
//            }
        }
        catch (FileNotFoundException ex1) {
            System.out.println(ex1.getMessage());
        }

    }
}
