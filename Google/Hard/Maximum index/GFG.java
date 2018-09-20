import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static class Number{
        int index;
        int value;
        int maxrightIndex;
        
        public Number(int index, int value){
            this.index = index;
            this.value = value;
            this.maxrightIndex = index;
        }
    }
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    for(int c=0;c<t;c++){
	        int n = input.nextInt();
	        Number [] nums = new Number[n];
	        for(int i=0;i<n;i++){
	            int value = input.nextInt();
	            nums[i] = new Number(i,value);
	        }
	        
	        Arrays.sort(nums, new Comparator<Number>(){
	            public int compare(Number num1, Number num2){
	                return num1.value-num2.value;
                }
            });
            
            int maxdiff = 0;
            for(int i=n-2;i>-1;i--){
                nums[i].maxrightIndex = Math.max(nums[i].maxrightIndex,nums[i+1].maxrightIndex);
                int diff = nums[i].maxrightIndex - nums[i].index;
                maxdiff = Math.max(maxdiff,diff);
            }
            System.out.println(maxdiff);
	    }
	}
}