package repositories.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Uzytkownik;
import repozytorium.IRepozytorium;
import unitofwork.IUnitOfWork;

public class UzytkownikRepozytorium 
	extends Repozytorium<Uzytkownik>{

	protected UzytkownikRepozytorium(Connection connection,
			IEntityBuilder<Uzytkownik> builder, IUnitOfWork uow) {
		super(connection, builder, uow);
	}

	@Override
	protected void setUpUpdateQuery(Uzytkownik entity) throws SQLException {
		update.setString(1, entity.getImie());
		update.setString(2, entity.getNazwisko());
		update.setString(3, entity.getPesel());
		update.setInt(4, entity.getId());
	}

	@Override
	protected void setUpInsertQuery(Uzytkownik entity) throws SQLException {
		insert.setString(1, entity.getImie());
		insert.setString(2, entity.getNazwisko());
		insert.setString(3, entity.getPesel());
	}

	@Override
	protected String getTableName() {
		return "uzytkownik";
	}

	@Override
	protected String getUpdateQuery() {
		return "update uzytkownik set (imie,nazwisko,pesel)=(?,?,?)"
				+ "where id=?";
	}

	@Override
	protected String getInsertQuery() {
		return "insert into uzytownik(imie,nazwisko,pesel) values(?,?,?)";
	}
	
}