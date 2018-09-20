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
	         for(int i=0;i<n;i++){
	             int num = Integer.parseInt(temp[i]);
	             array[i] = num*num;
	         }
	         
	         Arrays.sort(array);
	         
	         boolean result = false;
	         for(int i=n-1;i>1;i--){
	             int low = 0;
	             int high = i-1;
	             while(low<high){
	                 int sum = array[low] + array[high];
	                 if(sum==array[i]){
	                     result = true;
	                     break;
	                 }
	                 if(sum<array[i]){
	                     low++;
	                 }
	                 else{
	                     high--;
	                 }
	             }
	             if(result){
	                 break;
	             }
	         }
	         if(result){
	             System.out.println("Yes");
	         }
	         else{
	             System.out.println("No");
	         }
	     }
	}
}