import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner input  = new Scanner(System.in);
	    int t = input.nextInt();
	    input.nextLine();
	    for(int c=0;c<t;c++){
	        char [] array  = input.nextLine().trim().toCharArray();
	        Map<Character,Integer> map = new HashMap<Character,Integer>();
	        int max = 0;
	        int start = 0;
	        for(int i=0;i<array.length;i++){
	            char ch = array[i];
	            if(map.containsKey(ch) && map.get(ch)>=start){
	                int diff = i - start;
	                max = Math.max(max,diff);
	                start = map.get(ch)+1;
	                map.put(ch,i);
	                continue;
	            }
	            map.put(ch,i);
	        }
	        if(max<array.length-start){
	            max = array.length-start ;
	        }
	        System.out.println(max);
	    }
	}
}