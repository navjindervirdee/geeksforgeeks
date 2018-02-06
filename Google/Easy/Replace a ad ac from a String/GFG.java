import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    input.nextLine();
	    for(int i=0;i<t;i++){
	        String str = input.nextLine().trim();
	        str = str.replaceAll("ac","");
	        str = str.replaceAll("b","");
	        System.out.println(str);
	    }
		//code
	}
}