// Pairwise swap elements of a linked list

class Solution07 {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        // code here
         Node curr=head;
        Node ans=head.next; 
       
        if(curr.next==null){
            return curr;
        }
        
        if(curr.next.next==null){
            Node temp=curr.next;
            curr.next.next=curr;
            curr.next=null;
            return temp;
        }
        
        
        Node temp2=curr.next.next;
        curr.next.next=curr;
        curr.next=temp2;
        curr.next=pairwiseSwap(temp2);
        return ans;
    }
}