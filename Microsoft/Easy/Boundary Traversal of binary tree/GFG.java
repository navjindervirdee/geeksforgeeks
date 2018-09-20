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
}*/
class GfG
{
    void getLeafs(Node node, List<Integer> leafs,Set<Node> set){
        if(node==null){
            return;
        }
        if(node.left==null && node.right==null){
            if(!set.contains(node)){
                leafs.add(node.data);
            }
        }
        
        getLeafs(node.left,leafs,set);
        getLeafs(node.right,leafs,set);
    }
    
	void printBoundary(Node node){
	    if(node==null){
	        return;
	    }
	    if(node.left==null && node.right==null){
	        System.out.print(node.data);
	        return;
	    }
	    
	    Set<Node> set = new HashSet<Node>();
	    set.add(node);
	    List<Integer> leftBoundary = new ArrayList<Integer>();
	    Node temp = node.left;
	    while(temp!=null){
	        leftBoundary.add(temp.data);
	        set.add(temp);
	        if(temp.left==null && temp.right==null){
	            temp = null;
	            break;
	        }
	        if(temp.left!=null){
	            temp = temp.left;
	            continue;
	        }
	        temp = temp.right;
	    }
	    
	    temp = node.right;
	    List<Integer> rightBoundary = new ArrayList<Integer>();
	    while(temp!=null){
	        if(!set.contains(temp)){
	            rightBoundary.add(temp.data);
	        }
	        set.add(temp);
	        if(temp.left==null && temp.right==null){
	            break;
	        }
	        if(temp.right!=null){
	            temp=temp.right;
	            continue;
	        }
	        temp = temp.left;
	    }
	    System.out.print(node.data + " ");
		List<Integer> leafs = new ArrayList<Integer>();
		getLeafs(node,leafs,set);
		
		for(int i : leftBoundary){
		    System.out.print(i + " ") ;
		}
		
		for(int i : leafs){
		    System.out.print(i + " ");
		}
		
		for(int i=rightBoundary.size()-1;i>-1;i--){
		    System.out.print(rightBoundary.get(i) + " ");
		}
	}
}