// Program to sort an array of integers in ascending order.
// This example uses the bubble sort algorithm for simplicity.

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1};
        int n = arr.length;

        System.out.print("Original array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Bubble sort logic
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
