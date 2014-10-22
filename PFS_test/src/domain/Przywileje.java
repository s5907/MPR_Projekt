package domain;

import java.util.ArrayList;
import java.util.List;

public class Przywileje extends Entity {

	private String imie;
	
	private List<Role> roles;

	public Przywileje()
	{
		roles = new ArrayList<Role>();
	}
	
	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	
}