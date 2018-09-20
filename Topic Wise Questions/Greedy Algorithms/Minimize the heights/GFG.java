import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     int t = Integer.parseInt(br.readLine());
	     
	     for(int c=0;c<t;c++){
	         int k = Integer.parseInt(br.readLine());
	         int n = Integer.parseInt(br.readLine());
	         
	         String [] temp = br.readLine().trim().split(" ");
	         int [] array = new int[n];
	         
	         for(int i =0;i<n;i++){
	             array[i] = Integer.parseInt(temp[i]);
	         }
	         
	         Arrays.sort(array);
	         
	         int init = array[n-1] - array[0];
	         
	         int min = array[0] + k;
	         int max = array[n-1] - k;
	         
	         if(max<min){
	             max = array[0] + k;
	             min = array[n-1] - k;
	         }
	         
	         for(int i=1;i<n-1;i++){
	             int inc = array[i] + k;
	             int dec = array[i] - k;
	             
	             if(inc<=max || dec>=min){
	                 continue;
	             }
	             
	             if(max-dec < inc-min){
	                 min = dec;
	             }
	             else{
	                 max = inc;
	             }
	         }
	         
	         System.out.println(Math.min(max-min,init));
	     }
	}
}