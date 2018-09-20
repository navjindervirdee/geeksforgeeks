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
	        int [] array = new int[n];
	        
	        for(int i=0;i<n;i++){
	            array[i] = Integer.parseInt(temp[i]);
	        }
	        
	        int [] min = new int[n];
	        
	        for(int i = 0;i<n;i++){
	            min[i] = Integer.MAX_VALUE;
	        }
	        
	        
	        min[0] = 0;
	        
	        for(int i=0;i<n-1;i++){
	            if(array[i]==0 || min[i]==Integer.MAX_VALUE){
	                continue;
	            }
	            for(int j=i+1;j<Math.min(n,array[i]+i+1);j++){
	                min[j] = Math.min(min[j],min[i]+1);
	            }
	        }
	        
	        if(min[n-1]==Integer.MAX_VALUE){
	            System.out.println(-1);
	            continue;
	        }
	        System.out.println(min[n-1]);
	    }
	}
}