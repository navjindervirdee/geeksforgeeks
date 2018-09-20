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
	        Set<Character> set = new HashSet<Character>();
	        
	        char ch = '-';
	        for(int i=0;i<array.length;i++){
	            if(set.contains(array[i])){
	                ch = array[i];
	                break;
	            }
	            set.add(array[i]);
	        }
	        
	        if(ch=='-'){
	            System.out.println(-1);
	            continue;
	        }
            System.out.println(ch);
	    }
	
	}
}