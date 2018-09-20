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
	        
	        Set<Character> set = new HashSet<Character>();
	        
	        for(int i=0;i<array2.length;i++){
	            set.add(array2[i]);
	        }
	        
	        String result = "No character present";
	        for(int i=0;i<array1.length;i++){
	            if(set.contains(array1[i])){
	                result = "" + array1[i];
	                break;
	            }
	        }
	        System.out.println(result);
	    }
	}
}
