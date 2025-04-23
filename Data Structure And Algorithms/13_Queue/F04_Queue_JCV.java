import java.util.*;
public class F04_Queue_JCV {

    public static void main(String args[]){
        Queue <Integer> q = new F01_LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q.peek());

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        System.out.print(q.isEmpty());

    

    }
    
}
