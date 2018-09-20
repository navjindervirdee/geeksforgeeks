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
	         
	         int result = array[n-1];
	         for(int i=0;i<n-1;i+=2){
	             if(array[i]!=array[i+1]){
	                 result = array[i];
	                 break;
	             }
	         }
	         
	         System.out.println(result);
	     }
	}
}