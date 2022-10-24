package com.company.Algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class TSP {
    static int[][] adj;
    static int n, src;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of vertices: ");
        n = scanner.nextInt();
        System.out.println("Enter the adj Mat: ");
        adj = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adj[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the Source City: ");
        src = scanner.nextInt();

        ArrayList<Integer> citys = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(i == (src-1)) continue;
            citys.add(i);
        }

        int[] path = new int[n+1];

        int cost = tsp(src- 1, citys, path);

        System.out.println("Total Cost: " + cost);
        path[0] = src-1;
        path[n] = src-1;

        System.out.println("path:");
        for (int i = n; i >= 0 ; i--) {
            System.out.println(path[i] + " ");
        }
    }

    static int tsp(int v, ArrayList<Integer> citys, int[] path){
        if(citys.isEmpty())
            return adj[v][src-1];
        ArrayList<Integer> subCity;
        int minCost = Integer.MAX_VALUE;
        for(Integer i : citys){
            subCity = new ArrayList<>(citys);
            subCity.remove(i);
            int[] tempPath = new int[n+1];
            int cost = adj[v][i] + tsp(i, subCity, tempPath);

            if(cost < minCost){
                minCost = cost;
                tempPath[citys.size()] = i;
                copyCentral(path, tempPath, citys.size());
            }
        }
        return minCost;
    }

    static void copyCentral(int[] path, int[] tempPath, int size){
        for (int i = 1; i <= size; i++) {
            path[i] = tempPath[i];
        }
    }

}
