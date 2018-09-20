/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
/*a is an array of Nodes of the heads of linked lists
  and N is size of array a*/
class GfG
{
    Node mergeKList(Node[]a,int N){
        PriorityQueue<Node> queue = new PriorityQueue<Node>(new Comparator<Node>(){
            public int compare(Node n1, Node n2){
                return n1.data-n2.data;
            }
        });
        
        for(int i=0;i<N;i++){
            queue.add(a[i]);
        }
        
        Node head = new Node(-1);
        Node temp = head;
        
        while(!queue.isEmpty()){
            Node node = queue.poll();
            temp.next = node;
            temp = temp.next;
            if(node.next!=null){
                queue.add(node.next);
            }
        }
        return head.next;
    }
}