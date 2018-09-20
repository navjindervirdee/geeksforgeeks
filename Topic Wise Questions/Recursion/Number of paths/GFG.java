import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    private static void dfs(int i, int j, int [][] mat){
        //System.out.println(i + " " + j);
        if(i>=mat.length || j>=mat[0].length || mat[i][j]>0){
            return;
        }
        
        dfs(i,j+1,mat);
        dfs(i+1,j,mat);
        if(i+1<mat.length){
            mat[i][j] = mat[i+1][j];
        }
        if(j+1<mat[0].length){
            mat[i][j] += mat[i][j+1];
        }
        //mat[i][j] = mat[i+1][j] + mat[i][j+1];
    }
    
	public static void main (String[] args){
	   Scanner input = new Scanner(System.in);
	   int t = Integer.parseInt(input.nextLine());
	   
	   for(int c=0;c<t;c++){
	       String [] params = input.nextLine().trim().split(" ");
	       int n = Integer.parseInt(params[0]);
	       int m = Integer.parseInt(params[1]);
	       
	       int [][] mat = new int[n][m];
	       mat[n-1][m-1] = 1;
	       dfs(0,0,mat);
	       System.out.println(mat[0][0]);
	   }
	}
}