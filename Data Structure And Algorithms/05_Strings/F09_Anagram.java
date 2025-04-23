
import java.util.Arrays;

public class F09_Anagram {

    public static void isAnagram(String str1, String str2){
        //check their lengths
        if(str1.length() == str2.length()){
            // convert to lower cases
            String low1 = str1.toLowerCase();
            String low2 = str2.toLowerCase();
            
            //convert to character array and 
            char sort1[] = low1.toCharArray();
            char sort2[] = low2.toCharArray();
            
            // sort 
            Arrays.sort(sort1);
            Arrays.sort(sort2);

            // compare by equals
            if(Arrays.equals(sort1,sort2)){
                System.out.println("Strings are Anagram !!");
            }

        } else{
            System.out.println("Lengths are not equal :(");
            System.out.println("Strings are not Anagram :(");
        }
    }


    public static void main(String[] args) {
        String str1 = "Earth";
        String str2 = "Heart";

        isAnagram(str1, str2);
    }
}
