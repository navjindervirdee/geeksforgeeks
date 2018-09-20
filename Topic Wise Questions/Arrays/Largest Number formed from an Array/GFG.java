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
	         
	         Arrays.sort(temp, new Comparator<String>(){
	             public int compare(String s1, String s2){
	                 String s3 = s1+s2;
	                 String s4 = s2+s1;
	                 
	                 int result = s3.compareTo(s4);
	                 return result*-1;
	                 
	             }
	         });
	         
	         for(int i=0;i<n;i++){
	             System.out.print(temp[i]);
	         }
	         System.out.println();
	     }
	}
}