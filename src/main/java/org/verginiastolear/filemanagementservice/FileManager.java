package org.verginiastolear.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileManager {

    // createTheFileIfItDoesNotExist(File file)

    public static void createTheFileIfItDoesNotExist(File inputFile) {
        if (inputFile.exists()) {
            System.out.println("The file already exists");
        } else {
            System.out.println("The file does not exist, it has to be create");
            try {
                inputFile.createNewFile();
            } catch (IOException e) {
                System.out.println("There is an exception: " + e.getMessage());
            }
        }
    }

    public static void informIfTheFileExists(File file) {
        if (file.exists()) {
            System.out.println("The file is present");
        } else {
            System.out.println("The file is not present");
        }
    }

    public static void printTheFileName(File file) {
        String fileName = file.getName();
        System.out.println("Numele fisierului: " + fileName);
    }

    public static void printTheFileAbsolutePath(File file) {
        String absolutePath = file.getAbsolutePath();
        System.out.println("Calea absoluta a fisierului: " + absolutePath);
    }

    public static void printIfTheFileIaADirectoryOrNot(File inputFile) {
        System.out.println("The file is a directory: " + inputFile.isDirectory());

        if (inputFile.isDirectory()) {
            System.out.println("This is a directory");
        } else {
            System.out.println("This is a file");
        }
    }

    public static void deleteTheFileIfExists(File file) {
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("The file was deleted.");
            } else {
                System.out.println("The file exists, but was not deleted.");
            }
        } else {
            System.out.println("The file does not exists");
        }
    }

}
