package odevKamp5.dataAccess.concretes;

import java.util.List;

import odevKamp5.dataAccess.abstracts.EntityRepository;
import odevKamp5.entities.abstracts.Entity;

public class HibernateEntityRepositoryBase<Entity> implements EntityRepository<Entity>{
	public void add(Entity entity) {
		System.out.println("Hibernate ile eklendi ");

	}

	public void update(Entity entity) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile güncellendi ");
	}

	public void delete(Entity entity) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile silindi ");
	}

	public List<Entity> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Entity get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
