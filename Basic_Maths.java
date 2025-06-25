class Basic_Maths{

    public static int count_digits(int n){
        int count = 0;
        int reverse = 0;
        while (n>0) {
            int last_digit = n%10;
            reverse = reverse*10+last_digit;
            System.out.print(last_digit + " ");
            n = n/10;
            count++;
        }
        System.out.println();
        System.out.println(reverse);
        return count;
    }

    public static boolean isPalindrome(int n){
        int n1 = n;
        int reverse = 0;
        while(n>0){
            int last_digit = n%10;
            reverse = reverse*10+last_digit;
        }
        if(reverse == n1){
            return true;
        }
        else{
            return false;
        }
    }

    public static void  isArmstrong(int n){
        int n1 = n;
        double ans = 0;
        int count = (int)Math.log10(n)+1;
        while(n>0){
            int last_digit = n%10;
            ans = ans + Math.pow(last_digit, count);
            n = n/10;
        }
        if(ans == n1){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }
    }

    public static void print_Divisors(int n){
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean  check_prime(int n){
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }    
    
    public static void GCD(int n1,int n2){
        int[] divisors1 = new int[n1];
        int count1 = 0;
        for (int i = 1; i <= n1; i++) {
            if(n1 % i == 0){
                divisors1[count1] = i;
                count1++;
            }
        }
        
        int[] divisors2 = new int[n2];
        int count2 = 0;
        for (int i = 1; i <= n2; i++) {
            if(n2 % i == 0){
                divisors2[count2] = i;
                count2++;
            }
        }
        
        int gcd = 1;
        for (int i = 0; i < count1; i++) {
            for (int j = 0; j < count2; j++) {
                if(divisors1[i] == divisors2[j] && divisors1[i] > gcd){
                    gcd = divisors1[i];
                }
            }
        }
        
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    } 

    public static int Gcd_simple(int a,int b){
        if(b==0){
            return a;
        }
        return Gcd_simple(a, a%b);
    }
    public static void main(String[] args) {
        // System.out.println(count_digits(77877));
        // isArmstrong(1634);
        // print_Divisors(34);
        // if(check_prime(17)){
        //     System.out.println("Number is Prime");
        // }
        // else{
        //     System.out.println("Number is not Prime");
        // }

        // GCD(12, 18);
        // System.out.println(Gcd_simple(9, 12));

        
    }
} 