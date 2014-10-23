package repositories.impl;

import java.util.List;

import domain.Uzytkownik;
import repozytorium.IRepozytorium;


public class DummyPersonRepository implements IRepozytorium<Uzytkownik>{

	private DummyDb db;
	
	public DummyPersonRepository(DummyDb db) {
		super();
		this.db = db;
	}

	@Override
	public void save(Uzytkownik entity) {

		db.uzytkownik.add(entity);
		
	}

	@Override
	public void update(Uzytkownik entity) {
		
	}

	@Override
	public void delete(Uzytkownik entity) {

		db.uzytkownik.remove(entity);
		
	}

	@Override
	public Uzytkownik get(int id) {

		for(Uzytkownik p: db.uzytkownik)
			if(p.getId()==id)
				return p;
		return null;
	}

	@Override
	public List<Uzytkownik> getAll() {
		return db.uzytkownik;
	}

}
