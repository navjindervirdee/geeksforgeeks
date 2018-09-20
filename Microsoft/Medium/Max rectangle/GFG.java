/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function given below*/
class GfG{
    public int histArea(int [] array){
        int [] maxLeft = new int[array.length];
        int [] maxRight = new int[array.length];
        
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        
        int i = 1;
        while(i<array.length){
            int top = stack.peek();
            if(array[i]>=array[top]){
                stack.push(i);
                i++;
                continue;
            }
            
            while(!stack.isEmpty() && array[stack.peek()]>array[i]){
                top = stack.pop();
                maxRight[top] = i-1;
            }
            stack.push(i);
            i++;
        }
        
        while(!stack.isEmpty()){
            int top = stack.pop();
            maxRight[top] = array.length-1;
        }
        
        
        stack = new Stack<Integer>();
        stack.push(array.length-1);
        
        i = array.length-2;
        while(i>-1){
            int top = stack.peek();
            if(array[i]>=array[top]){
                stack.push(i);
                i--;
                continue;
            }
            
            while(!stack.isEmpty() && array[stack.peek()]>array[i]){
                top = stack.pop();
                maxLeft[top] = i+1;
            }
            stack.push(i);
            i--;
        }
        
        while(!stack.isEmpty()){
            int top = stack.pop();
            maxLeft[top] = 0;
        }
        
        int max = 0;
        for(i=0;i<array.length;i++){
            int width = (i-maxLeft[i]) + (maxRight[i]-i) + 1;
            int area = width*array[i];
            max = Math.max(max,area);
        }
        return max;
    }
    
    public int maxArea(int a[][],int m,int n){
        int [] hist = new int[n];
        int max = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==0){
                    hist[j] = 0;
                }
                else{
                    hist[j]++;
                }
            }
            max = Math.max(max,histArea(hist));
        }
        return max;
    }
}