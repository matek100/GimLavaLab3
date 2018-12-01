import java.util.*;
public class Naloga03{
	public static void main(String[] args){
		Scanner vhod = new Scanner(System.in);
		System.out.println("Koliko stevil naj prebere?");
		int n = vhod.nextInt();
		double vsota_sod = 0;
		double vsota_lih = 0;
		int st_sod = 0;
		int st_lih = 0;
		
		while(n > 0){
			System.out.println("Vnesi stevilo");
			int stevilo = vhod.nextInt();
			if (stevilo % 2 == 0){
				vsota_sod += stevilo;
				++st_sod;
			}
			else{
				vsota_lih += stevilo;
				++st_lih;
			}
			--n;
		}
		
		double pov_sod = vsota_sod /st_sod;
		double pov_lih = vsota_lih/st_lih;
		
		if (vsota_sod == 0){
			pov_sod = 0;
		}
		
		if (vsota_lih == 0){
			pov_lih = 0;
		}
			
		
		System.out.println("Pov. vrednost sodih je: " + pov_sod + " pov. vrednost lihih je: " + pov_lih);
			
		
	}
}