/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* A Binary Search Tree node */
/* class Node
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
    Node lca(Node node, int n1, int n2) 
    {
        boolean found2 = false;
        boolean found1 = false;
        List<Node> list1 = new ArrayList<Node>();
        Node temp = node;
        while(temp!=null){
            list1.add(temp);
            if(temp.data>n1){
                temp = temp.left;
                continue;
            }
            if(temp.data<n1){
                temp = temp.right;
            }
            else{
                found1 = true;
                break;
            }
        }
        
        List<Node> list2 = new ArrayList<Node>();
        temp = node;
        while(temp!=null){
            list2.add(temp);
            if(temp.data>n2){
                temp = temp.left;
                continue;
            }
            if(temp.data<n2){
                temp = temp.right;
            }
            else{
                found2 = true;
                break;
            }
        }
        
        if(found1 && found2){
            for(int i=list1.size()-1;i>-1;i--){
                if(list2.contains(list1.get(i))){
                    return list1.get(i);
                }
            }
            return null;
        }
        else{
            return null;
        }
        // Your code here
    }
    
}