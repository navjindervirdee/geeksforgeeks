import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = Integer.parseInt(input.nextLine());
	    
	    for(int c=0;c<t;c++){
	        String params [] = input.nextLine().trim().split(" ");
	        int n = Integer.parseInt(params[0]);
	        int m = Integer.parseInt(params[1]);
	        
	        String [] temp = input.nextLine().trim().split(" ");
	        
	        int [][] mat = new int[n][m];
	        int k = 0;
	        int max = 0;
	        
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                mat[i][j] = Integer.parseInt(temp[k]);
	                max = Math.max(max,mat[i][j]);
	                k++;
	            }
	        }
	        
	        
	        for(int i=1;i<n;i++){
	            for(int j=1;j<m;j++){
	                if(mat[i][j]==1){
	                    mat[i][j] = Math.min(Math.min(mat[i-1][j],mat[i][j-1]),mat[i-1][j-1])+1;
	                    max = Math.max(max, mat[i][j]);
	                }
	            }
	        }
	        
	        System.out.println(max);
	    }
	}
}