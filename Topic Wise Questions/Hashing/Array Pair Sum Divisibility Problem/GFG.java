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
	        int k = Integer.parseInt(br.readLine());
	        
	        int [] array = new int[n];
	        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	        
	        for(int i=0;i<array.length;i++){
	            array[i] = Integer.parseInt(temp[i])%k;
	        }
	        
	        for(int i=0;i<n;i++){
	            if(map.containsKey(array[i])){
	                int count = map.get(array[i]);
	                count--;
	                if(count==0){
	                    map.remove(array[i]);
	                }
	                else{
	                    map.put(array[i],count);
	                }
	                continue;
	            }
	            int need = array[i]%k;
	            if(need!=0){
	                need = k-need;
	            }
	            if(map.containsKey(need)){
	                map.put(need,map.get(need)+1);
	                continue;
	            }
	            map.put(need,1);
	        }
	        
	        if(n%2==0 && (map.isEmpty())){
	            System.out.println("True");
	            continue;
	        }
	        System.out.println("False");
	    }
	    
	}
	
}