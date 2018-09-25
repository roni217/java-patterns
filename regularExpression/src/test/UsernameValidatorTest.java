package test;

import org.junit.Assert;
import org.junit.Test;

import regularExpression.UsernameValidator;

public class UsernameValidatorTest {

	private UsernameValidator unv = new UsernameValidator();

	@Test
	public void tooShortMinimumCharacters() {
		String invalidUserName = "na";
		Assert.assertFalse(unv.validate(invalidUserName));
	}

	@Test
	public void errorDueToExcessiveCharacter() {
		String invalidUserName = "name1234567890123456789";
		Assert.assertFalse(unv.validate(invalidUserName));
	}
	
	@Test
	public void errorDueNameWithSymbol() {
		String invalidUserName = "n@me";
		Assert.assertFalse(unv.validate(invalidUserName));
	}
	
	@Test
	public void nameWithUnderscore() {
		String invalidUserName = "na_me";
		Assert.assertTrue(unv.validate(invalidUserName));
	}
	
	@Test
	public void simpleName() {
		String invalidUserName = "na_me";
		Assert.assertTrue(unv.validate(invalidUserName));
	}
}
