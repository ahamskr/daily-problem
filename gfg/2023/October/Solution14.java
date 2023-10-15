// Find Common Nodes in two BSTs

class Solution14
{
    //Function to find the nodes that are common in both BST.
	public static ArrayList<Integer> findCommon(Node root1,Node root2)
    {
        //code here
        Set<Integer> set=new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        inorder(root1,set,ans,true);
        inorder(root2,set,ans,false);
        return ans;
    }
    static void inorder(Node root,Set<Integer> set,ArrayList<Integer> ans,boolean flag){
        if(root==null) return;
        inorder(root.left,set,ans,flag);
        if(flag) set.add(root.data);
        else{
            if(set.contains(root.data)) ans.add(root.data);
        }
        inorder(root.right,set,ans,flag);
    }
}