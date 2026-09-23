import java.util.ArrayList;
import java.util.List;

    public class Clientes {
        private String nombre;
        private int documento;
        private int telefono;
        private String correo;

        private List<Compras> ListaCompras;

        public Clientes(String nombre, int documento, int telefono, String correo) {
            this.nombre = nombre;
            this.documento = documento;
            this.telefono = telefono;
            this.correo = correo;

            this.ListaCompras=new ArrayList<>();

        }

        @Override
        public String toString() {
            return "Clientes{" +
                    "nombre='" + nombre + '\'' +
                    ", documento=" + documento +
                    ", telefono=" + telefono +
                    ", correo='" + correo + '\'' +
                    ", Lista de compras"+ListaCompras+'\''+
                    '}';
        }


        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getDocumento() {
            return documento;
        }

        public void setDocumento(int documento) {
            this.documento = documento;
        }

        public int getTelefono() {
            return telefono;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public List<Compras> getListaCompras() {
            return ListaCompras;
        }

        public void setListaCompras(List<Compras> listaCompras) {
            ListaCompras = listaCompras;
        }
    }
