package fibnacciNumber;
import java.io.*;
import java.util.*;
/*
Enter your code here. Read input from STDIN. Print output to STDOUT
Your class should be named Solution
*/
import java.io.*;
import java.util.*;
public class Solution {
   	public long[] smallestFib(long k){
		long[] res=new long[2];
		ArrayList<Long> Fib=new ArrayList<Long>();
		Fib.add(0L);
		Fib.add(1L);
		long max=(long)Math.pow(10, 18);
		long curFib=Fib.get(Fib.size()-2)+Fib.get(Fib.size()-1);		
		while(curFib<max){
			long factor;
			if(curFib<=k){
				 factor=gcd(k,curFib);
			}
			else {
				factor=gcd(curFib,k);
			}
		   if(factor>1){
					res[0]=curFib;
					res[1]=factor;
					return res;
				}
				else{
					Fib.add(curFib);
					curFib=Fib.get(Fib.size()-2)+Fib.get(Fib.size()-1);					
				}
					
			}
			return res;
		}
		
	
	public long gcd(long a,long b){
		if(b==0L){
			return a;
		}
		return gcd(b,a%b);
		
	}
   
   public static void main(String args[] ) throws Exception {
      
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        int testCase=Integer.parseInt(line);
	        for(int i=0;i<testCase;i++){
	        line=br.readLine();
	        long K=Long.parseLong(line);
		    Solution test=new Solution();
		    long[] result=test.smallestFib(K);
		    System.out.println(result[0]+" "+result[1]);
	        }
   }
}