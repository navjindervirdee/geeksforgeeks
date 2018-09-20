import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = Integer.parseInt(input.nextLine().trim());
	    
	    for(int c=0;c<t;c++){
	        int n = Integer.parseInt(input.nextLine().trim());
	        String [] temp = input.nextLine().trim().split(" ");
	        
	        int [] array = new int[n];
	        
	        for(int i=0;i<n;i++){
	            array[i] = Integer.parseInt(temp[i]);
	        }
	        
	        
	        int i=0;
	        while(i<n && array[i]==0){
	            i++;
	        }
	        
	        int j =i+1;
	        while(j<n){
	            if(array[i]==array[j]){
	                array[i] *= 2;
	                array[j] = 0;
	                j++;
	                continue;
	            }
	            if(array[j]!=0){
	                i=j;
	                j=i+1;
	                continue;
	            }
	            j++;
	        }
	        
	        int [] arr = new int[n];
	        int k=0;
	        for( i=0;i<n;i++){
	            if(array[i]!=0){
	                arr[k] = array[i];
	                k++;
	            }
	        }
	        
	        for(int h:arr){
	            System.out.print(h + " ");
	        }
	        System.out.println();
	    }
	}
}