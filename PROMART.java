import java.util.Scanner;

import java.time.format.DateTimeFormatter;

import java.time.YearMonth;

import java.time.format.DateTimeParseException;




public class PROMART {



    static String correoRegistrado = "";

    static String correoLogin = "";

    static String numDocumento = "";

    static String nombreTitular = "";

    static double precio = 0.0;

    static String contraRegistrada = "";

    static String apellidosTitular = "";

    static String tipoDocumento = "";

    static String telefonoMovil = "";

    static String departamento = "";

    static String provincia = "";

    static String distrito = "";

    static String nombreProductoSeleccionado = "";



    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);

        String contraLogin = "";

        int opcionMenu = 0;



        // Bucle Principio

        while (opcionMenu != 4) {

            System.out.println();

            System.out.println("========================================");

            System.out.println("             BIENVENIDO A               ");

            System.out.println("========================================");

            System.out.println("1. Iniciar Sesion");

            System.out.println("2. Registrarse (Crear Cuenta)");

            System.out.println("3. Entrar como Invitado");

            System.out.println("4. Salir");

            System.out.print("Elige una opcion: ");

            opcionMenu = escaner.nextInt();



            switch (opcionMenu) {

                case 1:

                    System.out.println();

                    System.out.println("=== INICIO DE SESIÓN ===");

                    System.out.print("Introduce tu correo: ");

                    correoLogin = escaner.next();

                    System.out.print("Introduce tu contrasena: ");

                    contraLogin = escaner.next();



                    if (correoLogin.equals(correoRegistrado) && contraLogin.equals(contraRegistrada) && !correoRegistrado.equals("")) {

                        System.out.println("¡Login exitoso! Bienvenido de nuevo.");

                        menuCategorias(escaner);

                    } else if (correoLogin.equals("admin@gmail.com") && contraLogin.equals("12345678@")) {

                        System.out.println("Ingreso exitoso a Promart. Bienvenido Admin.");

                    } else {

                        System.out.println("Error: Correo o contrasena incorrectos, o no estas registrado.");

                    }

                    break;



                case 2:

                    System.out.println();

                    System.out.println("=== REGISTRO DE USUARIO ===");

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



                    String clavel = "";

                    String clave2 = "";

                    boolean passValida = false;



                    do {

                        System.out.print("Ingresa tu contrasena: ");

                        clavel = escaner.next();

                        System.out.print("Repite tu contrasena: ");

                        clave2 = escaner.next();



                        boolean estructuraPassOk = clavel.length() >= 8 && (clavel.contains("#") || clavel.contains("@"));



                        if (!clavel.equals(clave2)) {

                            System.out.println("Las contrasenas no coinciden. Intenta otra vez.");

                        } else if (!estructuraPassOk) {

                            System.out.println("Error: La contraseña debe tener mínimo 8 caracteres y contener '#' o '@'");

                        } else {

                            passValida = true;

                        }

                    } while (!passValida);



                    contraRegistrada = clavel;

                    System.out.println("¡Cuenta creada con exito! Ahora puedes comprar.");

                    menuCategorias(escaner);

                    break;



                case 3:

                    System.out.println();

                    System.out.println("Entrando en modo Invitado...");

                    menuCategorias(escaner);

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



    //PARTE 2

    public static void menuCategorias(Scanner escaner) {

        int opcionCategoria = 0;

        while (opcionCategoria != 24) {

            System.out.println();

            System.out.println("=== CATEGORIAS DISPONIBLES ===");

            System.out.println("1. Limpieza");

            System.out.println("2. Tecnologia");

            System.out.println("3. Electrohogar");

            System.out.println("4. Muebles");

            System.out.println("5. Terrazas y Aire Libre");

            System.out.println("6. Bano");

            System.out.println("7. Herramientas");

            System.out.println("8. Pisos y ceramicos");

            System.out.println("9. Iluminacion");

            System.out.println("10. Organizacion y Decohogar");

            System.out.println("11. Cocina");

            System.out.println("12. Dormitorio");

            System.out.println("13. Construccion");

            System.out.println("14. Electricidad");

            System.out.println("15. Gasfiteria");

            System.out.println("16. Pinturas y acabados");

            System.out.println("17. Ferreteria y Puertas");

            System.out.println("18. Automotriz");

            System.out.println("19. Jardineria");

            System.out.println("20. Oficina y escolar");

            System.out.println("21. Infantil");

            System.out.println("22. Salud y Deportes");

            System.out.println("23. Mascotas");

            System.out.println("24. Volver al Menu de Inicio");

            System.out.print("Selecciona una categoria: ");

            opcionCategoria = escaner.nextInt();



            switch (opcionCategoria) {

                // ABEL

                case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8:

                    eleccionMenu(opcionCategoria);

                    subCategoriaAbel(opcionCategoria, escaner);

                    break;



                // ADRIAN

                case 9:

                    subCategoriaIluminacion(escaner); break;

                case 10: subCategoriaOrganizacion(escaner); break;

                case 11: subCategoriaCocina(escaner); break;

                case 12: subCategoriaDormitorio(escaner); break;

                case 13: subCategoriaConstruccion(escaner); break;

                case 14: subCategoriaElectricidad(escaner); break;



                // ZAMIR

                case 15: subCategoriaGasfiteria(escaner); break;

                case 16: subCategoriaPinturas(escaner); break;

                case 17: subCategoriaFerreteria(escaner); break;

                case 18: subCategoriaAutomotriz(escaner); break;

                case 19: subCategoriaJardineria(escaner); break;

                case 20: subCategoriaOficina(escaner); break;

                case 21: subCategoriaInfantil(escaner); break;

                case 22: subCategoriaSaludDeportes(escaner); break;

                case 23: subCategoriaMascotas(escaner); break;



                case 24:

                    System.out.println("Regresando al menu de inicio...");

                    break;



                default:

                    System.out.println("Opcion incorrecta.");

                    break;

            }

        }

    }



    //==============================================================================

    // PARTE DE ABE

    //==============================================================================

    public static void eleccionMenu(int categoria) {

        String[] nombresCategorias = {

            "Limpieza", "Tecnología", "Electrohogar", "Muebles",

            "Terraza Y Aire Libre", "Baño", "Herramientas", "Pisos y cerámicos"

        };



        if (categoria >= 1 && categoria <= 8) {

            System.out.println("Usted eligio productos de " + nombresCategorias[categoria - 1]);

        } else {

            System.out.println("Categoria no valida");

        }

    }



    public static void subCategoriaAbel(int subCategoria, Scanner scanner) {

        String[][] productos = {

            // Categoria 1: Limpieza

            {

                "Limpiador Multipropósito con Vinagre 650 ml Daryza", "Pinesol 4.5 Lt",

                "Destructor De Sarro Pato Cítrico 710ml", "Pato Destructor de Sarro 710 Ml",

                "Limpiador Lavadoras Impecables Binner 300 Ml", "Desinfectante baños y duchas 500ml + repuesto Binner",

                "Desinfectante Aire Binner Eucalipto Limon x 2 Unidades", "Saniquat 500 desinfectante 1 litro",

                "Desinfectante Pino Daryza 5gl", "Toallas Desinfectantes Clorox Expert 30 Unid"

            },

            // Categoria 2: Tecnologia

            {

                "Laptop Lenovo Ideapad Slim 3 AMD Ryzen 5 7520U 8GB RAM 512GB SSD",

                "Combo Laptop HP 250 G10 Intel Core i3 N305 8GB RAM 256GB SSD",

                "Laptop Lenovo IdeaPad Slim 3 15IAH8 15.6in FHD Intel Core i5-12450H 8GB RAM 512GB SSD", 

                "LAPTOP HP 250 G10 15.6in HD LED Core i7-1355U 5GHz 8GB DDR4-3200 512GB SSD",

                "Macbook Air 13in Chip M5 512GB SSD 16GB RAM - STARLIGHT", 

                "Laptop ASUS TUF Gaming A15 15.6in AMD Ryzen 7 7445HS 512GB SSD 8GB RTX3050",

                "Laptop HP 250R G10 Intel Core 5 120U 16GB RAM 512 SSD", 

                "Laptop HP 255 G10 AMD Ryzen 3 7320U 8GB RAM 256GB SSD",

                "Laptop HP 255 G10 AMD Ryzen 3 7320U 8GB RAM 256GB SSD", 

                "Laptop HP 250R G10 Intel Core 5 120U 16GB RAM 512 SSD"

            },

            // Categoria 3: Electrohogar

            {

                "Lavadora LG WT130BVTB 13Kg TurboDrum", "Lavadora LG WT190BVTB 19Kg Carga Superior",

                "Lavadora Samsung WA19CG6441BDPE 19Kg EcoBubble", "Lavadora Indurama LRI19CRI 19Kg Inverter",

                "Lavadora Electrolux EWIP15F2XSWB 15Kg", "Lavadora LG WT9BVTB 9Kg Carga Superior",

                "Lavadora Samsung 15Kg AI EcoBubble", "Lavadora Indurama LRI-18DGR 18Kg",

                "Lavadora Mabe 16Kg Semiautomática", "Lavadora Blackline SPBL16TL 16Kg"

            },

            // Categoria 4: Muebles

            {

                "Juego de Sala Spring 3-2 Tela Beige Forli", "Juego de Sala Lineal Mundial 3-2 Tela Plata Forli",

                "Juego de Sala Montiano Marrón 3-2-1 Forli", "Juego de Sala Montiano 2-1 Negro Forli",

                "Juego de Sala Spring 3-2 Tela Mando Forli", "Juego de Sala Aliyah 3-2 Tabaco Forli",

                "Juego de Sala Montiano 3-2 Marrón Forli", "Juego de Sala Montiano 3-2 Negro Forli",

                "Juego de Sala Havana 2-1-1 Plata + Mesa", "Juego de Sala Montiano 3-2-1 Marrón Forli"

            },

            // Categoria 5: Terrazas

            {

                "Parrilla a Gas 4 Quemadores", "Juego de Terraza Mesa + 4 Sillas", "Piscina Inflable Bestway",

                "Toldo Retráctil 3x3m", "Hamaca con Soporte", "Set de Muebles Rattan",

                "Fogón Exterior", "Cortadora de Césped", "Sombrilla Playa 2.5m", "Mesa Plegable de Camping"

            },

            // Categoria 6: Bano

            {

                "Combo Sanitario + Lavatorio Blanco", "Gabinete de Baño con Espejo", "Mezcladora para Ducha Cromada",

                "Set de Accesorios de Baño (5 pzas)", "Mampara de Vidrio Templado para Ducha", "Extractor de Aire para Baño",

                "Portarrollo Cromado", "Organizador de Ducha Angular", "Grifería Lavatorio Alta Vainsa", "Cortina de Baño Impermeable"

            },

            // Categoria 7: Herramientas

            {

                "Rotomartillo Inalámbrico Bosch 20V", "Amoladora Angular DeWalt 4-1/2\"",

                "Caja de Herramientas Completa Stanley (150 pzas)", "Set de Destornilladores Tramontina (6 pzas)",

                "Medidor de Distancia Láser Makita", "Taladro Percutor Skill 550W", "Juego de Llaves Alen",

                "Nivel de Mano de Aluminio 24\"", "Alicate de Presión Stanley 10\"", "Cinta Métrica Stanley 5m"

            },

            // Categoria 8: Pisos y Ceramicos

            {

                "Porcelanato Pulido 60x60 cm Gris (m2)", "Piso Laminado Madera 8mm (m2)",

                "Cerámico Pared Blanco Brillante 30x45 cm (m2)", "Pegamento para Porcelanato Bolsa 25kg",

                "Fragua para Cerámicos 1kg", "Crucetas para Cerámicos 2mm x 100", "Zócalo de Madera Pine 2.4m",

                "Limpiador Concentrado de Porcelanato", "Rodón de Aluminio para Cerámico", "Espátula Dentada de Goma"

            }

        };



        double[][] precios = {

            {9.90, 44.50, 25.00, 25.00, 22.90, 19.90, 28.90, 107.40, 69.90, 11.90}, // Limpieza

            {1849.0, 1619.0, 2079.0, 3099.0, 5299.0, 3199.0, 2399.0, 1599.0, 1599.0, 2399.0}, // Tecnologia

            {1249.0, 1449.0, 2099.0, 1299.0, 1799.0, 999.0, 1499.0, 1599.0, 999.0, 799.0}, // Electrohogar

            {3598.0, 3318.0, 4598.0, 2518.0, 3598.0, 4798.0, 3638.0, 3638.0, 2798.0, 2518.0}, // Muebles

            {899.0, 1299.0, 249.0, 599.0, 159.0, 1899.0, 399.0, 449.0, 99.0, 149.0}, // Terraza

            {349.0, 199.0, 129.0, 49.0, 499.0, 79.0, 24.90, 39.90, 189.0, 29.90}, // Baño

            {649.0, 329.0, 299.0, 39.0, 249.0, 199.0, 19.90, 34.90, 49.90, 25.00}, // Herramientas

            {39.90, 45.90, 24.90, 32.90, 7.90, 5.50, 18.00, 14.90, 12.50, 9.90} // Pisos

        };



        String[] titulos = {

            "PRODUCTOS DE LIMPIEZA", "PRODUCTOS DE TECNOLOGÍA (LAPTOPS)", "PRODUCTOS DE ELECTROHOGAR (LAVADORAS)",

            "PRODUCTOS DE MUEBLES (JUEGOS DE SALA)", "PRODUCTOS DE TERRAZA Y AIRE LIBRE", "PRODUCTOS DE BAÑO",

            "PRODUCTOS DE HERRAMIENTAS", "PRODUCTOS DE PISOS Y CERÁMICOS"

        };



        int idxCat = subCategoria - 1;

        System.out.println("\n=== " + titulos[idxCat] + " ===");



        for (int i = 0; i < productos[idxCat].length; i++) {

            System.out.println((i + 1) + ". " + productos[idxCat][i] + " : S/. " + precios[idxCat][i]);

        }



        System.out.print("Elige el producto: ");

        int producto = scanner.nextInt();

        System.out.print("Cantidad: ");

        int cantidad = scanner.nextInt();



        if (producto >= 1 && producto <= productos[idxCat].length) {

            int idxProd = producto - 1;

            nombreProductoSeleccionado = productos[idxCat][idxProd];

            precio = precios[idxCat][idxProd] * cantidad;

            System.out.println("\nUsted ha escogido: " + nombreProductoSeleccionado + " x" + cantidad);

            procesarCompra(scanner, precio);

        } else {

            System.out.println("Producto no válido.");

        }

    }



    //==============================================================================

    // PARTE DE ADRIAN

    //==============================================================================

    public static void subCategoriaIluminacion(Scanner escaner) {

        String[] prod = {

            "Foco Vintage G45 E27 1W Luz Cálida Clear x 6 unidades Orange", "Foco Led Smart Wifi Cla60 220V 7W E27 Ledvance",

            "Foco High Power Led E27 48W Luz Fría Orange", "Foco LED UFO 34W Luz Fría Orange",

            "Foco LED Smart Nexxt Nhb-C120MRGB", "Foco LED High Power Orange 18W Luz Fría",

            "Foco LED Philips Luz Blanca x2 14W E27 Ahorro Energético", "Foco Werken Smart",

            "Foco LED UFO Orange E27 15W Luz Fría", "Pack x 2 Foco Led G95 7W Luz Cálida Ámbar Orange"

        };

        double[] prec = {19.90, 25.00, 19.90, 39.90, 39.00, 9.90, 21.90, 25.00, 12.90, 29.90};



        System.out.println("\n=== FOCOS LED ===");

        for (int i = 0; i < prod.length; i++) {

            System.out.println((i + 1) + ". " + prod[i] + " : S/. " + prec[i]);

        }

        ejecutarSeleccion(escaner, prod, prec);

    }



    public static void subCategoriaOrganizacion(Scanner escaner) {

        String[] prod = {

            "Alfombra Juego Mundo 80x150cm", "Lámpara Colgante Calada 18cm Alto Astronauta",

            "Juego x 6 piezas Vaso Alto Labrado 330ml Y6015", "Farol Rectangular Negro 11x24cm Decore",

            "Lámpara de Mesa Trama Ver 28cm Decore", "Lámpara Animal Print con Base de Metal 15x20x145cm Casa Bella",

            "Florero Esencia Acanalada 19cm Decore", "Florero Grande Elegant Decore",

            "Cuadro Canva bar & drinks 30x40cm Decore Diseño Aleatorio", "Candelabro 12cm Diseño Aleatorio Orange"

        };

        double[] prec = {27.00, 35.60, 27.00, 39.92, 35.60, 60.40, 31.92, 59.92, 23.92, 15.00};



        System.out.println("\n=== PRODUCTOS ORGANIZACION Y DECOHOGAR ===");

        for (int i = 0; i < prod.length; i++) {

            System.out.println((i + 1) + ". " + prod[i] + " : S/. " + prec[i]);

        }

        ejecutarSeleccion(escaner, prod, prec);

    }



    public static void subCategoriaCocina(Scanner escaner) {

        String[] prod = {

            "Horno Microondas LG 20L Negro", "Licuadora Oster 2 Velocidades con Pulso",

            "Cocina a Gas Indurama 4 Hornillas", "Arrocera Thomas 1.8 Litros",

            "Extractor de Jugos Imaco Potente", "Hervidor Eléctrico Record 1.7L Acero",

            "Sartén Antiadherente Tramontina 24cm", "Juego de Ollas Infinitum x 5 piezas Record",

            "Organizador de Platos Metálico Cromado Mueble", "Set de Cuchillos de Cocina x 6 piezas Carve"

        };

        double[] prec = {389.00, 189.00, 899.00, 149.00, 199.00, 79.00, 45.00, 259.00, 59.00, 49.00};



        System.out.println("\n=== PRODUCTOS DE COCINA ===");

        for (int i = 0; i < prod.length; i++) {

            System.out.println((i + 1) + ". " + prod[i] + " : S/. " + prec[i]);

        }

        ejecutarSeleccion(escaner, prod, prec);

    }

public static void subCategoriaDormitorio(Scanner escaner) {

        String[] prod = {

            "Cama Box Tarima 4 Cajones PARAISO Pocket Star Chocolate King + 2 Almohadas", 

            "Dormitorio 4 Cajones PARAISO Pocket Max Chocolate Queen + 2 Almohadas",

            "Cama Boxet Paraíso Blocks Su Majestad Queen Chocolate + Cabecera", 

            "Cama Juvenil + Cabecera + Mesa de Noche Janeiro color Blanco/Negro 3 cajones",

            "Cama Boxet Paraíso Pocket Max 1.5 Plazas Champagne", 

            "Ropero Florencia 7 Puertas 1 Cajón MDP Castaño",

            "Ropero Bali Plus 6 Puertas MDP Canela/Blanco", 

            "Tocador Charlotte 1 Cajón con Espejo Melamina Blanco/Nogal Bonno",

            "Cómoda Perú 4 cajones 1 puerta TV 40 Tuhome", 

            "Cómoda Praga 3 Cajones 1 Puerta Abatible Melamina Wengue Tuhome"

        };

        double[] prec = {3499.00, 2899.00, 1999.00, 4600.00, 2499.60, 329.00, 349.00, 764.00, 599.00, 450.00};



        System.out.println(
            


        System.out.println("\n=== PRODUCTOS DE DORMITORIO ===");

        for (int i = 0; i < prod.length; i++) {

            System.out.println((i + 1) + ". " + prod[i] + " : S/. " + prec[i]);

        }

        ejecutarSeleccion(escaner, prod, prec);

    }



    public static void subCategoriaConstruccion(Scanner escaner) {

        String[] prod = {

            "Cemento Sol Portland Tipo 1 Bolsa 42.5kg", "Fierro Corrugado 3/8\" Aceros Arequipa",

            "Ladrillo King Kong 18 Huecos Lark (Unidad)", "Placa de Yeso Drywall Standard 1.22x2.44m",

            "Arena Gruesa Bolsa 40kg", "Piedra Chancada 1/2\" Bolsa 40kg",

            "Alambre Negro Recocido Nro 16 (kg)", "Clavos para Madera con Cabeza 3\" (kg)",

            "Tanque de Agua Eternit 1100L Completo", "Cal Hidratada Bolsa 25kg"

        };

        double[] prec = {28.50, 24.90, 1.40, 34.90, 8.50, 9.50, 7.20, 6.80, 429.00, 14.50};



        System.out.println("\n=== PRODUCTOS DE CONSTRUCCION ===");

        for (int i = 0; i < prod.length; i++) {

            System.out.println((i + 1) + ". " + prod[i] + " : S/. " + prec[i]);

        }

        ejecutarSeleccion(escaner, prod, prec);

    }



    public static void subCategoriaElectricidad(Scanner escaner) {

        String[] prod = {

            "Cable Mellizo 2x16 AWG Indeco (Rollo 100m)", "Llave Termomagnética Bipolar 2x25A Schneider",

            "Cinta Aislante Negra 3M Temflex", "Interruptor Simple Blanco Ticino Modus",

            "Tomacorriente Doble con Tierra Ticino", "Caja Rectangular PVC Liviano (Unidad)",

            "Tubo Corrugado Blanco 1/2\" (Rollo 50m)", "Tablero Eléctrico Empotrable 8 Polos",

            "Socket de Baquelita E27 Negro", "Sensor de Movimiento 360° para Techo"

        };

        double[] prec = {149.00, 45.00, 4.50, 8.90, 12.50, 1.20, 29.90, 39.00, 2.50, 34.90};



        System.out.println("\n=== PRODUCTOS DE ELECTRICIDAD ===");

        for (int i = 0; i < prod.length; i++) {

            System.out.println((i + 1) + ". " + prod[i] + " : S/. " + prec[i]);

        }

        ejecutarSeleccion(escaner, prod, prec);

    }



    public static void subCategoriaGasfiteria(Scanner escaner) {

        String[] prod = {

            "Tubo PVC Agua Clase 10 1/2\" Matushita", "Pegamento para PVC Oatey 1/4 Galón",

            "Cinta Teflon 1/2\" x 10m Pegatanke", "Llave de Paso Esferica de Bronce 1/2\"",

            "Trampa para Lavatorio Cromada Vainsa", "Desatorador de Tuberías Líquido Drano 1L",

            "Silicón Sellador Transparente Sanitarios", "Flexible para Agua Trenzado Acero 40cm",

            "Mezcladora para Lavatorio Monocomando", "Tee PVC Presión Agua 1/2\" (Unidad)"

        };

        double[] prec = {11.50, 38.90, 2.20, 24.50, 49.00, 19.90, 15.50, 10.90, 129.00, 1.50};



        System.out.println("\n=== PRODUCTOS DE GASFITERIA ===");

        for (int i = 0; i < prod.length; i++) {

            System.out.println((i + 1) + ". " + prod[i] + " : S/. " + prec[i]);

        }

        ejecutarSeleccion(escaner, prod, prec);

    }



    public static void subCategoriaPinturas(Scanner escaner) {

        String[] prod = {

            "Pintura Látex CPP Pato Blanco Balde 4gl", "Esmalte Sintético Tekno Negro Galón",

            "Imprimante para Pared Pato Bolsa 5kg", "Rodillo de Pintar Antigota 9\" Pro",

            "Brocha para Pintar Cerda Fina 3\"", "Thinner Acrílico Galón Solvinter",

            "Cinta Masking Tape 1\" Shurtape", "Lija para Pared Nro 120 Fandeli (Pliego)",

            "Sellador de Pared Fijador CPP Galón", "Espátula de Acero Inoxidable 4\" Tramontina"

        };

        double[] prec = {119.00, 54.90, 14.50, 16.90, 8.50, 26.00, 5.20, 1.80, 39.00, 12.50};



        System.out.println("\n=== PINTURAS Y ACABADOS ===");

        for (int i = 0; i < prod.length; i++) {

            System.out.println((i + 1) + ". " + prod[i] + " : S/. " + prec[i]);

        }

        ejecutarSeleccion(escaner, prod, prec);

    }



    // Auxiliar reutilizable para evitar duplicación de código en selecciones

    private static void ejecutarSeleccion(Scanner escaner, String[] prod, double[] prec) {

        System.out.print("Selecciona un producto: ");

        int producto = escaner.nextInt();

        System.out.print("Cantidad: ");

        int cantidad = escaner.nextInt();



        if (producto >= 1 && producto <= prod.length) {

            nombreProductoSeleccionado = prod[producto - 1];

            precio = prec[producto - 1] * cantidad;

            System.out.println("\nUsted ha escogido: " + nombreProductoSeleccionado + " x" + cantidad);

            procesarCompra(escaner, precio);

        } else {

            System.out.println("Producto no valido.");

        }

    }

//==============================================================================

    // PARTE DE ZAMIR

    //==============================================================================

    public static void subCategoriaFerreteria(Scanner escaner) {

        String[] prod = {

            "Cerradura de Sobreponer Forte Clásica Dos Golpes", "Candado de Bronce Yale 50mm Gancho Largo",

            "Bisagra de Fierro Pulido 3\"x3\" (Pack x 3 unidades)", "Kit de Tarugos y Tornillos (100 piezas)",

            "Cadena de Eslabones de Acero Galvanizado 1/4\" (metro)", "Silicona Liquida Multiuso Multitop 250ml",

            "Pala Tramontina con Mango de Madera", "Huacha Presion de Acero 3/8\" (Ciento)",

            "Abrazadera de Metal para Tubo 2\"", "Esquinero de Metal Reforzado 4\"x4\""

        };

        double[] prec = {69.90, 34.50, 12.80, 15.00, 9.50, 11.90, 39.00, 8.00, 2.50, 4.20};



        System.out.println("\n=== FERRETERÍA Y PUERTAS ===");

        for (int i = 0; i < prod.length; i++) {

            System.out.println((i + 1) + ". " + prod[i] + " : S/. " + prec[i]);

        }

        ejecutarSeleccion(escaner, prod, prec);

    }



    public static void subCategoriaAutomotriz(Scanner escaner) {

        String[] prod = {

            "Aceite para Motor 10W-40 Mobil Super Galón", "Batería para Auto Capo 11 Placas",

            "Shampoo para Auto con Cera Sonax 1L", "Líquido de Frenos Wagner DOT 4 350ml",

            "Kit de Pisos de Goma Universales (4 piezas)", "Compresor de Aire Portátil para Auto 12V",

            "Medidor de Presión de Llantas Digital Análogo", "Ambientador para Auto Little Trees Pinito",

            "Esponja de Microfibra para Lavado Carwash", "Gata Hidráulica de Botella 2 Toneladas"

        };

        double[] prec = {115.00, 249.00, 28.90, 18.50, 45.00, 59.90, 12.00, 6.50, 7.90, 89.00};



        System.out.println("\n=== AUTOMOTRIZ ===");

        for (int i = 0; i < prod.length; i++) {

            System.out.println((i + 1) + ". " + prod[i] + " : S/. " + prec[i]);

        }

        ejecutarSeleccion(escaner, prod, prec);

    }



    public static void subCategoriaJardineria(Scanner escaner) {

        String[] prod = {

            "Tierra Preparada para Plantas Bolsa 5kg", "Manguera de Jardín Reforzada 1/2\" x 15m",

            "Pistola para Riego Multichorro Tramontina", "Fertilizante Completo NPK Bolsa 1kg",

            "Maceta de Plástico Redonda Terracota 30cm", "Tijera para Podar Ramas Flores Bahco",

            "Regadera de Plástico 5 Litros Jardín", "Semillas de Césped Americano Caja 500g",

            "Pala Jardinera de Mano Acero", "Pulverizador Manual de Presión Previa 2L"

        };

        double[] prec = {8.50, 49.90, 19.90, 14.50, 12.00, 35.00, 15.90, 29.90, 7.50, 24.90};



        System.out.println("\n=== JARDINERÍA ===");

        for (int i = 0; i < prod.length; i++) {

            System.out.println((i + 1) + ". " + prod[i] + " : S/. " + prec[i]);

        }

        ejecutarSeleccion(escaner, prod, prec);

    }



    public static void subCategoriaOficina(Scanner escaner) {

        String[] prod = {

            "Papel Fotocopia Report A4 75g (Millar)", "Cuaderno Espiralado Universitario Cuadriculado",

            "Lapicero Bolígrafo Faber-Castell Trilux (Caja x 12)", "Organizador de Escritorio de Malla Metálica",

            "Calculadora Científica Casio FX-82LA Plus", "Archivador de Palanca Lomo Ancho Oficio",

            "Plumón para Pizarra Recargable Pilot (Unidad)", "Notas Adhesivas Post-it 3\"x3\"",

            "Tijera de Oficina de Acero 7\" Artesco", "Grapadora de Metal de Oficina Standley"

        };

        double[] prec = {32.00, 7.50, 14.40, 24.90, 69.00, 8.50, 6.20, 5.50, 6.90, 19.90};



        System.out.println("\n=== OFICINA Y ESCOLAR ===");

        for (int i = 0; i < prod.length; i++) {

            System.out.println((i + 1) + ". " + prod[i] + " : S/. " + prec[i]);

        }

        ejecutarSeleccion(escaner, prod, prec);

    }



    public static void subCategoriaInfantil(Scanner escaner) {

        String[] prod = {

            "Pañales Huggies Triple Protección G x 48 unidades", "Toallitas Húmedas Pampers Recién Nacido x 80",

            "Piscina de Pelotas Infantil Inflable", "Juego de Bloques de Construcción x 100 piezas",

            "Silla de Comer para Bebé Plegable", "Coche Bastón para Bebé Ligero",

            "Biberón Anticólicos Avent 260ml", "Extractor de Leche Materno Manual",

            "Shampoo para Bebé Johnson's Baby 400ml", "Mordedor de Goma Refrigerable para Dentición"

        };

        double[] prec = {45.90, 14.90, 69.00, 39.90, 149.00, 189.00, 34.90, 99.00, 18.50, 9.90};



        System.out.println("\n=== INFANTIL ===");

        for (int i = 0; i < prod.length; i++) {

            System.out.println((i + 1) + ". " + prod[i] + " : S/. " + prec[i]);

        }

        ejecutarSeleccion(escaner, prod, prec);

    }



    public static void subCategoriaSaludDeportes(Scanner escaner) {

        String[] prod = {

            "Mancuernas de Fierro Fundido 5kg (Par)", "Colchoneta Mat para Yoga Antideslizante 6mm",

            "Rueda Abdominal para Ejercicios Core", "Liga de Resistencia Elástica en Ocho",

            "Tomatodo Deportivo de Acero Inoxidable 750ml", "Pelota de Fútbol Oficial Nro 5 Adidas",

            "Bicicleta Estacionaria Spinning para Hogar", "Protector de Rodilla Elástico Ajustable",

            "Cinta de Correr Caminadora Mecánica Eléctrica", "Guantes para Gimnasio con Muñequera"

        };

        double[] prec = {59.00, 34.90, 24.90, 12.50, 29.90, 89.00, 649.00, 15.00, 1299.00, 22.50};



        System.out.println("\n=== SALUD Y DEPORTES ===");

        for (int i = 0; i < prod.length; i++) {

            System.out.println((i + 1) + ". " + prod[i] + " : S/. " + prec[i]);

        }

        ejecutarSeleccion(escaner, prod, prec);

    }



    public static void subCategoriaMascotas(Scanner escaner) {

        String[] prod = {

            "Comida para Perro Adulto Ricocan Bolsa 15kg", "Comida para Gato Adulto Ricocat Bolsa 9kg",

            "Arena Sanitaria para Gato Bolsa 5kg Scoop", "Plato Doble de Plástico para Mascota",

            "Collar Ajustable con Cascabel para Gato Perro", "Shampoo Medicado Antipulgas para Perro 400ml",

            "Cama Acolchada Mediana para Mascota", "Snack Galletas para Perro Mimaskot Pack",

            "Juguete Hueso de Goma Mordedor", "Transportador de Plástico para Gato Perro Chico"

        };

        double[] prec = {129.00, 89.00, 18.50, 9.90, 7.50, 24.00, 55.00, 6.50, 8.90, 79.00};



        System.out.println("\n=== MASCOTAS ===");

        for (int i = 0; i < prod.length; i++) {

            System.out.println((i + 1) + ". " + prod[i] + " : S/. " + prec[i]);

        }

        ejecutarSeleccion(escaner, prod, prec);

    }

//==============================================================================



    public static void procesarCompra(Scanner escaner, double precioCalculado) {

        System.out.println("\n-----------------------------");

        System.out.println("TOTAL A PAGAR: S/. " + precioCalculado);

        System.out.println("-----------------------------");

        System.out.print("¿Desea confirmar su compra? (SI/NO): ");

        String confirmacion = escaner.next();



        if (confirmacion.equalsIgnoreCase("SI")) {

            double subtotal = precioCalculado / 1.18;

            double igv = precioCalculado - subtotal;



            System.out.println("\n========================================");

            System.out.println("           PROMART HOMECENTER           ");

            System.out.println("      BOLETA DE VENTA ELECTRONICA       ");

            System.out.println("========================================");

            System.out.println(" CLIENTE   : " + (nombreTitular.equals("") ? "INVITADO" : nombreTitular + " " + apellidosTitular));

            System.out.println(" CORREO    : " + (correoLogin.equals("") ? "Invitado" : correoLogin));

            System.out.println(" DOCUMENTO : " + (tipoDocumento.equals("") ? "N/A" : tipoDocumento + " - " + numDocumento));

            System.out.println("----------------------------------------");

            System.out.println(" CANT.  DESCRIPCION                     ");

            System.out.printf(" 1      %-45s S/. %.2f\n", nombreProductoSeleccionado, precioCalculado);

            System.out.println("--------------------------------------------------");

            System.out.printf(" SUBTOTAL   : S/. %.2f\n", subtotal);

            System.out.printf(" IGV (18%%)  : S/. %.2f\n", igv);

            System.out.println("----------------------------------------------------------");

            System.out.printf(" IMPORTE TOTAL : S/. %.2f\n", precioCalculado);

            System.out.println("========================================");

            System.out.println(" Representación impresa de la Boleta\n de Venta Electrónica");

            System.out.println(" Consulte su documento en\n https://www.promart.pe/");

            System.out.println("========================================");

        } else {

            System.out.println("Pedido cancelado. Volviendo al menu principal.");

        }

        System.out.println("Presione **ENTER** para volver al menú principal...");

        escaner.nextLine(); 

        escaner.nextLine(); 

    }

}





    
