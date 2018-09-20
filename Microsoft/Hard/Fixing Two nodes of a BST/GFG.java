/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/


class GfG
{
    private Node inOrder(Node node, Node prev,Node [] two){
        if(node==null){
            return prev;
        
        }
        
        prev = inOrder(node.left,prev,two);
        if(prev==null){
            prev = node;
        }
        else{
            if(prev.data>node.data){
                two[0] = prev;
                two[1] = node;
            }
            else{
                prev = node;
            }
        }
        
        prev = inOrder(node.right,prev,two);
        return prev;
    }
    
    public Node correctBST(Node root){
        Node [] two = new Node[2];
        Node prev = null;
        inOrder(root,prev,two);
        int temp = two[0].data;
        two[0].data = two[1].data;
        two[1].data = temp;
        return root;
    }
    
}