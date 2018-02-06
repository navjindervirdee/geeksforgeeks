import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    for(int c=0;c<t;c++){
	        int n = input.nextInt();
	        int [] array = new int[n];
	        for(int i=0;i<n;i++){
	            array[i] = input.nextInt();
	        }
	        int max = -1;
	        boolean found = false;
	        for(int i=0;i<n;i++){
	            if(n-1-i<=max){
	                break;
	            }
	            for(int j=n-1;j>=i;j--){
	                if(array[i]<=array[j]){
	                    int diff = j-i;
	                    if(max<diff){
	                        max = diff;
	                    }
	                }
	            }
	        }
	        System.out.println(max);
	    }
		//code
	}
}