package se.kth.ag2411.mapalegra;

import java.util.LinkedList;


public class Node {
	public String name;
	public double value;
	public LinkedList<Arc> outArcs;
	public Node prevNode;
	public Arc prevArc;
	
	public Node(String name) {
		this.name =name;
		value = Double.POSITIVE_INFINITY;
		outArcs=new LinkedList<Arc>();
		prevNode=null;
		prevArc=null;
	}
	

}
