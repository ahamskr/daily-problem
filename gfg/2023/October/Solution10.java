// Nodes at given distance in binary tree

class Solution10
{
    static Node findNode(Node root,int key,Map<Node,Node> parent,Node par){
        if(root==null) return null;
        parent.put(root,par);
        if(root.data==key) return root;
        Node left=findNode(root.left,key,parent,root);
        if(left!=null) return left;
        Node right=findNode(root.right,key,parent,root);
        return right;
    }
    public static ArrayList<Integer> KDistanceNodes(Node root, int target , int k)
    {
        // return the sorted list of all nodes at k dist
        ArrayList<Integer> ans=new ArrayList<>();
        Map<Node,Node> parent=new HashMap<>();
        Node tar=findNode(root,target,parent,null);
        Set<Node> vis=new HashSet<>();
        helper(tar,k,parent,vis,ans);
        Collections.sort(ans);
        return ans;
    }
    static void helper(Node root,int k,Map<Node,Node> parent,Set<Node> vis,ArrayList<Integer> ans){
        if(root==null||vis.contains(root)) return;
        vis.add(root);
        if(k==0) ans.add(root.data);
        helper(root.left,k-1,parent,vis,ans);
        helper(root.right,k-1,parent,vis,ans);
        helper(parent.get(root),k-1,parent,vis,ans);
    }
}