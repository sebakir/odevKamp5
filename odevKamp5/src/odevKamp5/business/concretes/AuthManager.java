package odevKamp5.business.concretes;

import odevKamp5.business.abstracts.AuthService;
import odevKamp5.entities.concretes.User;

public class AuthManager implements AuthService {

	@Override
	public void login(User user, String password, String eMail) {
		if (user.geteMail().equals(eMail) && user.getPassword().equals(password)) {
			System.out.println("Giriş yapıldı  hosgeldiniz :  " + user.getFirstName());
		}

	}

	@Override
	public boolean checkUser(User user, String eMail, String password) {
		if (user.geteMail().equals(eMail) && user.getPassword().equals(password)) {
			System.out.println("Dogrulama basarili");
			return true;
		}
		return false;
		
	}

	@Override
	public void validate(User user, String firstNane, String password) {
		if (user.getFirstName().equals(firstNane) && user.getPassword().equals(password)) {
			System.out.println("Dogrulama basarili");
		}

	}

}
