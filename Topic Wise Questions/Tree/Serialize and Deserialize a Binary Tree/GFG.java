/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the given function
Node is as follows:
class Tree{
	int data;
	Tree left,right;
	Tree(int d){
		data=d;
		left=right=null;
	}
}*/
class GfG{
    
   
    
	public String serialize(Tree root,ArrayList<Integer> aa) {
	    preOrder(root,aa);
        StringBuilder sb = new StringBuilder();
        for(int i : aa){
            sb.append(i + "/");
        }
        return sb.toString();
    }
    
    public void preOrder(Tree root, List<Integer> list){
        if(root==null){
            list.add(-1);
            return;
        }
        
        list.add(root.data);
        preOrder(root.left,list);
        preOrder(root.right,list);
    }
    
    public int preOrder(Tree parent, int index, int [] array){
        if(index>array.length-1){
            return index;
        }
        
        if(array[index]!=-1){
            parent.left = new Tree(array[index]);
            index = preOrder(parent.left,index+1,array)-1;
        }
        if(index+1<array.length && array[index+1]!=-1){
            parent.right = new Tree(array[index+1]);
            index = preOrder(parent.right,index+2,array)-2;
        }
        return index+2;
    }
    
    public Tree deSerialize(String data) {
        String [] temp = data.split("/");
        int [] array = new int[temp.length-1];
        for(int i=0;i<array.length;i++){
            array[i] = Integer.parseInt(temp[i]);
        }
        
        Tree node = new Tree(array[0]);
        preOrder(node,1,array);
        
        return node;
    }
}