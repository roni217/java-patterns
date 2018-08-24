package main.java.com.lad;

public class AdapterTomada extends TomadaDeDoisPinos {
    private TomadaDeTresPinos tomadaDeTresPinos;
 
    public AdapterTomada(TomadaDeTresPinos tomadaDeTresPinos) {
        this.tomadaDeTresPinos = tomadaDeTresPinos;
    }
 
    public void ligarNaTomadaDeDoisPinos() {
        tomadaDeTresPinos.ligarNaTomadaDeTresPinos();
    }
}
