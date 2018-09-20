'''Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.'''


# your task is to complete this function
# Your function should return an integer
def makeZero(arr, i, j,n,m):
    if(i<0 or j<0 or i>=n or j>=m or arr[i][j]==0):
        return 
    arr[i][j] = 0
    makeZero(arr,i,j+1,n,m)
    makeZero(arr,i+1,j,n,m)
    makeZero(arr,i-1,j,n,m)
    makeZero(arr,i,j-1,n,m)
    makeZero(arr,i+1,j+1,n,m)
    makeZero(arr,i-1,j-1,n,m)
    makeZero(arr,i+1,j-1,n,m)
    makeZero(arr,i-1,j+1,n,m)
    
def findIslands(arr, n, m):
    count = 0;
    for i in range(n):
        for j in range(m):
            if(arr[i][j]==0):
                continue
            count+=1;
            makeZero(arr,i,j,n,m)
    return count