/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left, right;
	Node(int d){
		data=d;
		left=right=null;
	}
}*/
class GfG
{
    private static void insert(Node root, Node node){
        if(root==null){
            return;
        }
        
        if(root.data==node.data){
            if(root.right==null){
                root.right=node;
                return;
            }
            else{
                insert(root.right,node);
            }
        }
        
        if(root.data>node.data){
            if(root.left==null){
                root.left = node;
                return;
            }
            else{
                insert(root.left,node);
            }
        }
        if(root.data<node.data){
            if(root.right==null){
                root.right = node;
                return;
            }
            else{
                insert(root.right,node);
            }
        }
    }
    
    private static void print(Node root){
        if(root==null){
            return;
        }
        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);
    }
    
    private static void preOrder(Node root1, Node root2){
        if(root2==null){
            return;
        }
        Node left = root2.left;
        Node right = root2.right;
        
        root2.left = null;
        root2.right = null;
        
        insert(root1,root2);
        
        preOrder(root1,left);
        preOrder(root1,right);
    }
    
	public static void merge(Node root1 , Node root2){
        if(root1==null && root2==null){
            return;
        }
        if(root1==null){
            print(root2);
        }
        if(root2==null){
            print(root1);
        }
        
        preOrder(root1,root2);
        print(root1);
        
    }
}