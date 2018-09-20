/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}
*/
class GfG
{
	public boolean isIsomorphic(Node root1,Node root2){
        if(root1==null && root2==null){
            return true;
        }
        
        if(root1==null && root2!=null){
            return false;
        }
        
        if(root2==null && root1!=null){
            return false;
        }
        
        if(root1.data!=root2.data){
            return false;
        }
        
        Queue<Node> vary = new LinkedList<Node>();
        Queue<Node> fixed = new LinkedList<Node>();
        
        vary.add(root1);
        fixed.add(root2);
        
        while(!vary.isEmpty()){
            Node node1 = vary.poll();
            Node node2 = fixed.poll();
            
            Node left1 = node1.left;
            Node right1 = node1.right;
            Node left2 = node2.left;
            Node right2 = node2.right;
            
            if(left1==null && right1==null){
                if(left2!=null || right2!=null){
                    return false;
                }
                continue;
            }
            
            if(left1==null && right1!=null){
                if((left2==null && right2==null) || (left2!=null && right2!=null)){
                    return false;
                }
                
                if(left2==null && right2!=null){
                    if(right2.data==right1.data){
                        vary.add(right1);
                        fixed.add(right2);
                    }
                    else{
                        return false;
                    }
                    continue;
                }
                if(left2!=null && right2==null){
                    if(right1.data==left2.data){
                        vary.add(right1);
                        fixed.add(left2);
                    }
                    else{
                        return false;
                    }
                    continue;
                }
            }
            
            if(left1!=null && right1==null){
                if((left2==null && right2==null) || (left2!=null && right2!=null)){
                    return false;
                }
                
                if(left2!=null && right2==null){
                    if(left2.data==left1.data){
                        vary.add(left1);
                        fixed.add(left2);
                    }
                    else{
                        return false;
                    }
                    continue;
                }
                if(left2==null && right2!=null){
                    if(right2.data==left1.data){
                        vary.add(left1);
                        fixed.add(right2);
                    }
                    else{
                        return false;
                    }
                    continue;
                }
            }
            
            if(left2.data==left1.data && right2.data==right1.data){
                vary.add(left1);
                fixed.add(left2);
                vary.add(right1);
                fixed.add(right2);
                continue;
            }
            if(left2.data==right1.data && left1.data == right2.data){
                vary.add(right1);
                fixed.add(left2);
                vary.add(left1);
                fixed.add(right2);
                continue;
            }
            return false;
        }
        
        return fixed.isEmpty();
    }
}