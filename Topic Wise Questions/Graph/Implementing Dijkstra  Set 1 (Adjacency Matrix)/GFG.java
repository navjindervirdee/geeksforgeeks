/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the given function*/
class GfG{
    static class Vertex{
        int index;
        int distance;
        
        public Vertex(int index){
            this.index = index;
            this.distance = Integer.MAX_VALUE;
        }
    }
    
    public static void dijkstra(int graph[][], int src ,int V){
        PriorityQueue<Vertex> queue = new PriorityQueue<Vertex>(new Comparator<Vertex>(){
            public int compare(Vertex v1,Vertex v2){
                return v1.distance - v2.distance;
            }
        });
        
        Vertex [] vertex = new Vertex[V];
        for(int i=0;i<V;i++){
            vertex[i] = new Vertex(i);
        }
        vertex[src].distance = 0;
        queue.add(vertex[src]);
        
        while(!queue.isEmpty()){
            Vertex vert = queue.poll();
            int index = vert.index;
            for(int i=0;i<V;i++){
                if(graph[index][i]==0){
                    continue;
                }
                Vertex temp = vertex[i];
                if(temp.distance>vert.distance+graph[index][i]){
                    temp.distance = vert.distance+graph[index][i];
                    queue.add(vertex[i]);
                }
            }
        }
        
        for(int i=0;i<V;i++){
            System.out.print(vertex[i].distance + " ");
        }
    }
}