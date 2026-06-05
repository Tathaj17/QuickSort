package algorithms;

/**
 * Interface for all sorting algorithm implementations.
 * All sorting classes should implement this interface.
 */
public interface Sorter {
    /**
     * Sorts the given array in ascending order.
     * 
     * @param arr the array to sort
     */
    void sort(int[] arr);
    
    /**
     * Returns the name of the sorting algorithm.
     * 
     * @return the algorithm name
     */
    String getName();
}
