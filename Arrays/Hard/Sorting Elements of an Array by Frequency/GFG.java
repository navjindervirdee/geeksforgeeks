import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static class Element{
        int value;
        int count;
        
        public Element(int value){
            this.value = value;
        }
        
        public void incVal(){
            this.count++;
        }
    }
    
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    for(int c=0;c<t;c++){
	        int n = input.nextInt();
	        List<Element> list = new ArrayList<Element>();
	        Map<Integer,Element> map = new HashMap<Integer,Element>();
	        for(int i=0;i<n;i++){
	            int num = input.nextInt();
	            Element e = map.get(num);
	            if(e==null){
	                e = new Element(num);
	                map.put(num,e);
	                list.add(e);
	            }
	            e.incVal();
	        }
	        
	        Collections.sort(list, new Comparator<Element>(){
	            public int compare(Element e1, Element e2){
	                if(e1.count>e2.count){
	                    return -1;
                    }
                    if(e1.count<e2.count){
                        return 1;
                    }
                    else{
                        if(e1.value>e2.value){
                            return 1;
                        }
                        else{
                            return -1;
                        }
                    }
	            }
	        });
	        
	        
	    
    	    for(int i=0;i<list.size();i++){
    	        Element e = list.get(i);
    	        for(int j=0;j<e.count;j++){
    	            System.out.print(e.value + " ");
    	        }
    	    }
    	    System.out.println();
	    }
	}
}