import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = Integer.parseInt(input.nextLine());
	    
	    Map<Character,Integer> map = new HashMap<Character,Integer>();
	    map.put('I',1);
	    map.put('V',5);
	    map.put('X',10);
	    map.put('L',50);
	    map.put('C',100);
	    map.put('D',500);
	    map.put('M',1000);
	    
	    for(int c=0;c<t;c++){
	        char [] array = input.nextLine().trim().toCharArray();
	        
	        int i=0;
	        int result = 0;
	        while(i<array.length){
	            int curr = map.get(array[i]);
	            if(i+1<array.length){
	                int next = map.get(array[i+1]);
	                if(curr<next){
	                    result += next  - curr;
	                    i+=2;
	                }
	                else{
	                    result += curr;
	                    i++;
	                }
	            }
	            else{
	                result += curr;
	                i++;
	            }
	        }
	        System.out.println(result);
	    }
	}
}