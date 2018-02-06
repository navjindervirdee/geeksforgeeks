/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class GfG
{
    void printNodes(Node root, int k , int height){
        if(root==null){
            return;
        }
        if(height==k){
            System.out.print(root.data + " ");
            return;
        }
        if(height<k){
            printNodes(root.left,k,height+1);
            printNodes(root.right,k,height+1);
        }
        
    }
     // Recursive function to print right view of a binary tree.
     void printKdistance(Node root, int k)
     {
         printNodes(root,k,0);
     }
}