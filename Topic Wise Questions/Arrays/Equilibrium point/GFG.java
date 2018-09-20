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
	        int left [] = new int[n];
	        int [] right = new int[n];
	        
	        for(int i=0;i<n;i++){
	            array[i] = Integer.parseInt(temp[i]);
	        }
	        
	        left[0] = -10;
	        right[n-1] = -20;
	        
	        int prev = 0;
	        for(int i=1;i<n;i++){
	            left[i] += array[i-1] + prev;
	            prev = left[i];
	        }
	        int next = 0;
	        for(int i=n-2;i>-1;i--){
	            right[i] = array[i+1] + next;
	            next = right[i];
	        }
	        
	        int index = -2;
	        for(int i=0;i<n;i++){
	            if(left[i]==right[i]){
	                index = i;
	            }
	        }
	        if(n==1){
	            index=0;
	        }
	        System.out.println(index+1);
	    }
	}
}