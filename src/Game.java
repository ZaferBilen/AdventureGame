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
							 + "4- Nehir     --> Karþýnýza ayý çýkabilir.\n"					
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
			case 2:
				location = new Magara(player);
				break;
			case 3:
				location = new Orman(player);
				break;
			case 4:
				location = new Nehir(player);
				break;
				
			case 5:
				location = new Magaza(player);
				break;
				default:
				location = new GuvenliEv(player);
			}
			if(location.getClass().getName().equals("GuvenliEv")) {
				if(player.getInventory().isOdun() && player.getInventory().isYemek()&& player.getInventory().isSu()) {
					System.out.println();
					System.out.println("TEBRÝKLER OYUNU KAZANDINIZ");
					break;
				}
			}
			if (!location.getLocation()) {
			System.out.println("Oyun Bitti");
			break;
			}
				
				
		}
	
	}


}
