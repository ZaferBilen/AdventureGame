import java.util.Scanner;

public class Game {
	Player player;
	Location location;
	Scanner veri = new Scanner(System.in);
	
	
	public void login() {
		Scanner veri = new Scanner(System.in);
		System.out.println("Macera Oyununa Hoþgeldiniz");
		System.out.println("Oyuna baþlamadan önce isminizi giriniz.");
		String oyuncuAdi = veri.nextLine();
		player = new Player (oyuncuAdi);  // burada oyunu oynayan kiþinin nicki oluþturuldu.
		player.karakterSec();     // Karakter seçme iþlemleri Player sýnýfýndaki karakterSec() içinde yapýlýr.
		start();
		
	}
	public void start() {
		
		while (true) {
			System.out.println();
			System.out.println("**************");
			System.out.println();
			System.out.println("Eylem gerçekleþtirmek için bir yer seçiniz : ");
			System.out.println("1- Güvenli Ev --> Size ait güvenli bir mekan, düþman yok.\n"
							 + "2- Maðara     --> Karþýnýza zombi çýkabilir.\n"
							 + "3- Orman      --> Karþýnýza vampir çýkabilir\n"	
							 + "4- Maðara     --> Karþýnýza ayý çýkabilir.\n"					
							 + "5- Maðaza     --> Silah veya zýrh alabilirsiniz.");
			int locSec = veri.nextInt();
			while (locSec <= 0 || locSec >5) {
				System.out.println("Lütfen geçerli bir yer seçiniz.");
				locSec = veri.nextInt();
			}
			switch (locSec) {
			case 1: 
				location = new GuvenliEv(player);
				break;
				default:
				location = new GuvenliEv(player);
			}
			if (!location.getLocation()) {
			System.out.println("Oyun Bitti");
			break;
			}
			case 2:
				location = new Magaza(player);
				
				
		}
	
	}


}
