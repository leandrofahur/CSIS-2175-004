package P300326045;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Logger extends Exception {
    private File file;

    public Logger() {
        // ...
    }

    public  Logger(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
    }
}
