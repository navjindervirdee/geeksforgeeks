import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static class Alpha{
        char c;
        int count;
        
        public Alpha(char c){
            this.c = c;
        }
    }
    
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = Integer.parseInt(input.nextLine().trim());
	    
	    for(int c=0;c<t;c++){
	        char [] array = input.nextLine().trim().toCharArray();
	        PriorityQueue<Alpha> queue = new PriorityQueue<Alpha>(new Comparator<Alpha>(){
	            public int compare(Alpha a1, Alpha a2){
	                return a2.count-a1.count;
                }
            });
            
            Alpha [] alpha = new Alpha[26];
            for(int i=0;i<array.length;i++){
                int val = array[i] - 'a';
                if(alpha[val]==null){
                    alpha[val] = new Alpha(array[i]);
                }
                alpha[val].count++;
            }
            
            for(int i=0;i<alpha.length;i++){
                if(alpha[i]!=null){
                    queue.add(alpha[i]);
                }
            }
            
            Alpha prev = queue.poll();
            prev.count--;
            
            while(!queue.isEmpty()){
                Alpha temp = queue.poll();
                temp.count--;
                if(prev.count>0){
                    queue.add(prev);
                }
                prev = temp;
            }
            
            if(queue.isEmpty() && prev.count==0){
                System.out.println(1);
                continue;
            }
            System.out.println(0);
        }
	}
}