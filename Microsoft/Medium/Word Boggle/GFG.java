import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    for(int c=0;c<t;c++){
	        int w = input.nextInt();
	        input.nextLine();
	        String [] words = input.nextLine().split(" ");
	        Arrays.sort(words);
	        int n = input.nextInt();
	        int m = input.nextInt();
	        input.nextLine();
	        String [] chars = input.nextLine().trim().split(" ");
	        List<String> list = new ArrayList<String>();
	        for(int i=0;i<words.length;i++){
	            String word = words[i];
	            boolean [] used = new boolean[chars.length];
	            Arrays.fill(used,false);
	            boolean canbemade = true;
	            for(int j=0;j<word.length();j++){
	                String s = Character.toString(word.charAt(j));
	                boolean found = false;
	                for(int k=0;k<chars.length;k++){
	                    
	                    if(chars[k].equals(s) && !used[k]){
	                        found = true;
	                        used[k] = true;
	                        break;
	                    }
	                }
	                if(!found){
	                    canbemade = false;
	                    break;
	                }
	            }
	            if(canbemade){
	                if(!list.contains(word)){
	                    list.add(word);
	                }
	            }
	        }
	        if(list.size()==0){
	            System.out.print(-1);
            }
            else{
                for(int i=0;i<list.size();i++){
                    System.out.print(list.get(i) + " ");
                }
            }
            System.out.println();
	    }
	}
}