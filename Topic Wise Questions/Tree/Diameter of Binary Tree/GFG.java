/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

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
    int [] findMax(Node node){
        if(node==null){
            int [] array =  new int[2];
            array[0] = 0;
            array[1] = 0;
            return array;
        }
        
        int [] left = findMax(node.left);
        int [] right = findMax(node.right);
        
        int [] array = new int[2];
        array[0] = Math.max(left[0],right[0])+1;
        int max = left[0] + right[0] + 1;
        max = Math.max(max, left[1]);
        max = Math.max(max,right[1]);
        array[1] = max;
        return array;
    }
    int diameter(Node node){
        int [] array = findMax(node);
        return array[1];
    }
}