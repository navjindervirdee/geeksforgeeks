/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
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
    int inOrder(Node root, int prev){
        if(root==null){
            return prev;
        }
        prev = inOrder(root.left,prev);
        if(root.left!=null && prev==-1){
            return -1;
        }
        if(root.data<prev){
            return -1;
        }
        prev = root.data;
        prev = inOrder(root.right,prev);
        return prev;
    }
    int isBST(Node root)  
    {
        if(root == null){
            return 1;
        }
        int prev = -1;
        prev = inOrder(root,prev);
        if(prev==-1){
            return 0;
        }
        else{
            return 1;
        }
    }
}