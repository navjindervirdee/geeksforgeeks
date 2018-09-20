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
	        int comp = n & -n;
	        int power = (int)(Math.log(comp)/Math.log(2.0));
	        if(n==0){
	            System.out.println(0);
	            continue;
	        }
	        System.out.println(power+1);
	    }
	}
}