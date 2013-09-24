package combinations;
import java.util.*;
public class Solution {
	public ArrayList<ArrayList<Integer>> combination(int n, int k){
		ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> com=new ArrayList<Integer>();
		getCombination(1,n,k,res,com);
		return res;
		
	}
	public void getCombination(int start,int n,int k,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> com){	
		if(com.size()==k){
			ArrayList<Integer> temp=new ArrayList<Integer>(com);
			res.add(temp);
			return;
		}
		if(start>n)
			return;
		com.add(start);
		getCombination(start+1,n,k,res,com);
		com.remove(com.remove(com.size()-1));
		getCombination(start+1,n,k,res,com);
		
			
	}
	public static void main(String [] args){
		Solution test=new Solution();
		ArrayList<ArrayList<Integer>> result=test.combination(4, 2);
		for(ArrayList<Integer> list: result){
			for(int x:list){
				System.out.print(x);
				
			}
			System.out.println();
		}
	}

}
