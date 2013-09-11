package inorderTree;

public class InorederTree {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> res=new ArrayList<Integer>();
        inorder(root,res);
        return res;       
    }
    public void inorder(TreeNode root, ArrayList<Integer> res){
        if(root==null)       
        return;
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
        
    }

}
