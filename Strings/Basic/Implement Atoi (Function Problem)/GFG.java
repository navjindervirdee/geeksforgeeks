/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*You are required to complete this method */
public class GFG{
    int atoi(String str)
    {
        
        char [] array = str.toCharArray();
        int num = 1;
        int start = 0;
        if(array[0]=='-'){
            start = 1;
        }
        for(int i=start;i<array.length;i++){
            int val = (int)array[i];
            if(val<48 || val > 57){
                return -1;
            }
            if(num==1){
                num = val-48;
                num *= 10;
            }
            else{
                num += val-48;
                num *= 10;
            }
        }
        if(start==1){
            num *= -1;
        }
        return num/10;
        
    }
}