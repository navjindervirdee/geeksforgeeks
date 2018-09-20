import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
	    int t = Integer.parseInt(br.readLine());
	    for(int c=0;c<t;c++){
	        int n = Integer.parseInt(br.readLine());
	        String [] temp = br.readLine().trim().split(" ");
	        long sum = 0;
	        for(int i=0;i<n-1;i++){
	            sum += Integer.parseInt(temp[i]);
	        }
	        
	        long act = (n*(n+1))/2;
	        System.out.println(act - sum);
	        
	        
	    }
	    
	}
}