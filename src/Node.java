// Where the doubly linked list uses a song object and points to the next song
// and the previous song

public class Node {
    int key;
    Node next, prev;

    public Node(int key) {
        this.key = key;
        this.prev = this.next = null;
    }
}