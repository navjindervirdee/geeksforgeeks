/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

// A Binary Tree node
/* class Node
{
    int data;
    Node left, right, nextRight;
    Node(int item)
    {
        data = item;
        left = right = nextRight = null;
		
    }
} */
class GfG
{
    void connect(Node root){
        Queue<Node> queue = new LinkedList<Node>();
        Node temp = new Node(-1);
        queue.add(root);
        queue.add(temp);
        List<Node> list = new ArrayList<Node>();
        
        while(!queue.isEmpty()){
            Node node = queue.poll();
            if(node.data == -1){
                if(!queue.isEmpty()){
                    queue.add(node);
                }
                for(int i=0;i<list.size()-1;i++){
                    Node curr = list.get(i);
                    Node next = list.get(i+1);
                    curr.nextRight = next;
                }
                list = new ArrayList<Node>();
                continue;
            }
            list.add(node);
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
    }
}