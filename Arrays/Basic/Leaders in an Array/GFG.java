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
    		for(int i=0;i<n;i++){
    		    boolean leader = true;
    		    for(int j=i+1;j<n;j++){
    		        if(array[i]<=array[j]){
    		            leader = false;
    		            break;
    		        }
    		    }
    		    if(leader){
    		        System.out.print(array[i] + " ");
    		    }
    		}
    		System.out.println();
		}
	}
}