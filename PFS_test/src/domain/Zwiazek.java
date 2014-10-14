package domain;

public class Zwiazek extends Entity {
	private String nazwa;
	private String dyscyplina;
	private String kordynator;
	private String email;
	private String telefon;
	private String badania;

private Zawodnik zawodnik;
	
	public Zawodnik getZawodnik() {
		return zawodnik;
	}
	public void setZawodnik(Zawodnik zawodnik) {
		this.zawodnik = zawodnik;
	}
	
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public String getDyscyplina() {
		return dyscyplina;
	}
	public void setDyscyplina(String dyscyplina) {
		this.dyscyplina = dyscyplina;
	}
	public String getKordynator() {
		return kordynator;
	}
	public void setKordynator(String kordynator) {
		this.kordynator = kordynator;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getBadania() {
		return badania;
	}
	public void setBadania(String badania) {
		this.badania = badania;
	}
		
}
