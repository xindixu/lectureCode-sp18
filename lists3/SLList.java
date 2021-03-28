 /** An SLList is a list of integers, which hides the terrible truth
   * of the nakedness within. */
public class SLList<CustomType> {
	private class StuffNode {
		public CustomType item;
		public StuffNode next;

		public StuffNode(CustomType i, StuffNode n) {
			item = i;
			next = n;
		}
	} 

	private StuffNode first;
	private int size;

	public SLList(CustomType x) {
		first = new StuffNode(x, null);
		size = 1;
	}

 	/** Adds x to the front of the list. */
 	public void addFirst(CustomType x) {
 		first = new StuffNode(x, first);
 		size += 1;
 	}

 	/** Returns the first item in the list. */
 	public CustomType getFirst() {
 		return first.item; 		
 	}

 	/** Adds an item to the end of the list. */
 	public void addLast(CustomType x) {
 		size += 1;

 		StuffNode p = first;

 		/* Move p until it reaches the end of the list. */
 		while (p.next != null) {
 			p = p.next;
 		}

 		p.next = new StuffNode(x, null);
 	}

 	public int size() {
 		return size;
 	}
}