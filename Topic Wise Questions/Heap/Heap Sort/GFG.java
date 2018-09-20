/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

class GfG
{
    void siftDown(int [] array, int index, int size){
        int max = index;
        if(index*2+1<size && array[index]<array[index*2+1]){
            max = index*2+1;
        }
        if(index*2+2<size && array[max]<array[index*2+2]){
            max = index*2+2;
        }
        
        if(max!=index){
            int temp = array[max];
            array[max] = array[index];
            array[index] = temp;
            siftDown(array,max,size);
        }
    }
    
    void buildHeap(int arr[], int n)
    {
        int mid = n/2 - 1;
        for(int i=mid;i>-1;i--){
            siftDown(arr,i,n);
        }
    }
 
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i)
    {   
        siftDown(arr,i,n);
    }
 }