package power;

public class Solution {
	   public double pow(double x, int n) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
		   if(n<0)
			   return 1.0/pow(x,-n);
		   if(n==0)
			   return 1;
		   if(x==0)
			   return 0;
		   if(n%2==0)
			   return pow(x,n/2)*pow(x,n/2);
		   else
			   return pow(x,n/2)*pow(x,n/2)*x;
	        
	    }
	   public double pow2(double x, int n) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
	        if(n==0) return 1.;
	        if(x==0) return 0.;
	        if(n<0){
	            n=-n;
	            x=1./x;
	        }
	        
	        double res=1.;
	        while(n>0){
	            //if(n%2 == 1) res*=x;
	            //x*=x;
	        	res *=x;
	            n--;
	        }
	        return res;
	    }
	   public static void main(String[] args){
		   Solution test=new Solution();
		   System.out.println(test.pow2(2.0, 3));
	   }

}
