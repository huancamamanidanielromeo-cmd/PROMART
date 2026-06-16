import java.util.Scanner;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.YearMonth;
import java.time.format.DateTimeParseException;
import java.time.LocalDateTime;




public class PROMART {

    static Scanner escaner = new Scanner(System.in);

    //datos del usuario xd
    static String correoRegistrado = "";
    static String correoLogin     = "";
    static String contraRegistrada = "";
    static String nombreTitular   = "";
    static String apellidosTitular = "";
    static String tipoDocumento   = "";
    static String numDocumento    = "";
    static String telefonoMovil   = "";
    static String departamento    = "";
    static String provincia       = "";
    static String distrito        = "";
    static String nombreProductoSeleccionado = "";
    static double precio = 0.0;


    
//abel

    
    static ArrayList<String> nombresLimpieza   = new ArrayList<>();
    static ArrayList<Double> preciosLimpieza   = new ArrayList<>();

    static ArrayList<String> nombresTecnologia = new ArrayList<>();
    static ArrayList<Double> preciosTecnologia = new ArrayList<>();

    static ArrayList<String> nombresElectrohogar = new ArrayList<>();
    static ArrayList<Double> preciosElectrohogar = new ArrayList<>();

    static ArrayList<String> nombresMuebles  = new ArrayList<>();
    static ArrayList<Double> preciosMuebles  = new ArrayList<>();

    static ArrayList<String> nombresTerraza  = new ArrayList<>();
    static ArrayList<Double> preciosTerraza  = new ArrayList<>();

    static ArrayList<String> nombresBano     = new ArrayList<>();
    static ArrayList<Double> preciosBano     = new ArrayList<>();

    static ArrayList<String> nombresHerramientas = new ArrayList<>();
    static ArrayList<Double> preciosHerramientas = new ArrayList<>();

    static ArrayList<String> nombresPisos    = new ArrayList<>();
    static ArrayList<Double> preciosPisos    = new ArrayList<>();


    
    //adrian
    static ArrayList<String> nombresIluminacion   = new ArrayList<>();
    static ArrayList<Double> preciosIluminacion   = new ArrayList<>();

    static ArrayList<String> nombresOrganizacion  = new ArrayList<>();
    static ArrayList<Double> preciosOrganizacion  = new ArrayList<>();

    static ArrayList<String> nombresCocina        = new ArrayList<>();
    static ArrayList<Double> preciosCocina        = new ArrayList<>();

    static ArrayList<String> nombresDormitorio    = new ArrayList<>();
    static ArrayList<Double> preciosDormitorio    = new ArrayList<>();

    static ArrayList<String> nombresConstruccion  = new ArrayList<>();
    static ArrayList<Double> preciosConstruccion  = new ArrayList<>();

    static ArrayList<String> nombresElectricidad  = new ArrayList<>();
    static ArrayList<Double> preciosElectricidad  = new ArrayList<>();

    static ArrayList<String> nombresGasfiteria    = new ArrayList<>();
    static ArrayList<Double> preciosGasfiteria    = new ArrayList<>();

    static ArrayList<String> nombresPinturas      = new ArrayList<>();
    static ArrayList<Double> preciosPinturas      = new ArrayList<>();

    //zamir


    
    //ferret
    static ArrayList<String> nombresPuertas       = new ArrayList<>();
    static ArrayList<Double> preciosPuertas       = new ArrayList<>();
    static ArrayList<String> nombresCerraduras    = new ArrayList<>();
    static ArrayList<Double> preciosCerraduras    = new ArrayList<>();
    static ArrayList<String> nombresHerramientasFerre = new ArrayList<>();
    static ArrayList<Double> preciosHerramientasFerre = new ArrayList<>();

    //Automotriz
    static ArrayList<String> nombresAccAuto       = new ArrayList<>();
    static ArrayList<Double> preciosAccAuto       = new ArrayList<>();
    static ArrayList<String> nombresHerramMec     = new ArrayList<>();
    static ArrayList<Double> preciosHerramMec     = new ArrayList<>();
    static ArrayList<String> nombresLlantas       = new ArrayList<>();
    static ArrayList<Double> preciosLlantas       = new ArrayList<>();

    //jardinería
    static ArrayList<String> nombresPlantas       = new ArrayList<>();
    static ArrayList<Double> preciosPlantas       = new ArrayList<>();
    static ArrayList<String> nombresHerramJard    = new ArrayList<>();
    static ArrayList<Double> preciosHerramJard    = new ArrayList<>();
    static ArrayList<String> nombresRiego         = new ArrayList<>();
    static ArrayList<Double> preciosRiego         = new ArrayList<>();

    //oficina
    static ArrayList<String> nombresUtiles        = new ArrayList<>();
    static ArrayList<Double> preciosUtiles        = new ArrayList<>();
    static ArrayList<String> nombresComputadoras  = new ArrayList<>();
    static ArrayList<Double> preciosComputadoras  = new ArrayList<>();
    static ArrayList<String> nombresMueblesOfic   = new ArrayList<>();
    static ArrayList<Double> preciosMueblesOfic   = new ArrayList<>();

    // cat infantil
    static ArrayList<String> nombresJuguetes      = new ArrayList<>();
    static ArrayList<Double> preciosJuguetes      = new ArrayList<>();
    static ArrayList<String> nombresRopaInfantil  = new ArrayList<>();
    static ArrayList<Double> preciosRopaInfantil  = new ArrayList<>();
    static ArrayList<String> nombresMueblesInfant = new ArrayList<>();
    static ArrayList<Double> preciosMueblesInfant = new ArrayList<>();

    // cat salud y deportes
    static ArrayList<String> nombresGimnasio      = new ArrayList<>();
    static ArrayList<Double> preciosGimnasio      = new ArrayList<>();
    static ArrayList<String> nombresBicicletas    = new ArrayList<>();
    static ArrayList<Double> preciosBicicletas    = new ArrayList<>();
    static ArrayList<String> nombresVitaminas     = new ArrayList<>();
    static ArrayList<Double> preciosVitaminas     = new ArrayList<>();

    //cat mascotas
    static ArrayList<String> nombresComidaPerros  = new ArrayList<>();
    static ArrayList<Double> preciosComidaPerros  = new ArrayList<>();
    static ArrayList<String> nombresComidaGatos   = new ArrayList<>();
    static ArrayList<Double> preciosComidaGatos   = new ArrayList<>();
    static ArrayList<String> nombresAccMascotas   = new ArrayList<>();
    static ArrayList<Double> preciosAccMascotas   = new ArrayList<>();








    

  








    
    public static void main(String[] args) {
        inicializarDatos();

        String contraLogin = "";
        int opcionMenu = 0;




        
        while (opcionMenu != 4) {
            System.out.println();
            System.out.println("___________________ BIENVENIDO A PROMART __________________");
            System.out.println("1. Iniciar Sesion");
            System.out.println("2. Registrarse (Crear Cuenta)");
            System.out.println("3. Entrar como Invitado");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcionMenu = escaner.nextInt();



            
            switch (opcionMenu) {
                case 1:
                    System.out.println();
                    System.out.println("___________________ INICIO DE SESIÓN __________________");
                    System.out.print("Introduce tu correo: ");
                    correoLogin = escaner.next();
                    System.out.print("Introduce tu contrasena: ");
                    contraLogin = escaner.next();






                    
                    if (correoLogin.equals(correoRegistrado) && contraLogin.equals(contraRegistrada) && !correoRegistrado.equals("")) {
                        System.out.println("¡Login exitoso! Bienvenido de nuevo.");
                        menuCategorias();
                    } else if (correoLogin.equals("admin@gmail.com") && contraLogin.equals("12345678@")) {
                        System.out.println("Ingreso exitoso a Promart. Bienvenido Admin.");
                        menuCategorias();
                    } else {
                        System.out.println("Error: Correo o contrasena incorrectos, o no estas registrado.");
                    }
                    break;

                case 2:
                    System.out.println();
                    System.out.println("___________________ REGISTRO DE USUARIO ___________________");



                    
                    boolean correoValido = false;
                    do {
                        System.out.print("Ingresa tu nuevo correo: ");
                        correoRegistrado = escaner.next();
                        if (correoRegistrado.contains("@") && correoRegistrado.endsWith(".com")) {
                            correoValido = true;
                        } else {
                            System.out.println("Error: El correo debe contener '@' y terminar en '.com'");
                        }
                    } while (!correoValido);


                    
                    String clave1 = "", clave2 = "";
                    boolean passValida = false;
                    do {
                        System.out.print("Ingresa tu contrasena: ");
                        clave1 = escaner.next();
                        System.out.print("Repite tu contrasena: ");
                        clave2 = escaner.next();
                        boolean estructuraPassOk = clave1.length() >= 8 && (clave1.contains("#") || clave1.contains("@"));
                        if (!clave1.equals(clave2)) {
                            System.out.println("Las contrasenas no coinciden. Intenta otra vez.");
                        } else if (!estructuraPassOk) {
                            System.out.println("Error: La contraseña debe tener mínimo 8 caracteres y contener '#' o '@'");
                        } else {
                            passValida = true;
                        }
                    } while (!passValida);

                    contraRegistrada = clave1;
                    System.out.println("¡Cuenta creada con exito! Ahora puedes comprar.");
                    menuCategorias();
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Entrando en modo Invitado...");
                    menuCategorias();
                    break;

                case 4:
                    System.out.println("Saliendo del sistema... ¡Gracias por visitarnos!");
                    break;

                default:
                    System.out.println("Opcion no valida. Pon un numero del 1 al 4.");
                    break;
            }
        }
        escaner.close();
    }





    
    public static void inicializarDatos() {


        
        //1.LIMPIEZ
    
        nombresLimpieza.add("Limpiador Multipropósito con Vinagre 650 ml Daryza");   preciosLimpieza.add(9.90);
        nombresLimpieza.add("Pinesol 4.5 Lt");                                        preciosLimpieza.add(44.50);
        nombresLimpieza.add("Destructor De Sarro Pato Cítrico 710ml");                preciosLimpieza.add(25.00);
        nombresLimpieza.add("Pato Destructor de Sarro 710 Ml");                       preciosLimpieza.add(25.00);
        nombresLimpieza.add("Limpiador Lavadoras Impecables Binner 300 Ml");          preciosLimpieza.add(22.90);
        nombresLimpieza.add("Desinfectante baños y duchas 500ml + repuesto Binner");  preciosLimpieza.add(19.90);
        nombresLimpieza.add("Desinfectante Aire Binner Eucalipto Limon x 2 Und");     preciosLimpieza.add(28.90);
        nombresLimpieza.add("Saniquat 500 desinfectante 1 litro");                    preciosLimpieza.add(107.40);
        nombresLimpieza.add("Desinfectante Pino Daryza 5gl");                         preciosLimpieza.add(69.90);
        nombresLimpieza.add("Toallas Desinfectantes Clorox Expert 30 Unid");          preciosLimpieza.add(11.90);



        
        //2.TECNOLOGÍA
        nombresTecnologia.add("Laptop Lenovo Ideapad Slim 3 AMD Ryzen 5 7520U 8GB 512GB SSD"); preciosTecnologia.add(1849.00);
        nombresTecnologia.add("Combo Laptop HP 250 G10 Intel Core i3 N305 8GB 256GB SSD");     preciosTecnologia.add(1619.00);
        nombresTecnologia.add("Laptop Lenovo IdeaPad Slim 3 15IAH8 Intel Core i5 8GB 512GB");  preciosTecnologia.add(2079.00);
        nombresTecnologia.add("Laptop HP 250 G10 Core i7-1355U 8GB DDR4 512GB SSD");           preciosTecnologia.add(3099.00);
        nombresTecnologia.add("Macbook Air 13in Chip M5 512GB SSD 16GB RAM STARLIGHT");        preciosTecnologia.add(5299.00);
        nombresTecnologia.add("Laptop ASUS TUF Gaming A15 AMD Ryzen 7 512GB 8GB RTX3050");     preciosTecnologia.add(3199.00);
        nombresTecnologia.add("Laptop HP 250R G10 Intel Core 5 120U 16GB RAM 512 SSD");        preciosTecnologia.add(2399.00);
        nombresTecnologia.add("Laptop HP 255 G10 AMD Ryzen 3 7320U 8GB RAM 256GB SSD");        preciosTecnologia.add(1599.00);
        nombresTecnologia.add("Laptop HP 255 G10 AMD Ryzen 3 7320U 8GB RAM 256GB SSD v2");     preciosTecnologia.add(1599.00);
        nombresTecnologia.add("Laptop HP 250R G10 Intel Core 5 120U 16GB RAM 512 SSD v2");     preciosTecnologia.add(2399.00);


        
        //3.ELECTROHOGAR
        nombresElectrohogar.add("Lavadora LG WT13OBVTB 13Kg TurboDrum");                preciosElectrohogar.add(1249.00);
        nombresElectrohogar.add("Lavadora LG WT19OBVTB 19Kg Carga Superior");           preciosElectrohogar.add(1449.00);
        nombresElectrohogar.add("Lavadora Samsung WA19CG6441BDPE 19Kg EcoBubble");      preciosElectrohogar.add(2099.00);
        nombresElectrohogar.add("Lavadora Indurama LRI19CRI 19Kg Inverter");             preciosElectrohogar.add(1299.00);
        nombresElectrohogar.add("Lavadora Electrolux EWIP15F2XSWB 15Kg");               preciosElectrohogar.add(1799.00);
        nombresElectrohogar.add("Lavadora LG WT9BVTB 9Kg Carga Superior");              preciosElectrohogar.add(999.00);
        nombresElectrohogar.add("Lavadora Samsung 15Kg AI EcoBubble");                  preciosElectrohogar.add(1499.00);
        nombresElectrohogar.add("Lavadora Indurama LRI-18DGR 18Kg");                    preciosElectrohogar.add(1599.00);
        nombresElectrohogar.add("Lavadora Mabe 16Kg Semiautomática");                   preciosElectrohogar.add(999.00);
        nombresElectrohogar.add("Lavadora Blackline SPBL16TL 16Kg");                    preciosElectrohogar.add(799.00);



        
        //4.MUEBLES
        nombresMuebles.add("Juego de Sala Spring 3-2 Tela Beige Forli");          preciosMuebles.add(3598.00);
        nombresMuebles.add("Juego de Sala Lineal Mundial 3-2 Tela Plata Forli");  preciosMuebles.add(3318.00);
        nombresMuebles.add("Juego de Sala Montiano Marrón 3-2-1 Forli");          preciosMuebles.add(4598.00);
        nombresMuebles.add("Juego de Sala Montiano 2-1 Negro Forli");             preciosMuebles.add(2518.00);
        nombresMuebles.add("Juego de Sala Spring 3-2 Tela Mando Forli");          preciosMuebles.add(3598.00);
        nombresMuebles.add("Juego de Sala Aliyah 3-2 Tabaco Forli");              preciosMuebles.add(4798.00);
        nombresMuebles.add("Juego de Sala Montiano 3-2 Marrón Forli");            preciosMuebles.add(3638.00);
        nombresMuebles.add("Juego de Sala Montiano 3-2 Negro Forli");             preciosMuebles.add(3638.00);
        nombresMuebles.add("Juego de Sala Havana 2-1-1 Plata + Mesa");            preciosMuebles.add(2798.00);
        nombresMuebles.add("Juego de Sala Montiano 3-2-1 Marrón Forli");          preciosMuebles.add(2518.00);



        
        //5.TERRAZAS Y AIRE LIBRE
        nombresTerraza.add("Parrilla a Gas 4 Quemadores");       preciosTerraza.add(899.00);
        nombresTerraza.add("Juego de Terraza Mesa + 4 Sillas");  preciosTerraza.add(1299.00);
        nombresTerraza.add("Piscina Inflable Bestway");           preciosTerraza.add(249.00);
        nombresTerraza.add("Toldo Retráctil 3x3m");               preciosTerraza.add(599.00);
        nombresTerraza.add("Hamaca con Soporte");                  preciosTerraza.add(159.00);
        nombresTerraza.add("Set de Muebles Rattan");               preciosTerraza.add(1899.00);
        nombresTerraza.add("Fogón Exterior");                      preciosTerraza.add(399.00);
        nombresTerraza.add("Cortadora de Césped");                 preciosTerraza.add(449.00);
        nombresTerraza.add("Sombrilla Playa 2.5m");                preciosTerraza.add(99.00);




        
        //6.BAÑO
        nombresBano.add("Combo Sanitario + Lavatorio Blanco");           preciosBano.add(349.00);
        nombresBano.add("Gabinete de Baño con Espejo");                  preciosBano.add(199.00);
        nombresBano.add("Mezcladora para Ducha Cromada");                preciosBano.add(129.00);
        nombresBano.add("Set de Accesorios de Baño (5 pzas)");           preciosBano.add(49.00);
        nombresBano.add("Mampara de Vidrio Templado para Ducha");        preciosBano.add(499.00);
        nombresBano.add("Extractor de Aire para Baño");                  preciosBano.add(79.00);



        
        //7.HERRAMIENTAS
        nombresHerramientas.add("Rotomartillo Inalámbrico Bosch 20V");                    preciosHerramientas.add(649.00);
        nombresHerramientas.add("Amoladora Angular DeWalt 4-1/2\"");                      preciosHerramientas.add(329.00);
        nombresHerramientas.add("Caja de Herramientas Completa Stanley (150 pzas)");      preciosHerramientas.add(299.00);
        nombresHerramientas.add("Set de Destornilladores Tramontina (6 pzas)");           preciosHerramientas.add(39.00);
        nombresHerramientas.add("Medidor de Distancia Láser Makita");                     preciosHerramientas.add(249.00);




        
        //8.PISOS Y CERÁMICOS
        nombresPisos.add("Porcelanato Pulido 60x60 cm Gris (m2)");              preciosPisos.add(39.90);
        nombresPisos.add("Piso Laminado Madera 8mm (m2)");                      preciosPisos.add(45.90);
        nombresPisos.add("Cerámico Pared Blanco Brillante 30x45 cm (m2)");      preciosPisos.add(24.90);
        nombresPisos.add("Pegamento para Porcelanato Bolsa 25kg");               preciosPisos.add(32.90);
        nombresPisos.add("Fragua para Cerámicos 1kg");                           preciosPisos.add(7.90);




        
        //9.ILUMINACIÓN
        nombresIluminacion.add("Foco Vintage G45 E27 1W Luz Cálida Clear x6 und Orange"); preciosIluminacion.add(19.90);
        nombresIluminacion.add("Foco Led Smart Wifi Cla60 220V 7W E27 Ledvance");         preciosIluminacion.add(25.00);
        nombresIluminacion.add("Foco High Power Led E27 48W Luz Fría Orange");             preciosIluminacion.add(19.90);
        nombresIluminacion.add("Foco LED UFO 34W Luz Fría Orange");                        preciosIluminacion.add(39.90);
        nombresIluminacion.add("Foco LED Smart Nexxt Nhb-C120MRGB");                       preciosIluminacion.add(39.00);
        nombresIluminacion.add("Foco LED High Power Orange 18W Luz Fría");                 preciosIluminacion.add(9.90);
        nombresIluminacion.add("Foco LED Philips Luz Blanca x2 14W E27 Ahorro Energ.");    preciosIluminacion.add(21.90);
        nombresIluminacion.add("Foco Werken Smart");                                        preciosIluminacion.add(25.00);
        nombresIluminacion.add("Foco LED UFO Orange E27 15W Luz Fría");                    preciosIluminacion.add(12.90);
        nombresIluminacion.add("Pack x2 Foco Led G95 7W Luz Cálida Ámbar Orange");        preciosIluminacion.add(29.90);




        
        //10.ORGANIZACIÓN Y DECOHOGAR
        nombresOrganizacion.add("Alfombra Juego Mundo 80x150cm");                              preciosOrganizacion.add(27.00);
        nombresOrganizacion.add("Lámpara Colgante Calada 18cm Alto Astronauta");               preciosOrganizacion.add(35.60);
        nombresOrganizacion.add("Juego x6 piezas Vaso Alto Labrado 330ml Y6015");             preciosOrganizacion.add(27.00);
        nombresOrganizacion.add("Farol Rectangular Negro 11x24cm Decore");                     preciosOrganizacion.add(39.92);
        nombresOrganizacion.add("Lámpara de Mesa Trama Ver 28cm Decore");                      preciosOrganizacion.add(35.60);
        nombresOrganizacion.add("Lámpara Animal Print con Base de Metal 15x20x145cm");         preciosOrganizacion.add(60.40);
        nombresOrganizacion.add("Florero Esencia Acanalada 19cm Decore");                      preciosOrganizacion.add(31.92);
        nombresOrganizacion.add("Florero Grande Elegant Decore");                              preciosOrganizacion.add(59.92);
        nombresOrganizacion.add("Cuadro Canva bar & drinks 30x40cm Decore");                   preciosOrganizacion.add(23.92);
        nombresOrganizacion.add("Candelabro 12cm - Diseño Aleatorio Orange");                  preciosOrganizacion.add(15.00);




        
        //11.COCINA
        nombresCocina.add("Horno Microondas LG 20L Negro");                       preciosCocina.add(389.00);
        nombresCocina.add("Licuadora Oster 2 Velocidades con Pulso");             preciosCocina.add(189.00);
        nombresCocina.add("Cocina a Gas Indurama 4 Hornillas");                   preciosCocina.add(899.00);
        nombresCocina.add("Arrocera Thomas 1.8 Litros");                          preciosCocina.add(149.00);
        nombresCocina.add("Extractor de Jugos Imaco Potente");                    preciosCocina.add(199.00);
        nombresCocina.add("Hervidor Eléctrico Record 1.7L Acero");                preciosCocina.add(79.00);
        nombresCocina.add("Sartén Antiadherente Tramontina 24cm");                preciosCocina.add(45.00);
        nombresCocina.add("Juego de Ollas Infinitum x5 piezas Record");           preciosCocina.add(259.00);
        nombresCocina.add("Set de Cuchillos de Cocina x6 piezas Carve");          preciosCocina.add(59.00);
        nombresCocina.add("Organizador de Platos Metálico Cromado");              preciosCocina.add(49.00);




        
        //12.ORMITORIO
        nombresDormitorio.add("Cama Box Tarima 4 Cajones PARAISO Pocket Star King");    preciosDormitorio.add(3499.00);
        nombresDormitorio.add("Dormitorio 4 Cajones PARAISO Pocket Max Queen");          preciosDormitorio.add(2899.00);
        nombresDormitorio.add("Cama Boxet Paraíso Blocks Su Majestad Queen Choc.");      preciosDormitorio.add(1999.00);
        nombresDormitorio.add("Cama Juvenil + Cabecera + Mesa Noche Janeiro Bl/Ng");     preciosDormitorio.add(4600.00);
        nombresDormitorio.add("Cama Boxet Paraíso Pocket Max 1.5 Plazas Champagne");    preciosDormitorio.add(2499.60);
        nombresDormitorio.add("Ropero Florencia 7 Puertas 1 Cajón MDP Castaño");        preciosDormitorio.add(329.00);
        nombresDormitorio.add("Ropero Bali Plus 6 Puertas MDP Canela/Blanco");           preciosDormitorio.add(349.00);
        nombresDormitorio.add("Tocador Charlotte 1 Cajón con Espejo Melamina Bl/Ng");    preciosDormitorio.add(764.00);
        nombresDormitorio.add("Cómoda Perú 4 cajones 1 puerta TV 40 Tuhome");           preciosDormitorio.add(599.00);
        nombresDormitorio.add("Cómoda Praga 3 Cajones 1 Puerta Abatible Wengue");       preciosDormitorio.add(450.00);




        
        //13.CONSTRUCCIÓN
        nombresConstruccion.add("Plancha de Drywall Gyplac Standard 3/8\" 1.22x2.44m");    preciosConstruccion.add(31.90);
        nombresConstruccion.add("Tablero melamina cendra escandinavo 18mm 7x8 Vesto");     preciosConstruccion.add(189.00);
        nombresConstruccion.add("Techo calamina metálica Roja 0.22mm 3.60x0.80m Werken"); preciosConstruccion.add(39.90);
        nombresConstruccion.add("Mortero de nivelacion Sikagrout 110 30kg");               preciosConstruccion.add(95.00);
        nombresConstruccion.add("Techo Policarbonato 5.5mm Clear 2.90x1.05m Poliligth");  preciosConstruccion.add(79.50);
        nombresConstruccion.add("Bloque de Vidrio Wave Azur 19x19x8cm Seves");            preciosConstruccion.add(28.90);
        nombresConstruccion.add("Ladrillo Pandereta Raya 10x14x22 cm");                   preciosConstruccion.add(1.35);
        nombresConstruccion.add("Baldosa de vidrio para piso 20x20cm Seves");             preciosConstruccion.add(29.90);
        nombresConstruccion.add("Trompo eléctrico 180 litros");                           preciosConstruccion.add(899.00);
        nombresConstruccion.add("Escalera Telescopica Fibra de Vidrio 24 Pasos");         preciosConstruccion.add(749.00);





        
        //14.ELECTRICIDAD
        nombresElectricidad.add("Cable THW-90 plus 450/750V 12 AWG Rojo 100m Indeco");    preciosElectricidad.add(215.00);
        nombresElectricidad.add("Linterna Repelente Camping 4 en 1 Amarillo");             preciosElectricidad.add(34.90);
        nombresElectricidad.add("Tomacorriente Doble Universal Orange Deco L/t");          preciosElectricidad.add(12.50);
        nombresElectricidad.add("Lámpara de emergencia Werken 2 luces 2.4w Pack x2");     preciosElectricidad.add(49.00);
        nombresElectricidad.add("Extensión 3 tomas tierra 3x18awg 5m Werken");            preciosElectricidad.add(29.90);
        nombresElectricidad.add("Kit Digital TKL Tablero 4 Polos Llave 2x25 + Medidor");  preciosElectricidad.add(69.00);
        nombresElectricidad.add("Interruptor Simple Bticino Dplus Blanco 10A 250V");       preciosElectricidad.add(31.92);
        nombresElectricidad.add("Kit de Alarma Seguridad Hikvision Minimun");              preciosElectricidad.add(449.00);
        nombresElectricidad.add("Cámara Hikvision 2Mp H.265 Wifi Nvs Kit 2 Bullet");      preciosElectricidad.add(399.00);
        nombresElectricidad.add("Llave Termomagnética Bipolar 2x25A Bticino");             preciosElectricidad.add(45.00);




        
        //15.GASFITERÍA
        nombresGasfiteria.add("Tanque de Agua Arena Rotoplas Plus 1100L + Kit");          preciosGasfiteria.add(749.00);
        nombresGasfiteria.add("Tanque de agua Pro 1100 litros Negro + Kit");              preciosGasfiteria.add(529.00);
        nombresGasfiteria.add("Electrobomba Periférica Werken 0.5 HP 32L/min Alum.");     preciosGasfiteria.add(129.00);
        nombresGasfiteria.add("Electrobomba Jet Werken 1 HP XJM101C Acero");              preciosGasfiteria.add(699.00);
        nombresGasfiteria.add("COMBO Tanque 1100L + Kit + Base metálica armable");        preciosGasfiteria.add(1608.00);
        nombresGasfiteria.add("Sistema Doble Pulsador Jet Werken");                       preciosGasfiteria.add(65.90);
        nombresGasfiteria.add("Llave doble manija para lavadora Werken");                 preciosGasfiteria.add(65.90);
        nombresGasfiteria.add("Mezcladora lavadero Monocomando Ocean Artic Vainsa");      preciosGasfiteria.add(849.90);
        nombresGasfiteria.add("COMBO Lavadero básico 1 poza 50x41cm + Llave Quadro");    preciosGasfiteria.add(179.80);
        nombresGasfiteria.add("Combo Lavadero Serpens 2 pozas 82x46 + Llave Galápagos"); preciosGasfiteria.add(389.00);


        
        //16.PINTURAS Y ACABADOS
        nombresPinturas.add("Pintura Látex CPP Pato Interiores Blanco 1 Balde");       preciosPinturas.add(145.00);
        nombresPinturas.add("Pintura Látex Vencedor Super Mate Blanco 1 Galón");       preciosPinturas.add(48.00);
        nombresPinturas.add("Esmalte Sintético Pato Orange Negro Gloss 1 Galón");      preciosPinturas.add(52.00);
        nombresPinturas.add("Imprimador para Paredes Fast Blanco 1 Balde");            preciosPinturas.add(85.00);
        nombresPinturas.add("Rodillo Antigota Profesional Mastodon 9 Pulgadas");       preciosPinturas.add(24.50);
        nombresPinturas.add("Brocha Premium Mango de Madera 3 Pulgadas Orange");       preciosPinturas.add(12.90);
        nombresPinturas.add("Thinner Acrílico Estándar Solven 1 Galón");               preciosPinturas.add(32.00);
        nombresPinturas.add("Base de Imprimación Sika Wall Cero Salitre 5 Litros");    preciosPinturas.add(65.00);
        nombresPinturas.add("Lija para Madera Grano 80 Norton x5 unidades");           preciosPinturas.add(8.50);
        nombresPinturas.add("Cinta Masking Tape Multipropósito Shurtape 2 Pulgadas");  preciosPinturas.add(9.90);






        

        
        nombresPuertas.add("Puerta de Madera");  preciosPuertas.add(150.00);
        nombresPuertas.add("Puerta de Metal");   preciosPuertas.add(250.00);
        nombresPuertas.add("Puerta de Vidrio");  preciosPuertas.add(350.00);
    


        
        nombresCerraduras.add("Cerradura de Puerta");       preciosCerraduras.add(30.00);
        nombresCerraduras.add("Cerradura de Seguridad");    preciosCerraduras.add(50.00);
        nombresCerraduras.add("Cerradura Electrónica");     preciosCerraduras.add(80.00);



        
        nombresHerramientasFerre.add("Martillo");      preciosHerramientasFerre.add(20.00);
        nombresHerramientasFerre.add("Taladro");       preciosHerramientasFerre.add(100.00);
        nombresHerramientasFerre.add("Llave de Tubo"); preciosHerramientasFerre.add(15.00);




        
        nombresAccAuto.add("Cubre Volante");      preciosAccAuto.add(20.00);
        nombresAccAuto.add("Alfombra de Auto");   preciosAccAuto.add(30.00);
        nombresAccAuto.add("GPS para Auto");      preciosAccAuto.add(150.00);



        
        nombresHerramMec.add("Llave de Cruz");               preciosHerramMec.add(50.00);
        nombresHerramMec.add("Gato Hidráulico de Botella");  preciosHerramMec.add(30.00);
        nombresHerramMec.add("Compresor de Aire");           preciosHerramMec.add(200.00);
        

        
        nombresLlantas.add("Llanta de Auto 14");  preciosLlantas.add(120.00);
        nombresLlantas.add("Llanta de Auto 15");  preciosLlantas.add(150.00);
        nombresLlantas.add("Llanta de Auto 16");  preciosLlantas.add(180.00);

        //jardin

        
        nombresPlantas.add("Planta de Interior");  preciosPlantas.add(20.00);
        nombresPlantas.add("Planta de Exterior");  preciosPlantas.add(30.00);
        nombresPlantas.add("Árbol Frutal");         preciosPlantas.add(50.00);

        
        //Herramientas 

        
        nombresHerramJard.add("Pala de Jardín");       preciosHerramJard.add(15.00);
        nombresHerramJard.add("Rastrillo Metálico");   preciosHerramJard.add(10.00);
        nombresHerramJard.add("Tijeras de Podar");     preciosHerramJard.add(20.00);
        
        // Riego


        
        nombresRiego.add("Manguera de Riego 15m");        preciosRiego.add(20.00);
        nombresRiego.add("Aspersor Giratorio");            preciosRiego.add(30.00);
        nombresRiego.add("Sistema de Riego Automático");   preciosRiego.add(150.00);


        
        // 20. OFICINA - Útiles

        
        nombresUtiles.add("Cuaderno Anillado A4");          preciosUtiles.add(12.90);
        nombresUtiles.add("Lapiceros Pack x3 Color");       preciosUtiles.add(19.90);
        nombresUtiles.add("Notas Adhesivas Post-it");       preciosUtiles.add(6.50);


        
        // Computadoras


        
        nombresComputadoras.add("PC de Escritorio Intel Core i5");  preciosComputadoras.add(2199.00);
        nombresComputadoras.add("Todo en Uno HP 23.8");              preciosComputadoras.add(1899.00);
        nombresComputadoras.add("Monitor Gamer 24 FHD");             preciosComputadoras.add(599.00);


        
        // Muebles oficina


        
        nombresMueblesOfic.add("Silla Ergonómica Ejecutiva");    preciosMueblesOfic.add(349.00);
        nombresMueblesOfic.add("Escritorio de Madera en L");     preciosMueblesOfic.add(450.00);
        nombresMueblesOfic.add("Estante de Libros 5 Niveles");   preciosMueblesOfic.add(219.00);

        // 21. INFANTIL 


        
        nombresJuguetes.add("Set de Bloques Lego Classic");   preciosJuguetes.add(249.00);
        nombresJuguetes.add("Muñeca Articulada Fashion");     preciosJuguetes.add(89.90);
        nombresJuguetes.add("Carro a Control Remoto");        preciosJuguetes.add(129.00);


        
        // Ropa infantil


        
        nombresRopaInfantil.add("Casaca de Invierno para Niño");   preciosRopaInfantil.add(79.90);
        nombresRopaInfantil.add("Pack de 3 Polos de Algodón");     preciosRopaInfantil.add(45.00);
        nombresRopaInfantil.add("Zapatillas Deportivas Kidz");     preciosRopaInfantil.add(89.00);


        
        // Muebles infantiles


        
        nombresMueblesInfant.add("Cuna Corral para Bebé");            preciosMueblesInfant.add(399.00);
        nombresMueblesInfant.add("Organizador de Juguetes");          preciosMueblesInfant.add(149.00);
        nombresMueblesInfant.add("Mesa con 2 Sillas Infantiles");     preciosMueblesInfant.add(189.00);


        
        // 22. SALUD Y DEPORTES - Gimnasio


        
        nombresGimnasio.add("Caminadora Eléctrica Plegable");        preciosGimnasio.add(1599.00);
        nombresGimnasio.add("Bicicleta Estacionaria Spinning");      preciosGimnasio.add(799.00);
        nombresGimnasio.add("Set de Mancuernas 20kg");               preciosGimnasio.add(199.00);


        
        // Bicicletas


        
        nombresBicicletas.add("Bicicleta de Montaña Aro 29");  preciosBicicletas.add(1199.00);
        nombresBicicletas.add("Bicicleta Urbana Aro 26");       preciosBicicletas.add(849.00);
        nombresBicicletas.add("Bicicleta Infantil Aro 16");     preciosBicicletas.add(349.00);


        
        // Vitaminas


        
        nombresVitaminas.add("Multivitamínico 90 Cápsulas");   preciosVitaminas.add(69.90);
        nombresVitaminas.add("Colágeno Hidrolizado 500g");      preciosVitaminas.add(89.90);
        nombresVitaminas.add("Proteína Whey 2lb");              preciosVitaminas.add(149.00);




        
        // 23. MASCOTAS 
        nombresComidaPerros.add("Alimento Ricocan Adulto 15kg");    preciosComidaPerros.add(129.90);
        nombresComidaPerros.add("Alimento Dog Chow Cachorros 8kg"); preciosComidaPerros.add(85.00);
        nombresComidaPerros.add("Paté para Perro Canbo 330g");      preciosComidaPerros.add(7.50);


        
        // Gatos

        
        nombresComidaGatos.add("Alimento Ricocat Adulto 9kg");    preciosComidaGatos.add(89.90);
        nombresComidaGatos.add("Alimento Whiskas Seco 3kg");       preciosComidaGatos.add(42.00);
        nombresComidaGatos.add("Sobre Felix Filetes en Salsa");    preciosComidaGatos.add(3.20);

        
        // Accesorios mascotas
        nombresAccMascotas.add("Cama Acolchada Mediana");              preciosAccMascotas.add(59.90);
        nombresAccMascotas.add("Rascador para Gato de 3 Niveles");    preciosAccMascotas.add(149.00);
        nombresAccMascotas.add("Correa Retráctil 5 metros");           preciosAccMascotas.add(34.90);
    }







    
   //mostraslista p
    public static void mostrarLista(ArrayList<String> nombres, ArrayList<Double> precios) {
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println((i + 1) + ". " + nombres.get(i) + "  -  S/. " + precios.get(i));
        }
    }


    
    public static void mostrarListaSinPrecio(ArrayList<String> nombres) {
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println((i + 1) + ". " + nombres.get(i));
        }
    }







    
    public static void menuCategorias() {
        int opcionCategoria = 0;
        while (opcionCategoria != 24) {
            System.out.println();
            System.out.println("___________________ CATEGORIAS DISPONIBLES ___________________");
            
            System.out.println("1.  Limpieza");
            
            System.out.println("2.  Tecnologia");
            
            System.out.println("3.  Electrohogar");
            
            System.out.println("4.  Muebles");
            
            System.out.println("5.  Terrazas y Aire Libre");
            
            System.out.println("6.  Bano");
            
            System.out.println("7.  Herramientas");
            
            System.out.println("8.  Pisos y ceramicos");
            
            System.out.println("9.  Iluminacion");
            
            System.out.println("10. Organizacion y Decohogar");
            
            System.out.println("11. Cocina");
            
            System.out.println("12. Dormitorio");
            
            System.out.println("13. Construccion");
            
            System.out.println("14. Electricidad");
            
            System.out.println("15. Gasfiteria");
            
            System.out.println("16. Pinturas y acabados");
            
            System.out.println("17. Ferreteria y Puertas");
            
            System.out.println("18. Automotriz");

            
            System.out.println("20. Oficina y escolar");
            
            System.out.println("21. Infantil");
            
            System.out.println("22. Salud y Deportes");
            
            System.out.println("23. Mascotas");
            
            System.out.println("24. Volver al Menu de Inicio");
            
            System.out.print("Selecciona una categoria: ");
            
            opcionCategoria = escaner.nextInt();




            
            switch (opcionCategoria) {
                    
                case 1:  subCategoria(nombresLimpieza,    preciosLimpieza,    "LIMPIEZA");            
                    break;
                    
                case 2:  subCategoria(nombresTecnologia,  preciosTecnologia,  "TECNOLOGÍA");           
                    break;
                    
                case 3:  subCategoria(nombresElectrohogar,preciosElectrohogar,"ELECTROHOGAR");        
                    break;
                case 4:  subCategoria(nombresMuebles,     preciosMuebles,     "MUEBLES");              
                    break;
                case 5:  subCategoria(nombresTerraza,     preciosTerraza,     "TERRAZAS Y AIRE LIBRE");
                    break;
                case 6:  subCategoria(nombresBano,        preciosBano,        "BAÑO");                 
                    break;
                case 7:  subCategoria(nombresHerramientas,preciosHerramientas,"HERRAMIENTAS");         
                    break;
                case 8:  subCategoria(nombresPisos,       preciosPisos,       "PISOS Y CERÁMICOS");    
                    break;
                case 9:  subCategoria(nombresIluminacion, preciosIluminacion, "ILUMINACIÓN");         
                    break;
                case 10: subCategoria(nombresOrganizacion,preciosOrganizacion,"ORGANIZACIÓN Y DECOHOGAR");
                    break;
                case 11: subCategoria(nombresCocina,      preciosCocina,      "COCINA");            
                    break;
                case 12: subCategoria(nombresDormitorio,  preciosDormitorio,  "DORMITORIO");         
                    break;
                case 13: subCategoria(nombresConstruccion,preciosConstruccion,"CONSTRUCCIÓN");       
                    break;
                case 14: subCategoria(nombresElectricidad,preciosElectricidad,"ELECTRICIDAD");       
                    break;
                case 15: subCategoria(nombresGasfiteria,  preciosGasfiteria,  "GASFITERÍA");          
                    break;
                case 16: subCategoria(nombresPinturas,    preciosPinturas,    "PINTURAS Y ACABADOS"); 
                    break;
                case 17: subCategoriaFerreteria(); 
                    break;
                case 18: subCategoriaAutomotriz();  
                    break;
                case 19: subCategoriaJardineria();  
                    break;
                case 20: subCategoriaOficina();     
                    break;
                case 21: subCategoriaInfantil();   
                    break;
                case 22: subCategoriaSaludDeportes();
                    break;
                case 23: subCategoriaMascotas();    
                    break;
                case 24: System.out.println("Regresando al menu de inicio..."); 
                    break;
                default: System.out.println("Opcion incorrecta."); 
                    break;
            }
        }
    }

   




    
    public static void subCategoria(ArrayList<String> nombres, ArrayList<Double> precios, String titulo) {
        System.out.println("\n=== PRODUCTOS DE " + titulo + " ===");
        mostrarLista(nombres, precios);

        System.out.print("Selecciona un producto (0 para volver): ");
        int op = escaner.nextInt();
        if (op == 0) return;

        System.out.print("Cantidad: ");
        int cantidad = escaner.nextInt();

        int idx = op - 1;
        if (idx >= 0 && idx < nombres.size()) {
            precio = precios.get(idx) * cantidad;
            nombreProductoSeleccionado = nombres.get(idx);
            System.out.println("\nUsted ha escogido: " + nombreProductoSeleccionado + " x" + cantidad);
            procesarCompra(precio);
        } else {
            System.out.println("Producto no valido.");
        }
    }





    

    public static void subCategoriaFerreteria() {
        System.out.println("--- FERRETERIA Y PUERTAS ---");
        System.out.println("1. Puertas");
        System.out.println("2. Cerraduras");
        System.out.println("3. Herramientas");
        System.out.print("Selecciona: ");
        int sub = escaner.nextInt();


        
        switch (sub) {
            case 1: elegirProducto(nombresPuertas,          preciosPuertas,          "PUERTAS");     
                
                break;
            case 2: elegirProducto(nombresCerraduras,       preciosCerraduras,       "CERRADURAS");   
                
                break;
            case 3: elegirProducto(nombresHerramientasFerre,preciosHerramientasFerre,"HERRAMIENTAS"); 
                
                break;
            default: System.out.println("Opción no válida."); 
                break;
        }
    }




    
    public static void subCategoriaAutomotriz() {
        System.out.println("--- AUTOMOTRIZ ---");
        System.out.println("1. Accesorios para Auto");
        System.out.println("2. Herramientas de Mecánica");
        System.out.println("3. Llantas");
        System.out.print("Selecciona: ");
        int sub = escaner.nextInt();

        switch (sub) {
            case 1: elegirProducto(nombresAccAuto,   preciosAccAuto,   "ACCESORIOS AUTO");     
                break;
            case 2: elegirProducto(nombresHerramMec, preciosHerramMec, "HERRAMIENTAS MECÁNICA"); 
                break;
            case 3: elegirProducto(nombresLlantas,   preciosLlantas,   "LLANTAS");            
                break;
            default: System.out.println("Opción no válida."); 
                break;
        }
    }

    public static void subCategoriaJardineria() {
        System.out.println("--- JARDINERIA ---");
        System.out.println("1. Plantas");
        System.out.println("2. Herramientas de Jardinería");
        System.out.println("3. Riego");
        System.out.print("Selecciona: ");
        int sub = escaner.nextInt();

        switch (sub) {
            case 1: elegirProducto(nombresPlantas,    preciosPlantas,    "PLANTAS");              
                break;
            case 2: elegirProducto(nombresHerramJard, preciosHerramJard, "HERRAMIENTAS JARDÍN");  
                break;
            case 3: elegirProducto(nombresRiego,      preciosRiego,      "RIEGO");               
                break;
            default: System.out.println("Opción no válida.");
                break;
        }
    }

    public static void subCategoriaOficina() {
        System.out.println("--- OFICINA Y ESCOLAR ---");
        System.out.println("1. Útiles de Escritorio");
        System.out.println("2. Computadoras");
        System.out.println("3. Muebles de Oficina");
        System.out.print("Selecciona: ");
        int sub = escaner.nextInt();

        switch (sub) {
            case 1: elegirProducto(nombresUtiles,       preciosUtiles,       "ÚTILES DE ESCRITORIO");
                break;
            case 2: elegirProducto(nombresComputadoras, preciosComputadoras, "COMPUTADORAS");        
                break;
            case 3: elegirProducto(nombresMueblesOfic,  preciosMueblesOfic,  "MUEBLES DE OFICINA");  
                break;
            default: System.out.println("Opción no válida."); 
                break;
        }
    }

    public static void subCategoriaInfantil() {
        System.out.println("--- INFANTIL ---");
        System.out.println("1. Juguetes");
        System.out.println("2. Ropa Infantil");
        System.out.println("3. Muebles Infantiles");
        System.out.print("Selecciona: ");
        int sub = escaner.nextInt();

        switch (sub) {
            case 1: elegirProducto(nombresJuguetes,      preciosJuguetes,      "JUGUETES");        
                break;
            case 2: elegirProducto(nombresRopaInfantil,  preciosRopaInfantil,  "ROPA INFANTIL");   
                break;
            case 3: elegirProducto(nombresMueblesInfant, preciosMueblesInfant, "MUEBLES INFANTIL"); 
                break;
            default: System.out.println("Opción no válida.");
                break;
        }
    }





    
    
    public static void subCategoriaSaludDeportes() {
        System.out.println("--- SALUD Y DEPORTES ---");
        System.out.println("1. Equipos de Gimnasio");
        System.out.println("2. Bicicletas");
        System.out.println("3. Vitaminas");
        System.out.print("Selecciona: ");
        int sub = escaner.nextInt();

        switch (sub) {
            case 1: elegirProducto(nombresGimnasio,    preciosGimnasio,    "EQUIPOS DE GIMNASIO");
                
                break;
                
            case 2: elegirProducto(nombresBicicletas,  preciosBicicletas,  "BICICLETAS");   
                
                break;
                
            case 3: elegirProducto(nombresVitaminas,   preciosVitaminas,   "VITAMINAS");      
                
                break;
                
            default: System.out.println("Opción no válida."); 
                
                break;
        }
    }


    
    public static void subCategoriaMascotas() {
        System.out.println("--- MASCOTAS ---");
        System.out.println("1. Comida para Perros");
        System.out.println("2. Comida para Gatos");
        System.out.println("3. Accesorios para Mascota");
        System.out.print("Selecciona: ");
        int sub = escaner.nextInt();

        switch (sub) {
            case 1: elegirProducto(nombresComidaPerros, preciosComidaPerros, "COMIDA PERROS");      
                
                break;
            case 2: elegirProducto(nombresComidaGatos,  preciosComidaGatos,  "COMIDA GATOS");       
                break;
                
            case 3: elegirProducto(nombresAccMascotas,  preciosAccMascotas,  "ACCESORIOS MASCOTAS"); 
                
                break;
            default: System.out.println("Opción no válida.");
                break;
        }
    }








    
    public static void elegirProducto(ArrayList<String> nombres, ArrayList<Double> precios, String titulo) {
        System.out.println("--- " + titulo + " ---");
        mostrarLista(nombres, precios);
        System.out.print("Elige el producto: ");
        int op = escaner.nextInt();
        int idx = op - 1;
        if (idx >= 0 && idx < nombres.size()) {
            precio = precios.get(idx);
            nombreProductoSeleccionado = nombres.get(idx);
            procesarCompra(precio);
        } else {
            System.out.println("Opción no válida.");
        }
    }













    public static void procesarCompra(double precioCalculado) {
        System.out.println();
        System.out.println("___________________ DATOS PERSONALES ___________________");
        System.out.print("Introduce tus Nombres: ");
        escaner.nextLine();
        nombreTitular = escaner.nextLine();
        System.out.print("Introduce tus Apellidos: ");
        apellidosTitular = escaner.nextLine();
        System.out.print("Introduce tu Tipo de Documento (DNI/CE): ");
        tipoDocumento = escaner.nextLine();
        System.out.print("Introduce tu Numero de documento: ");
        numDocumento = escaner.next();
        System.out.print("Introduce tu Telefono / Movil: ");
        telefonoMovil = escaner.next();


        
        System.out.println();
        System.out.println("___________________ DETALLES DE ENTREGA ___________________");
        System.out.print("Introduce el Departamento: ");
        escaner.nextLine();
        departamento = escaner.nextLine();
        System.out.print("Introduce la Provincia: ");
        provincia = escaner.nextLine();
        System.out.print("Introduce el Distrito: ");
        distrito = escaner.nextLine();


        
        System.out.println();
        System.out.println("Resumen de tu pedido:");
        System.out.println("- Articulo: " + nombreProductoSeleccionado);
        System.out.println("- TOTAL A PAGAR: S/. " + precioCalculado);
        System.out.println();
        System.out.println("Metodos de Pago Disponibles:");
        System.out.println("1. Tarjeta de Credito/Debito");
        System.out.println("2. Cancelar pedido");
        System.out.print("Selecciona una opcion: ");
        int pagar = escaner.nextInt();


        
        if (pagar == 1) {
            validaPagoTarjeta(precioCalculado);
            System.out.println("¡Tu pedido ha sido procesado! Gracias por comprar en Promart.");
            System.out.println("Generando comprobante electrónico...");

            String correoMostrado = "Invitado";
            if (!correoLogin.equals(""))      correoMostrado = correoLogin;
            else if (!correoRegistrado.equals("")) correoMostrado = correoRegistrado;

            double subtotal = precioCalculado / 1.18;
            double igv = precioCalculado - subtotal;
            LocalDateTime fechaHora = LocalDateTime.now();
            DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");





            
            System.out.println("================================================");
            System.out.println("              PROMART  S.A               ");
            System.out.println("           RUC: 20536557858                     ");
            System.out.println("       Av. Aviación Nro. 2405                   ");
            System.out.println("       Juliaca, Perú                             ");
            System.out.println("-----------------------------------------------");
            System.out.println("   BOLETA DE VENTA ELECTRÓNICA                  ");
            System.out.println("   BA01-000458923                                ");
            System.out.println("-----------------------------------------------");
            System.out.println(" FECHA DE EMISION : " + fechaHora.format(formatoFecha));
            System.out.println(" SEÑOR(A)         : " + nombreTitular + " " + apellidosTitular);
            System.out.println(" " + tipoDocumento + "              : " + numDocumento);
            System.out.println(" TELEFONO         : " + telefonoMovil);
            System.out.println(" CORREO           : " + correoMostrado);
            System.out.println("-----------------------------------------------");
            System.out.println(" UBICACIÓN ENTREGA:");
            System.out.println(" DEPARTAMENTO     : " + departamento);
            System.out.println(" PROVINCIA        : " + provincia);
            System.out.println(" DISTRITO         : " + distrito);
            System.out.println("-----------------------------------------------");
            System.out.println(" " + nombreProductoSeleccionado + "  S/. " + precioCalculado);
            System.out.println("-----------------------------------------------");
            System.out.println(" SUBTOTAL         : S/. " + String.format("%.2f", subtotal));
            System.out.println(" IGV (18%)        : S/. " + String.format("%.2f", igv));
            System.out.println("-----------------------------------------------");
            System.out.println(" IMPORTE TOTAL    : S/. " + precioCalculado);
            System.out.println("================================================");
            System.out.println("  Consulte su boleta en: promart.pe/facturacion  ");
            System.out.println("================================================");
        } else {
            System.out.println("Pedido cancelado. Volviendo al menu principal.");
        }
        System.out.println("Presione ENTER para volver al menú principal...");
        escaner.nextLine();
    }




    
    public static void validaPagoTarjeta(double total) {
        String nroTarjeta, fechaVencimiento, cvv;
        boolean pAprobado = false;

        System.out.println("Iniciando Pasarela de Pagos...");
        System.out.println("Monto total a pagar con tarjeta es: S/. " + total);
        escaner.nextLine();

        do {
            System.out.print("Ingrese los 16 digitos de la tarjeta: ");
            nroTarjeta = escaner.nextLine();

            System.out.print("Ingrese la fecha de caducidad (MM/yy): ");
            fechaVencimiento = escaner.nextLine();

            System.out.print("Ingrese el codigo de seguridad CVV: ");
            cvv = escaner.nextLine();

            
            boolean tarjetaOk        = (nroTarjeta.length() == 16);
            boolean cvvOk            = (cvv.length() == 3);
            boolean fechaEstructuraOk = (fechaVencimiento.length() == 5 && fechaVencimiento.contains("/"));
            boolean fechaNoVencida   = false;



            
            if (fechaEstructuraOk) {



                
                try {
                    
                    DateTimeFormatter formateador = DateTimeFormatter.ofPattern("MM/yy");
                    YearMonth fechaTarjeta = YearMonth.parse(fechaVencimiento, formateador);
                    YearMonth fechaActual  = YearMonth.now();
                    fechaNoVencida = fechaTarjeta.isAfter(fechaActual) || fechaTarjeta.equals(fechaActual);
                } catch (DateTimeParseException e) {
                    fechaEstructuraOk = false;
                }
            }




            
            
            if (tarjetaOk && fechaEstructuraOk && fechaNoVencida && cvvOk) {
                System.out.println("Autorizando fondos... transaccion exitosa.");
                pAprobado = true;
            } else {
                System.out.println("--- Operación denegada por el banco ---");
                if (!tarjetaOk)                           System.out.println("* El numero de tarjeta debe tener exactamente 16 digitos.");
                if (!fechaEstructuraOk)                   System.out.println("* Formato de fecha incorrecto. Use MM/yy");
                if (fechaEstructuraOk && !fechaNoVencida) System.out.println("* Tarjeta caducada.");
                if (!cvvOk)                               System.out.println("* El CVV debe contener 3 digitos.");
                System.out.println("Intente nuevamente el pago electrónico...");
            }
        } while (!pAprobado);
    }
}

    
