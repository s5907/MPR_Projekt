package repositories.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Zawodnik;
import repozytorium.IRepozytorium;
import unitofwork.IUnitOfWork;

public class ZawodnikRepozytorium 
	extends Repozytorium<Zawodnik>{

	protected ZawodnikRepozytorium(Connection connection,
			IEntityBuilder<Zawodnik> builder, IUnitOfWork uow) {
		super(connection, builder, uow);
	}

	@Override
	protected void setUpUpdateQuery(Zawodnik entity) throws SQLException {
		update.setString(1, entity.getImie());
		update.setString(2, entity.getNazwisko());
		update.setString(3, entity.getWiek());
		update.setString(4, entity.getKategoria());
		update.setString(5, entity.getDyscyplina());
		update.setString(6, entity.getBadania());
		update.setString(7, entity.getZgoda());
		
		
		
		
	}

	@Override
	protected void setUpInsertQuery(Zawodnik entity) throws SQLException {
				
		insert.setString(1, entity.getImie());
		insert.setString(2, entity.getNazwisko());
		insert.setString(3, entity.getWiek());
		insert.setString(4, entity.getKategoria());
		insert.setString(5, entity.getDyscyplina());
		insert.setString(6, entity.getBadania());
		insert.setString(7, entity.getZgoda());
	}

	@Override
	protected String getTableName() {
		return "zawodnik";
	}

	@Override
	protected String getUpdateQuery() {
		return "update zawodnik set (imie,nazwisko,wiek,kategoria,dyscyplina,badania,zgoda)=(?,?,?,?,?,?,?)"
				+ "where id=?";
	}

	@Override
	protected String getInsertQuery() {
		return "insert into zawodnik(imie,nazwisko,wiek,kategoria,dyscyplina,badania,zgoda)=(?,?,?,?,?,?,?)";
	}
	
}