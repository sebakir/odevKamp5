package odevKamp5;

import odevKamp5.business.abstracts.AuthService;
import odevKamp5.business.concretes.AuthManager;
import odevKamp5.business.concretes.UserManager;
import odevKamp5.dataAccess.abstracts.UserDao;
import odevKamp5.dataAccess.concretes.HibernateUserDao;
import odevKamp5.entities.concretes.User;

public class Main {
	public static void main(String[] args) throws Exception {
		User user = new User(1, "seckin", "bakir", 123123123L, "lsdfklsdf", "seckin@gmail.com");
		AuthManager authManager = new AuthManager();
		UserManager manager = new UserManager(new HibernateUserDao());

		manager.add(user);
		authManager.checkUser(user, "seckin@gmail.com", "lsdfklsdf");

	}
}
