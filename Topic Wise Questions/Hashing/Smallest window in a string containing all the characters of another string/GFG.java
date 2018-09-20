import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static class Element{
        int index;
        char c;
        
        public Element(int index, char c){
            this.index = index;
            this.c = c;
        }
    }
    
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    input.nextLine();
	    
	    for(int c=0;c<t;c++){
	        char [] array1  = input.nextLine().trim().toCharArray();
	        char [] array2  = input.nextLine().trim().toCharArray();
	        
	        Map<Character,Integer> map = new HashMap<Character,Integer>();
	        for(int i=0;i<array2.length;i++){
	            if(map.containsKey(array2[i])){
	                map.put(array2[i],map.get(array2[i])+1);
	                continue;
	            }
	            map.put(array2[i],1);
	        }
	        
	        List<Element> list = new ArrayList<Element>();
	        for(int i=0;i<array1.length;i++){
	            if(map.containsKey(array1[i])){
	                Element el = new Element(i,array1[i]);
	                list.add(el);
	            }
	        }
	        
	        int min = Integer.MAX_VALUE;
	        int minstart = Integer.MAX_VALUE;
	        
	        Map<Character,Integer> copy = new HashMap<Character,Integer>(map);
	        
	        for(int i=0;i<list.size()-array2.length+1;i++){
	            Map<Character,Integer> temp = new HashMap<Character,Integer>();
	            map = new HashMap<Character,Integer>(copy);
	            int start = list.get(i).index;
	            for(int j=i;j<list.size();j++){
	                char ch = list.get(j).c;
	                if(!map.containsKey(ch)){
	                    continue;
	                }
	                int count = map.get(ch);
	                count--;
	                map.put(ch,count);
	                if(count==0){
	                    map.remove(ch);
	                    
	                }
	                if(temp.containsKey(ch)){
	                    temp.put(ch,temp.get(ch)+1);
	                }
	                else{
	                    temp.put(ch,1);
	                }
	                if(map.isEmpty()){
	                    if(min>list.get(j).index-start){
	                        min = list.get(j).index-start;
	                        minstart = start;
                        }
	                }
	            }
	        }
	        
	        if(minstart==Integer.MAX_VALUE){
	            System.out.println(-1);
	            continue;
	        }
	        
	        for(int i=minstart;i<minstart+min+1;i++){
	            System.out.print(array1[i]);
	        }
	        System.out.println();
	    }
	    
	}
}