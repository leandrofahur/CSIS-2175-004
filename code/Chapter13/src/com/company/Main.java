package com.company;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.file.*;
import java.util.Scanner;
import static java.nio.file.AccessMode.*;
import java.io.IOException;
import java.nio.file.attribute.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class Main {
    public static void main(String[] args) {

        // Retrieving information about the path:
        Path filePath = Paths.get("//Users//leandro//Desktop//le//douglas_college//CSIS_2175//code//Chapter13//src//com//company//file.txt");
        int count = filePath.getNameCount();
        System.out.println("Path: " + filePath.toString());

        // Convert a relative path to an absolute one:
        String name;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a file name >> ");
        name = keyboard.nextLine();

        Path inputPath = Paths.get(name);
        Path fullPath = inputPath.toAbsolutePath();
        System.out.println("Full path is " + fullPath.toString());

        // Checking file accessibility:
        try {
            filePath.getFileSystem().provider().checkAccess(filePath, AccessMode.READ, EXECUTE);
        } catch (IOException ex) {
            System.out.println("File cannot be used for this application");
        }

        // Deleting a path:
        // try {
        //     Files.delete(filePath);
        //     System.out.println("File or directory is deleted");
        // } catch (NoSuchFieldException ex) {
        //     System.out.println("No such file or directory");
        // } catch (DirectoryNotEmptyException ex) {
        //     System.out.println("Directory is not empty");
        // } catch (SecurityException) {
        //     System.out.println("No permission to delete");
        // } catch (IOException ex) {
        //     System.out.println("IO Exception");
        // }

        // Determining file attributes:
        try {
            BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Creation time: " + attr.creationTime());
            System.out.println("Last modified time: " + attr.lastModifiedTime());
            System.out.println("Size: " + attr.size());
        } catch (IOException ex) {
            System.out.println("IO Exception");
        }

        // Writing to a file:
        String str = "Hello World";
        byte[] data =str.getBytes();
        OutputStream outputStream = null;
        try {
            outputStream = new BufferedOutputStream(Files.newOutputStream(filePath, CREATE));
            outputStream.write(data);
            outputStream.flush();
            outputStream.close();
        } catch (Exception ex) {
            System.out.println("Exception message: " + ex);
        }

        // Reading from a file:
        InputStream inputStream = null;
        try {
            inputStream = Files.newInputStream(filePath);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String s = null;
            s = reader.readLine();
            System.out.println(s);
            inputStream.close();

        } catch (IOException ex) {
            System.out.println("IO Exception");
        }
    }
}
