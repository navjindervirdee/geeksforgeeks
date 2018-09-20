/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function*/
class GfG
{
    static class Number{
        int index;
        int sortedindex;
        int value;
        
        public Number(int index, int value){
            this.index = index;
            this.value = value;
        }
    }
    
	public static int minSwaps(int[] A, int N){
	    int min = 0;
	    boolean [] done = new boolean[N];
	    Number [] numbers = new Number[N];
	    for(int i=0;i<N;i++){
	        numbers[i] = new Number(i,A[i]);
	    }
	    
	    Arrays.sort(numbers, new Comparator<Number>(){
	        public int compare(Number n1,Number n2){
	            return n1.value-n2.value;
            }
        });
        
        for(int i=0;i<N;i++){
            numbers[i].sortedindex = i;
        }
        
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<N;i++){
            map.put(numbers[i].index,numbers[i].sortedindex);
        }
        
        for(int i=0;i<N;i++){
            if(map.get(i)==i || done[i]){
                done[i] = true;
                continue;
            }
            int count = 0;
            int k = i;
            while(!done[k]){
                done[k] = true;
                k = map.get(k);
                if(done[k]){
                    break;
                }
                count++;
            }
            min += count;
        }
        return min;
	}
}