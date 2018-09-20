/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/


//Function should return the number of islands.
class GFG
{
    public static void relaxEdges(int i, int j, int [][] a, boolean [][] mat, int n, int m){
        mat[i][j] = true;
        if(i-1>-1 && j-1>-1){
            if(a[i-1][j-1] == 1 && !mat[i-1][j-1]){
                relaxEdges(i-1, j-1, a, mat, n, m);
            }
        }
        if(i-1>-1){
            if(a[i-1][j] == 1 && !mat[i-1][j]){
                relaxEdges(i-1, j, a, mat, n, m);
            }
        }
        if(i-1>-1 && j+1<m){
            if(a[i-1][j+1] == 1 && !mat[i-1][j+1]){
                relaxEdges(i-1, j+1, a, mat, n, m);
            }
        }
        if(j-1>-1){
            if(a[i][j-1] == 1 && !mat[i][j-1]){
                relaxEdges(i, j-1, a, mat, n, m);
            }
        }
        if(j+1<m){
            if(a[i][j+1] == 1 && !mat[i][j+1]){
                relaxEdges(i, j+1, a, mat, n, m);
            }
        }
        if(i+1<n && j-1>-1){
            if(a[i+1][j-1] == 1 && !mat[i+1][j-1]){
                relaxEdges(i+1, j-1, a, mat, n, m);
            }
        }
        if(i+1<n){
            if(a[i+1][j] == 1 && !mat[i+1][j]){
                relaxEdges(i+1, j, a, mat, n, m);
            }
        }
        if(i+1<n && j+1<m){
            if(a[i+1][j+1] == 1 && !mat[i+1][j+1]){
                relaxEdges(i+1, j+1, a, mat, n, m);
            }
        }
    }
    
    public static int findisland(int[][]a,int n,int m){   
        boolean [][] matrix = new boolean[n][m];
        int num = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]==0){
                    continue;
                }
                if(matrix[i][j]==true){
                    continue;
                }
                num++;
                relaxEdges(i,j,a,matrix,n,m);
            }
        }
        return num;
        
    }
}