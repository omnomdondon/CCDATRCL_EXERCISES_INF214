import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        Queue<String> klasmeyts = new LinkedList<>();

        // Enqueue 5 of your classmates in this section
        klasmeyts.add("Neil");
        klasmeyts.add("Lawrence");
        klasmeyts.add("Mariel");
        klasmeyts.add("Jane");
        klasmeyts.add("Jenina");

        System.out.println(klasmeyts);

        // Get the size of the queue
        System.out.println(klasmeyts.size());

        // Get the front of the queue
        System.out.println(klasmeyts.peek());

        // Dequeue 5 of your classmates
        klasmeyts.remove();
        klasmeyts.remove();
        klasmeyts.remove();
        klasmeyts.remove();
        klasmeyts.remove();

        // Enqueue another 5 of your classmates
        klasmeyts.add("Tristan");
        klasmeyts.add("Brandon");
        klasmeyts.add("Jap");
        klasmeyts.add("Mariel");
        klasmeyts.add("John");

        // Get the size of the queue
        System.out.println(klasmeyts.size());

        // Get the front of the queue
        System.out.println(klasmeyts.peek());
    }
}