package repositories.impl;

import java.util.List;

import repozytorium.IRepozytorium;
import domain.Role;

public class DummyRoleRepozytorium implements IRepozytorium<Role> {

	public DummyRoleRepozytorium(DummyDb db) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(Role entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Role entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Role entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Role get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
