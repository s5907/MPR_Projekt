package repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Uzytkownik;

public class UzytkownikBuilder implements IEntityBuilder<Uzytkownik>{

	@Override
	public Uzytkownik build(ResultSet rs) throws SQLException {
		Uzytkownik uzytkownik = new Uzytkownik();
		uzytkownik.setImie(rs.getString("imie"));
		uzytkownik.setNazwisko(rs.getString("nazwisko"));
		uzytkownik.setPesel(rs.getString("pesel"));
		uzytkownik.setId(rs.getInt("id"));
		return uzytkownik;
	}

}
