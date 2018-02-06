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
	        int k = input.nextInt();
	        int [] array = new int[n];
	        for(int i=0;i<n;i++){
	            array[i] = input.nextInt();
	        }
	        
	        Arrays.sort(array);
	        int i = n-1;
	        while(k>0){
	            System.out.print(array[i] + " ");
	            k--;
	            i--;
	        }
	        System.out.println();
	    }
	}
}