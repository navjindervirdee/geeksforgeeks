import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static class Stock{
        int buy;
        int sell;
        
        public Stock(int buy, int sell){
            this.buy = buy;
            this.sell = sell;
        }
    }
    
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    for(int c=0;c<t;c++){
	        int n = Integer.parseInt(br.readLine());
	        String [] temp = br.readLine().trim().split(" ");
	        
	        int [] array = new int[n];
	        
	        for(int i=0;i<n;i++){
	            array[i] = Integer.parseInt(temp[i]);
	        }
	        
	        int i = 0;
	        List<Stock> list = new ArrayList<Stock>();
	        while(i<n-1){
	            while(i<n-1 && array[i]>=array[i+1]){
	                i++;
	            }
	            
	            int j = i+1;
	            while(j<n && array[j]>array[j-1]){
	                j++;
	            }
	            
	            if(i<j-1 && j-1<n){
	                Stock stock = new Stock(i,j-1);
	                list.add(stock);
	            }
	            i = j;
	        }
	        
	        if(list.size()==0){
	            System.out.println("No Profit");
	            continue;
	        }
	        
	        for(Stock s : list){
	            System.out.print("(" + s.buy + " " + s.sell + ") ");
	        }
	        System.out.println();
	        
	    }
	}
}