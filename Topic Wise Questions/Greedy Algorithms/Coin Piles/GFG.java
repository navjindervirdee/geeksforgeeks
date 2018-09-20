import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     int t = Integer.parseInt(br.readLine());
	     
	     for(int c=0;c<t;c++){
	         String [] params = br.readLine().trim().split(" ");
	         int n = Integer.parseInt(params[0]);
	         int k = Integer.parseInt(params[1]);
	         String [] temp = br.readLine().trim().split(" ");
	         
	         int [] array = new int[n];
	         
	         for(int i=0;i<n;i++){
	             array[i] = Integer.parseInt(temp[i]);
	         }
	         
	         Arrays.sort(array);
	         
	         int total = Integer.MAX_VALUE;
	         int removed = 0;
	         
	         for(int i=0;i<n;i++){
	             if(i-1>-1){
	                 removed += array[i-1];
	             }
	             
	             int sum = 0;
	             for(int j=i+1;j<n;j++){
	                 int diff = Math.abs(array[j]-array[i]);
	                 if(diff>k){
	                     sum += diff-k;
	                 }
	             }
	             
	             total = Math.min(total,sum+removed);
	         }
	         System.out.println(total);
	     }
	}
}