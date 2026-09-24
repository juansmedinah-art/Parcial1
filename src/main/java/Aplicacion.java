import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Aplicacion {
    static void main() {
        Scanner sc=new Scanner(System.in);

        Supermercado supermercado= new Supermercado("MarketPlus", "Carrera 15 calle 47",3713278);

        int opcion;
        do{
            System.out.println("====CLIENTES====");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Buscar cliente");
            System.out.println("====PRODUCTOS=====");
            System.out.println("3. Registrar Producto");
            System.out.println("====COMPRAS=====");
            System.out.println("4. Realizar compra");
            System.out.println("5. Consultar compras de un cliente");
            System.out.println("=====REPORTES=====");
            System.out.println("6. Total vendido por una fecha");
            System.out.println("0. Salir");
            System.out.println("Seleccione una opcion: ");

            opcion=sc.nextInt();
            sc.nextLine();

            switch(opcion){
                case 1:
                    System.out.println("Digite el nombre del cliente: ");
                    String nombre=sc.nextLine();
                    System.out.println("Digite el documento del cliente: ");
                    int documento=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite el numero telefonico del cliente: ");
                    int numero=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite el correo del cliente: ");
                    String correo=sc.nextLine();

                    Clientes cliente= new Clientes(nombre, documento, numero, correo);

                    boolean validacion=supermercado.registrarCliente(cliente);

                    if(validacion==true){
                        System.out.println("Cliente registrado exitosamente");
                    }else{
                        System.out.println("Cliente ya existe en el sistema");
                    }

                    break;

            }

        }

    }
}
