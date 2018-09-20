import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    for(int c=0;c<t;c++){
	        int n = Integer.parseInt(br.readLine());
	        String [] temp = br.readLine().trim().split(" ");
	        
	        int [] array =  new int[n];
	        
	        for(int i=0;i<n;i++){
	            array[i] = Integer.parseInt(temp[i]);
	        }
	        
	        int m = Integer.parseInt(br.readLine());
	        Arrays.sort(array);
	        
	        int min = Integer.MAX_VALUE;
	        for(int i=0;i<n-m+1;i++){
	            min = Math.min(array[i+m-1]-array[i],min);
	        }
	        
	        System.out.println(min);
	    }
	}
}