import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    input.nextLine();
	    for(int i=0;i<t;i++){
	        String [] str = input.nextLine().trim().split("\\.");
	        
	        for(int j=str.length-1;j>0;j--){
	            System.out.print(str[j] + ".");
	        }
	        System.out.println(str[0]);
	    }
	    
	}
}