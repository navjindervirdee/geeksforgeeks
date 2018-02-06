import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    Set<Integer> set = new HashSet<Integer>();
	    set.add(1);
	    set.add(2);
	    set.add(3);
	    set.add(4);
	    set.add(5);
	    for(int c=0;c<t;c++){
	        int n = input.nextInt();
	        int count = 0;
	        for(int i=1;i<n+1;i++){
	            String s = Integer.toString(i);
	            boolean right = true;
	            for(int j=0;j<s.length();j++){
	                int digit = Integer.parseInt(Character.toString(s.charAt(j)));
	                if(!set.contains(digit)){
	                    right = false;
	                    break;
	                }
	            }
	            if(right){
	                count++;
	            }
	        }
	        System.out.println(count);
	        
	    }
	}
}