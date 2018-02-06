import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        for(int c=0;c<t;c++){
            char [] array =  input.nextLine().trim().toCharArray();
            Set<Character> set = new HashSet<Character>();
            StringBuilder p = new StringBuilder();
            for(int i=0;i<array.length;i++){
                char ch = array[i];
                if(!set.contains(ch)){
                    p.append(ch);
                    set.add(ch);
                }
            }
            System.out.println(p.toString());
        }
	}
}