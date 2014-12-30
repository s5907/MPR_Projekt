package repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Zawodnik;

public class ZawodnikBuilder implements IEntityBuilder<Zawodnik>{

	@Override
	public Zawodnik build(ResultSet rs) throws SQLException {
		Zawodnik zawodnik = new Zawodnik();
		zawodnik.setImie(rs.getString("imie"));
		zawodnik.setNazwisko(rs.getString("nazwisko"));
		zawodnik.setWiek(rs.getString("wiek"));
		zawodnik.setKategoria(rs.getString("kategoria"));
		zawodnik.setDyscyplina(rs.getString("dyscyplina"));
		zawodnik.setBadania(rs.getString("badania"));
		zawodnik.setZgoda(rs.getString("zgoda"));
		return zawodnik;
	}

}
