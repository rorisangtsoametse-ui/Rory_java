// Program to reverse the elements of an array.
// This program creates a new array to store the reversed elements.

public class ReverseArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] reversedArray = new int[originalArray.length];

        System.out.print("Original array: ");
        for (int value : originalArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }

        System.out.print("Reversed array: ");
        for (int value : reversedArray) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
