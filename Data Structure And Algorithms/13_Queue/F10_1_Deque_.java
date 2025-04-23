import java.util.*;
public class F10_1_Deque_ {
    
  
    public static void main(String args[]){
        Deque<Integer> d = new F01_LinkedList<>();

        d.addFirst(1);
        d.addLast(2);
        d.addFirst(3);
        d.addLast(4);
        
        System.out.println(d);

        d.removeLast();
        
        System.out.println(d);

        d.removeFirst();

        System.out.println(d);

        

    }
}
