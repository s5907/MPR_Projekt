package domain;
import java.util.ArrayList;
import java.util.List;

public class Zawodnik extends Entity {
	
	public Zawodnik() {
		super();
		this.wyniki = new ArrayList<Wyniki>();
	}
	
	
	
	private String imie;
	private String nazwisko;
	private String wiek;
	private String kategoria;
	private String dyscyplina;
	private String badania;
	private String zgoda;
	private List<Wyniki> wyniki;
	private Szkolenie szkolenie;
	
	
	public Szkolenie getSzkolenie() {
		return szkolenie;
	}
	public void setSzkolenie(Szkolenie szkolenie) {
		this.szkolenie = szkolenie;
	}
	
	
	
	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getWiek() {
		return wiek;
	}

	public void setWiek(String wiek) {
		this.wiek = wiek;
	}

	public String getKategoria() {
		return kategoria;
	}

	public void setKategoria(String kategoria) {
		this.kategoria = kategoria;
	}

	public String getDyscyplina() {
		return dyscyplina;
	}

	public void setDyscyplina(String dyscyplina) {
		this.dyscyplina = dyscyplina;
	}

	public String getBadania() {
		return badania;
	}

	public void setBadania(String badania) {
		this.badania = badania;
	}

	public String getZgoda() {
		return zgoda;
	}

	public void setZgoda(String zgoda) {
		this.zgoda = zgoda;
	}

	public List<Wyniki> getWyniki() {
		return wyniki;
	}
	public void setWyniki(List<Wyniki> wyniki) {
		this.wyniki = wyniki;
	}
}
