import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    private static void findNum(int i, int n, Set<String> set){
        Queue<Integer> queue =  new LinkedList<Integer>();
        queue.add(i);
        while(!queue.isEmpty()){
            int num = queue.poll();
            if(num<=n){
                set.add(Integer.toString(num));
                int lastDigit = num%10;
                if(lastDigit==0){
                    queue.add(num*10 + 1);
                    continue;
                }
                if(lastDigit==9){
                    queue.add(num*10 + 8);
                    continue;
                }
                queue.add(num*10 + lastDigit+1);
                queue.add(num*10 + lastDigit-1);
            }
        }
    }
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    for(int c=0;c<t;c++){
	        int n = input.nextInt();
	        
	        System.out.print("0" + " ");
	        
	        for(int i=1;i<10;i++){
	            Set<String> set = new HashSet<String>();
	            findNum(i,n,set);
	            List<String> list = new ArrayList<String>(set);
	            Collections.sort(list, new Comparator<String>(){
	                public int compare(String a, String b){
	                    if(a.length()<b.length()){
	                        return -1;
	                    }
	                    if(a.length()>b.length()){
	                        return 1;
	                    }
	                    else{
	                        return a.compareTo(b);
	                    }
	                }
	            });
	            
	            for(int j=0;j<list.size();j++){
	                System.out.print(list.get(j) + " ");
	            }
	        }
	        System.out.println();
	        
	        
	        
	    }
	}
}