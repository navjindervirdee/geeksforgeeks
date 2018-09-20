import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    for(int c=0;c<t;c++){
	        int n = Integer.parseInt(br.readLine());
	        String []  temp = br.readLine().trim().split(" ");
	        int [] nums = new int[n];
	        for(int i=0;i<n;i++){
	            nums[i] = Integer.parseInt(temp[i]);
	        }
	        
	        int maxEnd = 0;
	        int globMax = Integer.MIN_VALUE;
	        
	        for(int i=0;i<n;i++){
	            maxEnd += nums[i];
	            globMax = Math.max(maxEnd,globMax);
	            maxEnd = Math.max(maxEnd,0);
	        }
	        System.out.println(globMax);
	        
	    }
	}
}