package com.company.Algorithms;

import java.util.Random;
import java.util.Scanner;

public class QuickSort{
    static int comp = 0;
    static int[] arr;
   /* public static void quickSort(int low, int high){
        if(low < high) {
            comp += 1;
            int j = partition(low, high);
            quickSort(low, j);
            quickSort(j+1, high);
        }

    }

    public static int partition(int low, int high){
        int i = low, j = high, pivot = arr[low];
        while(i < j){
            comp++;
            while(i < high && arr[i] <= pivot){
                comp+= 2;
                i++;
            }
            while(j > low && arr[j] >= pivot ){
                comp += 2;
                j--;
            }
            if(i < j){
                comp++;
                interchange(i, j);
            }

        }
        arr[low] = arr[j];
        arr[j] = pivot;
        return j;
    }

    public static void interchange(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }*/

   static void mergeSort(int low, int high){
       if(low < high) {
           comp ++;
           int mid = (low + high) / 2;
           mergeSort(low, mid);
           mergeSort(mid+1, high);
           merge(low, mid, high);
       }
   }
   static void merge(int low, int mid, int high){
       int i = low, j = mid+1;
       int n = high - low + 1;
       int[] temp = new int[n];
       int k = 0;
       while(i <= mid && j <= high){
           if(arr[i] <= arr[j]){
               temp[k] = arr[i];
               i++;k++;
           }
           else{
               temp[k] = arr[j];
               j++;k++;
           }
       }
       while(i <= mid){
           temp[k] = arr[i];
           k++;
           i++;
       }
       while(j <= high){
           temp[k] = arr[j];
           k++;j++;
       }
       for (int l = 0; l < n; l++) {
           arr[low+l] = temp[l];
       }
   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        arr = new int[n];

        int ch = scanner.nextInt();
        switch (ch){
            case 1:
                Random random = new Random();
                for (int i = 0; i < n; i++) {
                    arr[i] = random.nextInt(10) + 1;
                }
                break;
            case 2:
                for (int i = 0; i < n; i++) {
                    arr[i] = i + 1;
                }
                break;
        }
        long start = System.nanoTime();
        mergeSort(0, n-1);
        long end = System.nanoTime();

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Time : " + (end-start));
        System.out.println("Comparision: " + comp);
    }
}