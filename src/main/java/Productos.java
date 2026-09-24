public class Productos {
    private int codigoProducto;
    private String nombre;
    private Categoria categoria;
    private double precioUnitario;
    private int stock;

    public Productos(int codigoProducto, String nombre, Categoria categoria, double precioUnitario, int stock) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "codigoProducto=" + codigoProducto +
                ", stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", categoria=" + categoria +
                '}';
    }
}