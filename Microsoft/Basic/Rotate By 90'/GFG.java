import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    for(int c=0;c<t;c++){
	        int n = input.nextInt();
	        int [][] mat = new int[n][n];
	        for(int i=0;i<n;i++){
	            for(int j=0; j<n;j++){
	                mat[i][j] = input.nextInt();
	            }
	        }
	        for(int i=n-1;i>-1;i--){
	            for(int j=0;j<n;j++){
	               System.out.print(mat[j][i] + " ");
	            }
	        }
	        System.out.println();
	        
	    }
	}
}