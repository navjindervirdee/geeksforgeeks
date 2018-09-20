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
	        int k = Integer.parseInt(input.nextLine());
	        
	        int [] array = new int[n];
	        
	        for(int i=0;i<n;i++){
	            array[i] = Integer.parseInt(temp[i]);
	        }
	        
	        String [] seq = new String[n];
	        double [] cost = new double[n];
	        
	        for(int i=0;i<n;i++){
	            cost[i] = Integer.MAX_VALUE;
	            seq[i] = (i+1) + " " + (i+1);
	        }
	        
	        cost[n-1] = 0;// (k-array[n-1])*(k-array[n-1]);
	        
	        for(int i=n-2;i>-1;i--){
	            cost[i] = k - array[i];
	            cost[i]  = cost[i]*cost[i] + cost[i+1];
	            double min = cost[i];
	            String result = seq[i] + " " + seq[i+1];
	            
	            int sum = array[i];
	            int space = 1;
	            
	            String tem = (i+1) + " ";
	            
	            for(int j=i+1;j<n;j++){
	                sum += array[j] + space;
	                
	                if(sum<=k){
	                    tem = (i+1) + " " + (j+1) + " ";
	                    double nextCost = j+1<n ? cost[j+1] : 0;
	                    String nextSeq = j+1<n ? seq[j+1] : "";
	                    nextCost = nextCost + (k-sum)*(k-sum);
	                    
	                    if(nextCost<min){
	                        min = nextCost;
	                        result = tem + nextSeq;
	                        if(j==n-1){
	                            min = 0;
	                        }
	                    }
	                    
	                    continue;
	                }
	                break;
	            }
	            
	            seq[i] = result;
	            cost[i] = min;
	        }
	        System.out.println(seq[0]);
	    }
	}
}