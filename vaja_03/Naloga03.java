import java.util.*;
public class Naloga03{
	public static void main(String[] args){
		Scanner vhod = new Scanner(System.in);
		System.out.println("Vnesi prvo stevilo");
		int st_1 = vhod.nextInt();
		System.out.println("Vnesi drugo stevilo");
		int st_2 = vhod.nextInt();
		if ((st_2 != 0) && (st_1 % st_2 == 0)){
			System.out.println("Stevilo je deljivo");
		}
		else{
			System.out.println("stevilo ni deljivo");
		}
	}
}