package odevKamp5.business.concretes;

import java.util.ArrayList;

import odevKamp5.business.abstracts.UserService;
import odevKamp5.core.GoogleService;
import odevKamp5.dataAccess.abstracts.UserDao;
import odevKamp5.entities.concretes.User;

public class UserManager implements UserService {

	UserDao userDao;
	GoogleService googleService;

	ArrayList<String> mailList = new ArrayList<String>();

	

	public UserManager(UserDao userDao, GoogleService googleService) {
		super();
		this.userDao = userDao;
		this.googleService = googleService;
		
	}

	@Override
	public void add(User user) throws Exception {
		if (user.getFirstName().length() >= 2 && user.getLastName().length() >= 2 && user.getPassword().length() >= 6
				&& user.geteMail() != "") {

			mailList.add(user.geteMail());
			if (mailList.contains(user.geteMail())) {
				System.out.println("Bu mail adresi zaten mevcut");
			}

			System.out.println("Kullanici eklendi : " + user.getFirstName());
			userDao.add(user);
			System.out.println("Dogrulama mailini aktiflestiriniz...");
			sendMail();
			
			
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
	
	public void sendMail() {
		System.out.println("Kullanici dogrulandi");
	}

	@Override
	public void registerWithGoogle() {
		googleService.registerToSystem("Google ile kayit oldundu");
		
	}

//	@Override
//	public boolean mailValidate(User user, String email) throws Exception {
//		if (user.geteMail().equals(email)) {
//			return false;
//		}
//		return true;
//	}

}
