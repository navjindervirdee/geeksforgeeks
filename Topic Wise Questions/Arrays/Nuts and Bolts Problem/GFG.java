import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = Integer.parseInt(input.nextLine());
	    char [] array = {'!', '#', '$', '%', '&', '*', '@', '^', '~'};
	    Map<Character,Integer> map = new HashMap<Character,Integer>();
	    for(int i=0;i<array.length;i++){
	        map.put(array[i],i);
	    }
	    //System.out.println(map);
	    for(int c=0;c<t;c++){
	        int n = Integer.parseInt(input.nextLine());
	        String [] nuts = input.nextLine().trim().split(" ");
	        String [] bolts = input.nextLine().trim().split(" ");
	        
	        boolean [] bool = new boolean[9];
	        
	        for(int i=0;i<n;i++){
	            char ch = bolts[i].charAt(0);
	            bool[map.get(ch)] = true;
	        }
	        
	        for(int i=0;i<array.length;i++){
	            if(bool[i]==true){
	                System.out.print(array[i] + " ");
	            }
	        }
	        System.out.println();
	        
	            for(int i=0;i<array.length;i++){
	            if(bool[i]==true){
	                System.out.print(array[i] + " ");
	            }
	        }
	        System.out.println();
	    
	    }
	}
}