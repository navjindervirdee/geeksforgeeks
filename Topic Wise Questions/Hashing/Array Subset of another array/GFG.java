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
	        int m = Integer.parseInt(params[1]);
	        
	        String [] temp1 = br.readLine().trim().split(" ");
	        String [] temp2 = br.readLine().trim().split(" ");
	        
	        Set<Integer> set1 = new HashSet<Integer>();
	        Set<Integer> set2 = new HashSet<Integer>();
	        
	        for(int i=0;i<n;i++){
	            int num = Integer.parseInt(temp1[i]);
	            set1.add(num);
	        }
	        
	        for(int i=0;i<m;i++){
	            int num = Integer.parseInt(temp2[i]);
	            set2.add(num);
	        }
	    
	        String result = "Yes";
	        for(int i : set2){
	            if(!set1.contains(i)){
	                result = "No";
	                break;
	            }
	        }
	        
	        System.out.println(result);
	    }
	}
}