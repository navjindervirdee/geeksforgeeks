import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    input.nextLine();
	    
	    for(int c=0;c<t;c++){
	        char [] array1 = input.nextLine().trim().toCharArray();
	        char [] array2 = input.nextLine().trim().toCharArray();
	        
	        Set<Character> set1 = new HashSet<Character>();
	        Set<Character> set2 = new HashSet<Character>();
	        
	        for(int i=0;i<array1.length;i++){
	            set1.add(array1[i]);
	        }
	        
	        for(int i=0;i<array2.length;i++){
	            set2.add(array2[i]);
	        }
	        
	        set1.retainAll(set2);
	        set2 = new HashSet<Character>();
	        
	        //List<Character> list = new ArrayList<Character>();
	        for(int i=0;i<array1.length;i++){
	            if(!set1.contains(array1[i])){
	                set2.add(array1[i]);
	            }
	        }
	        
	        for(int i=0;i<array2.length;i++){
	            if(!set1.contains(array2[i])){
	                set2.add(array2[i]);
	            }
	        }
	        
	        List<Character> list = new ArrayList<Character>(set2);
	        Collections.sort(list);
	        for(int i=0;i<list.size();i++){
	            System.out.print(list.get(i));
	        }
	        System.out.println();
	    }
	}
}