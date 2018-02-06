import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     
    private static String removeAdj(char [] array){
        StringBuilder p  = new StringBuilder();
        int i = 0;
        String prev = new String(array);
        while(i<array.length){
            if(i+1==array.length){
                p.append(array[i]);
                i++;
                continue;
            }
            if(array[i]!=array[i+1]){
                p.append(array[i]);
                i++;
                continue;
            }
            else{
                int j = i;
                while(j <array.length && array[i]==array[j]){
                    j++;
                }
                i = j;
            }
            
        }
        String temp = p.toString();
        if(temp.length()==prev.length()){
            return temp;
        }
        else{
            return removeAdj(temp.toCharArray());
        }
    }
    
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    input.nextLine();
	    for(int c=0;c<t;c++){
	        char [] array =  input.nextLine().trim().toCharArray();
	        String temp = removeAdj(array);
	        System.out.println(temp);
	    }
	}
}