package BST;
import java.util.*;
public class TreeTraverse {
	TreeNode root;
	public TreeTraverse(TreeNode root){
		this.root=root;
		
		
	}
	public ArrayList<TreeNode> inorder(){
		ArrayList<TreeNode> order=new ArrayList<TreeNode>();
		Stack<TreeNode> stack=new Stack<TreeNode>();
		TreeNode cursor=root;
		while(!stack.isEmpty()||cursor!=null){
			if(cursor==null){
				order.add(stack.peek());
				cursor=stack.pop().right;
			}
			else{
				while(cursor!=null){
					stack.push(cursor);
					cursor=cursor.left;
				}
			}
		}
		return order;
	}
	public ArrayList<TreeNode> preorder(){
		ArrayList<TreeNode> order=new ArrayList<TreeNode>();
		Stack<TreeNode> stack=new Stack<TreeNode>();
		stack.add(root);
		while(!stack.isEmpty()){
			TreeNode temp=stack.pop();
			order.add(temp);
			if(temp.right!=null)
			stack.add(temp.right);
			if(temp.left!=null)
			stack.add(temp.left);		
		}
		return order;
	}
	public ArrayList<TreeNode> postorder(){
		ArrayList<TreeNode> order=new ArrayList<TreeNode>();
		Stack<TreeNode> stack=new Stack<TreeNode>();
		TreeNode previous=null;
		stack.add(root);
		TreeNode current=root;
		while(!stack.isEmpty()){
			current=stack.peek();
			if(previous==null||previous.left==current||previous.right==current){
				if(current.left!=null){
					stack.push(current.left);
				}
				else if(current.right!=null){
					stack.push(current.right);
				}
				else{
					order.add(stack.pop());
				}
			}
			else if(current.left==previous){
				if(current.right!=null){
					stack.push(current.right);
				}
				else{
					order.add(stack.pop());
				}
			}
			else{
				order.add(stack.pop());
			}
			previous=current;
		}
		return order;
		
	}

}
