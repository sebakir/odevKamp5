package odevKamp5.dataAccess.abstracts;

import java.util.List;

import odevKamp5.entities.abstracts.Entity;


public interface EntityRepository<Entity> {
	void add(Entity entity);
	void update(Entity entity);
	void delete(Entity entity);
	List<Entity> getAll();
	Entity get(int id);
}
