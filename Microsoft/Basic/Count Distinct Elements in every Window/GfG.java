/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*You are required to complete below method */
class GfG
{
    void countDistinct(int A[], int k, int n)
    {
        for(int i=0;i<=A.length-k;i++){
            int count = 0 ;
            Set<Integer> set = new HashSet<Integer>();
            for(int j=i;j<i+k;j++){
                if(!set.contains(A[j])){
                    set.add(A[j]);
                }
            }
            System.out.print(set.size() + " ");
        }    
	// Your code here	
    }
}