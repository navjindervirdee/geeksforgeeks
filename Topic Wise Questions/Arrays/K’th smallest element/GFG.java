import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    private static int quickSort(int [] array, int low, int high, int k){
        if(low>high){
            return -1;
        }
        
        int index = partition(array,low,high);
        if(index==k){
            return array[k];
        }
        if(k<index){
            return quickSort(array,low,index-1,k);
        }
        else{
            return quickSort(array,index+1,high,k);
        }
        
    }
    
    private static int partition(int [] array, int low, int high){
        int pivotIndex = low + (int)(Math.random()*(high-low));
        int pivot = array[pivotIndex];
        array[pivotIndex] = array[low];
        array[low] = pivot;
        pivotIndex = low;
        
        for(int i=low+1;i<high+1;i++){
            if(array[i]<=pivot){
                pivotIndex++;
                int temp = array[i];
                array[i] = array[pivotIndex];
                array[pivotIndex] = temp;
            }
        }
        
        array[low] = array[pivotIndex];
        array[pivotIndex] = pivot;
        return pivotIndex;
    }
    
	public static void main (String[] args) throws Exception{
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     int t = Integer.parseInt(br.readLine());
	     for(int c=0;c<t;c++){
	         int n = Integer.parseInt(br.readLine());
	         String [] temp = br.readLine().trim().split(" ");
	         int k = Integer.parseInt(br.readLine()) - 1;
	         
	         int [] array = new int[n];
	         for(int i=0;i<n;i++){
	             array[i] = Integer.parseInt(temp[i]);
	         }
	         
	         int result = quickSort(array,0,n-1,k);
	         System.out.println(result);
	     }
	         
	}
}