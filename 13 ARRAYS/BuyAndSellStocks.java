import java.util.Scanner;
public class BuyAndSellStocks{
    public static int buyAndSellStock(int price[]) {
        int maxProf = 0;
        int buyStocks = Integer.MAX_VALUE;
    
        for (int i = 0; i < price.length; i++) {
            int sellStocks = price[i];
            
            if (sellStocks > buyStocks) {
                int profit = sellStocks - buyStocks; // Calculate today's profit
                maxProf = Math.max(maxProf, profit); // Update max profit
            } else {
                buyStocks = sellStocks; // Update buyStocks if today's price is lower
            }
        }
        
        return maxProf;
    }
    public static void main(String[]args){
    int spri[]={7,1,4,3,6,2};
    System.out.println("Max Profit = "+buyAndSellStock(spri));
    }
}