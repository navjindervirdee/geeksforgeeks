import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     int t = Integer.parseInt(br.readLine());
	     for(int c=0;c<t;c++){
	         char [] array = br.readLine().trim().toCharArray();
	         
	         StringBuilder sb = new StringBuilder();
	         Set<Character> set = new HashSet<Character>();
	         for(int i=0;i<array.length;i++){
	             if(!set.contains(array[i])){
	                 sb.append(array[i]);
	                 set.add(array[i]);
	             }
	         }
	         System.out.println(sb.toString());
	     }
	}
}