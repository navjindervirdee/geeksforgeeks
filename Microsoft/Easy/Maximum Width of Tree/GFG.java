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
} */
class GfG
{
    // /* Function to get the maximum width of a binary tree*/
    int getMaxWidth(Node root)
    {
        if(root==null){
            return 0;
        }
        
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        Node temp = new Node(-1);
        queue.add(temp);
        int count = 0;
        int max = 0;
        while(!queue.isEmpty()){
            Node node = queue.poll();
            if(node.data ==-1){
                max = Math.max(max,count);
                if(!queue.isEmpty()){
                    queue.add(node);
                }
                count=0;
                continue;
            }
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
            count++;
        }
        return max;
    }		
}