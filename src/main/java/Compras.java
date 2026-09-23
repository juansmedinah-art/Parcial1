import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Compras {
    private int codigoCompra;
    private LocalDate fechaDeRealizacion;
    private double valorTotal;
    private MetodoPago metodoPago;
    private List<Productos> listaProductos;

    public Compras(int codigoCompras, LocalDate fechaDeRealizacion, double valorTtotal, MetodoPago metodoPago) {
        this.codigoCompra = codigoCompras;
        this.fechaDeRealizacion = fechaDeRealizacion;
        this.valorTotal = valorTtotal;
        this.metodoPago = metodoPago;

        this.listaProductos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Compras{" +
                "codigoCompra=" + codigoCompra +
                ", fechaDeRealizacion=" + fechaDeRealizacion +
                ", valorTtotal=" + valorTotal +
                ", metodoPago=" + metodoPago +
                '}';
    }

    public int getCodigoCompras() {
        return codigoCompra;
    }

    public void setCodigoCompras(int codigoCompras) {
        this.codigoCompra = codigoCompras;
    }

    public LocalDate getFechaDeRealizacion() {
        return fechaDeRealizacion;
    }

    public void setFechaDeRealizacion(LocalDate fechaDeRealizacion) {
        this.fechaDeRealizacion = fechaDeRealizacion;
    }

    public double getValorTtotal() {
        return valorTotal;
    }

    public void setValorTtotal(double valorTtotal) {
        this.valorTotal = valorTtotal;
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

    //Metodo para agregar un porducto a la compar
}