import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    for(int c=0;c<t;c++){
	        int n = input.nextInt();
	        int sum = 0;
	        for(int i=0;i<n-1;i++){
	            sum += input.nextInt();
	        }
	        
	        n = (n*(n+1))/2;
	        System.out.println(n-sum);
	        
	    }
	}
}