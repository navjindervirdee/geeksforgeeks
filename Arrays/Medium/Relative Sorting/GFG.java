import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    for(int c=0;c<t;c++){
	        int n = input.nextInt();
	        int m = input.nextInt();
    	        
	        int [] a1 = new int[n];
	        int [] a2 = new int[n];
	        
	        for(int i=0;i<n;i++){
	            a1[i] = input.nextInt();
	        }
	        
	        for(int i=0;i<m;i++){
	            a2[i] = input.nextInt();
	        }
	        
	        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	        
	        for(int i=0;i<n;i++){
	            if(map.containsKey(a1[i])){
	                map.put(a1[i],map.get(a1[i])+1);
	                continue;
	            }
	            map.put(a1[i],new Integer(1));
	        }
	        
	        int j = 0;
	        for(int i=0;i<m;i++){
	            int num = a2[i];
	            if(!map.containsKey(num)){
	                continue;
	            }
	            int count = map.get(num);
	            while(count>0){
	                a1[j] = num;
	                System.out.print(a1[j] + " ");
	                j++;
	                count--;
	            }
	            map.remove(num);
	        }
	        
            List<Integer> list = new ArrayList<Integer>();
            for(int key : map.keySet()){
                int count = map.get(key);
                while(count!=0){
                    list.add(key);
                    count--;
                }
            }
                
            Collections.sort(list);
            int k = 0;
            for(int i=j;i<a1.length;i++){
                a1[i] = list.get(k);
                System.out.print(list.get(k) + " ");
                k++;
                
            }
            
            System.out.println();
	    }
	}
}