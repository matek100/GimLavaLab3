public class Naloga03{
	public static void main(String[] args){
		char [] znaki = new char [15];

		for(int i = 0; i < 15; i++){
			znaki[i] = (char)((int)(Math.random()*95)+32);
			System.out.println(znaki[i]);
		}

		for(int i = 0; i < 15; i++){
			if(znaki[i] >= 65 && znaki[i] <= 90){
				znaki[i] = Character.toLowerCase(znaki[i]);
			}
			else if(znaki[i] >= 97 && znaki[i] <= 122){
				znaki[i] = Character.toUpperCase(znaki[i]);
			}
		}

		System.out.println();

		for(int i = 0; i < 15; i++){
			System.out.println(znaki[i]);
		}
	}
}