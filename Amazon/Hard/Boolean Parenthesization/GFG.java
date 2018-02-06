import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static class Element{
        int numT;
        int numF;
        
        public Element(int numT, int numF){
            this.numT = numT;
            this.numF = numF;
        }
    }
    
    private static void orFunc(Element [][] table, int index, int start, int end){
        Element left = table[start][index-1];
        Element right = table[index+1][end];
        
        int numT = (left.numT*(right.numT + right.numF) + right.numT*left.numF)%1003;
        int numF = (left.numF*right.numF)%1003;
        
        Element e = new Element(numT,numF);
        if(table[start][end]!=null){
            Element prev = table[start][end];
            e.numT = (e.numT + prev.numT)%1003;
            e.numF = (e.numF + prev.numF)%1003;
        }
        table[start][end] = e;
    }
    
    private static void andFunc(Element [][] table, int index, int start, int end){
        Element left = table[start][index-1];
        Element right = table[index+1][end];
        
        int numT = (left.numT*right.numT)%1003;
        int numF = (left.numF*(right.numT + right.numF) + right.numF*left.numT)%1003;
        
        Element e = new Element(numT,numF);
        if(table[start][end]!=null){
            Element prev = table[start][end];
            e.numT = (e.numT + prev.numT)%1003;
            e.numF = (e.numF + prev.numF)%1003;
        }
        table[start][end] = e;
    }
    
    private static void xorFunc(Element [][] table, int index, int start, int end){
        Element left = table[start][index-1];
        Element right = table[index+1][end];
        
        int numT = (left.numT*right.numF + right.numT*left.numF)%1003;
        int numF = (left.numT*right.numT + left.numF*right.numF)%1003;
        
        Element e = new Element(numT,numF);
        if(table[start][end]!=null){
            Element prev = table[start][end];
            e.numT = (e.numT + prev.numT)%1003;
            e.numF = (e.numF + prev.numF)%1003;
        }
        table[start][end] = e;
    }
    
    
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    for(int c=0;c<t;c++){
	        int n = input.nextInt();
	        input.nextLine();
	        char [] array = input.nextLine().trim().toCharArray();
	        Element [][] table = new Element[array.length][array.length];
	        for(int i=0;i<array.length;i+=2){
	            int numT = 0;
	            int numF = 0 ;
	            if(array[i]=='T'){
	                numT++;
	            }
	            else{
	                numF++;
	            }
	            Element e = new Element(numT,numF);
	            table[i][i] = e;
	        }
	        int size = array.length/2+1;
	        for(int p=3;p<=array.length;p+=2){
	            for(int i=0;i<array.length-p+1;i+=2){
	                int j = i+p;
	                for(int l=i+1;l<j;l+=2){
	                    if(array[l]=='|'){
	                        orFunc(table,l,i,j-1);
	                    }
	                    if(array[l]=='&'){
	                        andFunc(table,l,i,j-1);
	                    }
	                    if(array[l]=='^'){
	                        xorFunc(table,l,i,j-1);
	                    }
	                }
	            }
	        }
	        System.out.println((table[0][array.length-1].numT)%1003);
	    }
	}
}