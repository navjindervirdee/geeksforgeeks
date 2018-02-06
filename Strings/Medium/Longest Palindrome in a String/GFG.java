import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    private static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    input.nextLine();
	    for(int c=0;c<t;c++){
	        char [] array = input.nextLine().trim().toCharArray();
	        String p = "";
	        int max = 1;
	        int start = 0;
	        boolean [][] table = new boolean[array.length][array.length];
	        
	        for(int i=0;i<array.length;i++){
	            table[i][i] = true;
	        }
	        
	        int temp = 100000;
	        for(int i=0;i<array.length-1;i++){
	            if(array[i]==array[i+1]){
	                table[i][i+1] = true;
	                max = 2;
	                temp = Math.min(temp,i);
	            }
	        }
	        
	        if(max>1){
	            start = temp;
	        }
	        
	        for(int k=3;k<array.length+1;k++){
	            temp = 100000;
	            for(int i=0;i<array.length-k+1;i++){
	                int j = i+k-1;
	                if(table[i+1][j-1] && array[i]==array[j]){
	                    table[i][j] = true;
	                    max = k;
	                    temp = Math.min(temp,i);
	                }
	            }
	            if(max>k-1){
	                start = temp;
	            }
	        }
	        
	        
	        for(int i=start;i<start+max;i++){
	            System.out.print(array[i]);
	        }
	        System.out.println();
	    }
	 
	}
}