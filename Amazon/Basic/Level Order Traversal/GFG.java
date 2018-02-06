/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


class GfG
{
    void levelOrder(Node node) 
    {
        Queue<Node> queue =  new LinkedList<Node>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.print(temp.data + " ");
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
    }
}