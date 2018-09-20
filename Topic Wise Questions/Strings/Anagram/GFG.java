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
	        char [] array1 = input.nextLine().trim().toCharArray();
	        char [] array2 = input.nextLine().trim().toCharArray();
	        
	        int [] alpha = new int[26];
	        
	        for(int i=0;i<array1.length;i++){
	            int val = array1[i]-'a';
	            alpha[val]++;
	        }
	        
	        for(int i=0;i<array2.length;i++){
	            int val = array2[i]-'a';
	            alpha[val]--;
	        }
	        
	        String result = "YES";
	        
	        for(int i : alpha){
	            if(i!=0){
	                result = "NO";
	                break;
	            }
	        }
	        
	        System.out.println(result);
	        
	    }
	}
}