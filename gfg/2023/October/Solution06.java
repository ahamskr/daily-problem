// Reverse alternate nodes in Link List

class Solution06
{
    public static void rearrange(Node odd)
    {
        // add your code here
        if(odd.next == null){
            return;
        }
        // add your code here
        Node alt = null;
        Node current = odd;
        Node prev = null;
        while(current!= null&& current.next!=null){
            //maintain a previous so that we can attach alt list to it later
            prev=current;
            Node future = current.next;
            //Always take current to odd nodes and use current.next in alt list
            current.next = future.next;
            //Keep reversing alt list
            future.next = alt;
            alt=future;
            current =current.next;
           }
        if(prev != null && prev.next != null){
            prev.next.next=alt;
        }
        else{
              prev.next= alt;
        }
    }
}