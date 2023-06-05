package org.verginiastolear.filemanagementservice;

import java.io.File;

public class FileExecutionService {
    public static void main(String[] args) {

        File demoFile = new File("src/main/java/org/verginiastolear/filemanagementservice/test.txt");

        FileManager.informIfTheFileExists(demoFile);
        FileManager.createTheFileIfItDoesNotExist(demoFile);
        FileManager.informIfTheFileExists(demoFile);
        FileManager.printIfTheFileIaADirectoryOrNot(demoFile);
        FileManager.printTheFileName(demoFile);
        FileManager.printTheFileAbsolutePath(demoFile);
        FileManager.deleteTheFileIfExists(demoFile);


        String filePath = "src/main/java/org/verginiastolear/filemanagementservice/testOutput.txt";
        String text1 = "A fost o data ca-n povesti ";
        String text2 = "A fost ca niciodata ";
        OutputFileWriterManager.writeDataIntoFileUsingFileWriter(filePath, text1);
        OutputFileWriterManager.writeDataIntoFileUsingBufferWriter(filePath, text2);

        File fileObjectUsingForReading = new File(filePath);
        InputFileReaderManager.readDataFromATextFile(fileObjectUsingForReading);
        System.out.println();
        InputFileReaderManager.readDataFromATextFileUsingFileReader(fileObjectUsingForReading);
        System.out.println();
        InputFileReaderManager.readDataFromAFileUsingBufferReader(fileObjectUsingForReading);
        InputFileReaderManager.readDataFromFileUsingFiles(fileObjectUsingForReading);

    }
}
