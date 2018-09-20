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
	        
	        int [] array = new int[n+1];
	        array[0] = 0;
	        array[1] = 1;
	        array[2] = 2;
	        for(int i=3;i<array.length;i++){
	            if(i%2==1){
	                array[i] = array[i-1] + 1;
	            }
	            else{
	                array[i] = Math.min(array[i-1],array[i/2]) + 1;
	            }
	        }
	        
	        System.out.println(array[n]);
	    }
	}
}