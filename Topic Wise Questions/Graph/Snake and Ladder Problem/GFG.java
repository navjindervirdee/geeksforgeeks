import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static class Cell{
        int index;
        int dist;
        
        public Cell(int index, int dist){
            this.index = index;
            this.dist = dist;
        }
    }
    
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    for(int c=0;c<t;c++){
	        int n = Integer.parseInt(br.readLine());
	        String [] temp = br.readLine().trim().split(" ");
	        
	        int [] array = new int[2*n];
	        for(int i=0;i<2*n;i++){
	            array[i] = Integer.parseInt(temp[i]);
	        }
	        
	        Map<Integer,Integer> ladder = new HashMap<Integer,Integer>();
	        Map<Integer,Integer> snake = new HashMap<Integer,Integer>();
	        
	        for(int i=0;i<2*n-1;i+=2){
	            if(array[i]<array[i+1]){
	                ladder.put(array[i],array[i+1]);
	                continue;
	            }
	            snake.put(array[i],array[i+1]);
	        }
	        
	        Queue<Cell> queue = new LinkedList<Cell>();
	        Cell cell = new Cell(1,0);
	        queue.add(cell);
	        
	        int result = -1;
	        while(!queue.isEmpty()){
	            Cell curr = queue.poll();
	            if(curr.index==30){
	                result = curr.dist;
	                break;
	            }
	            
	            for(int i=1;i<7;i++){
	                int next = curr.index+i;
	                if(next>30 || snake.containsKey(next)){
	                    continue;
	                }
	                if(ladder.containsKey(next)){
	                    next = ladder.get(next);
	                }
	                Cell nxt = new Cell(next,curr.dist+1);
	                queue.add(nxt);
	            }
	        }
	        System.out.println(result);
	    }
	}
}