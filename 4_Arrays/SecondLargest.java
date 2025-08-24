// Program to find the second largest element in an array.
// It iterates through the array, keeping track of the largest and second largest elements.

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}
