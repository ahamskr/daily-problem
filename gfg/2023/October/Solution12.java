// Duplicate subtree in Binary Tree

class Solution12 {
    int dupSub(Node root) {
        // code here 
        Map<String,Integer> map=new HashMap<>();
        fun(root,map);
        for(int val:map.values()){
            if(val>1) return 1;
        }
        return 0;
    }
    String fun(Node root,Map<String,Integer> map){
        if(root==null) return "";
        String left=fun(root.left,map);
        String right=fun(root.right,map);
        String ans=left+root.data+right;
        if(!left.isEmpty()||!right.isEmpty()) map.put(ans,map.getOrDefault(ans,0)+1);
        return ans;
    }
}