package odevKamp5.business.abstracts;

import odevKamp5.entities.concretes.User;

public interface AuthService {
	
	void login(User user , String password , String eMail);
	void validate(User user, String firstNane, String password);
	boolean checkUser(User user, String eMail, String password);
	
}
