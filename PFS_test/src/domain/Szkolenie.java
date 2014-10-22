package domain;

import java.util.ArrayList;
import java.util.List;

public class Szkolenie extends Entity {

	public Szkolenie() {
		super();
		this.zawodnik = new ArrayList<Zawodnik>();
	}
	
	private String nazwaSzkolenia;
	private String miejsceSzkolenia;
	private String dataSzkolenia;
	private String kosztSzkolenia;
	
	public String getNazwaSzkolenia() {
		return nazwaSzkolenia;
	}
	public void setNazwaSzkolenia(String nazwaSzkolenia) {
		this.nazwaSzkolenia = nazwaSzkolenia;
	}
	public String getMiejsceSzkolenia() {
		return miejsceSzkolenia;
	}
	public void setMiejsceSzkolenia(String miejsceSzkolenia) {
		this.miejsceSzkolenia = miejsceSzkolenia;
	}
	public String getDataSzkolenia() {
		return dataSzkolenia;
	}
	public void setDataSzkolenia(String dataSzkolenia) {
		this.dataSzkolenia = dataSzkolenia;
	}
	public String getKosztSzkolenia() {
		return kosztSzkolenia;
	}
	public void setKosztSzkolenia(String kosztSzkolenia) {
		this.kosztSzkolenia = kosztSzkolenia;
	}

	private List<Zawodnik> zawodnik;
	
	
	public List<Zawodnik> getZawodnik() {
		return zawodnik;
	}
	public void setZawodnik(List<Zawodnik> zawodnik) {
		this.zawodnik = zawodnik;
	}
}

	