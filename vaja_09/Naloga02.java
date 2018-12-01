public class Naloga02{
	public static void main(String[] args){
		int[] kocka = new int[6];
		int stevilka;
		for(int i = 0; i < 200; i++){
			stevilka = (int)(Math.random()*6)+1;
			kocka[stevilka-1]++;
		}

		int najmanjse = kocka[0];
		int najvecje = kocka[0];
		int stevec_max = 0, stevec_min = 0; 

		for(int i = 1; i < 6; i++){
			if(kocka[i] > najvecje){
				najvecje = kocka[i];
				stevec_max = i;
			}
			if(kocka[i] < najmanjse) {
				najmanjse = kocka[i];
				stevec_min = i; 
			}
		} 


		for(int i = 0; i < 6; i++){
			System.out.print((i+1) + " je padla " + kocka[i] + ", ");
		}

		System.out.println("Najveckrat je padla " + (stevec_max + 1) + " in to " + najvecje + " najmankrat pa " + (stevec_min + 1) + " in to kar " + najmanjse);

	}
}