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
	void resetVisited()
	{
		for(i=0;i<v;i++)
			visited[i]=0;
	}
    public void DFS(int source)
	{
		visited[source]=1;
		System.out.print("V"+source+" ");
		for(i=0;i<v;i++)
		{
			if(g[source][i]==1 && visited[i]!=1)
			{
				DFS(i);
			}
		}
	}
	void BFS(int source)
	{
		int q[]=new int[v];
		int front=0,rear=-1;
		visited[source]=1;
		q[++rear]=source;
		while(front<=rear)
		{
			int element=q[front++];
			System.out.print("V"+element+" ");
			for(i=0;i<v;i++)
			{
				if(g[element][i]==1 && visited[i]!=1)
				{
					visited[i]=1;
					q[++rear]=i;    
				}
			}
		}
	}
	public static void main(String[] args) {
		
		Graph obj=new Graph();
		obj.creategraph();
		obj.printgraph();
		System.out.println("DFS");
		obj.resetVisited();
		obj.DFS(0);
		}
}
