/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*complete the given function*/
class GfG{
    private static boolean checkTree(Tree T1, Tree T2){
        if(T1==null && T2==null){
            return true;
        }
        if(T1==null && T2!=null){
            return false;
        }
        
        if(T1!=null && T2==null){
            return false;
        }
        
        if(T1.data!=T2.data){
            return false;
        }
        
        return checkTree(T1.left,T2.left) && checkTree(T1.right,T2.right);
    }
    
    public static boolean isSubtree(Tree T, Tree S){
        if(T==null){
            return false;
        }
        boolean subtree = checkTree(T,S);
        if(subtree){
            return true;
        }
        return isSubtree(T.left,S) || isSubtree(T.right,S);
    }
}