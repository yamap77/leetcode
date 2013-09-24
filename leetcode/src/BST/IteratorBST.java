package BST;


import java.util.Iterator;
import java.util.Stack;

public class IteratorBST implements Iterator<TreeNode> {
	
		TreeNode root,cursor;
		Stack<TreeNode> stack;
		public IteratorBST(TreeNode root){
			this.root=root;
			this.cursor=root;
			this.stack=new Stack<TreeNode>();
			
		}
		public boolean hasNext(){
			return (!stack.isEmpty()||cursor!=null);
			
		}
		public TreeNode next(){
			while(cursor!=null){
				stack.push(cursor);
				cursor=cursor.left;
			}
			TreeNode next=stack.pop();
			cursor=next.right;
			return next;
			
			
		}
		public void remove(){
			stack.pop();
		}
	

}
