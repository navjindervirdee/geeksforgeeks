import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static boolean relaxEdges(int i, int j, int [][] mat, boolean [][] seen){
        seen[i][j] = true;
        if(mat[i][j]==2){
            return true;
        }
        
        boolean result = false;
        
        if(!result && i-1>-1){
            if(mat[i-1][j]!=0 && !seen[i-1][j]){
                result = relaxEdges(i-1,j,mat,seen);
            }
        }
        
        if(!result && j-1>-1){
            if(mat[i][j-1]!=0 && !seen[i][j-1]){
                result = relaxEdges(i,j-1,mat,seen);
            }
        }
        
        if(!result && j+1<mat.length){
            if(mat[i][j+1]!=0 && !seen[i][j+1]){
                result = relaxEdges(i,j+1,mat,seen);
            }
        }
        
        
        if(!result && i+1<mat.length){
            if(mat[i+1][j]!=0 && !seen[i+1][j]){
                result = relaxEdges(i+1,j,mat,seen);
            }
        }
        
        return result;
    }
	public static void main (String[] args) throws Exception{
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     int t = Integer.parseInt(br.readLine());
	     
	     for(int c=0;c<t;c++){
	         int n = Integer.parseInt(br.readLine());
	         int [][] mat = new int[n][n];
	         
	         String [] temp = br.readLine().trim().split(" ");
	         
	         int k = 0;
	         int srci = -1;
	         int srcj = -1;
	         for(int i=0;i<n;i++){
	             for(int j=0;j<n;j++){
	                 mat[i][j] = Integer.parseInt(temp[k]);
	                 if(mat[i][j]==1){
	                     srci = i;
	                     srcj = j;
	                 }
	                 k++;
	             }
	         }
	         
	         boolean [][] seen = new boolean[n][n];
	         boolean result = relaxEdges(srci,srcj,mat,seen);
	         if(result){
	             System.out.println(1);
	         }
	         else{
	             System.out.println(0);
	         }
	     }
	}
}