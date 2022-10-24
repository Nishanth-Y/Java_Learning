package com.company.Algorithms;

import java.util.Scanner;

public class Hamilton {
    static int n, count = 0;
    static int[][] adj;
    static int[] sol;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        n = scanner.nextInt();

        adj = new int[n+1][n+1];
        System.out.println("Enter the adjacency matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adj[i][j] = scanner.nextInt();
            }
        }

        sol = new int[n];

        sol[1] = 1;
        hamiltonian(2);

        if (count == 0)
            System.out.println("No Solution.");

    }

    private static void hamiltonian(int i) {
        while(true){
            nextValue(i);

            if(sol[i] == 0)
                return;

            if(i == n){
                printArray(i);
            } else{
                hamiltonian(i+1);
            }
        }
    }

    private static void nextValue(int i) {
        while(true){
            sol[i] = (sol[i] + 1) % n-1;

            if(sol[i] == 0){
                return;
            }

            if(adj[sol[i-1]][sol[i]] != 0){
               int j;
                for (j = 1; j < i; j++) {
                    if(sol[i] == sol[j]){
                        break;
                    }
                }

                if(j==i){
                    if(i < n || (i == n && adj[n][1] != 0))
                        return;
                }
            }
        }
    }

    static void printArray(int i){
        for (int j = 1; j <= n; j++) {
            System.out.print(sol[j] + " ");
        }
        System.out.println(sol[1]);
    }


}
