package main.java.com.lad.barco;

public class Capitao implements BarcoRemo {
	private BarcoRemo barcoRemo;

	  public Capitao(BarcoRemo barcoRemo) {
	    this.barcoRemo = barcoRemo;
	  }
	  @Override
	  public void row() {
		  barcoRemo.row();
	  }
}
