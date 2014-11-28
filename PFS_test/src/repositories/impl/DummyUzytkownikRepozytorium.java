package repositories.impl;

import java.util.List;

import repozytorium.IRepozytorium;
import domain.Uzytkownik;

public class DummyUzytkownikRepozytorium  implements IRepozytorium<Uzytkownik> {

private DummyDb db;
	
	public DummyUzytkownikRepozytorium(DummyDb db) {
		super();
		this.db = db;
	}


	
	

	@Override
	public void save(Uzytkownik entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Uzytkownik entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Uzytkownik entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Uzytkownik get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Uzytkownik> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
