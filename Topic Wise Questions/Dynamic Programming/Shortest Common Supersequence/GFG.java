import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    input.nextLine();
	    
	    for(int c=0;c<t;c++){
	        String [] temp = input.nextLine().trim().split(" ");
	        char [] array1 = temp[0].toCharArray();
	        char [] array2 = temp[1].toCharArray();
	        
	        int table [][] = new int[array1.length+1][array2.length+1];
	        
	        for(int i=1;i<array1.length+1;i++){
	            for(int j=1;j<array2.length+1;j++){
	                table[i][j] = Math.max(table[i-1][j],table[i][j-1]);
	                if(array1[i-1]==array2[j-1]){
	                    table[i][j] = Math.max(table[i][j],table[i-1][j-1]+1);
	                }
	            }
	        }
	        System.out.println(array1.length+array2.length - table[array1.length][array2.length]);
	        
	    }
	}
}