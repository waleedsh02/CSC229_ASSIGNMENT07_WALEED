/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

/**
 *CSC 229
 * @author Waleed SHAHID
 */
public class BubbleSort {

    public static void bubbleSort(int a[], int size) { // this method is used to perform bubble sort
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down outer loop
            for (inner = 0; inner < outer; inner++) { // bubbling up inner loop

                if (a[inner] > a[inner + 1]) {
                    // if the element is bigger than the upcoming element, then swap the elements
                    temp = a[inner];
                    a[inner] = a[inner + 1]; // element swapping
                    a[inner + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) { // Main method for testing the method above
        int a[] = {64, 34, 25, 12, 22, 11, 90}; // testing this eaxamplr as an array
        int size = a.length; // Showing the size of an array


        bubbleSort(a, size); // call to bubble sort method with the parameters


        System.out.println("Sorting  array:"); // printing the method
        for(int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
// the time complexity for this algorithm is O(n^2) as we have nested loops above, n-1 and n-2 and ....
    
    

