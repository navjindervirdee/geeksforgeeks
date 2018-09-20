import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static class Pair{
        int x;
        int y;
        
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    for(int c=0;c<t;c++){
	        String [] params = br.readLine().trim().split(" ");
	        int n = Integer.parseInt(params[0]);
	        int m = Integer.parseInt(params[1]);
	        int k = Integer.parseInt(params[2]);
	        
	        String [] temp1 = br.readLine().trim().split(" ");
	        String [] temp2 = br.readLine().trim().split(" ");
	        
	        int [] array1 = new int[n];
	        int [] array2 = new int[m];
	        
	        for(int i=0;i<n;i++){
	            array1[i] = Integer.parseInt(temp1[i]);
	        }
	        
	        for(int i=0;i<m;i++){
	            array2[i] = Integer.parseInt(temp2[i]);
	        }
	        
	        Set<Integer> set = new HashSet<Integer>();
	        
	        for(int i=0;i<n;i++){
	            set.add(k-array1[i]);
	        }
	        
	        List<Pair> list = new ArrayList<Pair>();
	        
	        for(int i=0;i<m;i++){
	            if(set.contains(array2[i])){
	                Pair p = new Pair(k-array2[i],array2[i]);
	                list.add(p);
	            }
	        }
	        
	        Collections.sort(list, new Comparator<Pair>(){
	            public int compare(Pair p1, Pair p2){
	                return p1.x-p2.x;
                }
            });
            
            if(list.size()==0){
                System.out.println(-1);
                continue;
            }
            
            for(int i=0;i<list.size()-1;i++){
                System.out.print(list.get(i).x + " " + list.get(i).y + ", ");
            }
            System.out.println(list.get(list.size()-1).x + " " + list.get(list.size()-1).y);
	    }
	}
}