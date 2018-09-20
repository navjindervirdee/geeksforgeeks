/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
/*
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class GfG{
    public int minLeafSum(Node root){
        if(root==null){
            return 0;
        }
        
        if(root.left==null && root.right==null){
            return root.data;
        }
        
        Queue<Node> queue = new LinkedList<Node>();
        Node temp = new Node(-1);
        queue.add(root);
        queue.add(temp);
        boolean minlevel = false;
        
        while(!queue.isEmpty()){
            Node node = queue.poll();
            if(node.data==-1){
                if(minlevel){
                    break;
                }
                queue.add(node);
                continue;
            }
            
            if(node.left!=null){
                queue.add(node.left);
                if(node.left.left==null && node.left.right==null){
                    minlevel = true;
                }
            }
            
            if(node.right!=null){
                queue.add(node.right);
                if(node.right.left==null && node.right.right==null){
                    minlevel = true;
                }
            }
        }
        
        int sum = 0; 
        while(!queue.isEmpty()){
            Node node = queue.poll();
            if(node.left==null && node.right==null){
                sum += node.data;
            }
        }
        return sum;
    }
}