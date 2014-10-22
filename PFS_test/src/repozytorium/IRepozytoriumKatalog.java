package repozytorium;


import repozytorium.IUserRepozytorium;
import repozytorium.IRepozytorium;
import domain.User;

public class IRepozytoriumKatalog {

	public IUserRepozytorium getUsers();
	public IRepozytorium<User> getUser();
	
	
}

