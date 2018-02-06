/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


class GfG
{
    void levelOrder(Node node) 
    {
        Queue<Integer> intQ = new LinkedList<Integer>();
        Queue<Node> treeQ = new LinkedList<Node>();
        intQ.add(1);
        treeQ.add(node);
        int l = 1;
        int i = 0;
        while(!treeQ.isEmpty()){
            i++;
            Node n = treeQ.poll();
            int level = intQ.poll();
            if(l!=level){
                System.out.print("$ ");
            }
            l = level;
            System.out.print(n.data + " ");
            if(n.left!=null){
                treeQ.add(n.left);
                intQ.add(level+1);
            }
            if(n.right!=null){
                treeQ.add(n.right);
                intQ.add(level+1);
            }
        }
        System.out.print("$");
        
        // Your code here
    }
}