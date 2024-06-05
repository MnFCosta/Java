package mfc.datastructures;
import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<String>();

//      Queues is an interface that extends Collections, and thus inherits its methods
//      Checks if queue is empty
        System.out.println(queue.isEmpty());


        queue.offer("Manoer");
        queue.offer("Predo");
        queue.offer("Samuca");
        queue.offer("Michas");
        queue.offer("Alecas");

        System.out.println(queue.isEmpty());
//      Checks the size of a queue
        System.out.println(queue.size());
//
        System.out.println(queue.contains("Manoer"));

        System.out.println(queue);

//      Prints first queue object
        System.out.println(queue.peek());

//      Removes first object
        queue.poll();

        System.out.println(queue);

        //Uses for queues
        // 1.Keyboard Buffer (letters should appear on the screen in the order they are pressed)
        // 2.Printer Queue (Print jobs should be completed in order)
        // 3.Used in LinkedLists, PriorityQueues, Breadth-first search;

    }
}
