import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    for(int c=0;c<t;c++){
	        int n = input.nextInt();
	        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	        for(int i=0;i<n;i++){
	            int num = input.nextInt();
	            if(map.containsKey(num)){
	                map.put(num,map.get(num)+1);
	                continue;
	            }
	            map.put(num, new Integer(1));
	        }
	        
	        List<Integer> list = new ArrayList<Integer>();
	        for(int key : map.keySet()){
	            list.add(map.get(key));
	        }
	        
	        Collections.sort(list);
	        
	        int m = input.nextInt();
	        int i = 0;
	        int count = 0;
	        
	        while(i<list.size() && m>0){
	            if(list.get(i)!=0){
	                list.set(i,list.get(i)-1);
	                m--;
	                continue;
	            }
	            i++;
	        }
	        
	        for(int j=0;j<list.size();j++){
	            if(list.get(j)!=0){
	                count++;
	            }
	        }
	        System.out.println(count);
	    }
	}
}