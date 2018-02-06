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
	        int [] array = new int[n];
	        for(int i=0;i<n;i++){
	            array[i] = input.nextInt();
	        }
	        
	        
	        int [] lmax = new int[n];
	        int [] rmin = new int[n];
	        
	        lmax[0] = array[0];
	        rmin[n-1] = array[n-1];
	        
	        for(int i=1;i<n;i++){
	            lmax[i] = Math.max(lmax[i-1],array[i]);
	        }
	        
	        for(int i=n-2;i>-1;i--){
	            rmin[i] = Math.min(rmin[i+1],array[i]);
	        }
	        
	        int ans = -1;
	        for(int i=1;i<n-1;i++){
	            if(lmax[i]<=array[i] && rmin[i]>=array[i]){
	                ans = array[i];
	                break;
	            }
	        }
	        System.out.println(ans);
	    }
	    
	}
}