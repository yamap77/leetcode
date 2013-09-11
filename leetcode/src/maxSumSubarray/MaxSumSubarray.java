package maxSumSubarray;
import java.util.*;
//如果前面的sum>0 A[i]属于前面，否则A[i]重新开始
public class MaxSumSubarray {
	public int MaxSumSubarray(int[] A){
		if(A==null)
			return 0;
		int length=A.length;
		int [] sum=new int[length];
		sum[0]=A[0];
		int max=A[0];
		for(int i=1;i<length;i++){
			if(sum[i-1]>0){
				sum[i]=sum[i-1]+A[i];			
			}
			else{
				sum[i]=A[i];
			}
			max=Math.max(max, sum[i]);
		}
		return max;
		
	}
	public static void main(String[] args){
		
		MaxSumSubarray test=new MaxSumSubarray();

		int [] A={-2,1,-3,4,-1,2,1,-5,4};
		//System.out.println(test.MaxSumSubarray(A));
		String a="123456";
		char [] b={'b','c'};
		String [] c={"a"};
		//System.out.println(b[0]==c[0]);
			Random rand=new Random();
			System.out.println(rand.nextInt(2)+1);
		   // Arrays.sort(b);
		    String x=b.toString();
       String sorted=new String(b);
		System.out.println(x);
	}

}
