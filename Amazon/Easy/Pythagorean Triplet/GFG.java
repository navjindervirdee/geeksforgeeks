import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    private static boolean findPair(int [] array, int start, int end, int num){
        while(start<end){
            int sum = array[start] + array[end];
            if(sum==num){
                return true;
            }
            if(sum>num){
                end--;
            }
            else{
                start++;
            }
        }
        return false;
    }
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    for(int c=0;c<t;c++){
	        int n = input.nextInt();
	        int [] array =  new int[n];
	        for(int i=0;i<n;i++){
	            int num = input.nextInt();
	            array[i] = num*num;
	        }
	        
	        Arrays.sort(array);
	        
	        boolean found = false;
	        for(int i=n-1;i>1;i--){
	            int num = array[i];
	            found = findPair(array,0,i-1,num);
	            if(found){
	                break;
	            }
	        }
	        if(found){
	            System.out.println("Yes");
	        }
	        else{
	            System.out.println("No");
	        }
	    }
	}
}