/**
 * 
 */
package com.a3.learnings.adjacencymatrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @author asinha (https://github.com/anubhawsinha13)
 *
 */
public class DFS {
	
	static void depthFirstSearch(int[][] matrix, int sourceVertex) {
		
		boolean visited[] = new boolean[matrix.length];
		visited[sourceVertex - 1] = true;
		Stack<Integer> currentVertex = new Stack<Integer>();
		currentVertex.push(sourceVertex);
		int i,x;
		System.out.println("Depth first order is:");
		System.out.println(sourceVertex);
		while(!currentVertex.isEmpty()) {
			x= currentVertex.pop();
			for(i=0; i<matrix.length; i++) {
				if(matrix[x-1][i]==1 && visited[i]==false) {
					currentVertex.push(x);
                    visited[i] = true;
                    System.out.println(i+1);
                    x = i+1;
                    i = -1;
					
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vertices;
        System.out.println("Enter the number of vertices in the graph");
        try{
            vertices = Integer.parseInt(br.readLine());
        }catch(IOException e){
            System.out.println("An error occurred");
            return;
        }
        int[][] matrix = new int[vertices][vertices];
        System.out.println("Enter the adjacency matrix");
        int i,j;
        for(i=0; i<vertices; i++){
            for(j=0; j<vertices; j++){
                try{
                    matrix[i][j] = Integer.parseInt(br.readLine());
                }catch (IOException e){
                    System.out.println("An error occurred");
                }
            }
        }
        int source;
        System.out.println("Enter the source vertex");
        try{
            source = Integer.parseInt(br.readLine());
        }catch(IOException e){
            System.out.println("An error occurred");
            return;
        }
        depthFirstSearch(matrix,source);
    }
	
	

}


