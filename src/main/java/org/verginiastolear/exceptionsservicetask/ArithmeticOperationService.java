package org.verginiastolear.exceptionsservicetask;

public class ArithmeticOperationService {
    public static int divideIntNoExceptionHandling(int a, int b) {
        return a / b;
    }

    public static int divideInWithExceptionHandling(int a, int b){
        try{
            int result = a / b;
            return result;
        } catch(ArithmeticException capturedException){
            System.out.println("An exception has occurred with the message: " + capturedException.getMessage());
            capturedException.printStackTrace();
            return 0;
        }
    }
}
