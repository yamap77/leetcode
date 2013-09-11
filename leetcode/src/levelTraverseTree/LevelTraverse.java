package levelTraverseTree;
import java.util.*;
public class LevelTraverse {
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
	    TreeNode(int val){
			this.val=val;
		}
	    public TreeNode createTree(int[] arr,int start, int end){
	    	if(end<start)
	    		return null;
	    	int mid=(start+end)/2;
	    	TreeNode root=new TreeNode(arr[mid]);
	    	root.left=createTree(arr,start,mid-1);
	    	root.right=createTree(arr,mid+1,end);
	    	return root;
	    }
	}
    public TreeNode createTree(int[] arr,int start, int end){
    	if(end<start)
    		return null;
    	int mid=(start+end)/2;
    	TreeNode root=new TreeNode(arr[mid]);
    	root.left=createTree(arr,start,mid-1);
    	root.right=createTree(arr,mid+1,end);
    	return root;
    }
	  public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
			ArrayList<ArrayList<TreeNode>> res=new ArrayList<ArrayList<TreeNode>>();
	        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
			ArrayList<TreeNode> list=new ArrayList<TreeNode>();
	        ArrayList<Integer> vallist=new ArrayList<Integer>();
			int level=0;
	        if(root==null)
	        return result;
			list.add(root);
	        vallist.add(root.val);
			res.add(list);
	        result.add(vallist);
			while(true){
				for(int i=0;i<res.get(level).size();i++){
					TreeNode temp=res.get(level).get(i);
                     list=new ArrayList<TreeNode>();
	                vallist=new ArrayList<Integer>();
					if(temp.left!=null){
						list.add(temp.left);
	                    vallist.add(temp.left.val);
					}
					if(temp.right!=null){
						list.add(temp.right);
	                    vallist.add(temp.right.val);
					}
					
				}
				if(list.size()<=0){
					break;
				}
				else{
					
					res.add(list);
	                result.add(vallist);
	                for(int k=0;k<vallist.size();k++){
	                	System.out.print(list.get(k).val+" ");
	                	
	                }
	                System.out.println();
				}
	            level++;
					
			}
			return result; 
	    }
	  public static void main(String [] args){
		  int[] arr={1,2,3,4,5};
		  LevelTraverse test=new LevelTraverse();
		  TreeNode root=test.createTree(arr, 0, arr.length-1);
		  test.levelOrder(root);
	  }
	  
	

}
