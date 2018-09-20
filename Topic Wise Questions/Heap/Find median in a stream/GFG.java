import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int n = Integer.parseInt(input.nextLine().trim());
	    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new Comparator<Integer>(){
	        public int compare(Integer i1, Integer i2){
	            return i2 - i1;
            }
        });
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        int first = Integer.parseInt(input.nextLine().trim());
        maxHeap.add(first);
        
        System.out.println(first);
        
        boolean equalSize = false;
        
        for(int i=1;i<n;i++){
            int num = Integer.parseInt(input.nextLine().trim());
            if(equalSize){
                int temp = maxHeap.peek();
                if(num>temp){
                    minHeap.add(num);
                    num = minHeap.poll();
                }
                maxHeap.add(num);
                System.out.println(maxHeap.peek());
                equalSize = false;
            }
            else{
                int temp = maxHeap.peek();
                if(num<temp){
                    temp = maxHeap.poll();
                    maxHeap.add(num);
                    num = temp;
                }
                minHeap.add(num);
                int median = minHeap.peek() + maxHeap.peek();
                System.out.println(median/2);
                equalSize = true;
            }
	    }
	}
}