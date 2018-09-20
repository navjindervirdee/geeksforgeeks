import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static class Item{
        int value;
        int weight;
        
        public Item(int value, int weight){
            this.value = value;
            this.weight = weight;
        }
    }
    
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    for(int c=0;c<t;c++){
	        int n = Integer.parseInt(br.readLine());
	        int W = Integer.parseInt(br.readLine());
	        
	        String [] temp1 = br.readLine().trim().split(" ");
	        String [] temp2 = br.readLine().trim().split(" ");
	        
	        Item [] items = new Item[n];
	        
	        for(int i=0;i<n;i++){
	            int value = Integer.parseInt(temp1[i]);
	            int weight = Integer.parseInt(temp2[i]);
	            Item item = new Item(value, weight);
	            items[i] = item;
	        }
	        
	        Arrays.sort(items, new Comparator<Item>(){
	            public int compare(Item i1, Item i2){
	                if(i1.weight==i2.weight){
	                    return i2.value-i2.value;
                    }
                    else{
                        return i1.weight-i2.weight;
                    }
                }
            });
            
            
	        int table [][] = new int[W+1][n+1];
	        
	        for(int i=1;i<n+1;i++){
	            Item item = items[i-1];
	            for(int j=1;j<W+1;j++){
	                table[j][i] = table[j][i-1];
	                if(item.weight>j){
	                    continue;
	                }
	                table[j][i] = Math.max(Math.max(table[j-item.weight][i-1]+item.value,table[j][i-1]),table[j][i]);
	            }
	        }
	        System.out.println(table[W][n]);
	    }
	}
}