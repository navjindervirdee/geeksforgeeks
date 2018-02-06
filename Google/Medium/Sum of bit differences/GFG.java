import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    private static String convertBinary(int num){
        String binary = "";
        while(num!=0){
            binary = Integer.toString(num%2) + binary;
            num=num/2;
        }
        while(binary.length()!=4){
            binary = "0" + binary;
        }
        return binary;
    }
    
    private static String [] getBinary(int [] array){
        String [] binary = new String[array.length];
        for(int i=0;i<array.length;i++){
             binary[i] = convertBinary(array[i]);
        }
        return binary;
    }
    
    private static int getDiff(String a, String b){
        int diff = 0;
        int i = a.length();
        int j = b.length();
        while(i!=0 && j!=0){
            if(a.charAt(i-1)!=b.charAt(j-1)){
                diff++;
            }
            i--;
            j--;
        }
        return diff*2;
    }
    
    private static int getSum(String [] binary){
        int sum = 0;
        for(int i=0; i<binary.length;i++){
            for(int j= i+1;j<binary.length;j++){
                sum = sum + getDiff(binary[i],binary[j]);
            }
        }
        return sum;
    }
    
	public static void main (String[] args) {
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    for(int c=0;c<t;c++){
	        int n = input.nextInt();
	        int [] array = new int[n];
	        for(int i=0;i<n;i++){
	            array[i] = input.nextInt();
	        }
	        
	        String [] binary = getBinary(array);
	        int sumbitDiff = getSum(binary);
	        System.out.println(sumbitDiff);
	    }
	}
}