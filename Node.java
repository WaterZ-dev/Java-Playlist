public class Node {
	int key;
	Node next, prev;

	public Node(int key) {
		this.key = key;
		this.prev = this.next = null;
	}
}