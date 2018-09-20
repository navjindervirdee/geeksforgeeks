/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

class GfG
{
	int bin_search(int A[], int left, int right,  int k){
		if(left>right){
		    return -1;
		}
		
		int mid = left + (right-left)/2;
		if(A[mid]==k){
		    return mid;
		}
		
		if(A[mid]>k){
		    return bin_search(A,left,mid-1,k);
		}
		else{
	        return bin_search(A,mid+1,right,k);
		}
	}
}