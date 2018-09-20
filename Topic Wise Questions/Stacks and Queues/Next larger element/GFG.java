import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    for(int c=0;c<t;c++){
	        int n = Integer.parseInt(br.readLine());
	        String [] temp = br.readLine().trim().split(" ");
	        int [] array = new int[n];
	        
	        for(int i=0;i<n;i++){
	            array[i] = Integer.parseInt(temp[i]);
	        }
	        
	        Stack<Integer> stack = new Stack<Integer>();
	        int [] next = new int[n];
	        for(int i=0;i<n;i++){
	            if(stack.isEmpty()){
	                stack.push(i);
	                continue;
	            }
	            else{
	                int index = stack.peek();
	                while(array[index]<array[i]){
	                    stack.pop();
	                    next[index] = array[i];
	                    if(stack.isEmpty()){
	                        break;
	                    }
	                    else{
	                        index = stack.peek();
	                    }
	                }
	                stack.push(i);
	            }
	        }
	        while(!stack.isEmpty()){
	            int index = stack.pop();
	            next[index] = -1;
	        }
	        for(int i=0;i<n;i++){
	            System.out.print(next[i] + " ");
	        }
	        System.out.println();
	        
	    }
	    
	}
}