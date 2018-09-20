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
	         int n = Integer.parseInt(params[0]);
	         int k = Integer.parseInt(params[1]);
	         String [] temp =  br.readLine().trim().split(" ");
	         int [] array = new int[n];
	         for(int i=0;i<n;i++){
	             array[i] = Integer.parseInt(temp[i]);
	         }
	         
	         Queue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
	         for(int i=0;i<k;i++){
	             queue.add(array[i]);
	         }
	         int max = queue.peek();
	         List<Integer> list = new ArrayList<Integer>();
	         list.add(max);
	         
	         for(int i=k;i<n;i++){
	             queue.remove(new Integer(array[i-k]));
	             queue.add(array[i]);
	             max = queue.peek();
	             list.add(max);
	         }
	         for(int i=0;i<list.size();i++){
	             System.out.print(list.get(i) + " ");
	         }
	         System.out.println();
	     }
	}
}