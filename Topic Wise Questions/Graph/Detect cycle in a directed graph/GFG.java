/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below*/
class GfG
{
    boolean relaxEdges(int v, List<Integer> [] alist, boolean [] visited, boolean [] explored){
        visited[v] = true;
        List<Integer> list = alist[v];
        boolean result = false;
        for(int i=0;i<list.size();i++){
            int t = list.get(i);
            if(visited[t] && !explored[t]){
                return true;
            }
            if(visited[t]){
                continue;
            }
            result = relaxEdges(t, alist, visited,explored);
            if(result){
                return true;
            }
        }
        explored[v] = true;
        return result;
    }
    
    public boolean hasCycle(int v,LinkedList<Integer>[] alist,boolean[] visited,boolean[] explored){
        //return relaxEdges(v-1,alist,visited,explored);
        for(int i=0;i<alist.length;i++){
            if(visited[i]){
                continue;
            }
            boolean result = relaxEdges(i,alist,visited,explored);
            if(result){
                return true;
            }
        }
        return false;
    }
}