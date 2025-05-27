package web.service;

public class LoginService {

	public static boolean login(String username, String password, String dob) {
		
		if ("simasha".equals(username) && "simasha123".equals(password) && "1999-08-27".equals(dob)) {
			return true;
		}
		return false;
	}
	
	
}
