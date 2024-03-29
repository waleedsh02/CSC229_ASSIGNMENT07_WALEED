/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

/**
 *CSC 229
 * @author WALEED SHAHID
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    //ToDo 2: Call the above method and test the algorithm
    // provide time and space analysis
    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11,13}; // Example of a sorted array
        int key = 7; // This is the value to be searched for in the array
        int low = 0; // starting index
        int high = sortedArray.length - 1; // Last index of the array


        int index = runBinarySearchIteratively(sortedArray, key, low, high); // binary search method is called


        if (index != Integer.MAX_VALUE) { // printing the result of the search
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("required element  not found in the array.");
        }
    }
}
// time complexity is O(logn) as during the execution of the algorithm... the search is divided into half (high-low/2)
