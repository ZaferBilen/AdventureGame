import java.util.Scanner;

public class Player {
	private int hasar , saglik, para,gercekSaglik;
	private String karakterAdi,oyuncuAdi;
	private Inventory ýnventory;
	Scanner veri = new Scanner(System.in);
	
	public Player(String oyuncuAdi) {
		this.oyuncuAdi = oyuncuAdi;
		this.ýnventory = new Inventory();
	}

	public void karakterSec() {
		switch(karakterMenu()) {
		case 1: 
			karakterTanimla("Samuray", 5, 21, 15);
			break ;
		case 2: 
			karakterTanimla("Okçu", 7, 18, 20);           	//karakterTanimla () kod kýsaltmak için kullanýldý.
			break ;
		case 3: 
			karakterTanimla("Þovalye", 8, 24, 5); 
			break ;
			
			default:
			karakterTanimla("Samuray", 5, 21, 15);
			break ;
			
		}
		System.out.println("Karakter : " + getKarakterAdi() + "\t Hasar : " + getHasar() + "\t Saðlýk : " + getSaglik() + "\t Para : " + getPara());

	}

	public int karakterMenu() {
		System.out.println("Oynamak istediðiniz karakteri seçiniz.");
		System.out.println("1- Samuray \t Hasar : 5 \t Saðlýk : 21 \t Para : 15");
		System.out.println("2- Okçu \t Hasar : 7 \t Saðlýk : 18 \t Para : 20");
		System.out.println("3- Þovalye \t Hasar : 8 \t Saðlýk : 24 \t Para : 5");
		System.out.print("Karakter Seçiminiz : ");
		int secimID = veri.nextInt();
		
		while (secimID < 1 || secimID >3) {
			System.out.println("Lütfen geçerli bir karakter seçiniz : ");
			secimID = veri.nextInt();
		}
		return secimID;
		
	}
	public int gettoplamHasar () {
		return this.getHasar() + this.getInventory().getHasar();
	}
	
	public void karakterTanimla(String Cname, int damage , int healty , int money ) {  // kodu kýsaltmak için yukarýda kullanýldý.
		setKarakterAdi(Cname);
		setHasar(damage);
		setSaglik(healty);
		setPara(money);
		setGercekSaglik(healty);
		
	}

	public int getHasar() {
		return hasar;
	}

	public void setHasar(int hasar) {
		this.hasar = hasar;
	}

	public int getSaglik() {
		return saglik;
	}

	public void setSaglik(int saglik) {
		this.saglik = saglik;
	}

	public int getPara() {
		return para;
	}

	public void setPara(int para) {
		this.para = para;
	}

	public String getKarakterAdi() {
		return karakterAdi;
	}

	public void setKarakterAdi(String ad) {
		this.karakterAdi = ad;
	}

	public String getOyuncuAdi() {
		return oyuncuAdi;
	}

	public void setOyuncuAdi(String karaterAdi) {
		this.oyuncuAdi = karaterAdi;
	}

	public Inventory getInventory() {
		return ýnventory;
	}

	public void setInventory(Inventory inventory) {
		ýnventory = inventory;
	}

	public int getGercekSaglik() {
		return gercekSaglik;
	}

	public void setGercekSaglik(int gercekSaglik) {
		this.gercekSaglik = gercekSaglik;
	}
	
	
	
	
	

}
