/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

class GfG
{
    // The task is to complete this function
    int getId(int M[][], int n){
        int [] count = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(M[i][j]==1){
                    count[j]++;
                }
            }
        }
        
        int result = -1;
        for(int i=0;i<n;i++){
            if(result == -1 && count[i]==n-1){
                result = i;
                for(int j=0;j<n;j++){
                    if(M[i][j]==1){
                        result = -1;
                        break;
                    }
                }
                if(result!=-1){
                    break;
                }
            }
        }
        return result;
    }
}