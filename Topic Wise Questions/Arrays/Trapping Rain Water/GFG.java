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
	        
	        int [] left = new int[n];
	        int [] right = new int[n];
	        
	        left[0] = -1;
	        
	        for(int i=1;i<n;i++){
	            int max = Math.max(left[i-1],array[i-1]);
	            if(array[i]<max){
	                left[i] = max;
	                continue;
	            }
	            left[i] = -1;
	        }
	        
	        right[n-1] = -1;
	        for(int i=n-2;i>-1;i--){
	            int max = Math.max(right[i+1],array[i+1]);
	            if(array[i]<max){
	                right[i] = max;
	                continue;
	            }
	            right[i] = -1;
	        }
	        
	        int trap = 0;
	        for(int i=0;i<n;i++){
	            if(left[i]==-1 || right[i]==-1){
	                continue;
	            }
	            trap += Math.min(left[i],right[i]) - array[i];
	        }
	        System.out.println(trap);
	    }
	}
}