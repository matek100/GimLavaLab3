import java.util.*;
public class Naloga05{
	public static void main(String[] args){
		Scanner vhod = new Scanner(System.in);
		System.out.println("Vnesi a");
		double a = vhod.nextDouble();
		System.out.println("Vnesi b");
		double b = vhod.nextDouble();
		
		if (a > -10){
			b = b +1 ;
		}
		
		System.out.println(b);
		
	}
}