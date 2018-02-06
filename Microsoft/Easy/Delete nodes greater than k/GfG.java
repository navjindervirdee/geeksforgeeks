/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*Complete the function below
Node is as follows:
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
    List<Integer> list = new ArrayList<Integer>();
    Node newRoot = null;
    private void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        list.add(root.data);
        inOrder(root.right);
    }
    
    private int findIndex(int num){
        for(int i=0;i<list.size();i++){
            if(list.get(i)>=num){
                return i-1;
            }
        }
        return -1;
    }
    
    private void add( int num){
        Node node = new Node(num);
        if(newRoot == null){
            newRoot = node;
            return;
        }
        Node temp = newRoot;
        while(temp!=null){
            if(temp.data<num){
                if(temp.right==null){
                    temp.right=node;
                    return;
                }
                temp = temp.right;
                continue;
            }
            if(temp.data>num){
                if(temp.left==null){
                    temp.left = node;
                    return;
                }
                temp = temp.left;
                continue;
            }
            if(temp.data==num){
                Node right = temp.right;
                temp.right = node;
                node.right = right;
                return;
            }
        }
    }
    
	public Node deleteNode(Node root,int x){
	    inOrder(root);
	    int index = findIndex(x);
	    for(int i=0;i<=index;i++){
	        add(list.get(i));
	    }
	    return newRoot;
    }
}