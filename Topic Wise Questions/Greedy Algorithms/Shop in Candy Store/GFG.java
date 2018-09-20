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
	         int n  = Integer.parseInt(params[0]);
	         int k  = Integer.parseInt(params[1]);
	         
	         String [] temp = br.readLine().trim().split(" ");
	         
	         int [] array = new int[n];
	         
	         int m = 0;
	         while(m<n){
	             if(!temp[m].equals("")){
	                array[m] = Integer.parseInt(temp[m]);
	                m++;
	             }
	         }
	         
	         Arrays.sort(array);
	         
	         int min = 0;
	         int max = 0;
	         
	         int j = n-1;
	         int l = n-1;
	         for(int i=0;i<n;i++){
	             if(l>=i){
	                min += array[i];
	                max += array[j];
	                l-=k;
	                j--;
	                continue;
	             }
	             break;
	         }
	         System.out.println(min + " " + max);
	     }
	}
}