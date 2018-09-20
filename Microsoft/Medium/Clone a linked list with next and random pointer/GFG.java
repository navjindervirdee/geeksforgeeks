/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/
/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/
//function to copy linked list
class GfG
{
    Node copyList(Node head)
    {
        Node newHead = new Node(-1);
        Node temp = newHead;
        Node curr = head;
        
        while(curr!=null){
            Node node = new Node(curr.data);
            node.data = curr.data;
            System.out.println(node.data);
            node.arb = curr;
            temp.next = node;
            Node next = curr.next;
            curr.next = node;
            temp = temp.next;
            curr = next;
        }
        
        temp = newHead.next;
        /*while(temp!=null){
            System.out.print(temp.data + " - " + temp.arb.data + " , ");
            temp = temp.next;
        }
        System.out.println();*/
        temp = newHead.next;
        
        while(temp!=null){
            Node arb = temp.arb;
            arb = arb.arb;
            if(arb!=null){
                arb = arb.next;
            }
            temp.arb = arb;
            temp = temp.next;
        }
        return newHead.next;
        
    }
}