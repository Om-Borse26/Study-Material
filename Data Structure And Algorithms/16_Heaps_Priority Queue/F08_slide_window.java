import java.util.*;
public class F08_slide_window{

    static class Pair implements Comparable<Pair>{
        int val;
        int idx;

        public Pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }
        @Override
        public int compareTo(Pair p2){
            //for accending 
            //return this.val - p2.val;

            //for decendint
            return p2.val - this.val;
        }

    }
    public static void main(String args[]){
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3; // window size
        int res[] = new int[arr.length-k+1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        //first window
        for(int i=0; i<k; i++){
            pq.add(new Pair(arr[i],i));
        }
        //adding the first number
        res[0] = pq.peek().val;

        for(int i = k; i<arr.length; i++){
            while(pq.size()>0 && pq.peek().val <= (i-k)){
                pq.remove();
            }

            pq.add(new Pair(arr[i],i));
            res[i-k+1] = pq.peek().val;
        }

        //print results
        for(int i =0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }

    }
}