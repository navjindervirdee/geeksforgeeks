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
	        int m = input.nextInt();
	        
	        int xor = n^m;
	        int comp = xor & -xor;
	        int power = (int)(Math.log(comp)/Math.log(2));
	        System.out.println(power+1);
	    }
	}
}