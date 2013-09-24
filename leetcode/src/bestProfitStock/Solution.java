package bestProfitStock;
import java.util.*;
public class Solution {
	//one time
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	if(prices==null||prices.length==0) return 0;
    	 int minPrice=prices[0];
    	 int maxProfit=0;
    	 for(int i=1;i<prices.length;i++){
    		 if(minPrice>prices[i]){
    			 minPrice=prices[i];
    		 }
    		 maxProfit=Math.max(maxProfit, prices[i]-minPrice);
    	 }
    	 return maxProfit;
        
    }
    //multiple times
    public int maxProfit2(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	int maxProfit=0;
    	for(int i=0;i<prices.length-1;i++){
    		if(prices[i+1]-prices[i]>0){
    			maxProfit +=prices[i+1]-prices[i];
    		}

    		
    	}
    	return maxProfit;
        
    }
    public int maxProfit3(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	
    }
    
    

}
