import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    for(int c=0;c<t;c++){
	        String [] params = br.readLine().trim().split(" ");
	        int n = Integer.parseInt(params[0]);
	        int m = Integer.parseInt(params[1]);
	        
	        String [] strings = br.readLine().trim().split(" ");
	        
	        char [] array1 = strings[0].toCharArray();
	        char [] array2 = strings[1].toCharArray();
	        
	        int [][] table = new int[n+1][m+1];
	        
	        for(int i=0;i<n+1;i++){
	            table[i][0] = i;
	        }
	        
	        for(int i=0;i<m+1;i++){
	            table[0][i] = i;
	        }
	        
	        for(int i=1;i<n+1;i++){
	            for(int j=1;j<m+1;j++){
	                if(array1[i-1]==array2[j-1]){
	                    table[i][j] = Math.min(Math.min(table[i-1][j]+1,table[i][j-1]+1),table[i-1][j-1]);
	                }
	                else{
	                    table[i][j] = Math.min(Math.min(table[i-1][j]+1,table[i][j-1]+1),table[i-1][j-1]+1);
	                }
	            }
	        }
	        System.out.println(table[n][m]);
	    }
	}
}