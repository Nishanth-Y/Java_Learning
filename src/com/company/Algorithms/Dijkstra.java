package com.company.Algorithms;

import java.util.Scanner;

public class Dijkstra{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = scanner.nextInt();

        int[][] adj = new int[n][n];
        System.out.println("Enter the adj matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adj[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the source vertex: ");
        int src = scanner.nextInt();

        int[] dist = dijkstra(src-1, adj);
        for (int i = 0; i < n; i++) {
            if(src-1 == i) continue;
            System.out.println("Shortest distance from " + (src) + " to " + (i + 1) + " : " + dist[i]);
        }
        System.out.println();
    }
    static int[] dijkstra(int src, int[][] adj){
        int n =  adj.length, unvis = -1;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            dist[i] = adj[src][i];
            visited[i] = false;
        }

        visited[src] = true;

        for (int i = 0; i < n; i++) {
            int minCost = Integer.MAX_VALUE;
            for (int j = 1; j < n; j++) {
                if(!visited[j] && dist[j] < minCost){
                    minCost = dist[j];
                    unvis = j;
                }
            }
            visited[unvis] = true;
            for (int v = 0; v < n; v++) {
                if (!visited[v] && dist[unvis] + adj[unvis][v] < dist[v]){
                    dist[v] = dist[unvis] + adj[unvis][v];
                }
            }
        }
        return dist;
    }
}