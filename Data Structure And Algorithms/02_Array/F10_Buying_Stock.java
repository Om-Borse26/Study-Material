public class F10_Buying_Stock {

    public static int BuyAndSellStock(int prices []){

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i<prices.length; i++ ){

            if(buyPrice<prices[i]){ //profit
               int profit = prices[i]-buyPrice;
               System.out.println("Profit at " + i + " = "+ profit);
               
               maxProfit = Math.max(maxProfit, profit);
               System.out.println("MaxProfit till now at "+ i + " = "+ maxProfit);
               
            }else{
                buyPrice = prices[i];
                System.out.println("Current Buyprice at " + i + " = "+ buyPrice);
            }

        }
        return maxProfit;
    }


    public static void main(String args[]){
        
        int prices[] = {7, 1, 5, 3, 6, 4};



        System.out.print(BuyAndSellStock(prices));

    }
    
}
