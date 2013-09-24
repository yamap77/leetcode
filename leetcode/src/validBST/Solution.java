package validBST;
import java.util.*;
public class Solution {
	 public class TreeNode {
		     int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	   public boolean isValidBST(TreeNode root) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
		  return checkBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	        
	    }
	   public boolean checkBST(TreeNode n, int min,int max){
		   if(n==null){
			   return true;
		   }
		   if(n.val>min&&n.val<max){
			   return checkBST(n.left,min,n.val)&&checkBST(n.right,n.val,max);
		   }
		   else{
			   return false;
		   }

	   }

}
