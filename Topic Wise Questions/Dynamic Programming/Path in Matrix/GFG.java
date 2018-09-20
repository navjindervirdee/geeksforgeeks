import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    for(int c=0;c<t;c++){
	        int n = Integer.parseInt(br.readLine());
	        String [] temp = br.readLine().trim().split(" ");
	        
	        int [][] mat = new int[n][n];
	        
	        int k = 0;
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                mat[i][j] = Integer.parseInt(temp[k]);
	                k++;
	            }
	        }
	        
	        for(int i=n-2;i>-1;i--){
	            for(int j=0;j<n;j++){
	                int max = 0;
	                if(j-1>-1){
	                    max = Math.max(max,mat[i+1][j-1]);
	                }
	                if(j+1<n){
	                    max = Math.max(max,mat[i+1][j+1]);
	                }
	                max = Math.max(max,mat[i+1][j]);
	                mat[i][j] += max;
	            }
	        }
	        int max = 0;
	        for(int i=0;i<n;i++){
	            max = Math.max(mat[0][i],max);
	        }
	        System.out.println(max);
	    }
	}
}