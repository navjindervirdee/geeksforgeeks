/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below*/
class GfG
{   
    void relaxEdges(int v, LinkedList<Integer> adj[], boolean [] visited){
        visited[v] = true;
        LinkedList<Integer> list = adj[v];
        System.out.print(v + " ");
        for(int i=0;i<list.size();i++){
            int t = list.get(i);
            if(visited[t]){
                continue;
            }
            relaxEdges(t,adj,visited);
        }
    }
    public void DFS(int v,LinkedList<Integer> adj[],boolean visited[]){
        relaxEdges(v,adj,visited);
    }
}