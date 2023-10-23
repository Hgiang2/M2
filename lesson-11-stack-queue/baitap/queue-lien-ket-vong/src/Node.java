public class Node {
    public Node link;
    public int data;

    public Node(int data) {
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }

    public Node(int data, Node link) {
        this.link = link;
        this.data = data;
    }
}
