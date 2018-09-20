import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    for(int c=0;c<t;c++){
	        String params [] = br.readLine().trim().split(" ");
	        int n = Integer.parseInt(params[0]);
	        int s = Integer.parseInt(params[1]);
	        
	        String [] temp = br.readLine().trim().split(" ");
	        int [] array = new int[n];
	        for(int i=0;i<n;i++){
	            array[i] = Integer.parseInt(temp[i]);
	        }
	        int start = 0;
	        int end = -1;
	        int sum = 0;
	        for(int i=0;i<n;i++){
	            sum += array[i];
	            if(sum>s){
	                while(start<i && sum>s){
	                    sum = sum - array[start];
	                    start++;
	                }
	            }
	            if(sum==s){
	                end = i;
	                break;
	            }
	        }
	        if(start>end){
	            System.out.println(-1);
	        }
	        else{
	            start++;
	            end++;
	            System.out.println(start + " " + end);
	        }
	        
	    }
	}
}