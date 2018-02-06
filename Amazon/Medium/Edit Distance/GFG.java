import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    for(int c=0;c<t;c++){
	        int n = input.nextInt();
	        int m = input.nextInt();
	        input.nextLine();
	        String [] strs = input.nextLine().trim().split(" ");
	        int [][] table = new int [n+1][m+1];
	        for(int i=0;i<m+1;i++){
	            table[0][i] = i;
	        }
	        for(int i=0;i<n+1;i++){
	            table[i][0] = i;
	        }
	        for(int i=1;i<n+1;i++){
	            for(int j=1;j<m+1;j++){
	                if(strs[1].charAt(j-1)==strs[0].charAt(i-1)){
	                    table[i][j] = table[i-1][j-1];
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