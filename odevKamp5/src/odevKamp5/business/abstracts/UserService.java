package odevKamp5.business.abstracts;

import java.util.List;

import odevKamp5.entities.concretes.User;

public interface UserService {

	void add(User user) throws Exception;
	void update(User user);
	void delete(User user);
	
}
