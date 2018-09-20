import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static void siftDown(int [] nums, int index, int size){
        int maxindex = index;
        if(index*2+1<size && nums[index]<nums[2*index+1]){
            maxindex = 2*index + 1;
        }
        if(index*2+2 <size && nums[maxindex]<nums[2*index+2]){
            maxindex = index*2+2;
        }
        if(maxindex!=index){
            int temp = nums[index];
            nums[index] = nums[maxindex];
            nums[maxindex] = temp;
            siftDown(nums,maxindex,size);
        }
    }
    
    private static int extractMax(int [] numbers,int size){
        int result = numbers[0];
        numbers[0] = numbers[size-1];
        siftDown(numbers,0,size-1);
        return result;
    }
	public static void main (String[] args) throws Exception
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    for(int c=0;c<t;c++){
	        String [] params = br.readLine().trim().split(" ");
	        int n = Integer.parseInt(params[0]);
	        int k = Integer.parseInt(params[1]);
	        String [] nums = br.readLine().trim().split(" ");
	        int [] numbers = new int[nums.length];
	        for(int i=0;i<nums.length;i++){
	            numbers[i] = Integer.parseInt(nums[i]);
	        }
	        
	        for(int i=nums.length/2;i>-1;i--){
	            siftDown(numbers,i,nums.length);
	        }
	        
	        List<Integer> list = new ArrayList<Integer>();
	        for(int i=0;i<k;i++){
	            int max = extractMax(numbers,numbers.length-i);
	            list.add(max);
	        }
	        for(int i=0;i<list.size();i++){
	            System.out.print(list.get(i) + " ");
	        }
	        System.out.println();
	        
	    }
	 }
}