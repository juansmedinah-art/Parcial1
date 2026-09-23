import java.time.LocalDate;

public class Compras {
    private int codigoCompras;
    private LocalDate fechaDeRealizacion;
    private double valorTtotal;
    private MetodoPago metodoPago;

    public Compras(int codigoCompras, LocalDate fechaDeRealizacion, double valorTtotal, MetodoPago metodoPago) {
        this.codigoCompras = codigoCompras;
        this.fechaDeRealizacion = fechaDeRealizacion;
        this.valorTtotal = valorTtotal;
        this.metodoPago = metodoPago;
    }

    @Override
    public String toString() {
        return "Compras{" +
                "codigoCompras=" + codigoCompras +
                ", fechaDeRealizacion=" + fechaDeRealizacion +
                ", valorTtotal=" + valorTtotal +
                ", metodoPago=" + metodoPago +
                '}';
    }

    public int getCodigoCompras() {
        return codigoCompras;
    }

    public void setCodigoCompras(int codigoCompras) {
        this.codigoCompras = codigoCompras;
    }

    public LocalDate getFechaDeRealizacion() {
        return fechaDeRealizacion;
    }

    public void setFechaDeRealizacion(LocalDate fechaDeRealizacion) {
        this.fechaDeRealizacion = fechaDeRealizacion;
    }

    public double getValorTtotal() {
        return valorTtotal;
    }

    public void setValorTtotal(double valorTtotal) {
        this.valorTtotal = valorTtotal;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
}
