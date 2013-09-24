package subSet;
import java.util.*;
public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	Arrays.sort(S);
    	ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>> ();
    	ArrayList<Integer> set=new ArrayList<Integer>();
    	res.add(set); 
    	findSubSet(S,0,res,set);
    	return res;
    }
    public void findSubSet(int[] S,int current,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> set){
    	if(current==S.length)
    		return; 
    	findSubSet(S,current+1,res,set);
    	set.add(S[current]);
    	ArrayList<Integer> temp=new ArrayList<Integer>(set);
    	res.add(temp);
    	findSubSet(S,current+1,res,set);
    	set.remove(set.size()-1);
    }
    public ArrayList<ArrayList<Integer>> subset(int[] S) {
    	ArrayList<ArrayList<Integer>> subsets=new ArrayList<ArrayList<Integer>>();
    	Arrays.sort(S);
    	subsets.add(new ArrayList<Integer>());
    	for (int i = 0; i < S.length; i++) {
    	    int size = subsets.size();
    	    if(i>0&&S[i]==S[i-1]){
    	    	ArrayList<Integer> subset = new ArrayList<Integer>(subsets.get(size-1));
    	    	subset.add(S[i]);
    	    	subsets.add(subset);
    	    }
    	    else{
    	    for (int j = 0; j < size; j++) {
    		ArrayList<Integer> subset = new ArrayList<Integer>(subsets.get(j));
    		subset.add(S[i]);
    		subsets.add(subset);
    	    }
    	    }
    	}
    	return subsets;
    }
    public static void main(String[] args){
    	Solution test=new Solution();
    	int[] S={1,2,2};
    	ArrayList<ArrayList<Integer>>result=test.subset(S);
    	for(ArrayList<Integer> list:result){
    		for(int x:list){
    			System.out.print(x);
    		}
    		System.out.println();
    	}
    	int a=1;
    	String b="abc";
    	char c='a';
    	System.out.println(b.hashCode());
    	}
    
    

}
