package findPairsOfGivenDiff;
import java.io.*;
import java.util.*;
public class FindPairs {
	public int FindPairsOfGivenDiff(int [] a,int diff){
		HashSet<Integer> dic=new HashSet<Integer>();
	    for(int i=0;i<a.length;i++){
	    	dic.add(a[i]);
	    }
	    int count=0;
	    for(int i=0;i<a.length;i++){
	    	int temp=a[i]+diff;
	    	if(dic.contains(temp))
	    	count++;
	    }
	    return count;
		
	}
	public static void main(String[] args) throws IOException{
		//int result=0;'
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] parameter=line.split(" ");
        int number=Integer.parseInt(parameter[0]);
        int diff=Integer.parseInt(parameter[1]);
        line=br.readLine();
        String[] list=line.split(" ");
        int [] a=new int[number];
        for(int i=0;i<number;i++){
        	a[i]=Integer.parseInt(list[i]);
        }
		//int[] a={1,5,4,3,2};
		//int diff=2;
		FindPairs test=new FindPairs();
		System.out.println(test.FindPairsOfGivenDiff(a, diff));
		
		
	}

}
