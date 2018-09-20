import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	     Scanner input = new Scanner(System.in);
	     int t = input.nextInt();
	     int [] array = {1,2,3};
	     
	     for(int c=0;c<t;c++){
	         int n = input.nextInt();
	         
	         int table[] = new int[n+1];
	         table[0]=1;
	         
	         for(int i=1;i<n+1;i++){
	             for(int j=1;j<array.length+1;j++){
	                 if(array[j-1]>i){
	                     break;
	                 }
	                 table[i] += table[i-array[j-1]];
	             }
	         }
	         System.out.println(table[n]);
	     }
	}
}