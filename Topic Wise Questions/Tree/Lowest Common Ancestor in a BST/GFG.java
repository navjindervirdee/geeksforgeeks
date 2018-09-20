/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* A Binary Search Tree node */
/* class Node
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
    void findNode(Node node, int data, List<Node> list){
        if(node==null){
            return;
        }
        list.add(node);
        if(node.data==data){
            return;
        }
        if(node.data<data){
            findNode(node.right,data,list);
        }
        else{
            findNode(node.left,data,list);
        }
    }
    
    Node lca(Node node, int n1, int n2){
        List<Node> list1 = new ArrayList<Node>();
        List<Node> list2 = new ArrayList<Node>();
        
        findNode(node,n1,list1);
        findNode(node,n2,list2);
        
        for(int i=list1.size()-1;i>-1;i--){
            Node temp = list1.get(i);
            for(int j=list2.size()-1;j>-1;j--){
                if(temp.equals(list2.get(j))){
                    return temp;
                }
            }
        }
        return null;
            
    }
    
}