/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
class GfG
{
    private static void findNode(Node node, List<Node> temp, Set<Node> set, int k){
        if(node==null){
            return;
        }
        if(node.left==null && node.right==null){
            int index = temp.size()-k;
            if(k==0){
                set.add(node);
            }
            if(index>-1 && index<temp.size()){
                set.add(temp.get(index));
            }
            return;
        }
        
        temp.add(node);
        findNode(node.left,temp,set,k);
        findNode(node.right,temp,set,k);
        temp.remove(temp.size()-1);
    }
    public static int printKDistantfromLeaf(Node node, int k){
        List<Node> temp = new ArrayList<Node>();
        Set<Node> set = new HashSet<Node>();
        
        findNode(node,temp,set,k);
        return set.size();
    }
}