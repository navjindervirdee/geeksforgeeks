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
	        if(n==0){
	            System.out.println(0);
	            continue;
	        }
	        
	        int [] array =  new int[n];
	        
	        for(int i=0;i<n;i++){
	            array[i] = Integer.parseInt(temp[i]);
	        }
	        
	        int [] max = new int[n];
	        for(int i=0;i<n;i++){
	            max[i] = 1;
	        }
	        
	        int globalmax = 0;
	        
	        for(int i=1;i<n;i++){
	            for(int j=i-1;j>-1;j--){
	                if(array[i]>array[j]){
	                    max[i] = Math.max(max[i],max[j]+1);
	                }
	                globalmax = Math.max(max[i],globalmax);
	            }
	            
	        }
	        System.out.println(globalmax);
	    }
	}
}