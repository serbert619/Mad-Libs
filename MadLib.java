import java.util.Scanner;
public class MadLib {
	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	
	//seperating inputs for easier reading
	
	System.out.println("famous person");
	String a = input.nextLine();
	
	System.out.println("food");
	String b = input.nextLine();
	
	System.out.println("noun");
	String c = input.nextLine();
	
	System.out.println("adjective");
	String d = input.nextLine();
	
	System.out.println("noun");
	String e = input.nextLine();
	
	System.out.println("adjective");
	String f = input.nextLine();
	
	System.out.println("noun");
	String g = input.nextLine();
	
	System.out.println("time frame");
	String h = input.nextLine();
	
	System.out.println("noun");
	String i = input.nextLine();
	
	System.out.println("Kitchen appliance");
	String j = input.nextLine();
	
	//mad lib
	
	System.out.println(a + "s' recipe for " + b + ".");
	System.out.println("First you place " + c + " into a bowl and make a " 
	+ d +" " + e + "!");
	System.out.println("Then you cover it in a " + f + " " + g + " for " 
	+ h + "." );
	System.out.println("Finnally! You serve with " + i + " and put any"
	+ "left overs in the " + j + ".");
	System.out.println(a + "s' recipe for " + b + ".");
	

}
}