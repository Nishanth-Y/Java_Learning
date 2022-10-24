package com.company.Algorithms;

import java.util.Scanner;

public class Floyds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n vlaue: ");
        int n = scanner.nextInt();

        int[][] adj = new int[n][n];
        System.out.println("Enter the adjacency matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adj[i][j] = scanner.nextInt();
            }
        }

        int[][][] D = new int[n+1][n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                D[0][i][j] = adj[i][j];
            }
        }


        for (int k = 1; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    D[k][i][j] = Math.min(D[k-1][i][j], D[k-1][i][k-1] + D[k-1][k-1][j]);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.print(D[i][j][k] + " ");
                }
            }
            System.out.println();
        }
    }
}
