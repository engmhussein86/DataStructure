import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DS_Queue {
    public static void main(String[] args){
        //Queue- FIFO - Line of People - first come first served - linear data structure
        // add = enqueue, offer()
        //remove = dequeue, poll()
        // Queue interface not class
        Queue<String> queue = new LinkedList<>();// Queue extends Collection , linkedList implements Queue

        queue.offer("Mariam");
        queue.offer("Loai");
        queue.offer("Arwa");
        queue.offer("Aya");

        System.out.println("isEmpty: "+queue.isEmpty()); // isEmpty from Collection
        System.out.println("size: "+queue.size()); // size from Collection
        System.out.println("contains: "+queue.contains("Arwa")); // contains from Collection

        System.out.println("peek: "+ queue.peek());// Mariam
        System.out.println("queue: "+ queue);

        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();//empty
        queue.poll();// doesn't throw exception - poll, offer, peek don't throw exception
//        queue.element();// throw exception

        System.out.println("queue: "+ queue);

        //Where queue is used?? hold element before processing
        // 1- keyboard buffer (letters should appear in order they are pressed)
        // 2- Printer Queue
        // 3- Used in LinkedList, ProirtyQueue, Breadth-first search




    }
}
