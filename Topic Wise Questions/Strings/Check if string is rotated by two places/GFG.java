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
	         String s1 = input.nextLine().trim();
	         String s2 = input.nextLine().trim();
	         int result = 0;
	         if(s1.length()==s2.length()){
	             String rot1 = s1.substring(2) + s1.substring(0,2);
	             String rot2 = s1.substring(s1.length()-2) + s1.substring(0,s1.length()-2);
	             if(rot1.equals(s2) || rot2.equals(s2)){
	                 result = 1;
	             }
	         }
	         System.out.println(result);
	     }
	     
	}
}