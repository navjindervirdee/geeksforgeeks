/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/


/*node class of the binary tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}*/
class GfG
{
    public static Node construcTree(int arr[], int n){
       Map<Integer,Node> map = new HashMap<Integer,Node>();
       Node [] array = new Node[n];
       Node root = null;
       for(int i=0;i<n;i++){
           Node node = new Node(i);
           map.put(i,node);
           if(arr[i]==-1){
               root = node;
           }
       }
       
       for(int i=0;i<n;i++){
           if(arr[i]==-1){
               continue;
           }
           Node node = map.get(arr[i]);
           if(node.left==null){
               node.left = map.get(i);
               continue;
           }
           node.right = map.get(i);
       }
       return root;
    }
}