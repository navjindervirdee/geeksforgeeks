/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* Node is defined as 
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/
class GfG{
    int detectLoop(Node head){
        Node temp = head;
        Set<Node> set = new HashSet<Node>();
        while(temp!=null){
            if(set.contains(temp)){
                return 1;
            }
            set.add(temp);
            temp = temp.next;
            
        }
        return 0;
    }
}