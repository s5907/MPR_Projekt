package repozytorium;


import repozytorium.IUserRepozytorium;
import repozytorium.IRepozytorium;
import domain.User;

public class IRepozytoriumKatalog {

	public IUserRepozytorium getUzytkownicy();
	public IRepozytorium<Uzytkownik>getUzytkownik();
	
	
}

