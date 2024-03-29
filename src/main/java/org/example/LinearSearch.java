
package org.example;

/**
 *CSC 229
 * @author Waleed Shahid
 */public class LinearSearch {

    // Method to perform linear search
    public static int search(int arr[], int x) { // this method is used to do linear search

        int n = arr.length; // variable n allows for the calculation of length of the array.

        // Loop through each element in the array
        for (int i = 0; i < n; i++) {  // looping through each array element
            // If the element at the current index equals 'x', return the index
            if (arr[i] == x) { // return the index if the element is at a index is 'x'
                return i;
            }
        }

        // If 'x' is not found in the array, return -1 to indicate not found
        return -1; // return -1 if 'x' is not found in the array
    }


    public static void main(String[] args) { // this main method is used to test the function above
        int arr[] = {3, 6, 9, 12, 15}; // testing
        int x = 6; // Element that is going to be looked up


        int result = search(arr, x); // calling the search method and storing the result


        if (result == -1) { // printing a result if the element was found.
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
// the space complexity is O(1) since it uses fixed amount of space
// Big O is O (n), since 'x' has to be compared with element in the array; which means going iterating to the very end.