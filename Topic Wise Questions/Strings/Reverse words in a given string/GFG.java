import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     int t = Integer.parseInt(br.readLine());
	     for(int c=0;c<t;c++){
	         String [] array = br.readLine().trim().split("\\.");
	         String [] reverse = new String[array.length];
	         for(int i=array.length-1;i>-1;i--){
	             reverse[i] = array[array.length-i-1];
	         }
             for(int i=0;i<array.length-1;i++){
                 System.out.print(reverse[i]+ ".");
             }
             System.out.println(reverse[array.length-1]);
	     }
	}
}