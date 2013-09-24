package primeFactoring;
import java.util.*;
public class Solution {
	public ArrayList<Integer> primeFactoring(int n){
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for(int i=2;i<=n;i++){
			while(n%i==0){
				factors.add(i);
				n /=i;
			}
		}
		return factors;
	}
	public static void main(String []args){
		Solution test=new Solution();
		ArrayList<Integer> res=test.primeFactoring(120932);
		System.out.println(res);
	}

}
