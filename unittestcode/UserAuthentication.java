package unittestcode;
import java.util.HashMap;
import java.util.Map;

public class UserAuthentication {
	private Map<String,String> userDatabase = new HashMap<>();
	
	public UserAuthentication() {
		userDatabase.put("chikawa@gmail.com", "white123");
		userDatabase.put("usagi@gmail.com", "yellow123");
		userDatabase.put("hachiware@gmail.com", "blue123");
	}
	
	public boolean verifyLogin(String email, String password) {
		if (userDatabase.containsKey(email)) {
			if (password.equals(userDatabase.get(email))) {
				System.out.println("Login Successful");
				return true;
			} else {
				System.out.println("Invalid password");
				return false;
			}
		}
		System.out.println("Invalid email");
		return false;
	}
	
}





