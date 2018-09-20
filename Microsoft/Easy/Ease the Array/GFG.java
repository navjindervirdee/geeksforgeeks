import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = Integer.parseInt(input.nextLine());
	    
	    for(int c=0;c<t;c++){
	        int n = Integer.parseInt(input.nextLine());
	        String [] temp = input.nextLine().trim().split(" ");
	        
	        int [] array = new int[n];
	        
	        for(int i=0;i<temp.length;i++){
	            array[i] = Integer.parseInt(temp[i]);
	        }
	        
	        int prev = 0;
	        if(array[0]==0){
	            prev = -1;
	        }
	        
	        for(int i=1;i<array.length;i++){
	            if(array[i]==0){
	                prev=-1;
	                continue;
	            }
	            if(prev==-1){
	                prev = i;
	                continue;
	            }
	            if(array[i]!=array[prev]){
	                prev = i;
	                continue;
	            }
	            array[prev] = array[prev]*2;
	            array[i] = 0;
	        }
	        
	        int i = -1;
	        while(i+1<array.length && array[i+1]!=0){
	            i++;
	        }
	        
	        for(int j = i+1;j<n;j++){
	            if(array[j]!=0){
	                i++;
	                array[i] = array[j];
	            }    
	        }
	        
	        for(int j=i+1;j<n;j++){
	            array[j] = 0;
	        }
	        
	        for(int j : array){
	            System.out.print(j  + " ");
	        }
	        System.out.println();
	    }
	    
	}
}