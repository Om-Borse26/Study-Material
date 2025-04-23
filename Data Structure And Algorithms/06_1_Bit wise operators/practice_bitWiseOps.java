public class practice_bitWiseOps {

    public static void even_odd(int n){
        int bitmask = 1;
        if((bitmask & n) == 0){
            System.out.println("Number is even");
        } else{
            System.out.println("Number is odd");
        }
    }

    public static int get_i_th_bit(int n, int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }

    public static void main(String[] args) {
        // even_odd(5);
        // even_odd(6);

        System.out.println(get_i_th_bit(10, 2));
        
    }
}
