import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    private static void findSubsets(List<Integer> array, Set<ArrayList<Integer>> set, List<Integer> l, int index, int sum, int num){
        if(sum==num){
            ArrayList<Integer> list = new ArrayList<Integer>(l);
            set.add(list);
            return;
        }
        
        if(index>=array.size()){
            return;
        }
        if(sum>num){
            return;
        }
        
        sum = sum + array.get(index);
        l.add(array.get(index));
        findSubsets(array,set,l,index+1,sum,num);
        
        sum = sum - array.get(index);
        l.remove(l.size()-1);
        findSubsets(array,set,l,index+1,sum,num);
        
    }
	public static void main (String[] args) {
       Scanner input = new Scanner(System.in);
       int t = input.nextInt();
       for(int c=0;c<t;c++){
           //read values. 
           int n = input.nextInt();
           List<Integer> array = new ArrayList<Integer>();
           for(int i=0;i<n;i++){
               array.add(input.nextInt());
           }
           int num = input.nextInt();
           
           //sort values.
           Collections.sort(array);
           
           Set<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
           List<Integer> l = new ArrayList<Integer>();
           
           findSubsets(array,set,l,0,0,num);
           
           if(set.size()==0){
               System.out.println("Empty");
               continue;
           }
           
           List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(set);
           Collections.sort(list, new Comparator<List<Integer>>(){
               public int compare(List<Integer> l1, List<Integer> l2){
                   int j=0;
                   for(int i=0;i<l1.size();i++){
                       if(j>=l2.size()){
                           return 1;
                       }
                       if(l1.get(i)<l2.get(j)){
                           return -1;
                       }
                       if(l1.get(i)>l2.get(i)){
                           return 1;
                       }
                       j++;
                   }
                   return  -1;
               }
           });
           
           for(int i=0;i<list.size();i++){
               List<Integer> ls = list.get(i);
               System.out.print("(");
               for(int j=0;j<ls.size()-1;j++){
                   System.out.print(ls.get(j) + " ");
               }
               System.out.print(ls.get(ls.size()-1) + ")");
           }
           System.out.println();
       }
	}
}