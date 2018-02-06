import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    private static boolean checkEquality(String str){
        int mid = str.length()/2;        
        int lsum = 0;
        int rsum = 0;
        for(int i=0;i<mid;i++){
            int num = Integer.parseInt(Character.toString(str.charAt(i)));
            lsum = lsum + num;
        }
        
        for(int i=mid;i<str.length();i++){
            int num = Integer.parseInt(Character.toString(str.charAt(i)));
            rsum = rsum + num;
        }
        if(rsum==lsum){
            return true;
        }
        return false;
    }
            
    public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		input.nextLine();
		for(int c=0;c<t;c++){
		    String a = input.nextLine();
		    int len = 0;
		    for(int i=0;i<a.length();i++){
		        for(int j=a.length();j>i;j--){
		            String sub = a.substring(i,j);
		            if(sub.length()%2!=0){
		                continue;
		            }
		            boolean lrequal = checkEquality(sub);
		            if(lrequal){
		                if(len<sub.length()){
		                    len = sub.length();
		                }
		            }
		        }
		    }
		    System.out.println(len);
		}
	}
}