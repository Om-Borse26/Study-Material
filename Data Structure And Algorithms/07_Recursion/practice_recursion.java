public class practice_recursion{

    public static void printBinString(int n, String str, int lastPlace){
        if(n==0){
            System.out.println(str);
            return;
        }


        printBinString(n-1, str+'0', 0);

        if(lastPlace==0){
            printBinString(n-1, str+'1', 1);
        }
    }
    public static void main(String[] args) {
        
        printBinString(3, "", 0);
    }
}