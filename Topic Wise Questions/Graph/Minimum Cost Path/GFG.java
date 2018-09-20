import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static class Vertex{
        int i;
        int j;
        int distance;
        
        public Vertex(int i, int j){
            this.i = i;
            this.j = j;
            this.distance = Integer.MAX_VALUE;
        }
    }
    
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    for(int c=0;c<t;c++){
	        int n = Integer.parseInt(br.readLine());
	        int [][] mat =  new int[n][n];
	        
	        String [] tempp = br.readLine().trim().split(" ");
	        
	        int k = 0;
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                mat[i][j] = Integer.parseInt(tempp[k]);
	                k++;
	            }
	        }
	        
	        PriorityQueue<Vertex> queue = new PriorityQueue<Vertex>(new Comparator<Vertex>(){
	            public int compare(Vertex v1, Vertex v2){
	                return v1.distance - v2.distance;
                }
            });
            
            int [][] distances = new int[n][n];
            for(int i=0;i<n;i++){
                for(int j = 0;j<n;j++){
                    distances[i][j] = Integer.MAX_VALUE;
                }
            }
            
            distances[0][0] = mat[0][0];
            Vertex vertex = new Vertex(0,0);
            vertex.distance = mat[0][0];
            queue.add(vertex);
            
            while(!queue.isEmpty()){
                Vertex vert = queue.poll();
                int i = vert.i;
                int j = vert.j;
                int dist = vert.distance;
                
                if(i-1>-1){
                    if(distances[i-1][j]>mat[i-1][j] + dist){
                        distances[i-1][j] = mat[i-1][j] + dist;
                        Vertex temp = new Vertex(i-1,j);
                        temp.distance = distances[i-1][j];
                        queue.add(temp);
                    }
                }
                if(j-1>-1){
                    if(distances[i][j-1]>mat[i][j-1] + dist){
                        distances[i][j-1] = mat[i][j-1] + dist;
                        Vertex temp = new Vertex(i,j-1);
                        temp.distance = distances[i][j-1];
                        queue.add(temp);
                    }
                }
                if(j+1<n){
                    if(distances[i][j+1]>mat[i][j+1] + dist){
                        distances[i][j+1] = mat[i][j+1] + dist;
                        Vertex temp = new Vertex(i,j+1);
                        temp.distance = distances[i][j+1];
                        queue.add(temp);
                    }
                }
                if(i+1<n){
                    if(distances[i+1][j]>mat[i+1][j] + dist){
                        distances[i+1][j] = mat[i+1][j] + dist;
                        Vertex temp = new Vertex(i+1,j);
                        temp.distance = distances[i+1][j];
                        queue.add(temp);
                    }
                }
            }
            
            System.out.println(distances[n-1][n-1]);
        }
	
	}
}