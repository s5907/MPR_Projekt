package repositories.impl;

import java.util.ArrayList;
import java.util.List;

import domain.Role;
import domain.Uzytkownik;
import repozytorium.IUserRepozytorium;

public class DummyUserRepository implements IUserRepozytorium{

	private DummyDb db;
	
	public DummyUserRepository(DummyDb db) {
		super();
		this.db = db;
	}

	@Override
	public void save(Uzytkownik entity) {
		db.uzytkownicy.add(entity);
		
	}

	@Override
	public void update(Uzytkownik entity) {

		
	}

	@Override
	public void delete(Uzytkownik entity) {
		db.uzytkownicy.remove(entity);
		
	}

	@Override
	public Uzytkownik get(int id) {
		for(Uzytkownik u:db.uzytkownicy)
			if(u.getId()==id)
				return u;
		return null;
	}

	@Override
	public List<Uzytkownik> getAll() {

		return db.uzytkownicy;
	}

	@Override
	public List<Uzytkownik> withRole(Role role) {
		return withRole(role.getId());
	}

	@Override
	public List<Uzytkownik> withRole(String roleName) {

		for(Role r:db.roles)
			if(r.getName().equals(roleName))
				return r.getUzytkownicy();
		return new ArrayList<Uzytkownik>();
	}

	@Override
	public List<Uzytkownik> withRole(int roleId) {

		for(Role r:db.roles)
			if(r.getId()==roleId)
				return r.getUzytkownicy();
		return new ArrayList<Uzytkownik>();
	}

}

