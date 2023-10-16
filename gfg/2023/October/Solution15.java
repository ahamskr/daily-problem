// Normal BST to Balanced BST

// class GfG
class Solution15
{
    Node buildBalancedTree(Node root) 
    {
        //Add your code here.
        List<Integer> al=new ArrayList<>();
        inorder(root,al);
        return buildBalancedBST(al,0,al.size()-1);
    }
    void inorder(Node root,List<Integer> al){
        if(root==null) return;
        inorder(root.left,al);
        al.add(root.data);
        inorder(root.right,al);
    }
    Node buildBalancedBST(List<Integer> al,int lo,int hi){
        if(hi<lo) return null;
        int mi=lo+(hi-lo)/2;
        Node node=new Node(al.get(mi));
        if(lo==hi) return node;
        node.left=buildBalancedBST(al,lo,mi-1);
        node.right=buildBalancedBST(al,mi+1,hi);
        return node;
    }
}