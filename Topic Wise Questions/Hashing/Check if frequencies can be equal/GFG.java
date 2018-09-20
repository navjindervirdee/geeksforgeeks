import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    input.nextLine();
	    
	    for(int c=0;c<t;c++){
	        char [] array = input.nextLine().trim().toCharArray();
	        
	        int [] count =  new int[26];
	        
	        for(int i=0;i<array.length;i++){
	            int num = array[i] - 'a';
	            count[num]++;
	        }
	        
	        int lowest = -1;
	        
	        Arrays.sort(count);
	        for(int i=0;i<count.length;i++){
	            if(count[i]!=0){
	                lowest = i;
	                break;
	            }
	        }
	        
	        int result = 1;
	        for(int i=lowest;i<25;i++){
	            if(count[i]!=count[i+1]){
	                result = 0;
	            }
	        }
	        if(result ==0){
                result = 1;
                count[lowest]--;
                for(int i=lowest;i<count.length-1;i++){
                    if(count[i]!=0 && count[i]!=count[i+1]){
                        result = 0;
                    }
                }
	        }
	        
	        if(result==0){
	            count[lowest]++;
	            count[25]--;
	            result = 1;
	            for(int i=lowest;i<25;i++){
	                if(count[i+1]!=0 && count[i]!=count[i+1]){
	                    result = 0;
	                }
	            }
	        }
	        System.out.println(result);
	    }
	    
	}
}