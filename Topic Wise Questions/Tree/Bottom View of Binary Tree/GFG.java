/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* Tree node class
class Node {
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}*/
class GfG
{
    void levelOrderTraversal(Node root, int [] minmax, int [] array){
        Queue<Node> queue = new LinkedList<Node>();
        Queue<Integer> posqueue = new LinkedList<Integer>();
        queue.add(root);
        posqueue.add(0);
        while(!queue.isEmpty()){
            Node node  = queue.poll();
            int pos = posqueue.poll();
            if(array==null){
                minmax[0] = Math.min(minmax[0],pos);
                minmax[1] = Math.max(minmax[1],pos);
            }
            else{
                array[pos+Math.abs(minmax[0])] = node.data;
            }
            if(node.left!=null){
                queue.add(node.left);
                posqueue.add(pos-1);
            }
            if(node.right!=null){
                queue.add(node.right);
                posqueue.add(pos+1);
            }
        }
    }
    // Should print bottom view of tree with given root
    public void bottomView(Node root){
        int [] minmax =  new int[2];
        minmax[0] = Integer.MAX_VALUE;
        minmax[1] = Integer.MIN_VALUE;
        int [] array = null;
        levelOrderTraversal(root,minmax,array);
        array = new int[minmax[1]-minmax[0]+1];
        Arrays.fill(array,-1);
        levelOrderTraversal(root, minmax, array);
        
        for(int i=0;i<array.length;i++){
            if(array[i]!=-1){
                System.out.print(array[i] + " ");
            }
        }
    }
}