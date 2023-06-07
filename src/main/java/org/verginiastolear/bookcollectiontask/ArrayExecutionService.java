package org.verginiastolear.bookcollectiontask;

public class ArrayExecutionService {
    public static void main(String[] args) {
        int[] tablouIntDeDate = {1, 5, 3, 4, 6, 9, 8, 7, 5, 6, 0, 2, 3, 9, 5, 6, 4, 8, 2, 6};

        System.out.println(IntArrayManager.getTheMinValueOfTheArray(tablouIntDeDate));
        System.out.println(IntArrayManager.getTheMinValueIndexOfTheArray(tablouIntDeDate));
        System.out.println(IntArrayManager.getTheAverageOfTheArray(tablouIntDeDate));


        int a = 5;
        int b = 8;

        System.out.println("1. a = " + a + " b = " + b);

//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println("2. a = " + a + " b = " + b);


        a = a + b;
        // a = 5+8 = 13
        b = a - b;
        // b = 13-8 = 5
        a = a - b;
        // a = 13-5 = 8

        System.out.println("3. a = " + a + " b = " + b);
    }
}
