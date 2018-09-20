import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    private static int dfs(int [][] mat){
        int result = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    continue;
                }
                int count = explore(mat,i,j);
                result = Math.max(result,count);
            }
        }
        return result;
    }
    
    private static int explore(int [][] mat, int i, int j){
        mat[i][j] = 0;
        int count = 1;
        
        if(i-1>-1 && mat[i-1][j]!=0){
            count += explore(mat,i-1,j);
        }
        
        if(i-1>-1 && j-1>-1 && mat[i-1][j-1]!=0){
            count += explore(mat,i-1,j-1);
        }
        
        if(i-1>-1 && j+1<mat[0].length && mat[i-1][j+1]!=0){
            count += explore(mat,i-1,j+1);
        }
        
        if(j-1>-1 && mat[i][j-1]!=0){
            count += explore(mat,i,j-1);
        }
        
        if(j+1<mat[0].length && mat[i][j+1]!=0){
            count += explore(mat,i,j+1);
        }
        
        if(i+1<mat.length && mat[i+1][j]!=0){
            count += explore(mat,i+1,j);
        }
        
        if(i+1<mat.length && j-1>-1 && mat[i+1][j-1]!=0){
            count += explore(mat,i+1,j-1);
        }
        
        if(i+1<mat.length && j+1<mat[0].length && mat[i+1][j+1]!=0){
            count += explore(mat,i+1,j+1);
        }
        return count;
    }
    
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = Integer.parseInt(input.nextLine());
	    
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
	        
	        int result = dfs(mat);
	        System.out.println(result);
	    }
	}
}