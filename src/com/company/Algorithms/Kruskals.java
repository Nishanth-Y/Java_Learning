package com.company.Algorithms;

import java.util.Arrays;
import java.util.Scanner;

class Edge{
    int src, dest, weight;
    Edge(int src, int dest, int weight){
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

public class Kruskals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        int n = scanner.nextInt();

        System.out.println("Enter the adjacency matrix: ");
        int[][] adj = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adj[i][j] = scanner.nextInt();
            }
        }
        int k = 0;
        Edge[] edges = new Edge[(n*(n-1) / 2)];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                edges[k] = new Edge(i, j, adj[i][j]);
                k++;
            }
        }

        sort(edges);

        int[] parent = new int[n];
        Arrays.fill(parent, -1);
        int minCost = 0;
        for (int i = 0; i < n; i++) {
            int lsrc = find(parent, edges[i].src);
            int ldest = find(parent, edges[i].dest);
            if(lsrc != ldest){
                System.out.println((edges[i].src + 1) + "<->" + (edges[i].dest + 1));
                minCost += edges[i].weight;
                union(parent, lsrc, ldest);
            }
        }
        System.out.println("Minimum Cost: " + minCost);

    }

    static void
    union(int[] parent, int lsrc, int ldest){
        parent[lsrc] = ldest;
    }

    static void sort(Edge[] edges){
        for (int i = 1; i < edges.length; i++) {
            for (int j = 0; j < edges.length; j++) {
                if(edges[j].weight > edges[j+1].weight){
                    Edge temp = edges[j];
                    edges[j] = edges[j+1];
                    edges[j+1] = temp;
                }
            }
        }
    }

    static int find(int[] parents, int i){
        if(parents[i] == -1)
            return  i;
        return  find(parents, parents[i]);
    }

}
