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
	        
	        int [] array1 = new int[n];
	        int [] array2 = new int[m];
	        
	        int sum1 = 0;
	        for(int i=0;i<n;i++){
	            array1[i] = Integer.parseInt(temp1[i]);
	            sum1 += array1[i];
	        }
	        
	        int sum2 = 0;
	        for(int i=0;i<m;i++){
	            array2[i] = Integer.parseInt(temp2[i]);
	            sum2 += array2[i];
	        }
	        
	        int total = sum1+sum2;
	        if(total%2!=0){
	            System.out.println(-1);
	            continue;
	        }
	        
	        int half = total/2;
	        
	        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	        int end = n;
	        int [] temp = array1;
	        if(sum1>half){
	            end = m;
	            temp = array2;
	        }
	        
	        for(int i=0;i<end;i++){
	            if(map.containsKey(temp[i])){
	                map.put(temp[i],map.get(temp[i])+1);
	                continue;
	            }
	            map.put(temp[i],1);
	        }
	        
	        int sum = -1;
	        if(end==m){
	            end = n;
	            temp = array1;
	            sum = sum1;
	        }
	        else{
	            end = m;
	            temp = array2;
	            sum = sum2;
	        }
	        
	        int result = -1;
	        for(int i=0;i<end;i++){
	            if(sum-temp[i]>half){
	                continue;
	            }
	            int need = half - (sum-temp[i]);
	            if(map.containsKey(need)){
	                result = 1;
	                break;
	            }
	        }
	        System.out.println(result);
	    }
	}
}