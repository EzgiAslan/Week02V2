
public class Cats extends Mammal{
	
	String cinsi;
	String gozRengi;
	

	public Cats(int ayakSayisi, String renk, String cinsi, String gozRengi){
		
		super(ayakSayisi,renk);
		this.cinsi = cinsi;
		this.gozRengi = gozRengi;
	
}
	
	public String getCinsi() {
		return cinsi;
	}

	public void setCinsi(String cinsi) {
		this.cinsi = cinsi;
	}

	public String getGozRengi() {
		return gozRengi;
	}

	public void setGozRengi(String gozRengi) {
		this.gozRengi = gozRengi;
	}
	
	public void ozellikCat(){
		
		System.out.println("Cinsi = " + getCinsi());
		System.out.println("Goz Rengi = " + getGozRengi());
		
	}
	
}
	
