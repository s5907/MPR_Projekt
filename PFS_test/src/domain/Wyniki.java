package domain;

public class Wyniki extends Entity {
	
	private String nazwa_zawodow;
	private String miasto;
	private String data;
	private String miejsce_zawodnika;
	private String miejsce_zawodow;

	
private Zawodnik zawodnik;
	
	public Zawodnik getZawodnik() {
		return zawodnik;
	}
	public void setZawodnik(Zawodnik zawodnik) {
		this.zawodnik = zawodnik;
	}
	public String getNazwa_zawodow() {
		return nazwa_zawodow;
	}
	public void setNazwa_zawodow(String nazwa_zawodow) {
		this.nazwa_zawodow = nazwa_zawodow;
	}
	public String getMiasto() {
		return miasto;
	}
	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getMiejsce_zawodnika() {
		return miejsce_zawodnika;
	}
	public void setMiejsce_zawodnika(String miejsce_zawodnika) {
		this.miejsce_zawodnika = miejsce_zawodnika;
	}
	public String getMiejsce_zawodow() {
		return miejsce_zawodow;
	}
	public void setMiejsce_zawodow(String miejsce_zawodow) {
		this.miejsce_zawodow = miejsce_zawodow;
	}

}
