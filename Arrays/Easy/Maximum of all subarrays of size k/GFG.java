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
		    for(int i=0;i<array.length;i++){
		        array[i] = input.nextInt();
		    }
		    for(int i=0;i<n-k+1;i++){
		        int max = array[i];
		        for(int j=i+1;j<i+k;j++){
		            if(max<array[j]){
		                max = array[j];
		            }
		        }
		        System.out.print(max + " ");
		    }
		    System.out.println();
		}
	}
}