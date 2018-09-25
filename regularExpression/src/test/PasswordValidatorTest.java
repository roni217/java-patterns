package test;

import org.junit.Assert;
import org.junit.Test;

import regularExpression.PasswordValidator;

public class PasswordValidatorTest {

	private PasswordValidator pv = new PasswordValidator();

	@Test
	public void tooShortMinimumCharacters() {
		String invalidPassWord = "pw";
		Assert.assertFalse(pv.validate(invalidPassWord));
	}

	@Test
	public void uppercaseCharactersIsRequired() {
		String invalidPassWord = "paswordg12@";
		Assert.assertFalse(pv.validate(invalidPassWord));
	}

	@Test
	public void specialSymbolIsNotAllow() {
		String invalidPassWord = "paswordg12@*";
		Assert.assertFalse(pv.validate(invalidPassWord));
	}

	@Test
	public void digitIsRequired() {
		String invalidPassWord = "paswordG$$";
		Assert.assertFalse(pv.validate(invalidPassWord));
	}
	
	@Test
	public void lowerCaseCharacterIsRequired() {
		String invalidPassWord = "PASWORDG12$";
		Assert.assertFalse(pv.validate(invalidPassWord));
	}
	
	@Test
	public void validPassWord() {
		Assert.assertTrue(pv.validate("pasword1A@"));
		Assert.assertTrue(pv.validate("pasworD12$"));
	}
	
}
