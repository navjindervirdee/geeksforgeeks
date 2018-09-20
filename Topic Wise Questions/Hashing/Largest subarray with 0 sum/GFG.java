/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

class GfG
{
    int maxLen(int arr[], int n){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int max = 0;
        int sum = arr[0];
        map.put(sum,0);
        for(int i=1;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                max = Math.max(max,i+1);
            }
            if(arr[i]==0){
                max = Math.max(max,1);
            }
            if(map.containsKey(sum)){
                int index = map.get(sum);
                if(i-1!=index){
                    max = Math.max(max, i-index);
                }
                continue;
            }
            
            map.put(sum,i);
        }
        return max;
    }
}