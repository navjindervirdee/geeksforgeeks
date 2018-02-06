/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


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
    List<Integer> list = new ArrayList<Integer>();
    void inOrder(Node root){
        if(root == null){
            return;
        }
        isBST(root.left);
        list.add(root.data);
        isBST(root.right);
    }
    int isBST(Node root)  
    {
        inOrder(root);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1)){
                return 0;
            }
        }
        return 1;
    }
}