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
	        int n = Integer.parseInt(params[0]);
	        int k = Integer.parseInt(params[1]);
	        
	        String [] temp = input.nextLine().trim().split(" ");
	        int [] array = new int[n];
	        
	        for(int i=0;i<n;i++){
	            array[i] = Integer.parseInt(temp[i]);
	        }
	        
	        int i = 0;
	        int j = n-1;
	        String result = "OOPS! NOT FOUND";
	        while(i<=j){
	            if(array[i]==k){
	                result = i+"";
	                break;
	            }
	            if(array[j]==k){
	                result = j+"";
	                break;
	            }
	            i++;
	            j--;
	        }
	        System.out.println(result);
	    }
	    
	}
}