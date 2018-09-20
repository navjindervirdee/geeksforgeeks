import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = Integer.parseInt(input.nextLine());
	    
	    for(int c=0;c<t;c++){
	        int n = Integer.parseInt(input.nextLine());
	        String [] temp = input.nextLine().trim().split(" ");
	        
	        int [] array = new int[n];
	        
	        for(int i=0;i<n;i++){
	            array[i] = Integer.parseInt(temp[i]);
	        }
	        
	        int [] inc = new int[n];
	        int [] dec = new int[n];
	        
	        inc[0] = 1;
	        dec[n-1] = 1;
	        
	        for(int i=1;i<n;i++){
	            inc[i] = 1;
	            for(int j=i-1;j>-1;j--){
	                if(array[j]<array[i]){
	                    inc[i] = Math.max(inc[j]+1,inc[i]);
	                }    
	            }
	        }
	        
	        for(int i=n-2;i>-1;i--){
	            dec[i] = 1;
	            for(int j =i+1;j<n;j++){
	                if(array[i]>array[j]){
	                    dec[i] = Math.max(dec[j]+1,dec[i]);
	                }
	            }
	        }
	        
	        int max = 0;
	        for(int i=0;i<n;i++){
	            max = Math.max(inc[i] + dec[i] -1,max);
	        }
	        System.out.println(max);
	    }
	}
}