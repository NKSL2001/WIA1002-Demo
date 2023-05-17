package w8;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q1{
    public static void main(String[] args) {
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();
        int[] arr = {4, 8, 1, 2, 9, 6, 3, 7};

        for(int i: arr){
            pqueue.add(i);
        }

        System.out.println(pqueue.toString());
        System.out.printf("Poll: %d\n", pqueue.poll());
        pqueue.add(5);

        System.out.println("To array:");
        Object[] temp_arr = pqueue.toArray();
        for(int i=0; i < temp_arr.length; i++){
            System.out.print(temp_arr[i]);
            System.out.print(" ");
        }
        System.out.println();

        System.out.printf("Peek: %d\n", pqueue.peek());
        System.out.printf("Contains 1?: %b\n", pqueue.contains(1));
        System.out.printf("Queue size: %d\n", pqueue.size());
        while(!pqueue.isEmpty()){
            System.out.print(pqueue.poll());
            System.out.print(" ");
        }

        System.out.println("\nReverse order:");
        PriorityQueue<Integer> pqueue2 = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: arr){
            pqueue2.add(i);
        }
        while(!pqueue2.isEmpty()){
            System.out.print(pqueue2.poll());
            System.out.print(" ");
        }
    }
}