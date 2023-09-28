
public class Magaza extends NormalLoc {

	Magaza(Player player) {
		super(player, "Maðaza");
		
	}
	
	public boolean getLocation(){
		System.out.println("Para : " + player.getPara());
		System.out.println("1- Silahlar\n"
						 + "2- Zýrhlar\n"
						 + "3- Çýkýþ" );
		System.out.println("Seçiminiz : ");
		int selTool = veri.nextInt();
		int selItemID;
		switch (selTool) {
		case 1:
			selItemID = silahMenu();
			buySilah(selItemID);
			
			break;
		case 2:
			selItemID = zirhMenu();
			buyZirh(selItemID);	
			break;
		case 3: 
			System.out.println("Bir üst menüye dönülüyor.");
			break;
			default:
				System.out.println("Hatalý bir tuþlama yaptýnýz.");
			break;
		}
		return true;
	}
	
	public int zirhMenu() {
		System.out.println("1- Hafif Zýrh \t Para : 15 \t Hasar : 1\n"
				 		 + "2- Orta Zýrh \t Para : 25 \t Hasar : 3\n"
				 		 + "3- Aðýr Zýrh\t Para : 40 \t Hasar : 5\n"
				 		 + "4- Çýkýþ");
		System.out.println("Kalkan Seçiminiz : ");
		int selZirhID = veri.nextInt();
		return selZirhID;

}
	
	public void buyZirh(int itemID) {
		int azaltma=0 , para=0;
		String zirhAdi = null;
		switch (itemID){
		case 1:
		azaltma = 1;
		zirhAdi = "Hafif Zýrh";
		para = 15;
		break;
		case 2:
			azaltma = 3;
			zirhAdi = "Orta Zýrh";
			para = 25;
			break;
		case 3:
			azaltma = 35;
			zirhAdi = "Aðýr Zýrh";
			para = 40;
			break;
		case 4:
			System.out.println("Bir üst menüye dönülüyor.");
			break;
			default : 
				System.out.println("Geçersiz Ýþlem ");
				break;
				
		}

		if (para > 0 ) {
			if(player.getPara() >=para) {
				player.getInventory().setZirh(azaltma);
				player.getInventory().setZirhAdi(zirhAdi);;
				player.setPara(player.getPara()-para);
				System.out.println(zirhAdi + " satýn aldýnýz.Engellenen Hasar : " + (player.getInventory().getZirh()));
				System.out.println("Kalan paranýz : " + player.getPara());
			}
			else {
				System.out.println("Bakiye yetersiz.");
			}

		}
	}
	
	public int silahMenu() {
		System.out.println("1- Tabanca \t Para : 25 \t Hasar : 2\n"
						 + "2- Kýlýç \t Para : 35 \t Hasar : 3\n"
						 + "3- Tüfek \t Para : 45 \t Hasar : 7\n"
						 + "4- Çýkýþ");
		System.out.println("Silah Seçiminiz : ");
		int selSilahID = veri.nextInt();
		return selSilahID;
		
	}
	
	public void buySilah(int itemID) {
		int damage=0 , para=0;
		String silahAdi = null;
		switch (itemID){
		case 1:
		damage = 2;
		silahAdi = "Tabanca";
		para = 25;
		break;
		case 2:
			damage = 3;
			silahAdi = "Kýlýç";
			para = 35;
			break;
		case 3:
			damage = 7;
			silahAdi = "Tüfek";
			para = 45;
			break;
		case 4:
			System.out.println("Bir üst menüye dönülüyor.");
			break;
			default : 
				System.out.println("Geçersiz Ýþlem ");
				break;
				
		}

		if (para > 0 ) {
			if(player.getPara()>para && (para > 0)) {
				player.getInventory().setHasar(damage);
				player.getInventory().setSilahAdi(silahAdi);
				player.setPara(player.getPara()-para);
				System.out.println(silahAdi + " satýn aldýnýz.Önceki Hasarýnýz : " + (player.getHasar()) +  " Yeni Hasarýnýz : "+ player.gettoplamHasar());
				System.out.println("Kalan paranýz : " + player.getPara());
			}
			else {
				System.out.println("Bakiye yetersiz.");
			}

		}
	}
	
	//public void
	


}



