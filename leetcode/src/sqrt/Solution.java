package sqrt;

public class Solution {
	   public int sqrt(int x) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
		   int start=0;
		   int end=x;
		   while(start<=end){
			   int mid=(start+end)/2;
			   if(mid>Math.sqrt(Integer.MAX_VALUE)){
				   end=mid-1;
				   continue;
			   }				   
			   if(mid*mid<x){
				   start=mid+1;
			   }
			   else if(mid*mid==x)
				   return mid;
			   else{
				   end=mid-1;
			   }
		   }
		   return (start+end)/2;

	        
	    }
	   public static void main(String[] args){
		   Solution test=new Solution();
		   double x=(double)Integer.MAX_VALUE;
		   System.out.println(test.sqrt(Integer.MAX_VALUE)+" "+Math.sqrt(Integer.MAX_VALUE));
		
		   }
	   }
	   


