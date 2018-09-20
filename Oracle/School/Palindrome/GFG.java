import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    for(int c=0;c<t;c++){
	        int reverse = 0;
	        int num = input.nextInt();
	        int temp = num;
    	    while(num!=0){
    	        int rem = num%10;
    	        int quo = num/10;
    	        num = quo;
    	        reverse = reverse*10 + rem;
    	    }
    	    if(reverse==temp){
    	        System.out.println("Yes");
    	    }
    	    else{
    	        System.out.println("No");
    	    }
	    }
	}
}