import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    private static void dfs(int [][] mat, int i, int j, int prev, int curr){
        //System.out.println(i + " " + j + " " + mat[i][j]);
        mat[i][j] = curr;
        
        if(i-1>-1 && mat[i-1][j]==prev){
            dfs(mat,i-1,j,prev,curr);
        }
        
        if(i+1<mat.length && mat[i+1][j]==prev){
            dfs(mat, i+1,j,prev,curr);
        }
        
        if(j-1>-1 && mat[i][j-1]==prev){
            dfs(mat, i,j-1,prev,curr);
        }
        
        if(j+1<mat[0].length && mat[i][j+1]==prev){
            dfs(mat, i,j+1,prev,curr);
        }
    }
    
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = Integer.parseInt(input.nextLine().trim());
	    
	    for(int c=0;c<t;c++){
	        String [] params = input.nextLine().trim().split(" ");
	        int n = Integer.parseInt(params[0]);
	        int m = Integer.parseInt(params[1]);
	        
	        String [] temp = input.nextLine().trim().split(" ");
	        
	        int [][] mat = new int[n][m];
	        int k = 0;
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                mat[i][j] = Integer.parseInt(temp[k]);
	                k++;
	            }
	        }
	        
	        String [] indexColor = input.nextLine().trim().split(" ");
	        int i = Integer.parseInt(indexColor[0]);
	        int j = Integer.parseInt(indexColor[1]);
	        int clr = Integer.parseInt(indexColor[2]);
	        
	        dfs(mat,i,j,mat[i][j],clr);
	        
	        for(i=0;i<n;i++){
	            for(j=0;j<m;j++){
	                System.out.print(mat[i][j] + " ");
	            }
	        }
	        
	        System.out.println();
	    }
	}
	
}