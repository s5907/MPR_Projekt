package domain;

import java.util.ArrayList;
import java.util.List;

public class Uzytkownik extends Entity {

	public Uzytkownik() {
		super();
		this.adresy = new ArrayList<Adresy>();
	}
	
	private String imie;
	private String nazwisko;
	private String pesel;
	
	private User user;
	
	private List<Adresy> adresy;

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

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Adresy> getAdresy() {
		return adresy;
	}

	public void setAdresy(List<Adresy> adresy) {
		this.adresy = adresy;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	
		
}