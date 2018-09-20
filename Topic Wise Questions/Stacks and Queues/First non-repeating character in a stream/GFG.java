import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = Integer.parseInt(input.nextLine());
	    
	    for(int c=0;c<t;c++){
	        int n = Integer.parseInt(input.nextLine());
	        String [] temp = input.nextLine().trim().split(" ");
	        
	        int [] array = new int[26];
	        Queue<Character> queue = new LinkedList<Character>();
	        
	        for(int i=0;i<temp.length;i++){
	            char str = temp[i].charAt(0);
	            int val = str - 'a';
	            array[val]++;
	            if(array[val]==1){
	                queue.add(str);
	            }
	            
	            while(!queue.isEmpty() && array[queue.peek()-'a']>1){
	                queue.poll();
	            }
	            
	            if(queue.isEmpty()){
	                System.out.print(-1 + " ");
	                continue;
	            }
	            System.out.print(queue.peek() + " ");
	        }
	        System.out.println();
	    }
    }
}