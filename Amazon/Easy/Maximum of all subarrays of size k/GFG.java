import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static class Element implements Comparable<Element>{
        int index;
        int value;
        
        public Element(int index, int value){
            this.index = index;
            this.value = value;
        }
        
        public int compareTo(Element e){
            if(this.value>e.value){
                return -1;
            }
            return 1;
        }
    }
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    for(int c=0;c<t;c++){
	        int n = input.nextInt();
	        int k = input.nextInt();
	        Element [] array = new Element[n];
	        for(int i=0;i<n;i++){
	            array[i] = new Element(i,input.nextInt());
	        }
	        PriorityQueue<Element> queue = new PriorityQueue<Element>();
	        
	        for(int i=0;i<k;i++){
	            queue.add(array[i]);
	        }
	        System.out.print(queue.peek().value + " ");
	        int j = 1;
	        for(int i=k;i<n;i++){
	            queue.remove(array[j-1]);
	            queue.add(array[i]);
	            Element max = queue.peek();
                System.out.print(max.value + " ");
	            j++;
	        }
	        System.out.println();
	    }
	}
}