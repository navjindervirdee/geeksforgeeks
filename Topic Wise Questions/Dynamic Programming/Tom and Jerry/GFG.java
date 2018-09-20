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
	        
	        boolean [] array = new boolean[n+1];
	        
	        for(int i=2;i<n+1;i++){
	            for(int j=1;j<i/2+1;j++){
	                if(i%j==0){
	                    array[i] = !array[i-j];
	                    if(array[i]){
	                        break;
	                    }
	                }
	            }
	        }
	        
	        if(array[n]){
	            System.out.println(1);
	            continue;
	        }
	        System.out.println(0);
	    }
	}
}