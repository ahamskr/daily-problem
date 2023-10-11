// Check for Balanced Tree

// class Tree
class Solution11
{
    boolean isBalanced(Node root)
    {
	// Your code here
	if(root==null) return true;
	int left=cntHeight(root.left);
	int right=cntHeight(root.right);
	if(Math.abs(left-right)>1) return false;
	return isBalanced(root.left)&&isBalanced(root.right);
    }
    int cntHeight(Node root){
        if(root==null) return 0;
        return 1+Math.max(cntHeight(root.left),cntHeight(root.right));
    }
}