import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    private static void printNum(Map<Integer,String> map, String str,Map<Integer,String> tenplace){
        for(int i=0;i<str.length();i++){
            int digit = Integer.parseInt(Character.toString(str.charAt(i)));
            int place = str.length()-i;
            if(place==4 && digit!=0){
                System.out.print(map.get(digit) + " thousand ");
                continue;
            }
            if(place==3 && digit!=0){
                System.out.print(map.get(digit) + " hundred ");
                int ten = Integer.parseInt(Character.toString(str.charAt(i+1)));
                int one = Integer.parseInt(Character.toString(str.charAt(i+2)));
                if(ten!=0 || one != 0){
                    System.out.print("and ");
                }
                continue;
            }
            
            if(place==2 && digit!=0){
                if(digit==1){
                    String one = Character.toString(str.charAt(i+1));
                    String n = Integer.toString(digit) + one;
                    int num = Integer.parseInt(n);
                    System.out.print(tenplace.get(num));
                    System.out.println();
                    return;
                }
                else{
                    System.out.print(tenplace.get(digit) + " ");
                }
                continue;
            }
            if(place==1 && digit!=0){
                System.out.print(map.get(digit));
                continue;
            }
        }
        System.out.println();
    }
	public static void main (String[] args) {
	    Map<Integer,String> map = new HashMap<Integer,String>();
	    map.put(0,"zero");
	    map.put(1,"one");
	    map.put(2,"two");
	    map.put(3,"three");
	    map.put(4,"four");
	    map.put(5,"five");
	    map.put(6,"six");
	    map.put(7,"seven");
	    map.put(8,"eight");
	    map.put(9,"nine");
	    
	    Map<Integer,String> tenplace = new HashMap<Integer,String>();
	    tenplace.put(2,"twenty");
	    tenplace.put(3,"thirty");
	    tenplace.put(4,"forty");
	    tenplace.put(5,"fifty");
	    tenplace.put(6,"sixty");
	    tenplace.put(7,"seventy");
	    tenplace.put(8,"eighty");
	    tenplace.put(9,"ninety");
	    tenplace.put(10,"ten");
	    tenplace.put(11,"eleven");
	    tenplace.put(12,"twelve");
	    tenplace.put(13,"thirteen");
	    tenplace.put(14,"fourteen");
	    tenplace.put(15,"fifteen");
	    tenplace.put(16,"sixteen");
	    tenplace.put(17,"seventeen");
	    tenplace.put(18,"eighteen");
	    tenplace.put(19,"nineteen");
	    
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    for(int c=0;c<t;c++){
	        int num = input.nextInt();
	        String str = Integer.toString(num);
	        printNum(map,str,tenplace);
	    }
	    
    }
}