package repositories.impl;

import java.sql.Connection;

import domain.User;
import domain.Uzytkownik;
import domain.Zawodnik;
import domain.Role;
import repozytorium.IRepozytorium;
import repozytorium.IRepozytoriumKatalog;
import repozytorium.IUzytkownikRepozytorium;
import unitofwork.IUnitOfWork;

public class RepozytoriumKatalog implements IRepozytoriumKatalog{

	private Connection connection;
	private IUnitOfWork uow;
	
	public RepozytoriumKatalog(Connection connection, IUnitOfWork uow) {
		super();
		this.connection = connection;
		this.uow = uow;
	}

	@Override
	public IRepozytorium<Uzytkownik> getUzytkownik() {
		return new UzytkownikRepozytorium(connection, new UzytkownikBuilder(), uow);
	}

	@Override
	public IRepozytorium<Zawodnik> getZawodnik() {
		return new ZawodnikRepozytorium(connection, new ZawodnikBuilder(), uow);
	}

	@Override
	public IRepozytorium<Role> getRoles() {
		return null;
	}

	@Override
	public IRepozytorium<User> getUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
