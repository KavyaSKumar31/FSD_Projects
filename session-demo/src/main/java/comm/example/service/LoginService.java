package comm.example.service;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("dummy") && password.equals("dummy"))
			return true;

		return false;
	}

}
