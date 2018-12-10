package regularexpression;

import org.junit.Assert;
import org.junit.Test;

public class PasswordValidadorTest {

	private PasswordValidador pv = new PasswordValidador();

	@Test
	public void tooShortMinimumCharacters() {
		String invalidPassWord = "pw";
		Assert.assertFalse(pv.validar(invalidPassWord));
	}

	@Test
	public void uppercaseCharactersIsRequired() {
		String invalidPassWord = "paswordg12@";
		Assert.assertFalse(pv.validar(invalidPassWord));
	}

	@Test
	public void specialSymbolIsNotAllow() {
		String invalidPassWord = "paswordg12@*";
		Assert.assertFalse(pv.validar(invalidPassWord));
	}

	@Test
	public void digitIsRequired() {
		String invalidPassWord = "paswordG$$";
		Assert.assertFalse(pv.validar(invalidPassWord));
	}
	
	@Test
	public void lowerCaseCharacterIsRequired() {
		String invalidPassWord = "PASWORDG12$";
		Assert.assertFalse(pv.validar(invalidPassWord));
	}
	
	@Test
	public void validPassWord() {
		Assert.assertTrue(pv.validar("pasword1A@"));
		Assert.assertTrue(pv.validar("pasworD12$"));
	}
}
