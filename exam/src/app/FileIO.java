package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileIO {
    /*
     * @Description: Attributes for the class.
     */
    private File file;
    private String fileName;
    private Scanner scanner;

    private ArrayList<String> arrayListFile;

    // From the definition, a set is a collection of unique objects:
    // It will be used to "filter" values from the column.
    private Set<String> hashSet;

    // If the file does not exist, or the path is wrong, it needs to throw an exception.
    public FileIO(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.file = new File(this.fileName);
        this.scanner = new Scanner(this.file);
    }

    public void ReadFile() {
        // Store line-by-line of the file into an ArrayList<String>
        this.arrayListFile = new ArrayList<>();
        try {
            while (this.scanner.hasNextLine()) {
                arrayListFile.add(scanner.nextLine());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Method return an ArrayList with the options for a column.
    // the idea is to populate the observable list with them.
    public ArrayList<String> GetColumn(int columnNumber) {

        hashSet = new HashSet<String>();
        String[] columnArray= arrayListFile.get(0).split(",");
        int numOfCol = columnArray.length;

        if(columnNumber > numOfCol) {
            return new ArrayList<String>(Collections.singleton("Out of bounds!"));
        }

        for(int i = 0; i < arrayListFile.size(); i++) {
            String[] token = arrayListFile.get(i).split(",");
            System.out.println(token[columnNumber]);
            hashSet.add(token[columnNumber]);
        }

        return new ArrayList<String>(hashSet);
    }

    public ArrayList<String> FormatedList() {
        ArrayList<String> formatedArrayList = new ArrayList<>();

        for(int i = 0; i < arrayListFile.size(); i++) {
            // format and use the formated parts for the formatedArrayList:
            String[] str = arrayListFile.get(i).split(",");
            String formatedStr = "";
            formatedStr = String.format("%-18s\t%-18s\t%-18s\t%-18s", str[0], str[1], str[2], str[3] );
            formatedArrayList.add(formatedStr);
        }
        return formatedArrayList;
    }

    public ArrayList<String> getArrayListFile() {
        return arrayListFile;
    }

}

