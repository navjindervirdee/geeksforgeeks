/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*
// A Binary Tree node
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
    boolean findPath(Node node, int sum, int total){
        if(node==null){
            return false;
        }
        if(node.right==null && node.left==null){
            if(sum+node.data==total){
                return true;
            }
            else{
                return false;
            }
        }
        int s = sum+node.data;
        if(s>total){
            return false;
        }
        boolean found = findPath(node.left,sum+node.data,total);
        if(!found){
            found = findPath(node.right,sum+node.data,total);
        }
        return found;
        
    }
    boolean hasPathSum(Node node, int sum)
    {
        if(node==null){
            return false;
        }
        return findPath(node,0,sum);
        
    }
}