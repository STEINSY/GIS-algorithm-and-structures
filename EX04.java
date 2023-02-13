package se.kth.ag2411.mapalegra;

public class EX04 {
	public static void main(String[] args) {
		// argument 0 = inPutFileName, argument 1 = outPutFileName
		Network network = new Network("name",args[0]);
		network.printNodes();
		network.printArcs();
		network.save(args[1]);
	}
}
