package partitionList;

public class Solution {
	class ListNode{
		int val;
		ListNode next;
		public ListNode(int val){
			this.val=val;
		}
	}
    public ListNode partition(ListNode head, int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	 ListNode current=head; 
    	 ListNode small=null;
    	 ListNode smallTail=null;
    	 ListNode big=null;
    	 ListNode bigTail=null;
    	 while(current!=null){
    		 if(current.val<x){
    			 if(small==null){
    				 small=new ListNode(current.val);
    				 smallTail=small;
    			 }
    			 else{
    				 smallTail.next=new ListNode(current.val);
    				 smallTail=smallTail.next;
    			 }
    		 }
    		 else {
    			 
    		   if(big==null){
    			   big=new ListNode(current.val);
    			   bigTail=big;
    		   }
    		   else{
    			   bigTail.next=new ListNode(current.val);
    			   bigTail=bigTail.next;
    		   }
    			 
                 
    		 }
    		 current=current.next;
    		 
    	 }
    	 if(small!=null){
    	 smallTail.next=big;
    	 return small;}
    	 else
    	 {return big;
    	 }
    	 
        
    }

}
