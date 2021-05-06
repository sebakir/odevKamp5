package odevKamp5.core;

import odevKamp5.googleAccount.GoogleManager;

public class GoogleAdapter implements GoogleService {

	@Override
	public void registerToSystem(String message) {
		
		GoogleManager googleManager = new GoogleManager();
		googleManager.registerWithGoogle(message);
	}
	
	
}
