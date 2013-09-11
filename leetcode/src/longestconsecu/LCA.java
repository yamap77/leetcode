package longestconsecu;
import java.util.*;
public class LCA {
	public int longestConsec(int[] num){
		HashSet<Integer> set=new HashSet<Integer>();
		int max=0;
		for(int i=0;i<num.length;i++){
			set.add(num[i]);
		}
		for(int j=0;j<num.length;j++){
			max=Math.max(max, getCount(set, num[j],false)+getCount(set,num[j]+1,true));
			
		}
		return max;
		
	}
	public int getCount(HashSet<Integer> set,int val,boolean asc){
		int count=0;
		while(set.contains(val)){
			count++;
			set.remove(val);
			if(asc)
				val++;
			else
				val--;
		}
		return count;
	}
	public static void main(String[] args){
		int[] num={100, 4, 200, 1, 3, 2};
		LCA test=new LCA();
		System.out.print(test.longestConsec(num));
		
		
	}

}
