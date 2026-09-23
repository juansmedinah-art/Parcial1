import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    private String nombre;
    private String direccion;
    private int telefono;

    private List<Productos> ListaProductos;
    private List<Clientes> ListaClientes;
    private List<Compras> ListaCompras;

    public Supermercado(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;

        this.ListaProductos=new ArrayList<>();
        this.ListaClientes=new ArrayList<>();
        this.ListaCompras=new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Supermercado{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +'\''+
                ", Lista de productos"+ListaProductos+'\''+
                ", Lista de clientes"+ListaClientes+'\''+
                ", Liata de compras"+ListaCompras+'\''+
                '}';

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Productos> getListaProductos() {
        return ListaProductos;
    }

    public void setListaProductos(List<Productos> listaProductos) {
        ListaProductos = listaProductos;
    }

    public List<Clientes> getListaClientes() {
        return ListaClientes;
    }

    public void setListaClientes(List<Clientes> listaClientes) {
        ListaClientes = listaClientes;
    }

    public List<Compras> getListaCompras() {
        return ListaCompras;
    }

    public void setListaCompras(List<Compras> listaCompras) {
        ListaCompras = listaCompras;
    }
}