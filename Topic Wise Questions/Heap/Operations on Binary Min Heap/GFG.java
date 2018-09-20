/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//The structure of the class is
/*class MinHeap
{
    int *harr;
    int capacity;
    int heap_size;
public:
MinHeap(int cap=100) {heap_size = 0; capacity = cap; harr = new int[cap];}
    int extractMin();
    void deleteKey(int i);
    void insertKey(int k);
};*/
/* Removes min element from min heap and returns it */
MinHeap :: MinHeap(int size){
    capacity = size;
    harr = new int[capacity];
    heap_size = 0;
}
int MinHeap ::  extractMin()
{
    if(heap_size==0){
        return -1;
    }
    int result = harr[0];
    harr[0] = harr[heap_size-1];
    heap_size--;
    int index = 0;
    int prev = -1;
    while(index!=prev){
        int min = index;
        prev = index;
        if(index*2+1<heap_size && harr[index*2+1]<harr[index]){
            min = index*2+1;
        }
        if(index*2+2<heap_size && harr[index*2+2]<harr[min]){
            min = index*2+2;
        }
    
        if(min!=index){
            int temp = harr[index];
            harr[index] = harr[min];
            harr[min] = temp;
            index = min;
        }
    }
    return result;
}
/* Removes element from position x in the min heap  */
void MinHeap :: deleteKey(int i)
{
    if(i<heap_size){
        
        
        harr[i] = harr[heap_size-1];
        heap_size--;
        int index = i;
        int prev = -1;
        while(index!=prev){
            int min = index;
            prev = index;
            if(index*2+1<heap_size && harr[index*2+1]<harr[index]){
                min = index*2+1;
            }
            if(index*2+2<heap_size && harr[index*2+2]<harr[min]){
                min = index*2+2;
            }
        
            if(min!=index){
                int temp = harr[index];
                harr[index] = harr[min];
                harr[min] = temp;
                index = min;
            }
        }
    }
}
/* Inserts an element at position x into the min heap*/
void MinHeap ::insertKey(int k)
{
   if(heap_size<capacity){
        harr[heap_size] = k;
        heap_size++;
        int index = heap_size-1;
        while((index-1)/2>-1 && harr[(index-1)/2]>harr[index]){
            int temp = harr[(index-1)/2];
            harr[(index-1)/2] = harr[index];
            harr[index] = temp;
            index = (index-1)/2;
        }
   }
}