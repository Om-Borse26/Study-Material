import java.util.ArrayList;

public class Practice_ArrayList {


    public static int water(ArrayList<Integer> bar){
        int left = 0;
        int right = bar.size()-1;
        int maxWater = 0;

        while(left<right){
            int height = Math.min(bar.get(left), bar.get(right));
            int water = height*(right-left);

            if(bar.get(left) < bar.get(right)){
                left++;
            }
            else{
                right--;
            }

            maxWater = Math.max(water, maxWater);
        }

        return maxWater;

    }


    public static void main(String[] args) {

        ArrayList <Integer> bars = new ArrayList<>();

        bars.add(1);
        bars.add(8);
        bars.add(6);
        bars.add(2);
        bars.add(5);
        bars.add(4);
        bars.add(8);
        bars.add(3);
        bars.add(7);


        System.out.println(water(bars));
        
    }
}
