import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    
	    for(int c=0;c<t;c++){
	        //num eggs
	        int k = input.nextInt();
	        //num of floors
	        int n = input.nextInt();
	        
	        int [][] table = new int[n+1][k+1];
	        for(int i=1;i<n+1;i++){
	            table[i][1] = i;
	        }
	        
	        for(int i=2;i<k+1;i++){
	            for(int j=1;j<n+1;j++){
	                int min = Integer.MAX_VALUE;
	                for(int l=1;l<j+1;l++){
	                    int max = 1 + Math.max(table[l-1][i-1],table[j-l][i]);
	                    min = Math.min(min,max);
	                }
	                table[j][i] = min;
	            }
	        }
	        System.out.println(table[n][k]);
	    }
	}
}