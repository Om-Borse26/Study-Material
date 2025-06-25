

public class Reccursion {

    public static void printLinear(int n){

        if(n==0){
            return;
        }
        printLinear(n-1);
        System.out.print(n + " ");
    }

    public static void printLinearReverse(int n){

        if(n==0){
            return;
        }
        System.out.print(n + " ");
        printLinearReverse(n-1);
    }

    public static int first_n_sum(int n){
        if(n==0){
            return 0;
        }
        return  n+first_n_sum(n-1);
    }

    public static int fibonnaci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fib1 = fibonnaci(n-1);
        int fib2 = fibonnaci(n-2);
        int result = fib1 + fib2;
        return result;
    }

    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fibonnaci(n-1);
    }

    public static void reverseArray(int[] arr,int index,int lastIndex){

        if(index>lastIndex){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            return;
        }

        int temp = arr[index];
        arr[index] = arr[lastIndex];
        arr[lastIndex] = temp;
    
        index++;
        lastIndex--;

        reverseArray(arr,index,lastIndex);

    }    
    
    public static boolean isPalindrome(String str,int index, int lastindex){

        if(index >= lastindex){
            return true;
        }
        
        if(str.charAt(index) == str.charAt(lastindex)){
            return isPalindrome(str, index+1, lastindex-1);
        }
        else{
            return false;
        }
    }

    public static void countFreq(int[] arr){

        int count[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        for (int i = 0; i < count.length; i++) {
            if(count[i] == 0){}
            else{
                System.out.println(i + " frequency = " + count[i]);
            }
        }
    }    
    
    public static void charHash(String str){
        str = str.toLowerCase();
        int count[] = new int[26];  
        char ch[] = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            count[ch[i] - 'a']++;  
            }

        for (int i = 0; i < count.length; i++) {
            if(count[i] != 0){
                char character = (char)('a' + i);  
                System.out.println(character + " frequency is = " + count[i]);
            }
        }
    }

    public static void main(String[] args) {
        // printLinear(10);
        // System.out.println();
        // printLinearReverse(10);

        // System.out.println(first_n_sum(5));
        // System.out.println(fibonnaci(5));
        // System.out.println(factorial(5));

        // int arr[] = {1,2,3,4,5};
        // reverseArray(arr,0,arr.length-1);

        // String str = "RACECAR";
        // if(isPalindrome(str, 0, str.length()-1)){
        //     System.out.println("Given String is Palindrome :)");
        // }
        // else{
        //     System.out.println("Given string is Not a Palindrome :(");
        // }

        // int arr[] = {1,2,1,3,2,9,7,1};
        // countFreq(arr);

        String str = "jesbsfioneinginqingtAwnunguinuihng";
        charHash(str);
    }
}
