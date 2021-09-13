public class Patron {
    public static void main(String[] args){
        Almacen almacen = new Almacen();
        
        MostrarNombre ejecutarMostrarNombre = new MostrarNombre(almacen);
        MostrarApellido ejecutarMostrarApellido = new MostrarApellido(almacen);
        
        Invocar invocar = new Invocar();
        invocar.printNombre(ejecutarMostrarNombre);
        invocar.printApellido(ejecutarMostrarApellido);
        
        invocar.ejecutarNombre();
        invocar.ejecutarApellido();
    }
}
