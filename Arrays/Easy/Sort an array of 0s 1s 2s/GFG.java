import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for(int c=0;c<t;c++){
		    int n = input.nextInt();
		    int [] count = new int[3];
		    for(int i=0;i<n;i++){
		        int num = input.nextInt();
		        count[num]++;
		    }
		    
		    int [] sorted = new int[n];
		    int k = 0;
		    for(int i=0;i<count.length;i++){
		        while(count[i]>0){
		            sorted[k] = i;
		            k++;
		            count[i]--;
		        }
		    }
		    for(int i=0;i<sorted.length;i++){
		        System.out.print(sorted[i] + " ");
		    }
		    System.out.println();
		}
	}
}