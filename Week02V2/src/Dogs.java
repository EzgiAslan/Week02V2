
public class Dogs extends Mammal {
	
	int kilo;
	int yavruSayisi;

	public Dogs(int ayakSayisi, String renk, int kilo, int yavruSayisi) {
		super(ayakSayisi, renk);
		this.kilo = kilo;
		this.yavruSayisi = yavruSayisi;
		
	}
	
	public int getKilo() {
		return kilo;
	}


	public void setKilo(int kilo) {
		this.kilo = kilo;
	}


	public int getYavruSayisi() {
		return yavruSayisi;
	}


	public void setYavruSayisi(int yavruSayisi) {
		this.yavruSayisi = yavruSayisi;
	}
	
	public void ozellikDog(){
		
		System.out.println("Kilosu = " + getKilo());
		System.out.println("Toplam Yavru Sayisi = " + getYavruSayisi());
		
	}



}
