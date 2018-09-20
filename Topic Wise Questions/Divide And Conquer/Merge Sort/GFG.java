/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* The task is to complete merge() which is used
in below mergeSort() */
class GfG
{
   // Merges two subarrays of arr[].  First subarray is arr[l..m]
   // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r){
        int [] array =  new int[r-l+1];
        int i = l;
        int j = m+1;
        int k = 0;
        while(i<m+1 && j<r+1){
            if(arr[i]<=arr[j]){
                array[k] = arr[i];
                i++;
                k++;
            }
            else{
                array[k] = arr[j];
                j++;
                k++;
            }
        }
        
        while(i<m+1){
            array[k] = arr[i];
            i++;
            k++;
        }
        while(j<r+1){
            array[k] = arr[j];
            k++;
            j++;
        }
        
        for(i=0;i<array.length;i++){
            arr[l] = array[i];
            l++;
        }
    }
}