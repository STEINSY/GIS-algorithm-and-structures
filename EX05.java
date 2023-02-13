package se.kth.ag2411.mapalegra;

public class EX05 {

	public static void main(String[] args) {
		
		Network testnetwork =new Network("test",args[0]);
		System.out.println("\nparameters of input"+args.length);
		if(args.length<3) {
			System.out.println("Too few arguments");
		}
		else if(args.length==3){
			Node startNode = testnetwork.nodeMap.get(args[2]);
			testnetwork.dijkstra(startNode);
		}
		else if(args.length==4) {
			Node startNode = testnetwork.nodeMap.get(args[2]);
			Node endNode = testnetwork.nodeMap.get(args[3]);
			
			testnetwork.dijkstra(startNode,endNode);
			
		}
			testnetwork.printNodes();
			System.out.println();
			testnetwork.printArcs();
			testnetwork.save(args[1]);
	}
}
