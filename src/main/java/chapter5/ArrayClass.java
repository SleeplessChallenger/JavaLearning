package chapter5;

import java.util.Arrays;

public class ArrayClass {

    public static void main(String[] args) {
        compareTwoArrays();
    }

    public static void showArray() {
        int[] numbers1 = new int[3]; // size of 3: 0,1,2

        int[] nums2 = new int[] {54,12,75}; // redundant
        int[] numbers2 = {43,21,54}; // a better way

        for (int currNum: numbers2) {
            System.out.println(currNum);
        }
    }

    public static void applyBinarySearch() {
        int[] currNumsArray = {4,6,7,8,9,34,65};

        int result = Arrays.binarySearch(currNumsArray, 34);
    }

    public static void compareTwoArrays() {
        int[] firstArray = {43,65,23,65};
        int[] secondArray = {32,98};

        System.out.println(Arrays.compare(secondArray, firstArray));

        int[] sampleArrayOne = {54,65,12};
        int[] sampleArrayTwo = {54,66,12};
        System.out.println(Arrays.compare(sampleArrayOne, sampleArrayTwo));
    }

    public static void showMismatchWorking() {
        int[] firstArray = {43,12,90};
        int[] secondArray = {31,65,87};

        int result = Arrays.mismatch(firstArray, secondArray);
        System.out.println(result);

        int[] similarArray1 = {43,12,90};
        int[] similarArray2 = {43,12,90};

        System.out.println(Arrays.mismatch(similarArray1, similarArray2));
    }

}

class MultiDimensionalArray {
    int[][] vars1;
    int[] vars4 [], space[][];
    int[][][] vars5;

    public static void main(String[] args) {
        showMultiDimensionsArray();
    }

    public static void showMultiDimensionsArray() {
        int[][] currArr = {{4, 6, 7, 3}, {9, 6, 1}};

        for (int i = 0; i < currArr.length; i++) {
            for (int j = 0; j < currArr.length; j++) {
                System.out.println(currArr[i][j]);
            }
        }

        System.out.println("Next array");

        for (int[] innerArr: currArr) {
            for (int num: innerArr) {
                System.out.println(num);
            }
        }
    }
}
