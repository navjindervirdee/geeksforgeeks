/*package whatever //do not write package name here */

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
	        int k = input.nextInt();
	        
            int start = 0;
            
            while(start<n){
                int end = Math.min(n,start+k);
                boolean cons = true;
                for(int i=start+1;i<end;i++){
                    if(array[i-1]+1!=array[i]){
                        cons = false;
                        break;
                    }
                }
                int s = start;
                int e = end-1;
                if(cons){
                    while(s<e){
                        int temp = array[s];
                        array[s] = array[e];
                        array[e] = temp;
                        s++;
                        e--;
                    }
                }
                start += k;
            }
            
            for(int i=0;i<n;i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
	        
	    }
	}
}