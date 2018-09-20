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
	        
	        int pos_prod = array[0];
	        int neg_prod = array[0];
	        int max_prod = array[0];
	        
	        for(int i=1;i<n;i++){
	            int a = pos_prod*array[i];
	            int b = neg_prod*array[i];
	            
	            pos_prod = Math.max(Math.max(a,b),array[i]);
	            neg_prod = Math.min(Math.min(a,b),array[i]);
	            
	            max_prod = Math.max(Math.max(pos_prod,neg_prod),max_prod);
	        }
	        
	        System.out.println(max_prod);
	    }
	    
	}
}