import java.util.*;
public class Naloga06{
	public static void main(String[] args){
		Scanner vhod = new Scanner(System.in);
		System.out.println("Vnesi zeleno kolicino kredita");
		double kredit = vhod.nextDouble();
		kredit = (kredit + kredit * 0.065)/12; //Mesecni obrok
		System.out.println("Mesecni obrok je: " + kredit);
	}
}