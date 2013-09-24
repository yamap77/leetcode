package twoSum;
import java.util.*;
public class TwoSum {
	public int[] twoSum(int[] a, int target){
		Hashtable<Integer,Integer> table=new Hashtable<Integer,Integer>();
		int [] res=new int[2];
		for(int i=0;i<a.length;i++){
			table.put(a[i], i);
		}
		System.out.println(table.size());
		for(int i=0;i<a.length;i++){
			int sub=target-a[i];
			table.remove(a[i]);//should remove, or will find itself
			if(table.containsKey(sub)){
				res[0]=a[i];
				res[1]=sub;
				break;
			}
		}
		return res;
	}
	public static void main(String []args){
		int[] a={2,3,4,5,6,7,8,9,10,11};
		int target=4;
		TwoSum test=new TwoSum();
		int [] result=test.twoSum(a, target);
		System.out.println(result[0]+" "+result[1]);
	}

}
