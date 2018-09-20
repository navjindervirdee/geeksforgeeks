import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    
	    for(int i=0;i<t;i++){
	        int num = input.nextInt();
	        int k = input.nextInt();
	        
	        int set = 1<<k;
	        num = num&set;
	        if(num>0){
	            System.out.println("Yes");
	            continue;
	        }
	        System.out.println("No");
	    }
	}
}