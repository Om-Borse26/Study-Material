public class practice_backtracking {

    public static void permutations(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String temp = str.substring(0,i) + str.substring(i+1);

            permutations(temp, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        permutations(str, "");
    }
}
