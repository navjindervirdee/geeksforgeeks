import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    input.nextLine();
	    
	    for(int c=0;c<t;c++){
	        char [] array = input.nextLine().trim().toCharArray();
	        int [][] table = new int[array.length][array.length];
	        
	        for(int i=0;i<array.length-1;i++){
	            if(array[i]==array[i+1]){
	                table[i][i+1] = 0;
	                continue;
	            }
	            table[i][i+1] = 1;
	        }
	        
	        for(int l=3;l<array.length+1;l++){
	            for(int i=0;i<array.length-l+1;i++){
	                int j = i+l-1;
	                int min = Integer.MAX_VALUE;
	                if(array[i]==array[j]){
	                    min = table[i+1][j-1];
	                }
	                else{
	                    min = Math.min(table[i][j-1],table[i+1][j]) + 1;
	                }
	                table[i][j] = min;
	                System.out.println(i + " " + j + " " + table[i][j]);
	            }
	        }
	        
	        System.out.println(table[0][array.length-1]);
	    }
	}
}