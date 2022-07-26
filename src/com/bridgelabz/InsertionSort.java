package com.bridgelabz;

public class InsertionSort {
    public static void main(String[] args) {
            String[] array = {"Apple", "Papaya", "Banana", "Orange", "Grapes", "Jack-fruits"};
            String temp;
            int j;
            for (int i = 0; i < array.length; i++) {
                temp = array[i];
                j = i;
                while (j > 0 && array[j - 1].compareTo(temp) > 0) {
                    array[j] = array[j - 1];
                    j = j - 1;
                }
                array[j] = temp;
            }
            System.out.println("Printing the sorted array ");
            for (int i = 0; i < array.length; i++) {

                System.out.print(array[i] + " ");
            }
        }
    }

