
import java.util.*;

public class F01_2_climbing_stair {

    public static int ans_Recursion(int n) {

        //base case 
        if (n == 0) {
            return 1; //to be at ground there is one way

                }if (n < 0) {
            return 0; //to go down there is no way
        }
        return ans_Recursion(n - 1) + ans_Recursion(n - 2);
    }

    public static int ans_Recur_memomisation(int n, int dp[]) {

        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (dp[n] != -1) {      //already calculated
            return dp[n];
        }

        dp[n] = ans_Recur_memomisation(n - 1, dp) + ans_Recur_memomisation(n - 2, dp);

        return dp[n];
    }

    public static int climbing_stair_Tabulation(int n) {

        int dp[] = new int[n + 1];

        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = 1;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }

        return dp[n];
    }

    public static void main(String args[]) {
        int n = 5;

        //using normal recursion
        // System.out.println(ans_Recursion(n));
        //using memomisation
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        // System.out.println(ans_Recur_memomisation(n, dp));

        //using tabulation
        System.out.println(climbing_stair_Tabulation(n));
    }
}
