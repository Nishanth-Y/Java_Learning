package com.company.Algorithms;

import java.util.Scanner;

public class Prims  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        int n = scanner.nextInt();

        int[][] adj = new int[n][n];
        System.out.println("Enter the Adjacency matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adj[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the source : ");
        int src = scanner.nextInt();

        boolean[] visited = new boolean[n];

        visited[src-1] = true;

        int minCost, cost = 0, source = 0, target = 0;
        for (int i = 1; i < n; i++) {
            minCost = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if(visited[j]){
                    for (int k = 0; k < n; k++) {
                        if(!visited[k] && minCost > adj[j][k]){
                            minCost = adj[j][k];
                            source = j ;
                            target = k;
                        }
                    }
                }
            }
            visited[target] = true;
            System.out.println("(" + source+1 + ", " + target+1 + ")");
            cost += minCost;
        }

        System.out.println("Minimum Cost : " + cost);
    }

}
