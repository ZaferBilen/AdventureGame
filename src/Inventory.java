
public class Inventory {
	private boolean su,yemek,odun;
	private String silahAdi,zirhAdi;
	private int zirh,hasar;
	
	Inventory(){
		this.su = false;
		this.yemek = false;
		this.odun = false;
		this.su = false;
		this.hasar = 0;
		this.zirh = 0;
		this.zirhAdi = null;
		this.silahAdi = null;
	}

	public boolean isSu() {
		return su;
	}

	public void setSu(boolean su) {
		this.su = su;
	}

	public boolean isYemek() {
		return yemek;
	}

	public void setYemek(boolean yemek) {
		this.yemek = yemek;
	}

	public boolean isOdun() {
		return odun;
	}

	public void setOdun(boolean odun) {
		this.odun = odun;
	}

	public String getSilahAdi() {
		return silahAdi;
	}

	public void setSilahAdi(String silahAdi) {
		this.silahAdi = silahAdi;
	}

	public String getZirhAdi() {
		return zirhAdi;
	}

	public void setZirhAdi(String zirhAdi) {
		this.zirhAdi = zirhAdi;
	}

	public int getZirh() {
		return zirh;
	}

	public void setZirh(int zirh) {
		this.zirh = zirh;
	}

	public int getHasar() {
		return hasar;
	}

	public void setHasar(int hasar) {
		this.hasar = hasar;
	}
	
	

}
