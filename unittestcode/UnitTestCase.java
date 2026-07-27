package unittestcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestCase {

	@Test
	public void testVerifyLogin() {
		UserAuthentication login = new UserAuthentication();

		//True Case: Test valid email with valid password
        assertTrue(login.verifyLogin("chikawa@gmail.com", "white123"));

        //False Case: Testing valid email with invalid password
        assertFalse(login.verifyLogin("usagi@gmail.com", "blue123"));

        //False Case: Testing non-existent email
        assertFalse(login.verifyLogin("momonga@gmail.com", "evil123"));
	}

}











