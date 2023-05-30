package org.verginiastolear.exceptionsservicetask;

import java.io.*;

public class ReadDataManagement {
    public static String readDataFromFileWithoutTryAndCatch(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);

        BufferedReader reader = new BufferedReader(fileReader);
        String line;

        while((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        return  reader.toString();
    }

    public static String readDataFromFileWithTryAndCatch(String filePath){
        try{
            FileReader fileReader = new FileReader(filePath);

            BufferedReader reader = new BufferedReader(fileReader);
            String line;

            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            return  reader.toString();
        }catch(IOException exception){
            System.out.println("An error has occurred:" + exception.getMessage());
            exception.printStackTrace();
            return "";
        }
   }

}
