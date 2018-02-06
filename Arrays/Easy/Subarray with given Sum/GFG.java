import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    for(int c=0;c<t;c++){
	        int n = input.nextInt();
	        int k = input.nextInt();
	        int [] array = new int[n];
	        for(int i=0;i<n;i++){
	            array[i] = input.nextInt();
	        }
	        int start = -1;
	        int end = -1;
	        int sum = 0;
	        for(int i=0;i<n;i++){
	            sum = array[i];
	            start = i;
	            if(sum==k){
	                end = i;
	                break;
	            }
	            for(int j=i+1;j<n;j++){
	                sum += array[j];
	                if(sum==k){
	                    end = j;
	                    break;
	                }
	                if(sum>k){
	                    break;
	                }
	            }
	            if(sum==k){
	                break;
	            }
	        }
	        if(sum!=k){
	            System.out.println(-1);
	        }
	        else{
    	        System.out.println((start+1) + " " + (end+1));
	        }
	    }
    }
}