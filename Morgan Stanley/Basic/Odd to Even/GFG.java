import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		input.nextLine();
		for(int c=0;c<t;c++){
		    String num = input.nextLine().trim();
		    int last = Integer.parseInt(Character.toString(num.charAt(num.length()-1)));
		    int min = 10000000;
		    int index = -1;
		    for(int i=0;i<num.length()-1;i++){
		        int digit = Integer.parseInt(Character.toString(num.charAt(i)));
		        if(digit%2==0){
		            if(digit<last){
		                index = i;
		                break;
		            }
	                min = digit;
	                index = i;
	                continue;
		          
		        }
		    }
		    if(index==-1){
		        System.out.println(num);
	        }
	        else{
		        System.out.println(num.substring(0,index) + Integer.toString(last) + num.substring(index+1,num.length()-1) + num.charAt(index));
	        }
		}
	}
}