
import java.util.*;

public class F05_reverse_String {

    public static String reverse(String s) {

        int iterator = 0;

        Stack<Character> list = new Stack<>();
        //converting string to a Stack
        while (iterator < s.length()) {
            list.push(s.charAt(iterator));
            iterator++;
        }

        //StringBuilder to store resultant string
        StringBuilder sb = new StringBuilder();

        while (!list.isEmpty()) {
            char curr = list.pop();
            sb.append(curr);
        }

        return sb.toString();

    }

    public static void main(String args[]) {

        String s = "abc";

        String result = reverse(s);
        System.out.println(result);
    }

}
