public class F07_clear_last_i_bits {

    public static int clear_last_i_bits(int n, int i){
        
        int bitmask = ~(0)<<i;
        
        return n & bitmask;
    }
    public static void main(String args []){

        System.out.println(clear_last_i_bits(15,2));
        
    }
    
}
