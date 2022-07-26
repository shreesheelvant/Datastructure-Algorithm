package com.bridgelabz;

public class BubbleSort {
    public static void main(String[] args) {
            int[] unsorted = {36, 19, 29, 12, 5};
            int temp;
            for (int i = 0; i < unsorted.length; i++) {
                for (int j = 0; j < unsorted.length - 1 - i; j++) {
                    if (unsorted[j] > unsorted[j + 1]) {
                        temp = unsorted[j];
                        unsorted[j] = unsorted[j + 1];
                        unsorted[j + 1] = temp;
                    }
                }
            }
            System.out.println("Printing the sorted array : ");
            for (int i = 0; i < unsorted.length; i++) {
                System.out.print(unsorted[i] + " ");
            }
        }
    }


