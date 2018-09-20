import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    for(int c=0;c<t;c++){
	        char [] array = br.readLine().trim().toCharArray();
	        int maxlen = 0;
	        Map<Character,Integer> map = new HashMap<Character,Integer>();
	        int start = 0;
	        for(int i=0;i<array.length;i++){
	            if(!map.containsKey(array[i])){
	                map.put(array[i],i);
	                maxlen = Math.max(maxlen,i-start+1);
	            }
	            else{
	                maxlen = Math.max(maxlen,i-start);
	                int index = map.get(array[i]);
	                for(int j=start;j<=index;j++){
	                    map.remove(array[j]);
	                }
	                map.put(array[i],i);
	                start = index+1;
	            }
	        }
	        System.out.println(maxlen);
	    }
	}
}