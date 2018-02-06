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
		    int posCount = 0;
		    int sum = 0;
		    for(int i=0;i<n;i++){
		        array[i] = input.nextInt();
		        sum += array[i];
		        if(array[i]>=0){
		            posCount++;
		        }
		    }
		    
		    if(posCount==array.length){
		        System.out.println(sum);
		        continue;
		    }
		    
		    int max = Integer.MIN_VALUE;
		    int current = 0;
		    for(int i=0;i<array.length;i++){
		        current += array[i];
		        if(current>max){
		            max = current;
		        }
		        if(current<0){
		            current = 0;
		        }
		    }
		    System.out.println(max);
		}
	}
}