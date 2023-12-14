import java.util.Scanner;

public class ManavSepetTutari {

	public static void main(String[] args) {
		/*Salatalık : 3,14 TL
		Elma : 4,11 TL
		Kabak : 2,22 TL
		Domates: 0,95 TL
		Patlıcan : 7,00 TL*/
		
		Scanner input= new Scanner(System.in);
		System.out.println("Kaç kilo salatılık:");
		double salatılık=input.nextDouble();
		System.out.println("Kaç kilo elma:");
		double elma=input.nextDouble();
		System.out.println("Kaç kilo kabak:");
		double kabak=input.nextDouble();
		System.out.println("Kaç kilo domates:");
		double domates= input.nextDouble();
		System.out.println("Kaç kilo patlıcan:");
		double patlıcan=input.nextDouble();
		
		double sonuc= salatılık*3.14 + elma*4.11+ kabak*2.22 + domates*0.95+ patlıcan*7;
		System.out.println("Sepet tutarınız: "+ sonuc);
		
		//Kullanıcı giriş yaparken ondalıklı sayıları noktayla değil virgülle gösterilmeli
		

	}

}
