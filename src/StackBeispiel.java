import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class StackBeispiel {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        while (! stack.isEmpty()){
            System.out.print("stack zeiger: " + stack.size() + " stack Inhalt: ");
            System.out.println(stack.pop());
        }

        System.out.println(); // Zeileumbruch

        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        while(! queue.isEmpty()){
            System.out.print(" queuq Größe: " + queue.size()+ " queue Inhalt: ");
            System.out.println(queue.poll());
        }


    }
}
