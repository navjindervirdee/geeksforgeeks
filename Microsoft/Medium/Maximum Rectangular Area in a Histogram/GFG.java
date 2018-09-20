import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    private static int [] farHeight(int [] array, int i, int j){
        Stack<Integer> stack = new Stack<Integer>();
        int [] farIndex = new int[array.length];
        farIndex[array.length-1] = array.length-1;
        
        stack.push(i);
        i++;
        while(i<j){
            int top = stack.peek();
            if(array[top]<=array[i]){
                stack.push(i);
                i++;
                continue;
            }
            
            while(!stack.isEmpty() && array[stack.peek()]>array[i]){
                top = stack.pop();
                farIndex[top] = i-1;
            }
            stack.push(i);
            i++;
        }
        
        while(!stack.isEmpty()){
            int top = stack.pop();
            farIndex[top] = array.length-1;
        }
        return farIndex;
    }
    
    private static int [] reverseArray(int [] array){
        int i = 0;
        int j = array.length-1;
        
        while(i<j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return array;
    }
    
    public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    for(int c=0;c<t;c++){
	        int n = Integer.parseInt(br.readLine());
	        String [] temp = br.readLine().trim().split(" ");
	        
	        int [] array = new int[n];
	        
	        for(int i=0;i<array.length;i++){
	            array[i] = Integer.parseInt(temp[i]);
	        }
	        
	        int [] farRight = farHeight(array,0,array.length);
	        int [] farLeft = farHeight(reverseArray(array),0,array.length);
	        farLeft = reverseArray(farLeft);
	        
	        for(int i=0;i<n;i++){
	            farLeft[i] = array.length-1-farLeft[i];
	        }
	        array = reverseArray(array);
	        
	        int max = 0;
	        for(int i=0;i<n;i++){
	            int left = farLeft[i];
	            int right = farRight[i];
	            int area = ((right-i) + (i-left) + 1 )*array[i];
	            max = Math.max(max,area);
	        }
	        
	        System.out.println(max);
	    }
	}
}