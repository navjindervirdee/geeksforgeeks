/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


// FUNCTION CODE
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
/* Should print vertical order such that each vertical line
    is separated by $ */
class GfG
{
    void preOrder(Node root,int [] array, int line,Map<Integer,List<Integer>> map){
        if(root==null){
            return;
        }
        if(map.containsKey(line)){
            List<Integer> list = map.get(line);
            list.add(root.data);
            map.put(line,list);
        }
        else{
            List<Integer> list = new ArrayList<Integer>();
            list.add(root.data);
            map.put(line,list);
        }
        array[0] = Math.min(array[0],line);
        array[1] = Math.max(array[1],line);
        preOrder(root.left,array,line-1,map);
        preOrder(root.right,array,line+1,map);
    }
    void verticalOrder(Node node) {
        int [] array =  new int[2];
        array[0] = Integer.MAX_VALUE;
        array[1] = Integer.MIN_VALUE;
        int lines = array[1]  - array[0] + 1;
        Map<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
        preOrder(node,array,0,map);
        for(int i=array[0]; i<=array[1];i++){
            List<Integer> list = map.get(i);
            for(int j=0;j<list.size();j++){
                System.out.print(list.get(j)  + " ");
            }
            System.out.print("$");
        }
    }
}