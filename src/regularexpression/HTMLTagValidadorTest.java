package regularexpression;

import org.junit.Assert;
import org.junit.Test;


public class HTMLTagValidadorTest {
	
	private HTMLTagValidador hv = new HTMLTagValidador();
	
	@Test
	public void validHTMLTag() {
		Assert.assertTrue(hv.validar("<b>"));
		Assert.assertTrue(hv.validar("<a href='http://www.google.com'>"));
		Assert.assertTrue(hv.validar("<input value='<'>"));
	}
	
	@Test
	public void singleOpeningTagIsNotAllow() {
		Assert.assertFalse(hv.validar("<input value= id=’test’>>"));
	}
	
	@Test
	public void  oneDoubleQuotesStringIsNotAllow() {
		Assert.assertFalse(hv.validar("<input value=\\\" id='test'>"));
	}
	
	@Test
	public void  oneSingleQuotesStringIsNotAllow() {
		Assert.assertFalse(hv.validar("<input value=' id='test'>"));
	}
}
