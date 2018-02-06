import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    private static String getBinary(int num){
        int rem = 0;
        String  binary = "";
        while(num!=0){
            rem = num%2;
            binary = binary + Integer.toString(rem);
            num = num/2;
        }
        binary = new StringBuilder(binary).reverse().toString();
        return binary;
    }
    
    private static String changeBit(String binary, int pos){
        int value = Integer.parseInt(Character.toString(binary.charAt(pos-1)));
        if(value == 0){
            return binary;
        }
        binary = binary.substring(0,pos-1) + "0" + binary.substring(pos);
        return binary;
    }
    
    private static int convert(String binary){
        int num = 0;
        int j = binary.length()-1;
        for(int i=0;i<binary.length();i++){
            num = num + ((int)Math.pow(2,j))*Integer.parseInt(Character.toString(binary.charAt(i)));
            j--;
        }
        return num;
    }
        
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for(int c=0;c<t;c++){
		    int num = input.nextInt();
		    int k = input.nextInt();
		    
		    String binary = getBinary(num);
		    String change = changeBit(binary,k);
		    
		    if(binary.equals(change)){
		        System.out.println(num);
		        continue;
		    }
		    
		    num = convert(change);
		    System.out.println(num);
		}
	}
}