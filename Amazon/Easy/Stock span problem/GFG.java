import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    for(int c=0;c<t;c++){
	        int n = input.nextInt();
	        int [] array = new int[n];
	        for(int i=0;i<n;i++){
	            array[i] = input.nextInt();
	        }
	        int [] span = new int[n];
	        span[0] = 1;
	        for(int i=1;i<n;i++){
	            if(array[i]<array[i-1]){
	                span[i] = 1;
	                continue;
	            }
	            int j = i - span[i-1] - 1;
	            span[i] = 1+span[i-1];
	            
	            while(j>-1){
	                if(array[i]<array[j]){
	                    break;
	                }
	                span[i] += span[j];
	                j = j - span[j];
	            }
	        }
	        
	        for(int i=0;i<n;i++){
	            System.out.print(span[i] + " ");
	        }
	        System.out.println();
	        
	    }
	}
}