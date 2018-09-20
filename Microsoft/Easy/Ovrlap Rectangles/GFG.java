import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = Integer.parseInt(input.nextLine());
	    
	    for(int c=0;c<t;c++){
	        String [] temp1 = input.nextLine().trim().split(" ");
	        String [] temp2 = input.nextLine().trim().split(" ");
	        
	        int x1 = Integer.parseInt(temp1[0]);
	        int y2 = Integer.parseInt(temp1[1]);
	        int x2 = Integer.parseInt(temp1[2]);
	        int y1 = Integer.parseInt(temp1[3]);
	        
	        int a1 = Integer.parseInt(temp2[0]);
	        int b2 = Integer.parseInt(temp2[1]);
	        int a2 = Integer.parseInt(temp2[2]);
	        int b1 = Integer.parseInt(temp2[3]);
	        
	        int max = Math.max(x1,x2);
	        int min = Math.min(x1,x2);
	        
	        x1 = min;
	        x2 = max;
	        
	        max = Math.max(y1,y2);
	        min = Math.min(y1,y2);
	        
	        y1 = min;
	        y2 = max;
	        
	        max = Math.max(a1,a2);
	        min = Math.min(a1,a2);
	        
	        a1 = min;
	        a2 = max;
	        
	        max = Math.max(b1,b2);
	        min = Math.min(b1,b2);
	        
	        b1 = min;
	        b2 = max;
	        
	        //System.out.print(x1 + " " + x2 + " " + y1 + " " + y2 + " " + a1 + " " + a2 + " " + b1 + " " + b2);
	        
	        int result = 0;
	        
	        if(x1<a1 && a1<x2){
	            if(y1<b1 && b1<y2){
	                result = 1;
	            }
	            if(y1<b2 && b2<y2){
	                result = 1;
	            }
	            if(b1<y1 && y2<b2){
	                result = 1;
	            }
	        }
	        
	        if(a1<x1 && x1<a2){
	            if(b1<y1 && y1<b2){
	                result = 1;
	            }
	            if(b1<y2 && y2<b2){
	                result = 1;
	            }
	            if(y1<b1 && b2<y2){
	                result = 1;
	            }
	        }
	        
	        
	        System.out.println(result);
	    }
	}
}