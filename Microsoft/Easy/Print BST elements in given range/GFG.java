/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* The structure of a BST node is as follows:
class Node
{
    int key;
    Node left, right;
    Node(int item)
    {
        key = item;
        left = right = null;
    }
} */
class GfG
{   
    Node find(Node node, int num){
        if(node==null){
            return node;
        }
        if(node.key==num){
            return node;
        }
        
        if(node.key<num){
            if(node.right==null){
                return node;
            }
            return find(node.right,num);
        }
        else{
            if(node.left==null){
                return node;
            }
            return find(node.left,num);
        }
    }
    
    Node getNext(Node node,Node root){
        Node next = getLeftDescendant(node);
        if(next==null){
            List<Node> list = new ArrayList<Node>();
            getRightParent(node,root,list);
            for(int i =list.size()-1;i>-1;i--){
                //System.out.print(list.get(i).key + " ");
                if(list.get(i).key>node.key){
                    next = list.get(i);
                    break;
                }
            }
        }
        return next;
    }
    
    Node getLeftDescendant(Node node){
        Node right = node.right;
        while(right!=null && right.left!=null){
            right= right.left;
        }
        return right;
    }
    
    void getRightParent(Node node, Node root,List<Node> list){
        if(node==root){
            list.add(root);
            return;
        }
        
        list.add(root);
        if(node.key<root.key){
            getRightParent(node,root.left,list);
        }
        else{
            getRightParent(node,root.right,list);
        }
    }
    
    void Print(Node node, int k1, int k2)
    {
        Node n = find(node,k1);
        //System.out.println(n.key);
        while(n!=null && n.key<=k2){
            if(n.key>=k1){
                System.out.print(n.key + " ");
            }
            n = getNext(n,node);
        }
    }    
}