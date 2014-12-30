package repozytorium;

import java.util.List;

import repozytorium.IRepozytorium;
import domain.Role;
import domain.User;

public interface IUzytkownikRepozytorium extends IRepozytorium<User>{
	

		public List<User> withRole(Role role);
		public List<User> withRole(String roleName);
		public List<User> withRole(int roleId);

}
