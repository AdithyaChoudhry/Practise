package Assignments;

public class ques6 {

    public static  int profitstock(int[] prices){
        int minprice = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
              minprice = Math.min(minprice,prices[i]);
              profit = Math.max(profit,(prices[i]-minprice));
        }
        return profit;
    }

    public static void main(String[] args){
        System.out.println(profitstock(new int[]{4,2,1,3,5,25 }));
    }
}
