import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    for(int c=0;c<t;c++){
	        String [] params = br.readLine().trim().split(" ");
	        int n = Integer.parseInt(params[0]);
	        int m = Integer.parseInt(params[1]);
	        
	        String [] temp1 = br.readLine().trim().split(" ");
	        String [] temp2 = br.readLine().trim().split(" ");
	        
	        int [] array1 = new int[n];
	        int [] array2 = new int[m];
	        
	        for(int i=0;i<n;i++){
	            array1[i] = Integer.parseInt(temp1[i]);
	        }
	        
	        for(int i=0;i<m;i++){
	            array2[i] = Integer.parseInt(temp2[i]);
	        }
	        
	        int i = 0;
	        int j = 0;
	        
	        int total = 0;
	        int max1 = 0;
	        int max2 = 0;
	        
	        int last1 = 0;
	        int last2 = 0;
	        
	        while(i<n && j<m){
	            if(array1[i]<array2[j]){
	                max1+= array1[i];
	                i++;
	                continue;
	            }
	            if(array2[j]<array1[i]){
	                max2 += array2[j];
	                j++;
	            }
	            else{
	                i++;
	                max1 += array1[i-1];
	                while(i<n && array1[i]==array1[i-1]){
	                    max1+=array1[i];
	                    i++;
	                }
	                i--;
	                max1 -= array1[i];
	                
	                j++;
	                max2 += array2[j-1];
	                while(j<m && array2[j]==array2[j-1]){
                        max2+=array2[j];
	                    j++;
	                }
	                j--;
	                max2 -= array2[j];
	                
	                
	                total += array1[i] + Math.max(max1,max2);
	                i++;
	                j++;
	                max1 = 0;
	                max2 = 0;
	                last1 = i-1;
	                last2 = j-1;
	            } 
	        }
	        
	        if(i>=n){
	            max2 = 0;
	            if(total!=0){
	                last2++;
	            }
	            while(last2<m){
	                max2 += array2[last2];
	                last2++;
	            }
	        }
	        else{
	            max1 = 0;
	            if(total!=0){
	                last1++;
	            }
	            while(last1<n){
	                max1 += array1[last1];
	                last1++;
	            }
	        }
	        
	        total += Math.max(max1,max2);
	        System.out.println(total);
	    }
	}
}