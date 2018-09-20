import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     int t = Integer.parseInt(br.readLine());
	     
	     for(int c=0;c<t;c++){
	         String [] params = br.readLine().trim().split(" ");
	         int n = Integer.parseInt(params[0]);
	         int s = Integer.parseInt(params[1]);
	         if(s==0){
	             System.out.println(-1);
	             continue;
	         }
	         int digit=9;
	         List<Integer> list = new ArrayList<Integer>();
	         while(n>0){
	             if(s-digit>=0){
	                 list.add(digit);
	                 s-=digit;
	                 n--;
	             }
	             else{
	                 digit--;
	             }
	         }
	         if(s>0){
	             System.out.println(-1);
	         }
	         else{
    	         for(int i=0;i<list.size();i++){
    	             System.out.print(list.get(i));
    	         }
    	         System.out.println();
	         }
	     }
	}
}