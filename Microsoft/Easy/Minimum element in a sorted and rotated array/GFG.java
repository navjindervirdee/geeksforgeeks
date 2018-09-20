import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    private static int binarySearch(int [] array, int low, int high, int min){
        if(low+1==high){
            return Math.min(array[low],array[high]);
        }
        
        int mid = low + (high-low)/2;
        if(array[low]<=array[mid]){
            if(array[low]<=min && min<=array[mid]){
                return binarySearch(array, low, mid, min);
            }
            else{
                return binarySearch(array, mid,high,min);
            }
        }
        
        else{
            if(array[mid]<=min && min<array[high]){
                return binarySearch(array, mid,high,min);
            }
            else{
                return binarySearch(array, low, mid,min);
            }
        }
    }
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
	        
	        int min = Integer.MIN_VALUE;
	        int result = binarySearch(array,0,n-1,min);
	        if(n==1 || array[0]<=array[n-1]){
	            result = array[0];
	        }
	        System.out.println(result);
	    }
	}
}