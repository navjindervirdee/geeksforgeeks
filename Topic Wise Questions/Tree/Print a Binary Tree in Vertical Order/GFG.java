/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/


/*
Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
/* Should print vertical order such that each vertical line
   is separated by $ */
class GfG
{
    void verticalOrder(Node root){
       	Queue<Node> queue = new LinkedList<Node>();
       	Queue<Integer> posQueue = new LinkedList<Integer>();
       	queue.add(root);
       	posQueue.add(0);
       	int [] minmax = new int[2];
       	minmax[0] = Integer.MAX_VALUE;
       	minmax[1] = Integer.MIN_VALUE;
       	
       	Map<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
       	
       	while(!queue.isEmpty()){
       	    Node node = queue.poll();
       	    int pos = posQueue.poll();
       	    if(map.containsKey(pos)){
       	        List<Integer> list = map.get(pos);
       	        list.add(node.data);
       	        map.put(pos,list);
       	    }
       	    else{
       	        List<Integer> list = new ArrayList<Integer>();
       	        list.add(node.data);
       	        map.put(pos,list);
       	    }
       	    
       	    minmax[0] = Math.min(minmax[0],pos);
       	    minmax[1] = Math.max(minmax[1],pos);
       	    
       	    if(node.left!=null){
       	        queue.add(node.left);
       	        posQueue.add(pos-1);
       	    }
       	    if(node.right!=null){
       	        queue.add(node.right);
       	        posQueue.add(pos+1);
       	    }
       	}
       	
       	for(int i=minmax[0];i<minmax[1]+1;i++){
       	    List<Integer> list = map.get(i);
       	    //Collections.sort(list);
       	    for(int j=0;j<list.size();j++){
       	        System.out.print(list.get(j) + " ");
       	    }
       	    System.out.print("$");
       	}
    }
}