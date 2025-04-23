public class F09_Rainwater_Trapping {

    public static int trappedRainWater(int bars[] ){
        int n = bars.length;
        //Calculate left max boundry 
        int leftMax[] = new int[n];
        leftMax [0] = bars [0];
        
        for(int i = 1; i< n; i++){
            leftMax [i] = Math.max(bars[i],leftMax[i-1]); 
            
        }

        System.out.print("LeftMax Array: ");
        for (int i = 0; i < leftMax.length; i++) {
            System.out.print(leftMax[i] + " ");
        }
        
        //calculate right max bondry
        int rightMax[] = new int[n];
        rightMax[n-1] = bars[n-1];
        
        for(int i = n-2; i>=0 ; i--){
            rightMax [i] = Math.max(bars[i],rightMax[i+1]);
        }
        
        System.out.print("\nRightMax Array: ");
        for (int i = 0; i < rightMax.length; i++) {
            System.out.print(rightMax[i] + " ");
        }

        
        
        int trappedWater = 0;
        //loop
        for(int i=0; i<n;i++){
            //calculate min(left,right) = water level
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            //trapped water  = water level - height
        
            trappedWater += waterLevel - bars[i];
            System.out.println(trappedWater);
        }
        
        return trappedWater;
    }



    public static void main(String args[]){

        int bars[] ={4,2,0,6,3,2,5};
        
        
        System.out.println("\nAmount Of Trapped Water = " + trappedRainWater(bars));


    }
    
}
