import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static class Node{
        double val;
        int left;
        int right;
        
        int row;
        int col;
        
        public Node(int row, int col){
            this.val = 0;
            this.left = col;
            this.right = col+1;
            this.row = row;
            this.col = col;
        }
    }
    
    private static void createRow(List<List<Node>> pascal){
        List<Node> prev = pascal.get(pascal.size()-1);
        List<Node> curr = new ArrayList<Node>();
        
        for(int i=0;i<prev.size()+1;i++){
            Node node = new Node(pascal.size(),i);
            curr.add(node);
        }
        pascal.add(curr);
    }
    
    private static void fillPascal(List<List<Node>> pascal, Node node, double k){
        double canfill = 1.0 - node.val;
        if(canfill>=k){
            node.val += k;
            return;
        }
        
        node.val = 1.0;
        double left = k-canfill;
        
        if(node.row+1>=pascal.size()){
            createRow(pascal);
        }
        
        fillPascal(pascal,pascal.get(node.row+1).get(node.left), left/2.0);
        fillPascal(pascal,pascal.get(node.row+1).get(node.right), left/2.0);
    }
    
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = Integer.parseInt(input.nextLine());
	    
	    for(int c=0;c<t;c++){
	        double k = Integer.parseInt(input.nextLine());
	        int i = Integer.parseInt(input.nextLine())-1;
	        int j = Integer.parseInt(input.nextLine())-1;
	        
	        
	        List<List<Node>> pascal = new ArrayList<List<Node>>();
	        
	        List<Node> list = new ArrayList<Node>();
	        Node node = new Node(0,0);
	        list.add(node);
	        pascal.add(list);
	        
	        fillPascal(pascal,node, k);
	        
	        if(i>=pascal.size()){
	            System.out.println(0.0);
	            continue;
	        }
	        System.out.println(pascal.get(i).get(j).val);
	    }
	    
	}
}