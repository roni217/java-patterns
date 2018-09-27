package test;

import org.junit.Assert;
import org.junit.Test;

import regularExpression.HTMLTagValidator;

public class HTMLTagValidatorTest {

	private HTMLTagValidator hv = new HTMLTagValidator();
	
	
	@Test
	public void validHTMLTag() {
		Assert.assertTrue(hv.validate("<b>"));
		Assert.assertTrue(hv.validate("<a href='http://www.google.com'>"));
		Assert.assertTrue(hv.validate("<input value='<'>"));
	}
	
	@Test
	public void singleOpeningTagIsNotAllow() {
		Assert.assertFalse(hv.validate("<input value= id=’test’>>"));
	}
	
	@Test
	public void  oneDoubleQuotesStringIsNotAllow() {
		Assert.assertFalse(hv.validate("<input value=\\\" id='test'>"));
	}
	
	@Test
	public void  oneSingleQuotesStringIsNotAllow() {
		Assert.assertFalse(hv.validate("<input value=' id='test'>"));
	}
	
	
}
