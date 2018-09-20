/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*You are required to complete below method */
class GfG
{
    void countDistinct(int A[], int k, int n){
	    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	    
	    for(int i=0;i<k;i++){
	        if(map.containsKey(A[i])){
	            map.put(A[i],map.get(A[i])+1);
	            continue;
	        }
	        map.put(A[i],1);
	    }
	    //System.out.println(map);
	    
	    for(int i=k;i<n;i++){
	        System.out.print(map.size() + " ");
	        if(map.containsKey(A[i])){
	            map.put(A[i],map.get(A[i])+1);
	        }
	        else{
	            map.put(A[i],1);
	        }
	        
	        int count = map.get(A[i-k]);
	        count--;
	        map.put(A[i-k],count);
	        if(count==0){
	            map.remove(A[i-k]);
	        }
	    }
	    System.out.print(map.size());
	}
}