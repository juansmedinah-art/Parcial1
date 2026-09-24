import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDate;
import java.util.Scanner;

public class Aplicacion {
    static void main() {
        Scanner sc=new Scanner(System.in);

        Supermercado supermercado= new Supermercado("MarketPlus", "Carrera 15 calle 47",3713278);

        int opcion;
        do{
            System.out.println("====CLIENTES====");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Actualizar clientes");
            System.out.println("3. Buscar cliente");
            System.out.println("4. Mostrar clientes");
            System.out.println("5. Eliminar cliente");
            System.out.println("====PRODUCTOS=====");
            System.out.println("6. Mostrar productos");
            System.out.println("7. Registrar Producto");
            System.out.println("8. Actualizar producto");
            System.out.println("9. Eliminar producto");
            System.out.println("====COMPRAS=====");
            System.out.println("10. Realizar compra");
            System.out.println("11. Consultar compras de un cliente");
            System.out.println("=====REPORTES=====");
            System.out.println("12. Total vendido por una fecha");
            System.out.println("0. Salir");
            System.out.println("Seleccione una opcion: ");

            opcion=sc.nextInt();
            sc.nextLine();

            switch(opcion){
                case 1:
                    System.out.println("----Registrar cliente----");

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


                case 2:
                    System.out.println("----Actualizar cliente-----");

                    System.out.println("Documento cliente: ");
                    int documentoActualizar=sc.nextInt();

                    System.out.println("Nuevo nombre del cliente: ");
                    String nuevoNombre= sc.nextLine();

                    System.out.println("Nuevo telefono: ");
                    int nuevoTelefono=sc.nextInt();


                    System.out.println("Nuevo correo: ");
                    String nuevoCorreo=sc.nextLine();

                    Clientes clienteActualizado=new Clientes(nuevoNombre, documentoActualizar, nuevoTelefono, nuevoCorreo);

                    if(supermercado.actualizarCliente(documentoActualizar, clienteActualizado)){
                        System.out.println("cliente actualizado correctamente.");

                    }else {
                        System.out.println("El cliente no existe");
                    }
                    break;

                case 3:
                    System.out.println("----Buscar cliente----");
                    System.out.println("digite el documento del cliente");
                    int documento1 = sc.nextInt();
                    sc.nextLine();

                    boolean encontrado = false;
                    for (Clientes cliente1 : supermercado.getListaClientes()) {
                        if (cliente1.getDocumento() == documento1) {
                            System.out.println("El cliente se encuentra registrado: ");
                            System.out.println(cliente1);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("El cliente no se encuentra registrado");
                    }
                break;

                case 4:
                    System.out.println("----Mostrar clientes----");
                    for(Clientes clientesLista: supermercado.getListaClientes()){
                        System.out.println(clientesLista);
                    }
                    break;

                case 5:
                    System.out.println("----Eliminar cliente----");

                    System.out.println("Documento del cliente a eliminar: ");
                    int documentoEliminado=sc.nextInt();

                    if(supermercado.eliminarCliente(documentoEliminado)){
                        System.out.println("El cliente ha sido eliminado correctamente");

                    }else{
                        System.out.println("cliente no encontrado");
                    }
                    break;

                case  6:
                    System.out.println("----Mostrar productos----");
                    for(Productos productosLista: supermercado.getListaProductos()){
                        System.out.println(productosLista);
                    }
                    break;

                case 7:
                    System.out.println("----Registrar producto----");

                    System.out.println("Digite el nombre del producto: ");
                    String nombreProducto=sc.nextLine();
                    System.out.println("Digite el codigo del producto: ");
                    int codigoProducto=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite la categoria del producto: ");
                    int i=1;
                    for (Categoria catetegoria: Categoria.values()){
                        System.out.println(i+". "+catetegoria);
                        i++;
                    }
                    int opcionCategoria= sc.nextInt();
                    sc.nextLine();
                    Categoria categoria=null;
                    switch (opcionCategoria){
                        case 1:
                            categoria=Categoria.ALIMENTOS;
                            break;
                        case 2:
                            categoria=Categoria.BEBIDAS;
                            break;
                        case 3:
                            categoria=Categoria.ASEO;
                            break;
                        case 4:
                            categoria=Categoria.CUIDADO_PERSONAL;
                            break;
                        default:
                            System.out.println("opcion no valida");

                    }

                    sc.nextLine();
                    System.out.println("Digite el precio unitario del producto: ");
                    double preciounitario=sc.nextDouble();
                    System.out.println("Digite la cantidad de producto que hay(stock)");
                    int stock= sc.nextInt();

                    Productos producto= new Productos(codigoProducto, nombreProducto, categoria, preciounitario, stock);

                    boolean validacionProducto=supermercado.registrarProductos(producto);

                    if(validacionProducto==true){
                        System.out.println("Producto registrado exitosamente");
                    }else{
                        System.out.println("Producto ya existe en el sistema");
                    }

                    break;

                case 8:
                    System.out.println("----Actualizar producro-----");

                    System.out.println("Codigo producto: ");
                    int codigoPActualizar=sc.nextInt();

                    System.out.println("Nuevo nombre del producto");
                    String nuevoNombreP=sc.nextLine();

                    System.out.println("Nueva categoria del prodcuto: ");
                    int j=1;
                    for (Categoria catetegoria: Categoria.values()){
                        System.out.println(j+". "+catetegoria);
                        j++;
                    }
                    int opcionCategoriaActualizada= sc.nextInt();
                    sc.nextLine();
                    Categoria categoriaActualizada=null;
                    switch (opcionCategoriaActualizada){
                        case 1:
                            categoriaActualizada=Categoria.ALIMENTOS;
                            break;
                        case 2:
                            categoriaActualizada=Categoria.BEBIDAS;
                            break;
                        case 3:
                            categoriaActualizada=Categoria.ASEO;
                            break;
                        case 4:
                            categoriaActualizada=Categoria.CUIDADO_PERSONAL;
                            break;
                        default:
                            System.out.println("opcion no valida");

                    }

                    System.out.println("Nuevo precio unitario: ");
                    double nuevoPrecioUnitario=sc.nextDouble();
                    sc.nextLine();


                    System.out.println("Nuevo stock: ");
                    int nuevoStock=sc.nextInt();

                    Productos productoActualizado=new Productos(codigoPActualizar, nuevoNombreP,  categoriaActualizada, nuevoPrecioUnitario, nuevoStock);

                    if(supermercado.actualizarProducto(codigoPActualizar, productoActualizado)){
                        System.out.println("producto actualizado correctamente.");

                    }else {
                        System.out.println("El producto no existe");
                    }
                    break;


                case 9:
                    System.out.println("----Eliminar Producto----");

                    System.out.println("Codigo del producto a eliminar: ");
                    int codigoPEliminado=sc.nextInt();

                    if(supermercado.eliminarProducto(codigoPEliminado)){
                        System.out.println("El producto ha sido eliminado correctamente");

                    }else{
                        System.out.println("Producto no encontrado");
                    }
                    break;

                case 10:
                    System.out.println("----Realizar compra----");
                    System.out.println("Digite el documento del cliente: ");
                    int documentoCompra = sc.nextInt();
                    sc.nextLine();

                    Clientes clienteCompra = null;
                    for (Clientes clienteActual : supermercado.getListaClientes()) {
                        if (clienteActual.getDocumento() == documentoCompra) {
                            clienteCompra = clienteActual;
                            break;
                        }
                    }

                    if (clienteCompra == null) {
                        System.out.println("Cliente no encontrado");
                        break;
                    }

                    System.out.println("Seleccione el metodo de pago: ");
                    int numeroOpcionPago = 1;
                    for (MetodoPago metodoPagoDisponible : MetodoPago.values()) {
                        System.out.println(numeroOpcionPago + ". " + metodoPagoDisponible);
                        numeroOpcionPago++;
                    }

                    int opcionPago = sc.nextInt();
                    sc.nextLine();

                    MetodoPago metodoPagoSeleccionado = null;
                    switch (opcionPago) {
                        case 1:
                            metodoPagoSeleccionado = MetodoPago.EFECTIVO;
                            break;
                        case 2:
                            metodoPagoSeleccionado = MetodoPago.TARJETA;
                            break;
                        case 3:
                            metodoPagoSeleccionado = MetodoPago.TRANSFERENCIA_BANCARIA;
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }

                    int codigoCompra = supermercado.getListaCompras().size() + 1;
                    Compras compraActual = new Compras(codigoCompra, LocalDate.now(), 0, metodoPagoSeleccionado);

                    String seguirAgregando = "s";
                    while (seguirAgregando.equalsIgnoreCase("s")) {
                        System.out.println("Digite el codigo del producto: ");
                        int codigoProductoCompra = sc.nextInt();
                        sc.nextLine();

                        Productos productoEncontrado = null;
                        for (Productos productoDigitado : supermercado.getListaProductos()) {
                            if (productoDigitado.getCodigoProducto() == codigoProductoCompra) {
                                productoEncontrado = productoDigitado;
                                break;
                            }
                        }

                        if (productoEncontrado == null) {
                            System.out.println("Producto no encontrado");
                        } else if (compraActual.agregarProducto(productoEncontrado)) {
                            System.out.println("Producto agregado a la compra");
                        } else {
                            System.out.println("No hay stock disponible");
                        }

                        System.out.println("Desea agregar otro producto? (s/n)");
                        seguirAgregando = sc.nextLine();
                    }

                    if (supermercado.registrarCompra(documentoCompra, compraActual)) {
                        System.out.println("Compra realizada con exito. Total: " + compraActual.getValorTotal());
                    } else {
                        System.out.println("No hay ningun producto digitado, la compra sera cancelada");
                    }
                    break;

                case 11:
                    System.out.println("----Consultar compras de un cliente----");
                    System.out.println("Digite el documento del cliente: ");
                    int documentoConsulta = sc.nextInt();
                    sc.nextLine();

                    if (supermercado.consultarCompras(documentoConsulta) != null && !supermercado.consultarCompras(documentoConsulta).isEmpty()) {
                        System.out.println("Compras del cliente: ");
                        for (Compras compraDigitada : supermercado.consultarCompras(documentoConsulta)) {
                            System.out.println(compraDigitada);
                        }
                    } else {
                        System.out.println("El cliente no se encuentra registrado o no tiene compras");
                    }
                    break;

                case 12:
                    System.out.println("===Total vendido pro una fecha===");
                    System.out.println("Digite la fecha en formato año-mes-dia");
                    LocalDate reporteFecha=LocalDate.parse(sc.nextLine());

                    double totalVendido= supermercado.calcularVentasPorFecha(reporteFecha);

                    System.out.println("El total vendido por la fecha "+reporteFecha+" es: "+totalVendido);
                    break;

                case 0:
                    System.out.println("programa actualizado");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        }while(opcion !=0);

    }
}
