/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the Given Function
Node is as follows:
class Tree{
int data;
Tree left,right;
Tree(int d){
	data=d;
	left=null;
	right=null;
}
}*/
class GfG{
    private int changeValues(Tree node){
        if(node==null){
            return 0;
        }
        int left = changeValues(node.left);
        int right = changeValues(node.right);
        int sum = left+right;
        
        int data = node.data;
        node.data = sum;
        
        return sum+data;
    }
    public void toSumTree(Tree root){
        changeValues(root);
    }
}