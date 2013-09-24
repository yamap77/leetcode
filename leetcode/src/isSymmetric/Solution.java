package isSymmetric;
import java.util.*;
public class Solution {
	//recursion
	  public class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode(int x) { val = x; }
		  }	
	  public boolean isSymmetric(TreeNode root){
		if(root==null)
			return true;
		return check(root.left,root.right);
		
	}
	public boolean check(TreeNode a, TreeNode b){
		if(a==null&&b==null) return true;
		if(a==null||b==null) return false;
		if(a.val!=b.val) return false;
		return check(a.left,b.right)&&check(a.right,b.left);
	}
	//iterative
	public boolean symmetric(TreeNode root){
		if(root==null)
			return true;
		Queue<TreeNode> left = new LinkedList<TreeNode>();
		Queue<TreeNode> right=new LinkedList<TreeNode>();
		left.add(root.left);
		right.add(root.right);
		TreeNode a;
		TreeNode b;
		while(!left.isEmpty()&&!right.isEmpty()){
			a=left.remove();
			b=right.remove();
			if(a==null&&b==null) continue;
			if(a==null||b==null) return false;
			if(a.val!=b.val)
				return false;
			left.add(a.left);
			left.add(a.right);
			right.add(b.right);
			left.add(b.left);
		}
		if(left.isEmpty()&&right.isEmpty())
			return true;
		else
			return false;
		
	}
	public TreeNode createTree(){
		TreeNode head=new TreeNode(1);
		head.left=new TreeNode(2);
		head.right=new TreeNode(2);
		return head;
	}
	public static void main(String [] args){
		Solution test=new Solution();
		TreeNode head=test.createTree();
		System.out.println(test.symmetric(head));
	}

}
