import java.util.Random;

public class Canavar {
	private String name;
	private int hasar,saglik,odul,maxSayi;
	
	public Canavar(String name, int hasar, int saglik, int odul, int maxSayi) {
		this.name = name;
		this.hasar = hasar;
		this.saglik = saglik;
		this.odul = odul;
		this.maxSayi = maxSayi;
	}
	
	public int canavarSayisi() {
		Random r = new Random();
		return r.nextInt(this.maxSayi) +1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getOdul() {
		return odul;
	}

	public void setOdul(int odul) {
		this.odul = odul;
	}

	public int getMaxSayi() {
		return maxSayi;
	}

	public void setMaxSayi(int maxSayi) {
		this.maxSayi = maxSayi;
	}
	
	
	
	 

}
