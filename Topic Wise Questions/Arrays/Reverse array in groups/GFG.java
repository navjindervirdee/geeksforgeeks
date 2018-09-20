import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    private static void reverse(int [] array, int i, int j){
        while(i<j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
    
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    for(int c=0;c<t;c++){
	        int n = Integer.parseInt(br.readLine());
	        String temp [] = br.readLine().trim().split(" ");
	        int k = Integer.parseInt(br.readLine());
	        
	        int [] array = new int[n];
	        
	        for(int i=0;i<n;i++){
	            array[i] = Integer.parseInt(temp[i]);
	        }
	        
	        int j = k;
	        while(j<n){
	            reverse(array,j-k,j-1);
	            j = j+k;
	        }
	        if(j<n+k){
	            reverse(array,j-k,n-1);
	        }
	        
	        for(int i=0;i<n;i++){
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }
	}
}