import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    private String nombre;
    private String direccion;
    private int telefono;

    private List<Productos> listaProductos;
    private List<Clientes> listaClientes;
    private List<Compras> listaCompras;

    public Supermercado(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;

        this.listaProductos=new ArrayList<>();
        this.listaClientes=new ArrayList<>();
        this.listaCompras=new ArrayList<>();
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
        return listaProductos;
    }

    public void setListaProductos(List<Productos> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public List<Clientes> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Clientes> listaClientes) {
       this.listaClientes = listaClientes;
    }

    public List<Compras> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(List<Compras> listaCompras) {
        this.listaCompras = listaCompras;
    }

    @Override
    public String toString() {
        return "Supermercado{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", listaProductos=" + listaProductos +
                ", listaClientes=" + listaClientes +
                ", listaCompras=" + listaCompras +
                '}';
    }

    //metodos de estudiante
    //Buscar cliente y comprobar
    public Clientes buscarCliente(int documento){
        for(Clientes cliente: listaClientes){
            if(documento == cliente.getDocumento()){
                return cliente;
            }
        }
        return null;
    }
    //metodo registrar cliente
    public boolean registrarCliente(Clientes cliente){
        boolean clienteRegistrado = false;
        Clientes clienteExistente = buscarCliente(cliente.getDocumento());
        if(clienteExistente == null){
            listaClientes.add(cliente);
            clienteRegistrado = true;
        }
        return clienteRegistrado;
    }
    //metodo actualizar cliente
    public boolean actualizarCliente(int documento, Clientes clienteActualizado){
        boolean estaActualizado=false;
        for(Clientes cliente: listaClientes){
            if (cliente.getDocumento()== documento){

                cliente.setNombre(clienteActualizado.getNombre());
                cliente.setCorreo(clienteActualizado.getCorreo());
                cliente.setTelefono(clienteActualizado.getTelefono());
                estaActualizado=true;
                break;
            }

        }
        return estaActualizado;
    }
    //eliminar cliente
    public boolean eliminarCliente(int documento){
        boolean esEliminado=false;
        for(Clientes cliente: listaClientes){
            if(cliente.getDocumento()==documento){
                listaClientes.remove(cliente);
                esEliminado=true;
                break;
            }

        }
        return esEliminado;
    }


    public Productos buscarProducto(int codigo){

        for(Productos producto: listaProductos){
            if(producto.getCodigoProducto()== codigo){
                return producto;
            }
        }
        return null;
    }
    public boolean registrarProductos(Productos producto){
        boolean productoRegistrado=false;
        Productos productoExistente= buscarProducto(producto.getCodigoProducto());
        if(productoExistente == null){
            listaProductos.add(producto);
            productoRegistrado=true;
        }
        return productoRegistrado;


    }

    public boolean actualizarPorducto(int codigo, Productos productoActualizado){
        boolean estaActualizado=false;
        for(Productos producto: listaProductos){
            if (producto.getCodigoProducto()==codigo ){

                producto.setNombre(productoActualizado.getNombre());
                producto.setCategoria(productoActualizado.getCategoria());
                producto.setPrecioUnitario(productoActualizado.getPrecioUnitario());
                producto.setStock(productoActualizado.getStock());
                estaActualizado=true;
                break;
            }

        }
        return estaActualizado;
    }

    public boolean eliminarProducto(int codigo){
        boolean esEliminado=false;
        for(Productos producto: listaProductos){
            if(producto.getCodigoProducto()==codigo){
                listaProductos.remove(producto);
                esEliminado=true;
                break;
            }

        }
        return esEliminado;
    }

    public Compras buscarCompra(int codigoCompra){
        for(Compras compra: listaCompras){
            if(codigoCompra ==compra.getCodigoCompra()){
                return compra;
            }
        }
        return null;
    }
    public boolean registrarCompra(int documentoCliente, Compras compra) {
        boolean compraRegistrada = false;
        Clientes cliente = buscarCliente(documentoCliente);
        Compras compraExistente = buscarCompra(compra.getCodigoCompra());

        if (cliente != null) {
            if (compraExistente == null) {
                if (compra.confirmarCompra()) {
                    listaCompras.add(compra);
                    cliente.agregarCompra(compra);
                    compraRegistrada = true;
                }
            }
        }
        return compraRegistrada;
    }
    public List<Compras> consultarCompras(int documento) {
        for(Clientes cliente: listaClientes){
            if(documento == cliente.getDocumento()){
                return cliente.getListaCompras();
                }
            }
        return null;
    }
    public double calcularVentasPorFecha(LocalDate fecha) {
        double totalVentas = 0;

        for (Compras compra : listaCompras) {
            if (compra.getFechaDeRealizacion().equals(fecha)) {
                totalVentas += compra.getValorTotal();
            }
        }

        return totalVentas;
    }
}