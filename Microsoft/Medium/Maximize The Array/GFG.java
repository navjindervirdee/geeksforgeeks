import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static class Element{
        int index;
        int id;
        int val;
        
        public Element(int index, int id, int val){
            this.index = index;
            this.id = id;
            this.val = val;
        }
    }
    
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = Integer.parseInt(input.nextLine());
	    
	    for(int c=0;c<t;c++){
	        int n = Integer.parseInt(input.nextLine());
	        String [] temp1 = input.nextLine().trim().split(" ");
	        String [] temp2 = input.nextLine().trim().split(" ");
	        
	        Element [] array = new Element[n+n];
	        
	        int k = 0;
	        for(int i=0;i<n;i++){
	            array[k] = new Element(i,1,Integer.parseInt(temp1[i]));
	            k++;
	        }
	        
	        for(int i=0;i<n;i++){
	            array[k] = new Element(i,2,Integer.parseInt(temp2[i]));
	            k++;
	        }
	        
	        Arrays.sort(array, new Comparator<Element>(){
	            public int compare(Element e1, Element e2){
	                if(e1.val==e2.val){
	                    if(e1.id==e2.id){
	                        return e1.index-e2.index;
                        }
                        return e2.id-e1.id;
                    }
                    return e2.val-e1.val;
                }
            });
            
            List<Element> list = new ArrayList<Element>();
            Set<Integer> set = new HashSet<Integer>();
            for(int i=0;i<n+n;i++){
                if(list.size()==n){
                    break;
                }
                if(set.contains(array[i].val)){
                    continue;
                }
                set.add(array[i].val);
                list.add(array[i]);
            }
            
            Collections.sort(list, new Comparator<Element>(){
                public int compare(Element e1, Element e2){
                    if(e1.id==e2.id){
                        return e1.index-e2.index;
                    }
                    return e2.id-e1.id;
                }
            });
            
            for(Element e : list){
                System.out.print(e.val + " ");
            }
            System.out.println();
	    }
	    
	}
}