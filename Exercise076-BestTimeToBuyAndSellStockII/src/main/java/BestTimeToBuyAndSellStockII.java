public class BestTimeToBuyAndSellStockII {

	  public static int maxProfit(int[] prices) {
	        int day=prices.length;
	        int maxprofit=0;
	        int[] profit=new int[day-1];
	        for(int i=0;i<day-2;i++){
	        	profit[i]=prices[i+1]-prices[i];
	        	if(profit[i]>0){
	        		maxprofit+=profit[i];
	        	}
	        }
		  return maxprofit;
	    
	  }

}