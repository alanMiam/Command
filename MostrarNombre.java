public class MostrarNombre implements Ejecutar {
    private Almacen nombreAlmacen;
    
    public MostrarNombre(Almacen nombreAlmacen){
        this.nombreAlmacen = nombreAlmacen;
    }
    
    public void ejecutar(){
        nombreAlmacen.mostrarNombre();
    }
}
