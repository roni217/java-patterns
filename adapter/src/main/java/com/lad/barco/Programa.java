package main.java.com.lad.barco;

public class Programa {
	public static void main(String[] args) {
		Capitao capitao = new Capitao(new BarcoAdapter());
		capitao.row();
	}
}
