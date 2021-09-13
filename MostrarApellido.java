public class MostrarApellido implements Ejecutar {
    private Almacen apellidoAlmacen;
    
    public MostrarApellido(Almacen apellidoAlmacen){
        this.apellidoAlmacen = apellidoAlmacen;
    }
    
    public void ejecutar(){
        apellidoAlmacen.mostrarApellido();
    }
}