import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for(int c=0;c<t;c++){
		    int n = input.nextInt();
		    int [] array =  new int[n];
		    int [] max = new int[n];
		    for(int i=0;i<n;i++){
		        array[i] = input.nextInt();
		        max[i] = array[i];
		    }
		    
		    for(int i=1;i<n;i++){
		        for(int j=i-1;j>-1;j--){
		            if(array[i]>array[j]){
		                max[i] = Math.max(max[i],max[j]+array[i]);
		            }
		        }
		    }
		    
		    int m = -1;
		    for(int i=0;i<n;i++){
		        if(m<max[i]){
		            m = max[i];
		        }
		    }
		    System.out.println(m);
		}
	}
}