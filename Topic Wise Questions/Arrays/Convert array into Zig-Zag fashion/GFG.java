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
	        for(int i=0;i<array.length;i++){
	            array[i] = Integer.parseInt(temp[i]);
	        }
	        
	        int curr = 0;
	        for(int i=0;i<n-1;i++){
	            if(curr==0){
	                if(array[i]>array[i+1]){
	                    int tem = array[i];
	                    array[i] = array[i+1];
	                    array[i+1] = tem;
	                }
	                curr = 1;
	            }
	            else{
	                if(array[i]<array[i+1]){
                        int tem = array[i];
                        array[i] = array[i+1];
	                    array[i+1] = tem;
	                }
	                curr = 0;
	            }
	        }
	        
	        for(int i=0;i<n;i++){
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }
	}
}