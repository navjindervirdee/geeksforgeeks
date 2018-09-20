import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    private static boolean checkAnagram(int [] copy, int [] anagram){
        for(int i=0;i<copy.length;i++){
            if(copy[i]!=anagram[i]){
                return false;
            }
        }
        return true;
    }
    
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = Integer.parseInt(input.nextLine());
	    
	    for(int c=0;c<t;c++){
	        char [] text = input.nextLine().trim().toCharArray();
	        char [] pattern = input.nextLine().trim().toCharArray();
	        
	        int [] anagram = new int[26];
	        int [] copy = new int[26];
	        for(int i =0;i<pattern.length;i++){
	            int val = pattern[i] - 'a';
	            anagram[val]++;
	        }
	        
	        int count = 0;
	        
	        for(int i=0;i<pattern.length;i++){
	            int val = text[i] - 'a';
	            copy[val]++;
	        }
	        
	        boolean same = checkAnagram(copy,anagram);
	        if(same){
	            count++;
	        }
	        
	        same = false;
	        
	        for(int i=pattern.length;i<text.length;i++){
	            int val = text[i-pattern.length] - 'a';
	            copy[val]--;
	            val = text[i] - 'a';
	            copy[val]++;
	            same = checkAnagram(copy,anagram);
	            if(same){
	                count++;
	                same = false;
	            }
	        }
	        System.out.println(count);
	    }
	}
}