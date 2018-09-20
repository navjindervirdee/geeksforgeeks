import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static class Number{
        int value;
        int count;
        
        public Number(int value, int count){
            this.value = value;
            this.count = count;
        }
    }
    
	public static void main (String[] args) throws Exception{
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     int t = Integer.parseInt(br.readLine());
	     
	     for(int c=0;c<t;c++){
	         int n = Integer.parseInt(br.readLine());
	         String [] temp = br.readLine().trim().split(" ");
	         
	         List<Number> list = new ArrayList<Number>();
	         Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	         
	         for(int i=0;i<n;i++){
	             int num = Integer.parseInt(temp[i]);
	             if(map.containsKey(num)){
	                 map.put(num,map.get(num)+1);
	                 continue;
	             }
	             map.put(num,new Integer(1));
	         }
	         
	         for(int key : map.keySet()){
	             Number number = new Number(key,map.get(key));
	             list.add(number);
	         }
	         
	         Collections.sort(list, new Comparator<Number>(){
	             public int compare(Number a, Number b){
	                 if(a.count==b.count){
	                     return a.value-b.value;
                     }
                     else{
                         return b.count-a.count;
                     }
	             }
	         });
	         
	         for(int i=0;i<list.size();i++){
	             Number number =  list.get(i);
	             int count = number.count;
	             for(int j=0;j<count;j++){
	                 System.out.print(number.value + " ");
	             }
	         }
	         System.out.println();
	     }
	}
}