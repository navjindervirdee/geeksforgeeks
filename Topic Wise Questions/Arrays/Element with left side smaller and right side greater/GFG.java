import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	     //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     Scanner input = new Scanner(System.in);
	     int t = input.nextInt();//Integer.parseInt(br.readLine());
	     
	     for(int c=0;c<t;c++){
	         int n = input.nextInt();//Integer.parseInt(br.readLine());
	         //String [] temp = br.readLine().trim().split(" ");
	         
	         int [] array = new int[n];
	         
	         for(int i=0;i<n;i++){
	             array[i] = input.nextInt();//Integer.parseInt(temp[i]);
	         }
	         
	         int left [] = new int[n];
	         int right [] = new int[n];
	         
	         left[0] = -1;
	         for(int i=1;i<n;i++){
	             left[i] = Math.max(left[i-1],array[i-1]);
	         }
	         
	         right[n-1] = Integer.MAX_VALUE;
	         for(int i=n-2;i>-1;i--){
	             right[i] = Math.min(right[i+1],array[i+1]);
	         }
	         
	         int result = -1;
	         for(int i=1;i<n-1;i++){
	             if(array[i]>=left[i] && array[i]<=right[i]){
	                 result = array[i];
	                 break;
	             }
	         }
	         
	         System.out.println(result);
	     }
	}
}