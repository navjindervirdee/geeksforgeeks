import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    for(int c=0;c<t;c++){
	        String [] params = br.readLine().trim().split(" ");
	        int k = Integer.parseInt(params[0]);
	        int n = Integer.parseInt(params[1]);
	        
	        String [] temp = br.readLine().trim().split(" ");
	        
	        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k);
	        
	        for(int i=0;i<k-1;i++){
	            int num = Integer.parseInt(temp[i]);
	            queue.add(num);
	            System.out.print(-1 + " ");
	        }
	        queue.add(Integer.parseInt(temp[k-1]));
	        
	        for(int i=k;i<n;i++){
	            int min = queue.peek();
	            System.out.print(min + " ");
	            
	            int num = Integer.parseInt(temp[i]);
	            if(num>min){
	                queue.poll();
	                queue.add(num);
	            }
	        }
            int min = queue.peek();
            System.out.println(min);
	    }
	}
}