import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int[n];
        int [] dep = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
            dep[i] = input.nextInt();
        }
        
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i = 0;
        int j = 0;
        int max = 0;
        int num = 0;
        while(i<arr.length && j<dep.length){
            if(arr[i]<dep[j]){
                num++;
                i++;
                max = Math.max(max,num);
            }
            else{
                num--;
                j++;
            }
        }
        System.out.println(max);
    }
}