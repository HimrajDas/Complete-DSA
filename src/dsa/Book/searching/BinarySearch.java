package dsa.Book.searching;

public class BinarySearch {
    public static void main(String[] args) {

    }

    public static int binarySearch(int[] arr, int target) {
        // iterative approach.
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target < arr[mid]) high = mid - 1;
            else if (target > arr[mid]) low = mid + 1;
            else return mid;
        }

        return -1;
    }
}
