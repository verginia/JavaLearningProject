package org.verginiastolear.filemanagementservice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class InputFileReaderManager {

        public static void readDataFromATextFile(File file) {
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
            int character;
            while ((character = fileReader.read()) != -1) {
                //Proceseaza fiecare caracter din fisier
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                e.getMessage();
                e.printStackTrace();
            }
        }
    }

    public static void readDataFromATextFileUsingFileReader(File file) {
        try {
            FileReader fileReader = new FileReader(file);
            int charIntValue = 0;
            while ((charIntValue = fileReader.read()) != -1) {
                System.out.print((char) charIntValue);
            }
        } catch (IOException exception) {
            System.out.println("There is an exception: " + exception.getMessage());
        }
    }

    public static void readDataFromAFileUsingBufferReader(File inputfile) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
//            fileReader = new FileReader(inputfile);
//            bufferedReader = new BufferedReader(fileReader);
            bufferedReader = new BufferedReader(new FileReader(inputfile));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                //Proceseaza fiecare linie a fisierului
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("The file was not found " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null)
                    bufferedReader.close();
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                e.getMessage();
                e.printStackTrace();
            }
        }
    }

    public static void readDataFromFileUsingFiles(File file) {
        try {
           // System.out.println(Files.readString(file.toPath()));
            System.out.println(Files.readString(Path.of(file.getPath())));
        } catch (IOException exception) {
           // throw new RuntimeException(e);
            System.out.println("There is an exception " + exception.getMessage());
        }
    }


}
