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
	         int k = Integer.parseInt(br.readLine());
	         
	         int [] coins = new int[n];
	         
	         for(int i=0;i<n;i++){
	             coins[i] = Integer.parseInt(temp[i]);
	         }
	         
	         Arrays.sort(coins);
	         
	         int [] min = new int[k+1];
	         
	         min[0] = 1;
	         
	         for(int i=0;i<n;i++){
	             for(int j=1;j<k+1;j++){
	                 if(coins[i]>j){
	                     continue;
	                 }
	                 else{
	                     min[j] += min[j-coins[i]];
	                 }
	             }
	         }
	         
	         System.out.println(min[k]);
	     }
	}
}