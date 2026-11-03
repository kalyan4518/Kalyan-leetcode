/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution 
{
    public Node copyRandomList(Node head) 
    {
        if(head==null)
        return null;

        Node temp=head;
        Node nextOfTemp=null;
        while(temp!=null)
        {
              nextOfTemp=temp.next;
              Node nn=new Node(temp.val);
              temp.next=nn;
              nn.next=nextOfTemp;
              temp=nextOfTemp;
        }
        temp=head;
        while(temp!=null)
        {
            if(temp.random!=null)
            temp.next.random=temp.random.next;  
            temp=temp.next.next;  
        }
        Node nn=new Node(101);
        Node dummy=nn;
         Node t1=head;
         while(t1!=null)
         {
            dummy.next=t1.next;
            dummy=dummy.next;
            t1.next=t1.next.next;
            t1=t1.next;

         }return nn.next;
    }
    
}