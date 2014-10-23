import java.util.List;

import domain.User;
import repositories.impl.DummyRepositoryCatalog;
import repozytorium.IRepozytoriumKatalog;


public class Main {
	public static void main(String[] args) {

		IRepozytoriumKatalog catalog = new DummyRepositoryCatalog();
		
		List<User> admins = catalog.getUsers().withRole("administrator");
	}

}
