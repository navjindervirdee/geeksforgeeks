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
            
            int mid = sum/2;
            
            int [][] table = new int[mid+1][array.length+1];
            
            for(int i=1;i<mid+1;i++){
                for(int j=1;j<n+1;j++){
                    table[i][j] = table[i][j-1];
                    if(i-array[j-1]<0){
                        continue;
                    }
                    table[i][j] = Math.max(table[i][j],array[j-1]+table[i-array[j-1]][j-1]);
                }
            }
            
            int diff = Math.abs(Math.abs((sum - table[mid][n])) - table[mid][n]);
            System.out.println(diff);
        }
	}
}