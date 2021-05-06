package odevKamp5;

import odevKamp5.business.abstracts.AuthService;
import odevKamp5.business.concretes.AuthManager;
import odevKamp5.business.concretes.UserManager;
import odevKamp5.core.GoogleAdapter;
import odevKamp5.dataAccess.abstracts.UserDao;
import odevKamp5.dataAccess.concretes.HibernateUserDao;
import odevKamp5.entities.concretes.User;

public class Main {
	public static void main(String[] args) throws Exception {
		User user = new User(1, "seckin", "bakir", "lsdfklsdf", "seckin@gmail.com");
		User user1 = new User(1, "seckin", "bakir", "lsdfklsdf", "seckin1@gmail.com.asd");
		AuthManager authManager = new AuthManager();
		UserManager manager = new UserManager(new HibernateUserDao() , new GoogleAdapter());

		manager.add(user);
		System.out.println(authManager.checkEmailValid(user));
		System.out.println(authManager.checkEmailValid(user1));
		authManager.checkUser(user, "seckin@gmail.com", "lsdfklsdf");

	}
}
