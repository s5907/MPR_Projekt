package domain;

import java.util.ArrayList;
import java.util.List;

public class User extends Entity {

	private String login;
	private String password;
	private Uzytkownik uzytkownik;
	
	private List<Role> roles;
	
	public User()
	{
		roles=new ArrayList<Role>();
	}
	
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Uzytkownik getUzytkownik() {
		return uzytkownik;
	}
	public void setPerson(Uzytkownik uzytkownik) {
		this.uzytkownik = uzytkownik;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
