package org.verginiastolear.operationsandcyclicfunctions;

public class PrintNumbersService {
    public static void main(String[] args) {
        int a = 1;
        int limit = 25;
        while (a > 0){
            System.out.println("Default value for a: " + a);
            // a = a - 1;
            // a -= 1;
            a--;
        }

        // Valoarea lui a dupa ce iese din ciclul while este 0
        System.out.println("Current value for a: " + a);

        do{
            System.out.println(" Value for a: " + a);
            // a = a + 1;
            a++;
        } while (a < limit);
        System.out.println();

        for(int i = 1; i <= limit; i++){
            if((i % 2) == 0) {
                System.out.print(i + ", ");
            } else {
                System.out.print("[], ");
            }
        }
    }
}
