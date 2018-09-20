/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/


/*
class of the node of the tree is as
class Node
{
	int key;
	 Node left, right;
	 
	 Node(int data)
	 {
	     key = data;
	     left = right = null
	 }
}
*/
// complete this function
// return true/false if the is Symmetric or not
class GfG
{
    public static boolean checkSymm(Node node1, Node node2){
        if(node1==null && node2==null){
            return true;
        }
        
        if(node1!=null && node2==null){
            return false;
        }
        
        if(node1==null && node2!=null){
            return false;
        }
        
        if(node1.data != node2.data){
            return false;
        }
        
        boolean result = checkSymm(node1.left,node2.right) && checkSymm(node1.right,node2.left);
        return result;
    }
    public static boolean isSymmetric(Node root){
        return checkSymm(root,root);
    }
}