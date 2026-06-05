package algorithms;

/**
 * QuickSort implementation using the Divide and Conquer approach.
 * 
 * Time Complexity:
 *   - Best/Average Case: O(n log n)
 *   - Worst Case: O(n²) - when pivot is always smallest or largest
 * Space Complexity: O(log n) - due to recursion stack
 * 
 * Characteristics:
 *   - In-place sorting
 *   - Unstable sorting
 *   - Not adaptive
 */
public class QuickSort implements Sorter {
    
    @Override
    public void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }
    
    /**
     * Recursive helper method to perform QuickSort.
     * 
     * @param arr the array to sort
     * @param low the starting index
     * @param high the ending index
     */
    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get pivot index
            int pivotIndex = partition(arr, low, high);
            
            // Recursively sort elements before and after pivot
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    
    /**
     * Partition method that places pivot in correct position.
     * Uses Lomuto partition scheme.
     * 
     * @param arr the array to partition
     * @param low the starting index
     * @param high the ending index
     * @return the pivot index
     */
    private int partition(int[] arr, int low, int high) {
        // Choose last element as pivot
        int pivot = arr[high];
        
        // Index of smaller element - indicates the right position
        // of pivot found so far
        int i = low - 1;
        
        // Traverse through all elements
        // Compare each element with pivot
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                swap(arr, i, j);
            }
        }
        
        // Swap arr[i+1] and arr[high] (pivot)
        swap(arr, i + 1, high);
        
        return i + 1;
    }
    
    /**
     * Helper method to swap two elements in an array.
     * 
     * @param arr the array
     * @param i first index
     * @param j second index
     */
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    @Override
    public String getName() {
        return "QuickSort";
    }
}
