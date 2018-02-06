import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for(int c=0;c<t;c++){
		    int n = input.nextInt();
		    long [] array = new long[n];
		    array[0] = 1;
		    if(n==1){
		        System.out.println(array[n-1]);
		        continue;
		    }
		    array[1] = 2;
		    if(n==2){
		        System.out.println(array[n-1]);
		        continue;
		    }
		    
		    for(int i=2;i<n;i++){
		        array[i] = array[i-1] + array[i-2];
		    }
		    
		    System.out.println(array[n-1]);
		    
		}
	}
}