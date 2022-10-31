public class Graph {
	
	// inner class
	// to keep track of edges
	class Edge {
		String src, dest;
	}
	
	// number of vertices and edges
	int vertices, edges;
	
	// array to store all edges
	Edge[] edge;
	
	Graph(int vertices, int edges) {
		this.vertices = vertices;
		this.edges = edges;
		
		// initialize the edge array
		edge = new Edge[edges];
		for (int i = 0; i < edges; i++) {
			
			// each element of the edge array
			// is an object of Edge type
			edge[i] = new Edge();
		}
	}
	
	public static void main(String[] args) {
		
		// create an object of Graph class
		int noVertices = 10;
		int noEdges = 13;
		Graph myGraph = new Graph(noVertices, noEdges);
		
		// create graph
		
		// Edge 1
		myGraph.edge[0].src = "Brandon";
		myGraph.edge[0].dest = "Maria Isabelle";
		
		// Edge 2 
		myGraph.edge[1].src = "Brandon";
		myGraph.edge[1].dest = "JM";
		
		// Edge 3 
		myGraph.edge[2].src = "Maria Isabelle";
		myGraph.edge[2].dest = "JM";
		
		// Edge 4
		myGraph.edge[3].src = "JM";
		myGraph.edge[3].dest = "Hanst";
		
		// Edge 5
		myGraph.edge[4].src = "JM";
		myGraph.edge[4].dest = "Maine";
		
		// Edge 6
		myGraph.edge[5].src = "Hanst";
		myGraph.edge[5].dest = "Maine";
		
		// Edge 7
		myGraph.edge[6].src = "Hanst";
		myGraph.edge[6].dest = "Vlad";
		
		// Edge 8
		myGraph.edge[7].src = "Maine";
		myGraph.edge[7].dest = "Vlad";
		
		// Edge 9
		myGraph.edge[8].src = "Maine";
		myGraph.edge[8].dest = "Sarah Jean";
		
		// Edge 10
		myGraph.edge[9].src = "Vlad";
		myGraph.edge[9].dest = "Jayvee";
		
		// Edge 11
		myGraph.edge[10].src = "Jayvee";
		myGraph.edge[10].dest = "Sarah Jean";
		
		// Edge 12
		myGraph.edge[11].src = "Sarah Jean";
		myGraph.edge[11].dest = "Roswell";
		
		// Edge 13
		myGraph.edge[12].src = "Roswell";
		myGraph.edge[12].dest = "Crissalyn";
		
		// print graph
		for (int i = 0; i < noEdges; i++) {
			System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
		}
	}
}
