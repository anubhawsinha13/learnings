/**
 * 
 */
package com.a3.learnings.adjacencymatrix;

/**
 * @author asinha (https://github.com/anubhawsinha13)
 *
 */
public class Graph {
	
	private boolean adjMatrix[][];
	private int numVertices;
	
	public Graph(int numVertices) {
		this.numVertices = numVertices;
		adjMatrix = new boolean[numVertices][numVertices];
	}
	
	public void addEdge(int i, int j) {
		
		adjMatrix[i][j] = true;
		adjMatrix[j][i] = true;
		
	}
	
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		for(int i=0;i<numVertices;i++) {
			s.append(i + ": ");
			for(boolean j:adjMatrix[i]) {
				
				//if j is greater than i then 1 else 0
				s.append((j?1:0) + " ");
			}
			s.append("\n");
		}
		
		return s.toString();
	}
	
	
	public static void main(String args[]) {
		
		Graph g = new Graph(4);
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
 
        System.out.print(g.toString());
        
	}


}
