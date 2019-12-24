package sample2;
class string {
public static void main(String args[])
{
	
	String x = "Hello "+ "world";//space after o ////concatenation//
	System.out.println(x);
	System.out.println("...............");
	String xcase= x.toLowerCase();//lower and uppercase //
	System.out.println(xcase);
	System.out.println("...............");
	int xlength = x.length();//length of the string//
	System.out.println(xlength);	
	System.out.println(x.replace('e', 'a'));//replace chars//
	System.out.println(x.indexOf('w'));//finding Index//
}
}
