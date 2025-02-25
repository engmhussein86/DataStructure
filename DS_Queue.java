import java.util.*;

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
///////////////////////////////////////////////////////////////////////////////
        /* Priority queue - serves elements with highest priority to lowest priority*/
//        Queue<Double>pDoubleQueue = new PriorityQueue<Double>();//asc
        Queue<Double>pDoubleQueue = new PriorityQueue<Double>(Collections.reverseOrder());//desc
        pDoubleQueue.offer(5.5);
        pDoubleQueue.offer(3.5);
        pDoubleQueue.offer(2.0);
        pDoubleQueue.offer(1.5);

        // start from smallest to highest (asc)
        // if add reverse in constructor, arrange from high to small (desc)
        System.out.println("pDoubleQueue : "+pDoubleQueue);
        while(!pDoubleQueue.isEmpty()){
            System.out.println(pDoubleQueue.poll());
        }



/////////////////////////////////////////////////////////////////////////////////////
        //Where queue is used?? hold element before processing
        // 1- keyboard buffer (letters should appear in order they are pressed)
        // 2- Printer Queue
        // 3- Used in LinkedList, ProirtyQueue, Breadth-first search




    }
}
