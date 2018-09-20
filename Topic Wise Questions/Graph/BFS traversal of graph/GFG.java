/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/


// Complete this function
class GFG
{
    public static void bfs(int s, ArrayList<Integer> adj[],boolean visited[]){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(s);
        visited[s] = true;
        while(!queue.isEmpty()){
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            List<Integer> list = adj[vertex];
            for(int i =0;i<list.size();i++){
                if(visited[list.get(i)]){
                    continue;
                }
                queue.add(list.get(i));
                visited[list.get(i)] = true;
            }
        }
    }
}