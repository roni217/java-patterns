package main.java.com.lad.barco;

public class BarcoAdapter implements BarcoRemo {
	

	  private BarcoPesca boat;

	  public BarcoAdapter() {
	    boat = new BarcoPesca();
	  }

	  @Override
	  public void row() {
	    boat.navegar();
	  }
}
