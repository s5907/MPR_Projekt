package repozytorium;
import domain.*;


public interface IRepozytoriumKatalog {

	public IRepozytorium<Uzytkownik> getUzytkownik();
	public IRepozytorium<User>getUser();
	public IRepozytorium<Role> getRoles();
	public IRepozytorium<Zawodnik> getZawodnik();
	
	
	
	
}

