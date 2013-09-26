package keepMedian;
import java.util.*;
public class Solution {
	public class maxHeapComparator implements Comparator<Integer>{
		
		public int compare(Integer a,Integer b){
			if(b-a>0) return 1;
			else if(b-a==0) return 0;
			else return -1;
		}

	}
	PriorityQueue<Integer> minHeap;
	PriorityQueue<Integer> maxHeap;
	int max;
	int min;
	public Solution(){
		minHeap=new PriorityQueue<Integer>();
		maxHeap=new PriorityQueue<Integer>(10,new maxHeapComparator());
		max=0;
	    min=0;
	}
	public void initial(int[]a){
		if(a.length==0)
			return;
		if(a.length==1){
			minHeap.add(a[0]);
			min++;
		}
		else{
			if(a[0]>a[1]){
			minHeap.add(a[0]);
			maxHeap.add(a[1]);
			}
			else{
			minHeap.add(a[1]);
			maxHeap.add(a[0]);	
			}
			min++;
			max++;
			for(int i=2;i<a.length;i++){
			
				if(a[i]<minHeap.peek()){
					maxHeap.add(a[i]);
					max++;
				}
				else{
					minHeap.add(a[i]);
					min++;
				}
				if(max-min>1){
					int temp=maxHeap.poll();
					minHeap.add(temp);
					max--;
					min++;
				}
				else if(min-max>1){
					int temp=minHeap.poll();
					maxHeap.add(temp);
					max++;
					min--;
				}
			}
		}
		
		
		
	
		
	}
	public void keepMedian(int a){
		if(min==0){
			minHeap.add(a);
			min++;
			}
		else{
		if(a<minHeap.peek()){
			maxHeap.add(a);
			max++;
		}
		else{
			minHeap.add(a);
			min++;
		}
		if(max-min>1){
			int temp=maxHeap.poll();
			minHeap.add(temp);
			max--;
			min++;
		}
		else if(min-max>1){
			int temp=minHeap.poll();
			maxHeap.add(temp);
			min--;
			max++;
		}
		}
	}
public static void main(String args[]){
	Solution test=new Solution();
	int[] a={11,7,1,3,4,5,6,10};
	
	//test.initial(a);
	for(int i=0;i<a.length;i++){
		
	test.keepMedian(a[i]);
	if(test.max==test.min)
		System.out.println((double)(test.minHeap.peek()+test.maxHeap.peek())/2);
	else if(test.max>test.min)
		System.out.println(test.maxHeap.peek());
	else
		System.out.println(test.minHeap.peek());
	}
		
}

}
