package utils;

import java.util.Arrays;
import java.util.Random;

/**
 * Utility class for array operations and testing.
 */
public class ArrayUtils {
    
    private static final Random random = new Random();
    
    /**
     * Generates a random array of given size.
     * 
     * @param size the size of the array
     * @return an array with random integers
     */
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1000);
        }
        return arr;
    }
    
    /**
     * Checks if an array is sorted in ascending order.
     * 
     * @param arr the array to check
     * @return true if sorted, false otherwise
     */
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Prints an array in a readable format.
     * 
     * @param arr the array to print
     */
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    
    /**
     * Creates a copy of the array.
     * 
     * @param arr the array to copy
     * @return a copy of the array
     */
    public static int[] copyArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }
    
    /**
     * Measures the time taken to execute a sorting algorithm.
     * 
     * @param arr the array to sort
     * @param sorter the sorting algorithm
     * @return time taken in milliseconds
     */
    public static long measureSortTime(int[] arr, algorithms.Sorter sorter) {
        long startTime = System.currentTimeMillis();
        sorter.sort(arr);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
