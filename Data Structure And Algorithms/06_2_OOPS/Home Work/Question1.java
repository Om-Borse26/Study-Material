import java.util.*;
public class Question1{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter both values of first no.");
        
        int a1  = sc.nextInt();
        float a2 = sc.nextFloat();

        System.out.println("Enter both values of second no.");
        int b1 = sc.nextInt();
        float b2 = sc.nextFloat();

        
        Complex c1 = new Complex();
        System.out.println(c1.sum(a1, a2, b1, b2));
        System.out.println(c1.pro(a1, a2));
        System.out.println(c1.pro(b1, b2));
        System.out.println(c1.diff(a1, a2));
        System.out.println(c1.diff(b1, b2));
        System.out.println((int) c1.divide(a1, a2));
    }
}

class Complex{
    float sum(int a, float b,int c,float d){

        float sum = ((float)a + b)+((float)c + d);
        return sum;
    }

    float pro(int a, float b){

        float pro = (float) a *b;
        return pro;
    }

    float diff(int a, float b){
        float diff = (float) a-b;
        return diff;
    }

    float divide(int a,float b){
        float div = (float) a/b;
        return div;
    }
}