import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in) ;
	    int t = input.nextInt();
	    for(int c=0;c<t;c++){
	        int n = input.nextInt();
	        int s = input.nextInt();
	        
	        int [] array = new int[n];
	        for(int i =0;i<n;i++){
	            array[i] = input.nextInt();
	        }
	        
	        int start = 0;
	        int end = -1;
	        
	        int sum = array[0];
	        int temp = 1;
	        while(temp < n){
	            if(sum==s){
	                end = temp-1;
	                break;
	            }
	            
	            if(sum + array[temp] <= s){
	                sum = sum + array[temp];
	                temp += 1;
	            }
	            
	            else{
	                sum = sum - array[start];
	                start += 1;
	            }
	        }
	        if(sum==s){
	            end = temp-1;
	        }
	        if(start<=end){
	            start += 1;
	            end += 1;
	            System.out.println(start + " " + end);
	        }
	        else{
	            System.out.println(-1);
	        }
	    }
	}
}