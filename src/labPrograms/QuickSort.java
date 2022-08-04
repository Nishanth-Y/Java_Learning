package labPrograms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuickSort {
    static int arr[];
    static int comp;

    static void quickSort(int low, int high){
        if(low < high){
            comp++;
            int j = partition(low, high);
            quickSort(low, j - 1);
            quickSort(j + 1, high);
        }
    }

    static int partition(int low, int high){
        int pivot = arr[low];
        int i = low, j = high;
        while(i < j){
            comp++;
            while(i < high && arr[i] <= pivot){
                comp += 2;
                i = i + 1;
            }
            while(j > low && arr[j] >= pivot){
                comp += 2;
                j = j - 1;
            }
            if(i < j){
                comp++;
                swap(i , j);
            }
        }
        arr[low] = arr[j];
        arr[j] = pivot;
        return j;
    }

    static void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        arr = new int[n];
        switch (scanner.nextInt()){
            case 1:
                Random random = new Random(50);
                for(int i = 0;  i < n; i++)
                        arr[i] = random.nextInt();
                break;
            case 2:
                for(int i = 0;  i < n; i++)
                        arr[i] = n - i;
                break;
        }
        System.out.println(Arrays.toString(arr));
        long start = System.nanoTime();
        quickSort(0, n-1);
        long end = System.nanoTime();

        System.out.println("Time : " + (end - start));
        System.out.println("Comparision: " + comp);
    }
}
