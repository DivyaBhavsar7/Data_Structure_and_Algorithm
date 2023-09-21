package practise_tree_graph;

import java.util.Scanner;

public class Graph {

	private int g[][],visited[],i,j,v;
	Scanner in=new Scanner(System.in);
	void creategraph()
	{
		System.out.println("Enter the number of vertices");
		v=in.nextInt();
		g=new int[v][v];
		visited=new int[v];
		for(i=0;i<v;i++)
		{
			for(j=0;j<v;j++)
			{
				System.out.println("Enter the value for v"+i+" v"+j);
				g[i][j]=in.nextInt();
			}
		}
	}
	void printgraph()
	{
		for(i=0;i<v;i++)
		{
			for(j=0;j<v;j++)
				System.out.print(g[i][j]+"\t");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		Graph obj=new Graph();
		obj.creategraph();
		obj.printgraph();
			}
}
