//Selection Sort
// Selection sort is a sorting algorithm that selects the smallest element from an unsorted list in each iteration and places that element at the beginning of the unsorted list.
/*
    * Selection sort is an in-place comparison sort.
    * Time Complexity: O(n^2)
    * Space Complexity: O(1)
    * Selection sort is not a stable sort.

    * The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning.
 */

/*
    * The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning.
    * The algorithm maintains two subarrays in a given array.
        1) The subarray which is already sorted.
        2) Remaining subarray which is unsorted.
    * In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.
 */

import java.util.Arrays;



public class SelectionSort {

    public static void main(String[] args) {
        System.out.println("Selection Sort Algorithms");
        int [] arr = {7,8,3,1,2};
        selectionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for(int i = 0;i<arr.length-1;i++){
            int minIndex = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j]<arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
        }
    }

    private static void swap(int[] arr, int minIndex, int i) {
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }


}
