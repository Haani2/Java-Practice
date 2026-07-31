package Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        Queue queue= new Queue();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.remove();
        queue.display();

    }
}
