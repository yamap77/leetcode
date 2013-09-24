package permutation;
import java.util.*;

public class Solution {
	public ArrayList<String> stringPermutation(String s){
		ArrayList<String> permutation=new ArrayList<String>();
		if(s==null)
			return null;
		if(s.length()==0){
			permutation.add("");
		return permutation;
		}
		char first=s.charAt(0);
		String remaider=s.substring(1);
		ArrayList<String> words=stringPermutation(remaider);
		for(String word:words){
			for(int i=0;i<=word.length();i++){
				permutation.add(insert(word,first,i));
			}
			
		}
		return permutation;
		
		
	}
	public String insert(String word,char first,int i){
		String start=word.substring(0,i);
		String end=word.substring(i);
		return start+first+end;
	}
	public ArrayList<ArrayList<Integer>> intPermutation(int[] a){
		ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> permutation=new ArrayList<Integer>();
		HashSet<Integer> used=new HashSet<Integer>();
		getPermutation(res,permutation,used,a);
		return res;
		
	}
	public void getPermutation(ArrayList<ArrayList<Integer>>res,ArrayList<Integer> permutation,HashSet<Integer> used,int[] a){
		if(permutation.size()==a.length){
			ArrayList<Integer> temp=new ArrayList<Integer>(permutation);
			res.add(temp);
			return;
		}
		for(int i=0;i<a.length;i++){
			if(!used.contains(a[i])){
				permutation.add(a[i]);
				used.add(a[i]);
				getPermutation(res,permutation,used,a);
				used.remove(a[i]);
				permutation.remove(permutation.size()-1);
			}
		}
	}
	public ArrayList<ArrayList<Integer>> intPermutationWithDuplicate(int[] a){
		
		ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer>permutation=new ArrayList<Integer>();
	    Arrays.sort(a);
	    int[] used=new int[a.length];
	    for(int i=0;i<a.length;i++){
	    	used[i]=0;
	    }
	    getPermutationWithDuplicate(res,permutation,used,a);
	    return res;
	    
	}
	public void getPermutationWithDuplicate(ArrayList<ArrayList<Integer>> res,ArrayList<Integer>permutation,int[] used,int[]a){
		if(permutation.size()==a.length){
			ArrayList<Integer> temp=new ArrayList<Integer>(permutation);
			res.add(temp);
			return;
		}
		for(int i=0;i<a.length;i++){
			if(used[i]==0){
				if(i==0||(i>0&&a[i-1]==a[i]&&used[i-1]==1)||(i>0&&a[i-1]!=a[i])){
					permutation.add(a[i]);
					used[i]=1;
					getPermutationWithDuplicate(res,permutation,used,a);
					used[i]=0;
					permutation.remove(permutation.size()-1);
				}				
			}
		}
		
	}
	public static void main(String[] args){
		Solution test=new Solution();
		ArrayList<String> res=test.stringPermutation("aaa");
		/*
		for(String per:res){
			System.out.println(per);
		}*/
		int[] a={1,1,2};
		ArrayList<ArrayList<Integer>> result=test.intPermutationWithDuplicate(a);
		for(ArrayList<Integer> l:result){
			for(int number:l){
				System.out.print(number);
			}
			System.out.println();
		}
	
	}
	
}
