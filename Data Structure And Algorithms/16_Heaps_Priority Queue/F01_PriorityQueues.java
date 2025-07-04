import java.util.PriorityQueue;

public class F01_PriorityQueues {

    public static void main(String args[]){

        PriorityQueue <Integer> pq = new PriorityQueue<>();

        // PriorityQueue <Integer> pq_reverse = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(3);
        pq.add(7);
        pq.add(4);
        pq.add(1);

        /*when the PriorityQueue is of integers the first priority is give to 
         smallest number as the accending order so when we remove the element
         they come in accending order */

         while(!pq.isEmpty()){
            System.out.print(pq.peek()+" ");
            pq.remove();
         }

    }
    
}
