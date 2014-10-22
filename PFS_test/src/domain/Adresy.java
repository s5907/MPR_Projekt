package domain;

public class Adresy extends Entity {

	private String funkcja;
	private String miasto;
	private String numerKodu;
	
	public String getFunkcja() {
		return funkcja;
	}
	public void setFunkcja(String funkcja) {
		this.funkcja = funkcja;
	}
	public String getMiasto() {
		return miasto;
	}
	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}
	public String getNumerKodu() {
		return numerKodu;
	}
	public void setNumerKodu(String numerKodu) {
		this.numerKodu = numerKodu;
	}
	public String getUlica() {
		return ulica;
	}
	public void setUlica(String ulica) {
		this.ulica = ulica;
	}
	public String getDomNumber() {
		return domNumber;
	}
	public void setDomNumber(String domNumber) {
		this.domNumber = domNumber;
	}
	public String getLocalNumber() {
		return localNumber;
	}
	public void setLocalNumber(String localNumber) {
		this.localNumber = localNumber;
	}
	private String ulica;
	private String domNumber;
	private String localNumber;
	
	private Uzytkownik uzytkownik;
	
	public Uzytkownik getUzytkownik() {
		return uzytkownik;
	}
	public void setUzytkownik(Uzytkownik uzytkownik) {
		this.uzytkownik = uzytkownik;
	}
		
}