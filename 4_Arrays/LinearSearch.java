// Program to perform a linear search for an element in an array.
// Linear search sequentially checks each element of the list until a match is found or the whole list has been searched.

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;
        int index = -1; // To store the index of the key if found

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break; // Exit the loop once the element is found
            }
        }

        if (index != -1) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
    }
}
