package repositories.impl;
import repozytorium.IRepozytoriumKatalog;
import repozytorium.IRepozytorium;
import domain.Uzytkownik;


import repozytorium.IUserRepozytorium;

public class DummyRepositoryCatalog implements IRepozytoriumKatalog{

	private DummyDb db = new DummyDb();
	
	@Override
	public IUserRepozytorium getUzytkownicy() {
		return new DummyUserRepository(db);
	}

	@Override
	public IRepozytorium<Uzytkownik> getUzytkownik() {
		return new DummyPersonRepository(db);
	}

}
