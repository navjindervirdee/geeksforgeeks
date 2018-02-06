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
		    
		    int [] lsum = new int[n];
		    int [] rsum = new int[n];
		    
		    lsum[0] = 0;
		    for(int i=1;i<n;i++){
		        lsum[i] = lsum[i-1] + array[i-1]; 
		    }
		    
		    rsum[n-1] = 0;
		    for(int i=n-2;i>-1;i--){
		        rsum[i] = rsum[i+1] + array[i+1];
		    }
		    
		    int ans = -1;
		    for(int i=0;i<n;i++){
		        if(lsum[i]==rsum[i]){
		            ans = i+1;
		            break;
		        }
		    }
		    
		    System.out.println(ans);
		}
	}
}