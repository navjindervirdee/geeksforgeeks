class Node
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
    int countLeaves(Node node) {
        if(node==null){
            return 0;
        }
        if(node.left == null && node.right == null){
            return 1;
        }
        int left = countLeaves(node.left);
        int right = countLeaves(node.right);
        return left+right;
    }
}