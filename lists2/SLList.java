/**
 * An SLList is a list of integers, which hides the terrible truth
 * of the nakedness within.
 */
public class SLList {
	/*
      make it private since we don't want other users to use it
      mark it static since this class doesn't use anything from SLList
     */
	private static class IntNode {
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n) {
			item = i;
			next = n;
		}
	}

	/* The first item (if it exists) is at sentinel.next. */
	private IntNode sentinel;
	private int size;

	private static void lectureQuestion() {
		SLList L = new SLList();
		IntNode n = new IntNode(5, null);
	}

	/**
	 * Creates an empty SLList.
	 */
	public SLList() {
		sentinel = new IntNode(63, null);
		size = 0;
	}


	/* a class can have multiple constructors */
	public SLList(int x) {
		sentinel = new IntNode(63, null);
		sentinel.next = new IntNode(x, null);
		size = 1;
	}

	/**
	 * Adds x to the front of the list.
	 */
	public void addFirst(int x) {
		// should ever reassign sentinel
		sentinel.next = new IntNode(x, sentinel.next);
		size = size + 1;
	}

	/**
	 * Returns the first item in the list.
	 */
	public int getFirst() {
		return sentinel.next.item;
	}

	/**
	 * Adds x to the end of the list.
	 */
	public void addLast(int x) {
		IntNode cur = sentinel;
		// move cur until it reaches the end
		while (cur.next != null) {
			cur = cur.next;
		}
		cur.next = new IntNode(x, null);
		size = size + 1;
	}


	/**
	 * Returns the size of the list.
	 */
	public int size() {
		return size;
	}

	public String toString() {
		StringBuilder string = new StringBuilder();
		IntNode cur = sentinel;
		while (cur != null) {
			string.append(" ");
			string.append(cur.item);
			cur = cur.next;
		}
		return string.toString();
	}


	public static void main(String[] args) {
		/* Creates a list of one integer, namely 10 */
		SLList L = new SLList();
		L.addLast(20);
		System.out.println(L);
		System.out.println(L.size());
	}
}