package swapPairs;

public class SwapPairs {
	public class ListNode{
		int val;
		ListNode next;
		public ListNode(int val){
			this.val=val;
		}
	}
	
    public ListNode swapPairs(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head!=null&&head.next!=null){
			ListNode temp=head.next;
			head.next=swapPairs(head.next.next);
			temp.next=head;
            return temp;
	}
		return head;

	}}


