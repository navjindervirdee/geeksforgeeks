/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*Complete the given function*/
//import java.math.*;
class GfG{
	public static String multiply(String num1, String num2) {
	    java.math.BigInteger n1 = new java.math.BigInteger(num1);
	    java.math.BigInteger n2 = new java.math.BigInteger(num2);
	    java.math.BigInteger n3 = n1.multiply(n2);
	    String result = n3.toString();
	    return result;
	  
    }
}