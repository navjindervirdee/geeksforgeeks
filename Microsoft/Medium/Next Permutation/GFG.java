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
	        
	        for(int i=0;i<n;i++){
	            array[i] = Integer.parseInt(temp[i]);
	        }
	        
	        int index = -1;
	        for(int i=n-1;i>0;i--){
	            if(array[i-1]<array[i]){
	                index = i-1;
	                break;
	            }
	        }
	        
	        if(index!=-1){
	            int swap = -1;
	            for(int i=n-1;i>index;i--){
	                if(array[i]>array[index]){
	                    swap = i;
	                    break;
	                }
	            }
	            
	            int tem = array[index];
	            array[index] = array[swap];
	            array[swap] = tem;
	        }
	        index++;
	        int i = index;
	        int j = n-1;
	        while(i<j){
	            int tem = array[i];
	            array[i] = array[j];
	            array[j] = tem;
	            i++;
	            j--;
	        }
	        
	        for(i=0;i<n;i++){
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }
	}
}