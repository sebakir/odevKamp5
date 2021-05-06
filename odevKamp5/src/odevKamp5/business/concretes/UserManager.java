package odevKamp5.business.concretes;

import java.util.List;

import odevKamp5.business.abstracts.UserService;
import odevKamp5.dataAccess.abstracts.UserDao;
import odevKamp5.entities.concretes.User;

public class UserManager implements UserService {

	UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;

	}

	@Override
	public void add(User user) throws Exception {
		if (user.getFirstName().length() >= 2 && user.getLastName().length() >= 2 && user.getPassword().length() >= 6
				&& user.geteMail() != "") {
			System.out.println("Kullanici eklendi : "+user.getFirstName());
			userDao.add(user);
		} else {
			throw new Exception("Kayit olma kurallarina uymadiniz");
		}

	}

	@Override
	public void update(User user) {
		userDao.update(user);

	}

	@Override
	public void delete(User user) {
		userDao.delete(user);

	}

}
