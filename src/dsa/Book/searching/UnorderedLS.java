package dsa.Book.searching;

public class UnorderedLS {
    public static void main(String[] args) {
        int[] numbs = {1, 5, 10, 4, 8, 4, 2};  // unordered.
        int data = 4;
        System.out.println(UnorderedLinearSearch(numbs, data));
    }

    public static int UnorderedLinearSearch(int[] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) return i;
        }

        // Time Complexity: O(n). In the worst case we need to scan the complete array. Space complexity: O(n).
        return -1;
    }
}
