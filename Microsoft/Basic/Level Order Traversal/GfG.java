/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


class GfG
{
    void levelOrder(Node node)
    {
        Node temp = node;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node n = queue.poll();
            System.out.print(n.data + " ");
            if(n.left!=null){
                queue.add(n.left);
            }
            if(n.right!=null){
                queue.add(n.right);
            }
        }
    }
}