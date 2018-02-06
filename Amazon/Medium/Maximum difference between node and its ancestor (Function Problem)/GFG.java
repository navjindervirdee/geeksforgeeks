/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*  A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
Structure of Res class 
class Res
{
	int r = Integer.MIN_VALUE;
}*/
class GfG
{
    int findMax(Node node,Res r){
        if(node==null){
            return -1;
        }
        
        int minL = findMax(node.left,r);
        int minR = findMax(node.right,r);
        
        if(minL==-1 && minR==-1){
            return node.data;
        }
        
        if(minL==-1){
            int diff = node.data - minR;
            r.r = Math.max(r.r,diff);
            return Math.min(node.data,minR);
        }
        
        if(minR==-1){
            int diff = node.data - minL;
            r.r = Math.max(r.r,diff);
            return Math.min(node.data,minL);
        }
        else{
            int diff1 = node.data - minL;
            int diff2 = node.data - minR;
            r.r = Math.max(r.r,diff1);
            r.r = Math.max(r.r,diff2);
            return Math.min(Math.min(minL,minR),node.data);
        }
        
    }
	int maxDiff(Node root){
		if(root.left==null && root.right==null){
		    return 0;
		}
		Res r = new Res();
		findMax(root,r);
		return r.r;
	}
}