package regularexpression;

import org.junit.Assert;
import org.junit.Test;

public class UsuarioValidadorTest {
	private UsuarioValidador unv = new UsuarioValidador();

	@Test
	public void tooShortMinimumCharacters() {
		String invalidUserName = "na";
		Assert.assertFalse(unv.validar(invalidUserName));
	}

	@Test
	public void errorDueToExcessiveCharacter() {
		String invalidUserName = "name1234567890123456789";
		Assert.assertFalse(unv.validar(invalidUserName));
	}

	@Test
	public void errorDueNameWithSymbol() {
		String invalidUserName = "n@me";
		Assert.assertFalse(unv.validar(invalidUserName));
	}

	@Test
	public void nameWithUnderscore() {
		String invalidUserName = "na_me";
		Assert.assertTrue(unv.validar(invalidUserName));
	}

	@Test
	public void simpleName() {
		String invalidUserName = "na_me";
		Assert.assertTrue(unv.validar(invalidUserName));
	}
}
