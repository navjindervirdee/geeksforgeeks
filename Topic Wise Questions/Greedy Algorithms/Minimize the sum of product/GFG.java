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
	        String [] temp1 = br.readLine().trim().split(" ");
	        String [] temp2 = br.readLine().trim().split(" ");
	        
	        int [] array1 = new int[n];
	        int [] array2 = new int[n];
	        
	        for(int i=0;i<n;i++){
	            array1[i] = Integer.parseInt(temp1[i]);
	            array2[i] = Integer.parseInt(temp2[i]);
	        }
	        
	        Arrays.sort(array1);
	        Arrays.sort(array2);
	        
	        int sum = 0;
	        
	        int j = n-1;
	        for(int i=0;i<n;i++){
	            sum += array1[i]*array2[j];
	            j--;
	        }
	        
	        System.out.println(sum);
	    }
	}
}