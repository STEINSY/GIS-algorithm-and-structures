package se.kth.ag2411.mapalegra;

public class Arc {
		public String name;
		Node tail;
		Node head;
		double weight;
		
		public Arc(String name,Node head,Node tail,double weight) {
			this.name=name;
			this.head=head;
			this.tail=tail;
			this.weight=weight;
			
		}
}
