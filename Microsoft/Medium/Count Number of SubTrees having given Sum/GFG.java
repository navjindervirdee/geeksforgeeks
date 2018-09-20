/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/
// Return the count of the sub-trees having sum as X.
class GFG
{
    static class Value{
        int count;
    }
    
    int getCount(Node root, int x, Value result){
        if(root==null){
            return 0;
        }
        int left = getCount(root.left,x,result);
        int right = getCount(root.right,x,result);
        int sum = left + right + root.data;
        if(sum==x){
            result.count++;
        }
        return sum;
    }
    
    int countSubtreesWithSumX(Node root, int x){
        Value result = new Value();
        getCount(root,x,result);
        return result.count;
    }
}