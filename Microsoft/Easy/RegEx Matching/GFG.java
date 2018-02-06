import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    input.nextLine();
	    for(int c=0;c<t;c++){
	        String pattern = input.nextLine().trim();
	        String text = input.nextLine().trim();
	        
	        if(pattern.charAt(0)=='^'){
	            String sub = pattern.substring(1);
	            String tsub = text.substring(0,sub.length());
	            if(sub.length()>tsub.length()){
	                System.out.println(0);
	                continue;
	            }
	            if(sub.equals(tsub)){
	                System.out.println(1);
	            }
	            else{
	                System.out.println(0);
	            }
	            continue;
	        }
	        
	        if(pattern.charAt(pattern.length()-1)=='$'){
	            String sub = pattern.substring(0,pattern.length()-1);
	            String tsub = text.substring(text.length()-pattern.length()+1);
	            if(sub.length()>tsub.length()){
	                System.out.println(0);
	                continue;
	            }
	            if(sub.equals(tsub)){
	                System.out.println(1);
	            }
	            else{
	                System.out.println(0);
	            }
	            continue;
	        }
	        
	        int index = text.indexOf(pattern);
	        if(index==-1){
	            System.out.println(0);
	        }
	        else{
	            System.out.println(1);
	        }
	    }
	}
}