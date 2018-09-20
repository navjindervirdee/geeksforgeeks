import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	    Scanner input = new Scanner(System.in);
	    int t = Integer.parseInt(input.nextLine());
	    
	    for(int c=0;c<t;c++){
	        String [] params = input.nextLine().trim().split(" ");
	        int n = Integer.parseInt(params[0]);
	        int date = Integer.parseInt(params[1]);
	        
	        String [] temp1 = input.nextLine().trim().split(" ");
	        String [] temp2 = input.nextLine().trim().split(" ");
	        
	        int [] nums = new int[n];
	        int [] fine = new int[n];
	        
	        for(int i=0;i<n;i++){
	            nums[i] = Integer.parseInt(temp1[i]);
	            fine[i] = Integer.parseInt(temp2[i]);
	        }
	        
	        long sum = 0;
	        for(int i=0;i<n;i++){
	            if(date%2==0 && nums[i]%2==1){
	                sum += fine[i];
	            }
	            if(date%2==1 && nums[i]%2==0){
	                sum += fine[i];
	            }
	        }
	        System.out.println(sum);
	    }
	    
	}
}