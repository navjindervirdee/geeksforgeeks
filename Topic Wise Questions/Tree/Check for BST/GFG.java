/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*  A Binary Search Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */
class GfG
{
    void checkBST(Node node, List<Integer> list){
        if(node==null){
            return;
        }
        checkBST(node.left,list);
        list.add(node.data);
        checkBST(node.right,list);
        
    }
    int isBST(Node root){
        List<Integer> list = new ArrayList<Integer>();
        checkBST(root, list);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                return 0;
            }
        }
        return 1;
    }
}