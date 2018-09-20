import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    int [] array = {1,2,5,10,20,50,100,500,1000};
	    
	    for(int c=0;c<t;c++){
	        int money = Integer.parseInt(br.readLine());
	        List<Integer> list = new ArrayList<Integer>();
	        
	        int max = array.length-1;
	        
	        while(money>0){
	            if(money-array[max]<0){
	                max--;
	            }
	            else{
	                money -= array[max];
	                list.add(array[max]);
	            }
	        }
	        
	        for(int i=0;i<list.size();i++){
	            System.out.print(list.get(i) + " ");
	        }
	        System.out.println();
	    }
	}
}