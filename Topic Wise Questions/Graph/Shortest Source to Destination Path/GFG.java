import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static class Pair{
        int x;
        int y;
        
        public Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    for(int c=0;c<t;c++){
	        String [] params = br.readLine().trim().split(" ");
	        int n = Integer.parseInt(params[0]);
	        int m = Integer.parseInt(params[1]);
	        
	        String [] temp = br.readLine().trim().split(" ");
	        String [] indexes = br.readLine().trim().split(" ");
	        
	        int destx = Integer.parseInt(indexes[0]);
	        int desty = Integer.parseInt(indexes[1]);
	        
	        int [][] mat = new int[n][m];
	        int k = 0;
	        
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                mat[i][j] = Integer.parseInt(temp[k]);
	                k++;
	            }
	        }
	        
	        int [][] dist = new int[n][m];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                dist[i][j] = Integer.MAX_VALUE;
	            }
	        }
	        
	        dist[0][0] = 0;
	        
	        Queue<Pair> queue = new LinkedList<Pair>();
	        Pair pair = new Pair(0,0);
	        queue.add(pair);
	        
	        while(!queue.isEmpty()){
	            Pair p = queue.poll();
	            int x = p.x;
	            int y = p.y;
	            int d = dist[x][y];
	            
	            if(x-1>-1 && dist[x-1][y]==Integer.MAX_VALUE && mat[x-1][y]!=0){
	                dist[x-1][y] = d+1;
	                Pair up = new Pair(x-1,y);
	                queue.add(up);
	            }
	            
	            if(y-1>-1 && dist[x][y-1]==Integer.MAX_VALUE && mat[x][y-1]!=0){
	                dist[x][y-1] = d+1;
	                Pair left = new Pair(x,y-1);
	                queue.add(left);
	            }
	            
	            if(y+1<m && dist[x][y+1]==Integer.MAX_VALUE && mat[x][y+1]!=0){
	                dist[x][y+1] = d+1;
	                Pair right = new Pair(x,y+1);
	                queue.add(right);
	            }
	            
	            if(x+1<n && dist[x+1][y]==Integer.MAX_VALUE && mat[x+1][y]!=0){
	                dist[x+1][y] = d+1;
	                Pair down = new Pair(x+1,y);
	                queue.add(down);
	            }
	        }
	        
	        if(dist[destx][desty]==Integer.MAX_VALUE || mat[0][0]==0){
	            System.out.println(-1);
	            continue;
	        }
	        System.out.println(dist[destx][desty]);
	    }
	}
}