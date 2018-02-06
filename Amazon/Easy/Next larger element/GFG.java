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
	        int [] array =  new int[n];
	        for(int i=0;i<n;i++){
	            array[i] = input.nextInt();
	        }
	        int [] next = new int[n];
	        next[n-1] = -1;
	        for(int i=n-2;i>-1;i--){
	            int j = i+1;
	            while(j<n){
	                if(array[i]<array[j]){
	                    next[i] = array[j];
	                    break;
	                }
	                
                    if(next[j]==-1){
                        next[i] = -1;
                        break;
                    }
                    j++;
	            }
	            if(j==n){
	                next[i] = -1;
	            }
	        }
	        for(int i=0;i<n;i++){
	            System.out.print(next[i] + " ");
	        }
	        System.out.println();
	    }
	}
}