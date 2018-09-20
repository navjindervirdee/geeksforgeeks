/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

class GfG
{
    /* This function takes last element as pivot, places  the pivot element 
    at its correct position in sorted  array, and places all smaller (smaller
    than pivot) to left of pivot and all greater elements to right  of pivot */
    int partition(int arr[], int low, int high)
    {
        int pivotIndex = low + (int)(Math.random()*(high-low+1));
        int pivot = arr[pivotIndex];
        arr[pivotIndex] = arr[low];
        arr[low] = pivot;
        pivotIndex = low;
        
        for(int i=low+1;i<=high;i++){
            if(arr[i]<=pivot){
                pivotIndex++;
                int temp = arr[pivotIndex];
                arr[pivotIndex] = arr[i];
                arr[i] = temp;
            }
        }
        
        arr[low] = arr[pivotIndex];
        arr[pivotIndex] = pivot;
        return pivotIndex;
    }
}