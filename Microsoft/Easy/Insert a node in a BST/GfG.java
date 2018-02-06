/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* Structure of BST node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null; }
}*/
class GfG
{
   /* This function should insert a new node with given data and
      return root of the modified tree  */
    Node insert(Node root, int data)
    {
        Node node = new Node(data);
        Node temp = root;
        while(temp!=null){
            if(temp.data>data){
                if(temp.left==null){
                    temp.left = node; 
                    return root;
                }
                temp = temp.left;
                continue;
            }
            if(temp.data<data){
                if(temp.right==null){
                    temp.right = node;
                    return root;
                }
                temp =temp.right;
                continue;
            }
            if(temp.data==data){
                return root;
            }
        }
        return node;
         // Your code here
    }
}