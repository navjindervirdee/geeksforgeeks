import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    for(int c=0;c<t;c++){
	        int n = Integer.parseInt(br.readLine());
	        String [] temp = br.readLine().trim().split(" ");
	        
	        int [][] mat = new int[n][n];
	        int [][] dist = new int[n][n];
	        int k = 0;
	        
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                mat[i][j] = Integer.parseInt(temp[k]);
	                dist[i][j] = mat[i][j];
	                k++;
	            }
	        }
	        
	        for(k=0;k<n;k++){
	            for(int i = 0;i<n;i++){
	                for(int j=0;j<n;j++){
	                    if(dist[i][j]>dist[i][k]+dist[k][j]){
	                        dist[i][j] = dist[i][k]+dist[k][j];
	                    }
	                }
	            }
	        }
	        
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                System.out.print(dist[i][j]+" ");
	            }
	        }
	        
	        System.out.println();
	    }
	    
	}
}