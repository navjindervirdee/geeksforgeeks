import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    private static void findComb(int [] array, int index, int sum, int B, List<Integer> temp , List<List<Integer>> list){
        if(sum==B){
            List<Integer> l = new ArrayList<Integer>(temp);
            list.add(l);
            return;
        }
        if(index>array.length-1 || sum>B){
            return;
        }
        
        
        temp.add(array[index]);
        findComb(array,index+1,sum+array[index],B,temp,list);
        
        temp.remove(temp.size()-1);
        findComb(array,index+1,sum,B,temp,list);
    }
    
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = Integer.parseInt(input.nextLine());
	    
	    for(int c=0;c<t;c++){
	        int n = Integer.parseInt(input.nextLine());
	        String [] temp = input.nextLine().trim().split(" ");
	        int B = Integer.parseInt(input.nextLine());
	        
	        int [] array = new int[n];
	        
	        for(int i=0;i<n;i++){
	            array[i] = Integer.parseInt(temp[i]);
	        }
	        
	        Arrays.sort(array);
	        List<List<Integer>> list = new ArrayList<List<Integer>>();
	        List<Integer> tp = new ArrayList<Integer>();
	        findComb(array,0,0,B,tp,list);
	        if(list.size()==0){
	            System.out.println("Empty");
	            continue;
	        }
	        
	        
	        Set<String> unique = new HashSet<String>();
	        
	        for(int i=0;i<list.size();i++){
	            StringBuilder sb = new StringBuilder();
	            sb.append("(");
	            for(int j =0;j<list.get(i).size()-1;j++){
	                sb.append(list.get(i).get(j) + " ");
	            }
	            sb.append(list.get(i).get(list.get(i).size()-1) + ")");
	            unique.add(sb.toString());
	        }
	        
	        List<String> result = new ArrayList<String>(unique);
	        Collections.sort(result);
	        
	        for(String l : result){
	            System.out.print(l);
	        }
	        System.out.println();
	    }
	}
}