/*
Q1: Merge two arrays by satisfying given constraints
Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells,
 merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.

For example,

Input: X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 }
Y[] = { 1, 8, 9, 10, 15 } The vacant cells in X[] is represented by 0 
Output: X[] = { 1, 2, 3, 5, 6, 8, 9, 10, 15 }
*/

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 1, 8, 9, 10, 15 };
        System.out.println(Arrays.toString(mergeArrays(X, X.length, Y, Y.length)));
    }

    // function to merge two sorted arrays
    static int[] mergeArrays(int[] arr1, int m, int[] arr2, int n) {
        int i = 0;
        int j = 0;

        while (i < m) {
            if (arr1[i] == 0) {
                arr1[i] = arr2[j];
                j++;
            }
            i++;
        }

        Arrays.sort(arr1);
        return arr1;
    }
}