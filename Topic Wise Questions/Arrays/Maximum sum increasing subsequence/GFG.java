import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t  = Integer.parseInt(br.readLine());
	    
	    for(int c=0;c<t;c++){
	        int n = Integer.parseInt(br.readLine());
	        String [] temp = br.readLine().trim().split(" ");
	        
	        int [] array = new int[n];
	        
	        for(int i=0;i<n;i++){
	            array[i] = Integer.parseInt(temp[i]);
	        }
	        
	        int max [] = new int[n];
	        max[0] = array[0];
	        
	        int globmax = array[0];
	        
	        for(int i=1;i<n;i++){
	            max[i] = array[i];
	            for(int j=i-1;j>-1;j--){
	                if(array[j]<array[i]){
	                    max[i] = Math.max(max[i],max[j]+array[i]);
	                }    
	            }
	            globmax = Math.max(max[i],globmax);
	        }
	        System.out.println(globmax);
	    }
	}
}