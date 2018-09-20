/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class GfG
{
    void leftView(Node root){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(new Node(-1));
        queue.add(root);
        while(!queue.isEmpty()){
            Node node = queue.poll();
            if(node.data==-1){
                if(queue.isEmpty()){
                    break;
                }
                queue.add(node);
                node = queue.poll();
                System.out.print(node.data + " ");
            }
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
    }
}