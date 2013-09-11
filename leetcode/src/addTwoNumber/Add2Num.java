package addTwoNumber;

public class Add2Num {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(l1==null&&l2==null)
        return null;
        int val,carry=0;
        ListNode res=new ListNode(0);
        ListNode temp=res;
    while(l1!=null||l2!=null||carry!=0){       
        val=0;
        val +=carry;
        if(l1!=null){
        val += l1.val;
        l1=l1.next;
        }
        if(l2!=null){
        val +=l2.val;
        l2=l2.next;
        
        }
        if(val>=10)
        carry=1;
        else
        carry=0;
        temp.next=new ListNode(val%10);
        temp=temp.next;
    }
    return res.next;
        
    }

}
