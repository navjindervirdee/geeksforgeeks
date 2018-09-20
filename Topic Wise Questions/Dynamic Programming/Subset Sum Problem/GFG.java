import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    for(int c=0;c<t;c++){
	        int n = Integer.parseInt(br.readLine());
	        String [] temp = br.readLine().trim().split(" ");
	        
	        int [] array = new int[n];
	        int sum = 0;
	        for(int i=0;i<n;i++){
	            array[i] = Integer.parseInt(temp[i]);
	            sum += array[i];
	        }
	        
	        if(sum%2==1){
	            System.out.println("NO");
	            continue;
	        }
	        
	        sum = sum/2;
	        
	        Arrays.sort(array);
	        
	        boolean table [][] = new boolean[sum+1][n+1];
	        
	        for(int i = 0;i<n+1;i++){
	            table[0][i] = true;
	        }
	        
	        for(int i=1;i<sum+1;i++){
	            for(int j=1;j<n+1;j++){
	                table[i][j] = table[i][j-1];
	                if(array[j-1]>i || table[i][j]){
	                    continue;
	                }
	                table[i][j] = table[i-array[j-1]][j-1];
	            }
	        }
	        
	        if(table[sum][n]){
	            System.out.println("YES");
	        }
	        else{
	            System.out.println("NO");
	        }
	    }
	}
}