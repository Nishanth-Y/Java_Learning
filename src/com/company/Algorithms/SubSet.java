package com.company.Algorithms;

import java.util.Scanner;

public class SubSet {

    static int[] arr;
    static int n, count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of Elements: ");
        n = scanner.nextInt();

        System.out.println("Enter the Elements: ");
         arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the Total Sum: ");
        int total = scanner.nextInt();

        subSet(total, n-1, new boolean[n]);

    }
    static void subSet(int total, int index, boolean[] solution){
        if(total == 0)
            printSol(solution);
        else if(total < 0 || index < 0)
            return;
        else{
            boolean[] tempSol = solution.clone();
            tempSol[index] = false;
            subSet(total, index-1, tempSol);
            tempSol[index] = true;
            subSet(total - arr[index], index - 1, tempSol);
        }

    }

    private static void printSol(boolean[] solution) {
        for (int i = 0; i < solution.length; i++) {
            if(solution[i]){
                System.out.println(arr[i] + " ");
            }
        }
    }

}
