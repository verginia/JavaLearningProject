package org.verginiastolear.filemanagementservice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputFileWriterManager {
    public static void writeDataIntoFileUsingFileWriter(String filePath, String content) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write(content);
        } catch (IOException e) {
            System.out.print("There has been found an exception: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();

                } catch (IOException e) {
                    e.getMessage();
                    e.printStackTrace();
                }
            }
        }
    }

    public static void writeDataIntoFileUsingBufferWriter(String filePath, String content) {
        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(filePath));
            bufferedWriter.write(content);
            bufferedWriter.flush();
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        }
//        } finally {
//            try {
//                if (bufferedWriter != null)
//                    bufferedWriter.close();
//            } catch (IOException e) {
//                e.getMessage();
//                e.printStackTrace();
//            }
//        }
    }
}
