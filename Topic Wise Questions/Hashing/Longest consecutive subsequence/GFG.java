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
	        Set<Integer> set = new HashSet<Integer>();
	        
	        for(int i=0;i<n;i++){
	            array[i] = Integer.parseInt(temp[i]);
	            set.add(array[i]);
	        }
	        
	        int max = 1;
	        for(int i=0;i<n;i++){
	            if(!set.contains(array[i])){
	                continue;
	            }
	            
	            int num = array[i];
	            int count = 0;
	            while(set.contains(num)){
	                count++;
	                set.remove(num);
	                num++;
	            }
	            
	            num = array[i]-1;
	            while(set.contains(num)){
	                count++;
	                set.remove(num);
	                num--;
	            }
	            max = Math.max(max,count);
	        }
	        
	        System.out.println(max);
	    }
	}
}