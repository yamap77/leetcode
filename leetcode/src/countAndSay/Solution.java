package countAndSay;
import java.util.*;
public class Solution {
	   public String countAndSay(int n) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
		   StringBuilder res=new StringBuilder();

		   int div=1;
		   while(n/div>=10){
			   div *=10;
		   }
		   int curNo=n/div;
		   int curCount=1;	   
		   n %=div;
		   div /=10;
		  while(n>0){
			  if(n/div!=curNo){
				  res.append(Integer.toString(curCount));
				  res.append(Integer.toString(curNo));
				  curNo=n/div;
				  curCount=1;
			  }
			  else{
				  curCount++;
			  }
			  n %=div;
			  div /=10;
		  }
		  res.append(Integer.toString(curCount));
		  res.append(Integer.toString(curNo));
		  return new String(res);
	        
	    }
	   public static void main(String [] args){
		   Solution test=new Solution();
		   System.out.println(test.countAndSay(111222233));
	   }

}
