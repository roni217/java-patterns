package adapter;

public class AdapterTomada {
	  private TomadaDeTresPinos tomadaDeTresPinos;
	  
	    public AdapterTomada(TomadaDeTresPinos tomadaDeTresPinos) {
	        this.tomadaDeTresPinos = tomadaDeTresPinos;
	    }
	 
	    public void ligarNaTomadaDeDoisPinos() {
	        tomadaDeTresPinos.ligarNaTomadaDeTresPinos();
	    }
}
