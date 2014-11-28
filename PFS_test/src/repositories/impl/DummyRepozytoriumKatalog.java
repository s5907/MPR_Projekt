package repositories.impl;

import repozytorium.IRepozytoriumKatalog;
import repozytorium.IRepozytorium;
import domain.Role;
import domain.User;
import domain.Uzytkownik;


public class DummyRepozytoriumKatalog implements IRepozytoriumKatalog{

	private DummyDb db = new DummyDb();
	
	
	@Override
	public IRepozytorium<Uzytkownik> getUzytkownik() {
		return new DummyUzytkownikRepozytorium(db);
	}

	@Override
	public IRepozytorium<Role> getRoles() {
		// TODO Auto-generated method stub
		return new DummyRoleRepozytorium(db);
	}

	@Override
	public IRepozytorium<User> getUser() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
