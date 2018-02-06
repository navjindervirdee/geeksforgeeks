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
	        int [] array = new int[n];
	        for(int i=0;i<n;i++){
	            array[i] = input.nextInt();
	        }
	        
	        int ans = array[n-1];
	        for(int i=0;i<n-1;i+=2){
	            if(array[i]!=array[i+1]){
	                ans = array[i];
	                break;
	            }
	        }
	        System.out.println(ans);
	    }
	}
}