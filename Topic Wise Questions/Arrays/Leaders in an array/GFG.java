import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    for(int c=0;c<t;c++){
	        int n = Integer.parseInt(br.readLine());
	        String [] temp = br.readLine().trim().split(" ");
	        int [] array = new int[n];
	        for(int i=0;i<n;i++){
	            array[i] = Integer.parseInt(temp[i]);
	        }
	        
	        int max = -1;
	        List<Integer> list = new ArrayList<Integer>();
	        for(int i=n-1;i>-1;i--){
	            if(array[i]>max){
	                list.add(array[i]);
	            }
	            max = Math.max(max,array[i]);
	        }
	        for(int i=list.size()-1;i>-1;i--){
	            System.out.print(list.get(i) +" ");
	        }
	        System.out.println();
	    }
	}
}