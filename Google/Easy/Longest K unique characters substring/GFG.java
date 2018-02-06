import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    private static boolean isUnique(String str,int k){
        Set<Character> set = new HashSet<Character>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            set.add(c);
            if(set.size()>k){
                return false;
            }
        }
        return true;
    }
    
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for(int c=0;c<t;c++){
		    input.nextLine();
		    String str = input.nextLine().trim();
		    int k = input.nextInt();
		    int count = -1;
		    for(int i=0;i<str.length()-k;i++){
		        for(int j=str.length();j>i;j--){
		            String sub = str.substring(i,j);
		            boolean unique = isUnique(sub,k);
		            if(unique){
		                if(count<sub.length()){
		                    count = sub.length();
		                }
		            }
		        }
		    }
		    System.out.println(count);
		}
	}
}