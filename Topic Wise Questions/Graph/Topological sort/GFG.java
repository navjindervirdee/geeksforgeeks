/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below*/
class GfG
{
    static class Vertex{
        int index;
        int prev;
        int post;
        
        public Vertex(int index){
            this.index = index;
        }
    }
    
    public static int relaxEdges(int v, List<Integer> [] graph, Vertex [] vertex, boolean [] visited, int tick){
        visited[v] = true;
        vertex[v].prev = tick;
        
        List<Integer> list = graph[v];
        for(int i=0;i<list.size();i++){
            int t = list.get(i);
            if(visited[t]){
                continue;
            }
            tick = relaxEdges(t,graph,vertex,visited,tick+1);
        }
        vertex[v].post = tick+1;
        return tick+1;
    }
    
    public static int[] topoSort(ArrayList<Integer> graph[],int N){
        Vertex [] vertex = new Vertex[N];
        for(int i=0;i<vertex.length;i++){
            vertex[i] = new Vertex(i);
        }
        
        boolean [] visited = new boolean[N];
        int tick = -1;
        for(int i=0;i<N;i++){
            if(visited[i]){
                continue;
            }
            tick = relaxEdges(i,graph,vertex,visited,tick+1);
        }
        
        Arrays.sort(vertex, new Comparator<Vertex>(){
            public int compare(Vertex v1, Vertex v2){
                return v2.post-v1.post;
            }
        });
        
        int [] topsort = new int[N];
        for(int i=0;i<vertex.length;i++){
            topsort[i] = vertex[i].index;
        }
        return topsort;
    }
}