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
	         String [] temp1 = br.readLine().trim().split(" ");
	         String [] temp2 = br.readLine().trim().split(" ");
	         
	         int [] array1 = new int[n];
	         int [] array2 = new int[n];
	         
	         for(int i=0;i<n;i++){
	             array1[i] = Integer.parseInt(temp1[i]);
	             array2[i] = Integer.parseInt(temp2[i]);
	         }
	         
	         Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	         for(int i=0;i<n;i++){
	             if(map.containsKey(array1[i])){
	                 map.put(array1[i],map.get(array1[i])+1);
	                 continue;
	             }
	             map.put(array1[i],1);
	         }
	         int result = 1;
	         
	         for(int i=0;i<n;i++){
	             if(!map.containsKey(array2[i])){
	                 result = 0;
	                 break;
	             }
	             
	             int count = map.get(array2[i]);
	             count--;
	             map.put(array2[i],count);
	             if(count==0){
	                 map.remove(array2[i]);
	             }
	         }
	         
	         if(result==1 && !map.isEmpty()){
	             result = 0;
	         }
	         
	         System.out.println(result);
	         
	         
	     }
	     
	}
}