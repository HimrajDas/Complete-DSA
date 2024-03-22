package dsa.Book.searching;

public class OrderedLS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};  // ordered.
        int target = 4;
        System.out.println(OrderedLinearSearch(arr, target));
    }

    public static int OrderedLinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
            else if (arr[i] > target) return -1;
        }

        return -1;
    }

    // Time Complexity: O(n). This is because in the worst case you need to scan the complete array. But in the average
    // case it reduces the complexity but the growth rate is same.
}
