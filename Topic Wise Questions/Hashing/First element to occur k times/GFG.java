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
	         String [] temp = br.readLine().trim().split(" ");
	         
	         int [] array = new int[n];
	         Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	         
	         for(int i=0;i<n;i++){
	             array[i] = Integer.parseInt(temp[i]);
	             if(map.containsKey(array[i])){
	                 map.put(array[i],map.get(array[i])+1);
	                 continue;
	             }
	             map.put(array[i],1);
	         }
	         
	         int num = -1;
	         for(int i=0;i<n;i++){
	             if(map.get(array[i])==k){
	                 num = array[i];
	                 break;
	             }
	         }
	         System.out.println(num);
	     }
	}
}