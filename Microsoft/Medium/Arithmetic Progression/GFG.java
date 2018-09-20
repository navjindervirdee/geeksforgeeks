import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = Integer.parseInt(input.nextLine());
	    
	    for(int c=0;c<t;c++){
	        String [] params = input.nextLine().trim().split(" ");
	        int n1 = Integer.parseInt(params[0]);
	        int n2 = Integer.parseInt(params[1]);
	        int n = Integer.parseInt(params[2]);
	        
	        int [] array = new int[n];
	        array[0] = 1;
	       
	        Set<Integer> set = new HashSet<Integer>();
	        if(n1-n2>1){
	            set.add(n1-n2);
	        }
	        
	        for(int i=1;i<n;i++){
	            int prev = array[i-1];
	            prev++;
	            while(set.contains(prev)){
	                prev++;
	            }
	            array[i] = prev;
	            
	            for(int j=0;j<=i;j++){
	                int num = array[j]*n1 - array[i]*n2;
	                if(num>prev){
	                    set.add(num);
	                }
	                num = array[i]*n1 - array[j]*n2;
	                if(num>prev){
	                    set.add(num);
	                }
	            }
	        }
	        
	        for(int i : array){
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }
	    
	}
}