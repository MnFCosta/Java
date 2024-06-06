package mfc.datastructures;
import java.sql.SQLOutput;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;

public class PriorityQueues {
    public static void main(String[] args){
        Queue<Double> doubleQueue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<String> stringQueue = new PriorityQueue<>();

        doubleQueue.offer(3.0);
        doubleQueue.offer(2.0);
        doubleQueue.offer(4.0);
        doubleQueue.offer(1.0);
        doubleQueue.offer(1.5);

        stringQueue.offer("B");
        stringQueue.offer("C");
        stringQueue.offer("A");
        stringQueue.offer("D");

        while(!doubleQueue.isEmpty()){
            System.out.println(doubleQueue.poll());
        }

        while(!stringQueue.isEmpty()){
            System.out.println(stringQueue.poll());
        }

    }
}
