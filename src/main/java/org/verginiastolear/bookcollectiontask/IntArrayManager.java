package org.verginiastolear.bookcollectiontask;

public class IntArrayManager {
    public static int getTheMinValueOfTheArray(int[] intArray) {
        int minValue = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < minValue) {
                minValue = intArray[i];
            }
        }
        return minValue;
    }

    public static int getTheMinValueIndexOfTheArray(int[] intArray) {
        int minValue = intArray[0];
        int index = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < minValue) {
                minValue = intArray[i];
                index = i;
            }
        }
        return index;
    }

    public static int getTheAverageOfTheArray(int[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum = sum + intArray[i];
        }
        return sum / intArray.length;
    }

}
