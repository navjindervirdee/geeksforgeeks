import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t  = Integer.parseInt(br.readLine());
	    for(int c=0;c<t;c++){
	        char [] array = br.readLine().trim().toCharArray();
	        boolean [][] table = new boolean[array.length][array.length];
	        
	        for(int i=0;i<array.length;i++){
	            table[i][i] = true;
	        }
	        
	        int maxlen = 1;
	        int start = 0;
	        int end = 0;
	        for(int k =2;k<array.length+1;k++){
	            for(int i=0;i<array.length-k+1;i++){
	                int j = i+k-1;
	                if(array[i]==array[j]){
	                    int m = i+1;
	                    int l = j-1;
	                    if(m>l || table[m][l]){
	                        table[i][j] = true;
	                        if(maxlen<k){
	                            start = i;
	                            end = j;
	                            maxlen = k;
	                        }
	                    }
	                }
	            }
	        }
	        
	        for(int i=start;i<=end;i++){
	            System.out.print(array[i]);
	        }
	        System.out.println();

	    }
	}
}