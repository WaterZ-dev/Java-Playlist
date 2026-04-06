public class DoublyLinkedList {
	int size = 0;
	Node head, tail;

	public DoublyLinkedList() {
		this.head = this.tail = null;
	}

	public void addFirst(int num) {
		Node node = new Node(num);
		if (head == null) {
			head = tail = node;
		} else {
			node.next = head;
			head.prev = node;
			head = node;
		}
		size++;
	}

	public void addLast(int num) {
		Node node = new Node(num);
		if (tail == null) {
			head = tail = node;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
		size++;
	}

	public void add(int index, int num) {
		Node temp = new Node(num);
		if (index == 1) {
			addFirst(num);
		} else {
			Node node = head;
			for (int i = 1; i < index; i++) {
				if (node != null)
					node = node.next;
			}
			if (node == null) {
				addLast(num);
			} else {
				temp.next = node;
				temp.prev = node.prev;
				node.prev.next = temp;
				node.prev = temp;
			}
		}
		size++;
	}

	public void deleteFirst() {
		if (head == null)
			return;
		if (head == tail) {
			head = tail = null;
			return;
		}
		Node node = head;
		head = head.next;
		head.prev = node.next = null;
		size--;
	}

	public void deleteLast() {
		if (tail == null)
			return;
		if (tail == head) {
			tail = head = null;
			return;
		}
		Node node = tail;
		tail = tail.prev;
		tail.next = node.prev = null;
		size--;
	}

	public void delete(int index) {
		Node node = head;
		if (index == 1) {
			deleteFirst();
			return;
		}
		for (int i = 1; i <= index; i++) {
			if (node != null)
				node = node.next;
		}
		if (node == null)
			return;
		if (node == tail) {
			deleteLast();
			return;
		}
	}

	public String toString() {
		String str = "";
		Node node = head;
		while (node != null) {
			str += node.key;
			if (node.next != null) {
				str += " | ";
			}
			node = node.next;
		}
		return str;
	}

	public int size() {
		int i = 0;
		for (Node node = head; node != null; node = node.next)
			i++;
		return i;

	}

	public int get(int index) {
		Node node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node.key;
	}
}