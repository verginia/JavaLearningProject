package org.verginiastolear.exceptionsservicetask;

import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        // Exception appeared and the program has stopped
//        int result = ArithmeticOperationService.divideIntNoExceptionHandling(10, 0);
        int result2 = ArithmeticOperationService.divideInWithExceptionHandling(10,0);
        System.out.println(result2);
        System.out.println("The program is running till the end from Arithmetic result");

        String stringValue = "Verginia";
        String stringValue2 = null;

        System.out.println(TextManager.getTheTextLengthWithTryCatchFinally(stringValue2));
        System.out.println(TextManager.getTheTextLength(stringValue));
        System.out.println(TextManager.getTheTextLengthIfElse(stringValue2));

        String filePath = "src/main/java/org/verginiastolear/exceptionsservicetask/test.txt";
        String filePath1 = "src/main/java/org/verginiastolear/exceptionsservicetask/test1.txt";

       // ReadDataManagement.readDataFromFileWithoutTryAndCatch(filePath);
        try{
            ReadDataManagement.readDataFromFileWithoutTryAndCatch(filePath);
        } catch(IOException exceptionObject) {
            System.out.println("The file does not exist, the execution of the program is not interrupted");
        }finally {
            System.out.println("This block is always executed");
        }
        System.out.println("The program is running till the end from ReadData");

        ReadDataManagement.readDataFromFileWithTryAndCatch(filePath);

        System.out.println("The program is running till the end from ReadData");

        ReadDataManagement.readDataFromFileWithTryAndCatch(filePath1);

        System.out.println("The program is running after ReadData TryCatch");
    }
}
