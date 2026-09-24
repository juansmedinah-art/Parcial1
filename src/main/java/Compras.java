import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Compras {
    private int codigoCompra;
    private LocalDate fechaDeRealizacion;
    private double valorTotal;
    private MetodoPago metodoPago;
    private List<Productos> listaProductos;

    public Compras(int codigoCompras, LocalDate fechaDeRealizacion, double valorTotal, MetodoPago metodoPago) {
        this.codigoCompra = codigoCompras;
        this.fechaDeRealizacion = fechaDeRealizacion;
        this.valorTotal = valorTotal;
        this.metodoPago = metodoPago;

        this.listaProductos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Compras{" +
                "codigoCompra=" + codigoCompra +
                ", fechaDeRealizacion=" + fechaDeRealizacion +
                ", valorTotal=" + valorTotal +
                ", metodoPago=" + metodoPago +
                '}';
    }

    public int getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(int codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    public LocalDate getFechaDeRealizacion() {
        return fechaDeRealizacion;
    }

    public void setFechaDeRealizacion(LocalDate fechaDeRealizacion) {
        this.fechaDeRealizacion = fechaDeRealizacion;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public List<Productos> getListaProductos() {
        return listaProductos;
    }

    //Metodo para agregar un producto a la compar
    public boolean agregarProducto(Productos producto) {
        boolean productoAgregado = false;
        int contador = 0;

        for (Productos productos : listaProductos) {
            if (productos.getCodigoProducto() == producto.getCodigoProducto()) {
                contador++;
            }
        }
        if (contador < producto.getStock()) {
            listaProductos.add(producto);
            productoAgregado = true;
        }

        return productoAgregado;
    }
    public double calcularTotal (){
        double total= 0;

        for(Productos item : listaProductos){
            total +=item.getPrecioUnitario();
        }
        valorTotal=total;
        return total;
    }
    public boolean confirmarCompra(){
        boolean factura=false;
        int cantidad=0;

        for(Productos item: listaProductos){
            cantidad= cantidad+1;
            item.setStock(item.getStock()-1);
        }
        calcularTotal();
        if(cantidad>0){
            factura=true;
        }else{
            factura=false;
        }
        return factura;
    }

}