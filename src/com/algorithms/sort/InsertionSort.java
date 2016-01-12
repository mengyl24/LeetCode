package com.algorithms.sort;

import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort {

    public static void main(String[] args) {
	// write your code here

        int[] a = { 5, 1, 6, 2, 4, 3 };
        insertionSort(a);
        printArray(a);

        ArrayList<Integer> al = new ArrayList();
        al.add(5);
        al.add(1);
        al.add(6);
        al.add(2);
        al.add(4);
        al.add(3);
        Collections.sort(al);
        System.out.println(al);
    }

    /**
     * compare the last element with previous elements:
     * 1. store the last value to key
     * 2. compare the key with the elements on its left, move them to right by 1 index if their values are smaller than key
     * 3. put the key to the empty index in front.
     * @param a an integer array
     */
    public static void insertionSort(int[] a){
        for(int i = 0; i < a.length; i++){
            int key = a[i];
            int j = i-1;

            while (j>=0 && key < a[j]){
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = key;
        }
    }

    private static void printArray(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ,");
        }
        System.out.println();
    }
}
