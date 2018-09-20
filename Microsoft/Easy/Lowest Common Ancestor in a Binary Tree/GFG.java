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
    boolean find(Node node, List<Node> list, int num){
        if(node==null){
            return false;
        }
        if(node.data == num){
            list.add(node);
            return true;
        }
        boolean left = find(node.left,list,num);
        boolean right = find(node.right,list,num);
        if(left || right){
            list.add(node);
        }
        return left || right;
    }
	Node LCA(Node root, int n1,int n2)
	{
	    List<Node> list1 = new ArrayList<Node>();
	    List<Node> list2 = new ArrayList<Node>();
	    
	    find(root,list1,n1);
	    find(root,list2,n2);
	    if(list1.size()==0 | list2.size()==0){
	        return null;
	    }
	    
	    
	    Set<Node> set = new HashSet<Node>();
	    for(Node n : list1){
	        set.add(n);
	    }
	    
	    for(int i=0;i<list2.size();i++){
	        if(set.contains(list2.get(i))){
	            return list2.get(i);
	        }
	    }
	    return null;
	}
}