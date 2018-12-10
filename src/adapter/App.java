package adapter;

public class App {

	public static void main(String[] args) {
		TomadaDeTresPinos t3 = new TomadaDeTresPinos();
     
		AdapterTomada a = new AdapterTomada(t3);
        //o cliente faz uma chamada normalmente usando a tomada de dois pinos
		//mas na realidade esta chamada est� sendo adaptada para uma tomada de tr�s pinos
		a.ligarNaTomadaDeDoisPinos();
	}
}
