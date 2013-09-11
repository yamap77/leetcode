package findLoop;
import java.util.*;
public class FindLoop {

		  public static class ListNode {

		     public int value;

		     public ListNode next;
		     public ListNode(int val){
		    	 this.value=val;
		    	 this.next=null;
		     }
	         
		  }
		 
		  public boolean hasLoops( ListNode myList ) {
		      if(myList==null)
		          return false;
		      ListNode fast=myList;
		      ListNode slow=myList;
		      while(fast.next!=null&&fast.next.next!=null){
		          slow=slow.next;
		          fast=fast.next.next;
		          if(slow==fast){
		              return true;
		          }
		      }
		      return false;

		  }
		  public ListNode createList(int[] a){
			  ListNode head=new ListNode(a[0]);
			  ListNode tail=head;
			  for(int i=1;i<a.length;i++){
				 ListNode temp=new ListNode(a[i]);
				 tail.next=temp;
				 tail=tail.next;
			  }
			  //tail.next=head.next;
			  return head;
		  }
		  public static void main(String []args){
			  FindLoop test=new FindLoop();
			  int[] a={1,2,3};
			  ListNode myList=test.createList(a);
			  System.out.println(mid);
		  }



}
