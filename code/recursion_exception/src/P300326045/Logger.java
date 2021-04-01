package P300326045;

import java.io.*;

public class Logger extends Exception {
    private File file;
    private FileReader fileReader;
    private String fileName;

    public Logger() {
        // ...
    }

    public  Logger(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.file = new File(fileName);
        this.fileReader = new FileReader(file);
    }

    public void WriteLog(String message) throws IOException {
        FileWriter fileWriter = new FileWriter(this.fileName, true);
        fileWriter.write(message+"\n");
        fileWriter.close();
    }
}
