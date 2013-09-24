package BST;
import java.util.*;
public class BST {
     public TreeNode insert(TreeNode root, int val){
    	 if(root==null)
    		 return new TreeNode(val);
    	    TreeNode current=root;
    	    if(current.val<val){  	    	
    	    if(current.right==null){
    	    	current.right=new TreeNode(val);
    	    }
    	    else{
    	    	insert(current.right, val);
    	    }
    	    }
    	    else if(current.val>val){
    	    	if(current.left==null){
    	    		current.left=new TreeNode(val);
    	    	}
    	    	else{
    	    		insert(current.left,val);
    	    	}
          	    		
    	    	
    	    }
    	    return root; 	      
     }
     public TreeNode search(TreeNode root, int val){
    	 if(root==null)
    		 return null;
    	 if(root.val==val)
    		 return root;
    	 if(val>root.val){
    		 if(root.right==null)
    			 return null;
    		 else
    			 return search(root.right,val);
    	 }
    	 else {
    		 if(root.left==null){
    			 return null;
    		 }
    		 else
    			 return search(root.left, val);
    	 }
     }
     public TreeNode successor(TreeNode root, TreeNode node){
    	 if(node==null)
    		 return null;
    	 TreeNode res=null;
    	 if(node.right!=null){
    		res=node.right;
    		while(res.left!=null){
    			res=res.left;
    		}
    	 }
    	 else{
         while(root!=null){
        	 if(root.val>node.val){
        		 res=root;
        		 root=root.left;
        		 
        	 }
        	 else if(root.val<node.val){
        		 root=root.right;
        	 }
        	 else
        		 break;
         }
         
    	 }
    	 return res;
     }
    /*
     public delete(TreeNode root, int val){
    	         TreeNode target=search(root,val);
    	         if(target==null) return;
     }*/
     public static void main(String []args){
    	 BST test=new BST();
    	 int[] list={3,4,1,2,5};
    	 TreeNode root=null;
    	 
    	 for(int i=0;i<list.length;i++){
    		 root=test.insert(root, list[i]);
    	 }
    	 //System.out.println(test.search(root, 5));
    	// TreeNode node=test.search(root, 1);
    	 //TreeNode successor=test.successor(root, node);
    	//System.out.println(successor.val);
    	 IteratorBST it=new IteratorBST(root);
    	 TreeTraverse tr=new TreeTraverse(root);
    	 /*
    	 while(it.hasNext()){
    		 System.out.println(it.next().val);
    	 }*/ 
    	 ArrayList<TreeNode> res=tr.postorder();
    	 for(int i=0;i<res.size();i++){
    		 System.out.println(res.get(i).val);
    	 }
     }

}
