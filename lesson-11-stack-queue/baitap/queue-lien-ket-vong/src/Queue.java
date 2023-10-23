public class Queue {
    private int capacity;
    private int queueArr[];

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }
}
