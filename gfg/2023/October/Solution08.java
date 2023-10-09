// Insert in a Sorted List

class Solution08 {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        Node node=new Node(key);
        Node tmp=head1,prev=null;
        while(tmp!=null&&tmp.data<key){
            prev=tmp;
            tmp=tmp.next;
        }
        if(prev==null){
            if(tmp!=null){
                node.next=tmp;
                return node;
            }
            return node;
        } 
        prev.next=node;
        node.next=tmp;
        return head1;
    }
}