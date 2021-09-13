import java.util.ArrayList;
import java.util.List;

public class Invocar {
    private List<MostrarNombre> nombreLista = new ArrayList<MostrarNombre>();
    private List<MostrarApellido> apellidoLista = new ArrayList<MostrarApellido>();
    
    public void printNombre(MostrarNombre mostrarNombre){
        nombreLista.add(mostrarNombre);
        
    }
    public void printApellido(MostrarApellido mostrarApellido){
        apellidoLista.add(mostrarApellido);
    }
    
    
    public void ejecutarNombre(){
        for (MostrarNombre mostrarNombre : nombreLista) {
            mostrarNombre.ejecutar();
        }
        nombreLista.clear();
    }
    
    public void ejecutarApellido(){
        for (MostrarApellido mostrarApellido : apellidoLista) {
            mostrarApellido.ejecutar();
        }
        apellidoLista.clear();
    }
}
