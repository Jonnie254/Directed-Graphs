package graphs;

import java.util.ArrayList;

public class Vertex {
	private String Data;
	private ArrayList<Edge>edges;
	public Vertex(String inputdata) {
		this.Data=inputdata;
		this.edges = new ArrayList<Edge>();
	}
	public void addEdge(Vertex endVertex, Integer weight) {
		
	}

}
