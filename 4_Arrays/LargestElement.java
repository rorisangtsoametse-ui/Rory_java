// Program to find the largest element in an array.
// It iterates through the array and keeps track of the largest element found so far.

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {25, 11, 7, 75, 56};
        int max = arr[0]; // Initialize max with the first element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The largest element in the array is: " + max);
    }
}
