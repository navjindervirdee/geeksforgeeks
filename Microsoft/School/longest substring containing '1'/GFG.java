/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below*/
class GfG{
    public int count(String s){
        char [] array = s.toCharArray();
        int max = 0;
        int count = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]=='0'){
                max = Math.max(max,count);
                count = 0;
                continue;
            }
            count++;
        }
        return Math.max(max,count);
    }
}