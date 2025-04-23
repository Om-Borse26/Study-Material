public class F08_clear_range_of_bits {
    
    public static int clear_bits_in_range_of(int n, int j, int i){
        int a = (~0) << j+1;
        int b = (1<<i) - 1;
        System.out.println(a + "\n" + b);
        int bitmask = a|b;

        return n & bitmask;
    }
    public static void main(String args[]){

        System.out.println(clear_bits_in_range_of(10,4,2));
    }
    
}