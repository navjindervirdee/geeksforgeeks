import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    private static void findSets(List<Integer> list, List<Integer> l, Set<ArrayList<Integer>> set,int sum, int index, int num){
        if(index>=list.size()){
            return;
        }
        sum = sum + list.get(index);
        l.add(list.get(index));
        if(sum>num){
            sum = sum - list.get(index);
            l.remove(l.size()-1);
            return;
        }
        
        if(sum==num){
            set.add(new ArrayList<Integer>(l));
            sum =sum - list.get(index);
            l.remove(l.size()-1);
            return;
        }
        
        if(sum<num){
            findSets(list,l,set,sum,index,num);
            for(int i=1;i<list.size()-index;i++){
                findSets(list,l,set,sum,index+i,num);
            }
            sum = sum - list.get(index);
            l.remove(l.size()-1);
            findSets(list,l,set,sum,index+1,num);
        }
    }
    
	public static void main (String[] args) {
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    for(int c = 0;c<t;c++){
	        int n = input.nextInt();
	        List<Integer> list = new ArrayList<Integer>();
	        Set<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
	        for(int i=0;i<n;i++){
	            list.add(input.nextInt());
	        }
	        Collections.sort(list);
	        int num = input.nextInt();
	        List<Integer> l = new ArrayList<Integer>();
	        findSets(list,l,set,0,0,num);
	        
	        List<ArrayList<Integer>> sets = new ArrayList<ArrayList<Integer>>(set);
	        Collections.sort(sets,new Comparator<ArrayList<Integer>>(){
	            public int compare(ArrayList<Integer> l1, ArrayList<Integer> l2){
	                int j = 0;
	                for(int i=0;i<l1.size();i++){
	                    if(j>=l2.size()){
	                        return 1;
	                    }
	                    if(l1.get(i)<l2.get(j)){
	                        return -1;
	                    }
	                    
	                    if(l1.get(i)>l2.get(j)){
	                        return 1;
	                    }
	                    j++;
	                }
	                if(j==l2.size()){
	                    return 0;
	                }
	                return -1;
	            }
	        });
	        if(sets.size()==0){
	            System.out.println("Empty");
	            continue;
	        }
	        for(int i=0;i<sets.size();i++){
	            List<Integer> s = sets.get(i);
	            System.out.print("(");
	            for(int j = 0;j<s.size()-1;j++){
	                System.out.print(s.get(j) + " ");
	            }
	            System.out.print(s.get(s.size()-1) +")");
	        }
	        System.out.println();
	    }
	}
}