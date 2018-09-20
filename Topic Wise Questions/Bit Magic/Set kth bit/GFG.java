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
	        int k = input.nextInt();
	        
	        int bit = 1<<k;
	        n = n|bit;
	        
	        System.out.println(n);
	    }
	}
}