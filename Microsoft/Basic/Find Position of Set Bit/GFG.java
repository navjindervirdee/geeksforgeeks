import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    private static String getBinary(int num){
        String binary = "";
        while(num!=0){
            binary = binary + Integer.toString(num%2);
            num = num/2;
        }
        binary = new StringBuilder(binary).reverse().toString();
        return binary;
    }
	public static void main (String[] args) {
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    for(int c=0; c<t;c++){
	        int num = input.nextInt();
	        String binary = getBinary(num);
	        int pos = -1;
	        boolean moreOnes = false;
	        for(int i=0;i<binary.length();i++){
	            int digit = Integer.parseInt(Character.toString(binary.charAt(i)));
	            if(digit==1 && pos>-1){
	                moreOnes = true;
	                break;
	            }
	            if(digit==1){
	                pos = i;
	            }
	        }
	        if(moreOnes){
	            System.out.println(-1);
	        }
	        else{
	            System.out.println(binary.length()-pos);
	        }
	    }
	}
}