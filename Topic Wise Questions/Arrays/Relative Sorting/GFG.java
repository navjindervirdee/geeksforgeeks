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
	        
	        for(int i=0;i<n;i++){
	            array1[i] = Integer.parseInt(temp1[i]);
	        }
	        
	        for(int i=0;i<m;i++){
	            array2[i] = Integer.parseInt(temp2[i]);
	        }
	        
	        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	        
	        for(int i=0;i<n;i++){
	            if(map.containsKey(array1[i])){
	                map.put(array1[i],map.get(array1[i])+1);
	                continue;
	            }
	            map.put(array1[i],new Integer(1));
	        }
	        
	        int last = 0;
	        for(int i=0;i<m;i++){
	            int num = array2[i];
	            if(!map.containsKey(num)){
	                continue;
	            }
	            int count = map.get(num);
	            for(int j=last;j<count+last;j++){
	                array1[j] = num;
	            }
	            last += count;
	            map.remove(num);
	        }
	        
	        List<Integer> list = new ArrayList<Integer>();
	        for(int key : map.keySet()){
	            int count = map.get(key);
	            for(int i=0;i<count;i++){
	                list.add(key);
	            }
	        }
	        
	        
	        Collections.sort(list);
	        for(int i=last;i<list.size()+last;i++){
	            array1[i] = list.get(i-last);
	        }
	        
	        for(int i=0;i<n;i++){
	            System.out.print(array1[i] + " ");
	        }
	        System.out.println();
	    }
	}
}