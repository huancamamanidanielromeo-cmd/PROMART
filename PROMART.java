
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.YearMonth;
import java.time.format.DateTimeParseException;
import java.time.LocalDateTime;

public class PROMART {
    

    static String correoRegistrado = "";
    static String correoLogin = "";
    static String numDocumento = "";
    static String nombreTitular = "";
    static double precio = 0.0;
    static String contraRegistrada = "";
    
//menu de badiables para despues de seleccionar compras
    
    static String apellidosTitular = "";
    static String tipoDocumento = "";
    static String telefonoMovil = "";
    static String departamento = "";
    static String provincia = "";
    static String distrito = "";
    static String nombreProductoSeleccionado = "";

    
    // PARTE DE DANIEL

    
    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);
        String contraLogin = "";
        int opcionMenu = 0;


        
        
        // Bucle Principio
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


                    
                    // Verifi




                    
                    if (correoLogin.equals(correoRegistrado) && contraLogin.equals(contraRegistrada) && !correoRegistrado.equals("")) {
                        System.out.println("¡Login exitoso! Bienvenido de nuevo.");
                        menuCategorias(escaner);
                    } else if (correoLogin.equals("admin@gmail.com") && contraLogin.equals("12345678@")) {
                        // Acceso de prueba extraído de tu código
                        System.out.println("Ingreso exitoso a Promart. Bienvenido Admin.");
                        menuCategorias(escaner);
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
                        // Regla de validación de correo adaptada
                        if (correoRegistrado.contains("@") && correoRegistrado.endsWith(".com")) {
                            correoValido = true;
                        } else {
                            System.out.println("Error: El correo debe contener '@' y terminar en '.com'");
                        }
                    } while (!correoValido);





                    
                    String clave1 = "";
                    String clave2 = "";
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

    
    // Men Categorias


    public static void menuCategorias(Scanner escaner) {
        int opcionCategoria = 0;
        while (opcionCategoria != 24) {
            
            System.out.println();
            
            System.out.println("___________________ CATEGORIAS DISPONIBLES ___________________");
            
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

//////////////////////////////////////////////////////////////////////////////////
                // ABEL
                case 1:
                    eleccionMenu(opcionCategoria);
                    subCategoriaAbel(opcionCategoria, escaner);
                    break;
                case 2:
                    eleccionMenu(opcionCategoria);
                    subCategoriaAbel(opcionCategoria, escaner);
                    break;
                case 3:
                    eleccionMenu(opcionCategoria);
                    subCategoriaAbel(opcionCategoria, escaner);
                    break;
                case 4:
                    eleccionMenu(opcionCategoria);
                    subCategoriaAbel(opcionCategoria, escaner);
                    break;
                case 5:
                    eleccionMenu(opcionCategoria);
                    subCategoriaAbel(opcionCategoria, escaner);
                    break;
                case 6:
                    eleccionMenu(opcionCategoria);
                    subCategoriaAbel(opcionCategoria, escaner);
                    break;
                case 7:
                    eleccionMenu(opcionCategoria);
                    subCategoriaAbel(opcionCategoria, escaner);
                    break;
                case 8:
                    eleccionMenu(opcionCategoria);
                    subCategoriaAbel(opcionCategoria, escaner);
                    break;

                // ADRIAN
                case 9:
                    subCategoriaIluminacion(escaner);
                    break;
                case 10:
                    subCategoriaOrganizacion(escaner);
                    break;
                case 11:
                    subCategoriaCocina(escaner);
                    break;
                case 12:
                    subCategoriaDormitorio(escaner);
                    break;
                case 13:
                    subCategoriaConstruccion(escaner);
                    break;
                case 14:
                    subCategoriaElectricidad(escaner);
                    break;
                case 15:
                    subCategoriaGasfiteria(escaner);
                    break;
                case 16:
                    subCategoriaPinturas(escaner);
                    break;

                // ZAMIR
                case 17:
                    subCategoriaFerreteria(escaner);
                    break;
                case 18:
                    subCategoriaAutomotriz(escaner);
                    break;
                case 19:
                    subCategoriaJardineria(escaner);
                    break;
                case 20:
                    subCategoriaOficina(escaner);
                    break;
                case 21:
                    subCategoriaInfantil(escaner);
                    break;
                case 22:
                    subCategoriaSaludDeportes(escaner);
                    break;
                case 23:
                    subCategoriaMascotas(escaner);
                    break;

                case 24:
                    System.out.println("Regresando al menu de inicio...");
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
                    break;
            }
        }
    }




    //PARTE DE ABEL
    public static void eleccionMenu(int categoria){
        switch(categoria){
            case 1:
                System.out.println("Usted eligio productos de limpieza ");
                break;
            case 2:
                System.out.println("Usted eligio productos de Tegnología");
                break;
            case 3:
                System.out.println("Usted eligio productos de Electrohogar");
                break;
            case 4:
                System.out.println("Usted eligio productos de Muebles");
                break;
            case 5:
                System.out.println("Usted eligio productos de Terraza Y Aire Libre");
                break;
            case 6:
                System.out.println("Usted eligio productos de Baño");
                break;
            case 7:
                System.out.println("Usted eligio productos de Herramientas");
                break;
            case 8:
                System.out.println("Usted eligio productos de Pisos y cerámicos");
                break;
            default:
                System.out.println("Categoria no valida");
                break;
        }
    }




    public static void subCategoriaAbel(int subCategoria, Scanner scanner) {

        
        int producto = 0;
        int cantidad = 0;
        
        switch (subCategoria) {
                
            case 1:
                
                System.out.println("PRODUCTOS DE LIMPIEZA");
                System.out.println("1.  Limpiador Multipropósito con Vinagre 650 ml Daryza           : S/.9.90");
                System.out.println("2.  Pinesol 4.5 Lt                                               : S/. 44.50");
                System.out.println("3.  Destructor De Sarro Pato Cítrico 710ml                       : S/. 25");
                System.out.println("4.  Pato Destructor de Sarro 710 Ml                              : S/. 25");
                System.out.println("5.  Limpiador Lavadoras Impecables Binner 300 Ml                 : S/. 22.90");
                System.out.println("6.  Desinfectante baños y duchas 500ml + repuesto Binner         : S/. 19.90");
                System.out.println("7.  Desinfectante Aire Binner Eucalipto Limon x 2 Unidades       : S/. 28.90");
                System.out.println("8.  Saniquat 500 desinfectante 1 litro                           : S/. 107.40");
                System.out.println("9.  Desinfectante Pino Daryza 5gl                                : S/. 69.90");
                System.out.println("10. Toallas Desinfectantes Clorox Expert 30 Unid                 : S/. 11.90");
                
                break;
                
            case 2:
                
                System.out.println("PRODUCTOS DE TEGNOLOGÍA (LAPTOPS)");
                System.out.println("1.  Laptop Lenovo Ideapad Slim 3 AMD Ryzen 5 7520U 8GB RAM 512GB SSD                         :S/. 1,849");
                System.out.println("2.  Combo Laptop HP 250 G10 Intel Core i3 N305 8GB RAM 256GB SSD                             :S/. 1,619");
                System.out.println("3.  Laptop Lenovo IdeaPad Slim 3 15IAH8 15.6in FHD Intel Core i5-12450H 8GB RAM 512GB SSD    :S/. 2,079");
                System.out.println("4.  LAPTOP HP 250 G10 15.6in HD LED Core i7-1355U 5GHz 8GB DDR4-3200 512GB SSD               :S/. 3,099");
                System.out.println("5.  Macbook Air 13in Chip M5 512GB SSD 16GB RAM - STARLIGHT                                  :S/. 5,299");
                System.out.println("6.  Laptop ASUS TUF Gaming A15 15.6in AMD Ryzen 7 7445HS 512GB SSD 8GB RTX3050               :S/. 3,199");
                System.out.println("7.  Laptop HP 250R G10 Intel Core 5 120U 16GB RAM 512 SSD                                    :S/. 2,399");
                System.out.println("8.  Laptop HP 255 G10 AMD Ryzen 3 7320U 8GB RAM 256GB SSD                                    :S/. 1,599");
                System.out.println("9.  Laptop HP 255 G10 AMD Ryzen 3 7320U 8GB RAM 256GB SSD                                    :S/. 1,599");
                System.out.println("10. Laptop HP 250R G10 Intel Core 5 120U 16GB RAM 512 SSD                                    :S/. 2,399");
                
                break;
                
            case 3:
                
                System.out.println("PRODUCTOS DE ELECTROHOGAR (LAVADORAS)");
                System.out.println("1.  Lavadora LG WT13OBVTB 13Kg TurboDrum                   : S/. 1,249");
                System.out.println("2.  Lavadora LG WT19OBVTB 19Kg Carga Superior              : S/. 1,449");
                System.out.println("3.  Lavadora Samsung WA19CG6441BDPE 19Kg EcoBubble         : S/. 2,099");
                System.out.println("4.  Lavadora Indurama LRI19CRI 19Kg Inverter               : S/. 1,299");
                System.out.println("5.  Lavadora Electrolux EWIP15F2XSWB 15Kg                  : S/. 1,799");
                System.out.println("6.  Lavadora LG WT9BVTB 9Kg Carga Superior                 : S/. 999");
                System.out.println("7.  Lavadora Samsung 15Kg AI EcoBubble                     : S/. 1,499");
                System.out.println("8.  Lavadora Indurama LRI-18DGR 18Kg                       : S/. 1,599");
                System.out.println("9.  Lavadora Mabe 16Kg Semiautomática                      : S/. 999");
                System.out.println("10. Lavadora Blackline SPBL16TL 16Kg                      : S/. 799");
                
                break;
                
            case 4:
                
                System.out.println("PRODUCTOS DE MUEBLES (JUEGOS DE SALA) ");
                System.out.println("1.  Juego de Sala Spring 3-2 Tela Beige Forli              : S/. 3,598");
                System.out.println("2.  Juego de Sala Lineal Mundial 3-2 Tela Plata Forli      : S/. 3,318");
                System.out.println("3.  Juego de Sala Montiano Marrón 3-2-1 Forli              : S/. 4,598");
                System.out.println("4.  Juego de Sala Montiano 2-1 Negro Forli                 : S/. 2,518");
                System.out.println("5.  Juego de Sala Spring 3-2 Tela Mando Forli              : S/. 3,598");
                System.out.println("6.  Juego de Sala Aliyah 3-2 Tabaco Forli                  : S/. 4,798");
                System.out.println("7.  Juego de Sala Montiano 3-2 Marrón Forli                : S/. 3,638");
                System.out.println("8.  Juego de Sala Montiano 3-2 Negro Forli                 : S/. 3,638");
                System.out.println("9.  Juego de Sala Havana 2-1-1 Plata + Mesa                : S/. 2,798");
                System.out.println("10. Juego de Sala Montiano 3-2-1 Marrón Forli              : S/. 2,518");
                
                break;
                
            case 5:
                
                System.out.println("PRODUCTOS DE TERRAZA Y AIRE LIBRE");
                System.out.println("1.  Parrilla a Gas 4 Quemadores                            : S/. 899");
                System.out.println("2.  Juego de Terraza Mesa + 4 Sillas                       : S/. 1,299");
                System.out.println("3.  Piscina Inflable Bestway                               : S/. 249");
                System.out.println("4.  Toldo Retráctil 3x3m                                   : S/. 599");
                System.out.println("5.  Hamaca con Soporte                                     : S/. 159");
                System.out.println("6.  Set de Muebles Rattan                                  : S/. 1,899");
                System.out.println("7.  Fogón Exterior                                         : S/. 399");
                System.out.println("8.  Cortadora de Césped                                    : S/. 449");
                System.out.println("9.  Sombrilla Playa 2.5m                                   : S/. 99");
                break;
                
            case 6:
                
                System.out.println("PRODUCTOS DE BAÑO");
                System.out.println("1.  Combo Sanitario + Lavatorio Blanco                     : S/. 349");
                System.out.println("2.  Gabinete de Baño con Espejo                            : S/. 199");
                System.out.println("3.  Mezcladora para Ducha Cromada                          : S/. 129");
                System.out.println("4.  Set de Accesorios de Baño (5 pzas)                      : S/. 49");
                System.out.println("5.  Mampara de Vidrio Templado para Ducha                  : S/. 499");
                System.out.println("6.  Extractor de Aire para Baño                            : S/. 79");
                break;
                
            case 7:
                
                System.out.println("PRODUCTOS DE HERRAMIENTAS");
                System.out.println("1.  Rotomartillo Inalámbrico Bosch 20V                     : S/. 649");
                System.out.println("2.  Amoladora Angular DeWalt 4-1/2\"                        : S/. 329");
                System.out.println("3.  Caja de Herramientas Completa Stanley (150 pzas)       : S/. 299");
                System.out.println("4.  Set de Destornilladores Tramontina (6 pzas)            : S/. 39");
                System.out.println("5.  Medidor de Distancia Láser Makita                      : S/. 249");
                break;
            case 8:
                
                System.out.println("PRODUCTOS DE PISOS Y CERÁMICOS");
                System.out.println("1.  Porcelanato Pulido 60x60 cm Gris (m2)                  : S/. 39.90");
                System.out.println("2.  Piso Laminado Madera 8mm (m2)                          : S/. 45.90");
                System.out.println("3.  Cerámico Pared Blanco Brillante 30x45 cm (m2)          : S/. 24.90");
                System.out.println("4.  Pegamento para Porcelanato Bolsa 25kg                  : S/. 32.90");
                System.out.println("5.  Fragua para Cerámicos 1kg                              : S/. 7.90");
                
                break;
        }

        System.out.print("Elige el producto: ");
        producto = scanner.nextInt();
        System.out.print("Cantidad: ");
        cantidad = scanner.nextInt();


        switch (subCategoria) {
            case 1:
                switch(producto){
                    case 1: precio = 9.90*cantidad; nombreProductoSeleccionado = "Limpiador Multipropósito con Vinagre 650 ml Daryza"; 
                        break;
                    case 2: precio = 44.50*cantidad; nombreProductoSeleccionado = "Pinesol 4.5 Lt";
                        break;
                    case 3: precio = 25*cantidad; nombreProductoSeleccionado = "Destructor De Sarro Pato Cítrico 710ml"; 
                        break;
                    case 4: precio = 25*cantidad; nombreProductoSeleccionado = "Pato Destructor de Sarro 710 Ml";
                        break;
                    case 5: precio = 22.90*cantidad; nombreProductoSeleccionado = "Limpiador Lavadoras Impecables Binner 300 Ml"; 
                        break;
                    case 6: precio = 19.90*cantidad; nombreProductoSeleccionado = "Desinfectante baños y duchas 500ml + repuesto Binner"; 
                        break;
                    case 7: precio = 28.90*cantidad; nombreProductoSeleccionado = "Desinfectante Aire Binner Eucalipto Limon x 2 Unidades"; 
                        break;
                    case 8: precio = 107.40*cantidad; nombreProductoSeleccionado = "Saniquat 500 desinfectante 1 litro";
                        break;
                    case 9: precio = 69.90*cantidad; nombreProductoSeleccionado = "Desinfectante Pino Daryza 5gl"; 
                        break;
                    case 10: precio = 11.90*cantidad; nombreProductoSeleccionado = "Toallas Desinfectantes Clorox Expert 30 Unid";
                        break;
                }
                break;
            case 2:
                switch(producto){
                    case 1: precio = 1849*cantidad; nombreProductoSeleccionado = "Laptop Lenovo Ideapad Slim 3 AMD Ryzen 5 7520U 8GB RAM 512GB SSD";
                        break;
                    case 2: precio = 1619*cantidad; nombreProductoSeleccionado = "Combo Laptop HP 250 G10 Intel Core i3 N305 8GB RAM 256GB SSD";
                        break;
                    case 3: precio = 2079*cantidad; nombreProductoSeleccionado = "Laptop Lenovo IdeaPad Slim 3 15IAH8 15.6in FHD Intel Core i5-12450H 8GB RAM 512GB SSD"; 
                        break;
                    case 4: precio = 3099*cantidad; nombreProductoSeleccionado = "LAPTOP HP 250 G10 15.6in HD LED Core i7-1355U 5GHz 8GB DDR4-3200 512GB SSD"; 
                        break;
                    case 5: precio = 5299*cantidad; nombreProductoSeleccionado = "Macbook Air 13in Chip M5 512GB SSD 16GB RAM - STARLIGHT";
                        break;
                    case 6: precio = 3199*cantidad; nombreProductoSeleccionado = "Laptop ASUS TUF Gaming A15 15.6in AMD Ryzen 7 7445HS 512GB SSD 8GB RTX3050";
                        break;
                    case 7: precio = 2399*cantidad; nombreProductoSeleccionado = "Laptop HP 250R G10 Intel Core 5 120U 16GB RAM 512 SSD"; 
                        break;
                    case 8: precio = 1599*cantidad; nombreProductoSeleccionado = "Laptop HP 255 G10 AMD Ryzen 3 7320U 8GB RAM 256GB SSD"; 
                        break;
                    case 9: precio = 1599*cantidad; nombreProductoSeleccionado = "Laptop HP 255 G10 AMD Ryzen 3 7320U 8GB RAM 256GB SSD"; 
                        break;
                    case 10: precio = 2399*cantidad; nombreProductoSeleccionado = "Laptop HP 250R G10 Intel Core 5 120U 16GB RAM 512 SSD";
                        break;
                }
                break;
            case 3:
                switch(producto){
                    case 1: precio = 1249*cantidad; nombreProductoSeleccionado = "Lavadora LG WT13OBVTB 13Kg TurboDrum";
                        break;
                    case 2: precio = 1449*cantidad; nombreProductoSeleccionado = "Lavadora LG WT19OBVTB 19Kg Carga Superior";
                        break;
                    case 3: precio = 2099*cantidad; nombreProductoSeleccionado = "Lavadora Samsung WA19CG6441BDPE 19Kg EcoBubble";
                        break;
                    case 4: precio = 1299*cantidad; nombreProductoSeleccionado = "Lavadora Indurama LRI19CRI 19Kg Inverter"; 
                        break;
                    case 5: precio = 1799*cantidad; nombreProductoSeleccionado = "Lavadora Electrolux EWIP15F2XSWB 15Kg"; 
                        break;
                    case 6: precio = 999*cantidad; nombreProductoSeleccionado = "Lavadora LG WT9BVTB 9Kg Carga Superior"; 
                        break;
                    case 7: precio = 1499*cantidad; nombreProductoSeleccionado = "Lavadora Samsung 15Kg AI EcoBubble"; 
                        break;
                    case 8: precio = 1599*cantidad; nombreProductoSeleccionado = "Lavadora Indurama LRI-18DGR 18Kg"; 
                        break;
                    case 9: precio = 999*cantidad; nombreProductoSeleccionado = "Lavadora Mabe 16Kg Semiautomática";
                        break;
                    case 10: precio = 799*cantidad; nombreProductoSeleccionado = "Lavadora Blackline SPBL16TL 16Kg"; 
                        break;
                }
                break;
            case 4:
                switch(producto){
                    case 1: precio = 3598*cantidad; nombreProductoSeleccionado = "Juego de Sala Spring 3-2 Tela Beige Forli"; 
                        break;
                    case 2: precio = 3318*cantidad; nombreProductoSeleccionado = "Juego de Sala Lineal Mundial 3-2 Tela Plata Forli"; 
                        break;
                    case 3: precio = 4598*cantidad; nombreProductoSeleccionado = "Juego de Sala Montiano Marrón 3-2-1 Forli"; 
                        break;
                    case 4: precio = 2518*cantidad; nombreProductoSeleccionado = "Juego de Sala Montiano 2-1 Negro Forli"; 
                        break;
                    case 5: precio = 3598*cantidad; nombreProductoSeleccionado = "Juego de Sala Spring 3-2 Tela Mando Forli";
                        break;
                    case 6: precio = 4798*cantidad; nombreProductoSeleccionado = "Juego de Sala Aliyah 3-2 Tabaco Forli";
                        break;
                    case 7: precio = 3638*cantidad; nombreProductoSeleccionado = "Juego de Sala Montiano 3-2 Marrón Forli";
                        break;
                    case 8: precio = 3638*cantidad; nombreProductoSeleccionado = "Juego de Sala Montiano 3-2 Negro Forli";
                        break;
                    case 9: precio = 2798*cantidad; nombreProductoSeleccionado = "Juego de Sala Havana 2-1-1 Plata + Mesa";
                        break;
                    case 10: precio = 2518*cantidad; nombreProductoSeleccionado = "Juego de Sala Montiano 3-2-1 Marrón Forli"; 
                        break;
                }
                break;
            case 5:
                switch(producto){
                    case 1: precio = 899*cantidad; nombreProductoSeleccionado = "Parrilla a Gas 4 Quemadores"; 
                        break;
                    case 2: precio = 1299*cantidad; nombreProductoSeleccionado = "Juego de Terraza Mesa + 4 Sillas";
                        break;
                    case 3: precio = 249*cantidad; nombreProductoSeleccionado = "Piscina Inflable Bestway"; 
                        break;
                    case 4: precio = 599*cantidad; nombreProductoSeleccionado = "Toldo Retráctil 3x3m"; 
                        break;
                    case 5: precio = 159*cantidad; nombreProductoSeleccionado = "Hamaca con Soporte";
                        break;
                    case 6: precio = 1899*cantidad; nombreProductoSeleccionado = "Set de Muebles Rattan"; 
                        break;
                    case 7: precio = 399*cantidad; nombreProductoSeleccionado = "Fogón Exterior";
                        break;
                    case 8: precio = 449*cantidad; nombreProductoSeleccionado = "Cortadora de Césped";
                        break;
                    case 9: precio = 99*cantidad; nombreProductoSeleccionado = "Sombrilla Playa 2.5m"; 
                        break;
                }
                break;
            case 6:
                switch(producto){
                    case 1: precio = 349*cantidad; nombreProductoSeleccionado = "Combo Sanitario + Lavatorio Blanco"; 
                        break;
                    case 2: precio = 199*cantidad; nombreProductoSeleccionado = "Gabinete de Baño con Espejo";
                        break;
                    case 3: precio = 129*cantidad; nombreProductoSeleccionado = "Mezcladora para Ducha Cromada"; 
                        break;
                    case 4: precio = 49*cantidad; nombreProductoSeleccionado = "Set de Accesorios de Baño (5 pzas)";
                        break;
                    case 5: precio = 499*cantidad; nombreProductoSeleccionado = "Mampara de Vidrio Templado para Ducha"; 
                        break;
                    case 6: precio = 79*cantidad; nombreProductoSeleccionado = "Extractor de Aire para Baño"; 
                        break;
                }
                break;
            case 7:
                switch(producto){
                    case 1: precio = 649*cantidad; nombreProductoSeleccionado = "Rotomartillo Inalámbrico Bosch 20V";
                        break;
                    case 2: precio = 329*cantidad; nombreProductoSeleccionado = "Amoladora Angular DeWalt 4-1/2\"";
                        break;
                    case 3: precio = 299*cantidad; nombreProductoSeleccionado = "Caja de Herramientas Completa Stanley (150 pzas)"; 
                        break;
                    case 4: precio = 39*cantidad; nombreProductoSeleccionado = "Set de Destornilladores Tramontina (6 pzas)"; 
                        break;
                    case 5: precio = 249*cantidad; nombreProductoSeleccionado = "Medidor de Distancia Láser Makita";
                        break;
                }
                break;
            case 8:
                switch(producto){
                    case 1: precio = 39.90*cantidad; nombreProductoSeleccionado = "Porcelanato Pulido 60x60 cm Gris (m2)";
                        break;
                    case 2: precio = 45.90*cantidad; nombreProductoSeleccionado = "Piso Laminado Madera 8mm (m2)";
                        break;
                    case 3: precio = 24.90*cantidad; nombreProductoSeleccionado = "Cerámico Pared Blanco Brillante 30x45 cm (m2)";
                        break;
                    case 4: precio = 32.90*cantidad; nombreProductoSeleccionado = "Pegamento para Porcelanato Bolsa 25kg"; 
                        break;
                    case 5: precio = 7.90*cantidad; nombreProductoSeleccionado = "Fragua para Cerámicos 1kg"; 
                        break;
                }
                break;
        }
        if (precio > 0) {
            System.out.println("\nUsted ha escogido: " + nombreProductoSeleccionado + " x" + cantidad);
            procesarCompra(scanner, precio);
        }
    }

    //PARTE DE ADRIAN


    public static void subCategoriaIluminacion(Scanner escaner) {

        
        System.out.println("\n=== FOCOS LED ===");
        
        System.out.println("RECOMENDADOS: ");
        System.out.println("1. Foco Vintage G45 E27 1W Luz Cálida Clear x 6 unidades Orange : S/. 19.90");
        
        System.out.println("2. Foco Led Smart Wifi Cla60 220V 7W E27 Ledvance               : S/. 25.00");
        
        System.out.println("3. Foco High Power Led E27 48W Luz Fría Orange                  : S/. 19.90");
        
        System.out.println("4. Foco LED UFO 34W Luz Fría Orange                            : S/. 39.90");
        
        System.out.println("5. Foco LED Smart Nexxt Nhb-C120MRGB                            : S/. 39.00");
        
        System.out.println("6. Foco LED High Power Orange 18W Luz Fría                     : S/. 9.90");
        
        System.out.println("7. Foco LED Philips Luz Blanca x2 14W E27 Ahorro Energético    : S/. 21.90");
        
        System.out.println("8. Foco Werken Smart                                            : S/. 25.00");
        
        System.out.println("9. Foco LED UFO Orange E27 15W Luz Fría                         : S/. 12.90");
        
        System.out.println("10. Pack x 2 Foco Led G95 7W Luz Cálida Ámbar Orange            : S/. 29.90");
        
        System.out.print("Selecciona un producto: ");
        
        int producto = escaner.nextInt();
        System.out.print("Cantidad: ");
        int cantidad = escaner.nextInt();

        double precioUnidad = 0;
        switch (producto) {
            case 1: precioUnidad = 19.90; nombreProductoSeleccionado = "Foco Vintage G45 E27 1W Luz Cálida Clear x 6 unidades Orange"; 
                break;
            case 2: precioUnidad = 25.00; nombreProductoSeleccionado = "Foco Led Smart Wifi Cla60 220V 7W E27 Ledvance"; 
                break;
            case 3: precioUnidad = 19.90; nombreProductoSeleccionado = "Foco High Power Led E27 48W Luz Fría Orange"; 
                break;
            case 4: precioUnidad = 39.90; nombreProductoSeleccionado = "Foco LED UFO 34W Luz Fría Orange";
                break;
            case 5: precioUnidad = 39.00; nombreProductoSeleccionado = "Foco LED Smart Nexxt Nhb-C120MRGB";
                break;
            case 6: precioUnidad = 9.90; nombreProductoSeleccionado = "Foco LED High Power Orange 18W Luz Fría"; 
                break;
            case 7: precioUnidad = 21.90; nombreProductoSeleccionado = "Foco LED Philips Luz Blanca x2 14W E27 Ahorro Energético";
                break;
            case 8: precioUnidad = 25.00; nombreProductoSeleccionado = "Foco Werken Smart";
                break;
            case 9: precioUnidad = 12.90; nombreProductoSeleccionado = "Foco LED UFO Orange E27 15W Luz Fría"; 
                break;
            case 10: precioUnidad = 29.90; nombreProductoSeleccionado = "Pack x 2 Foco Led G95 7W Luz Cálida Ámbar Orange";
                break;
            default: System.out.println("Producto no valido.");
                return;
        }
        precio = precioUnidad * cantidad;
        if(precio > 0) {
            System.out.println("\nUsted ha escogido: " + nombreProductoSeleccionado + " x" + cantidad);
            procesarCompra(escaner, precio);
        }
    }


    
    public static void subCategoriaOrganizacion(Scanner escaner) {
        
        System.out.println("\n=== PRODUCTOS ORGANIZACION Y DECOHOGAR ===");
        System.out.println("1. Alfombra Juego Mundo 80x150cm                                          : S/. 27.00");
        
        
        System.out.println("2. Lámpara Colgante Calada 18cm Alto Astronauta                           : S/. 35.60");
        
        System.out.println("3. Juego x 6 piezas Vaso Alto Labrado 330ml Y6015                         : S/. 27.00");
        
        System.out.println("4. Farol Rectangular Negro 11x24cm Decore                                 : S/. 39.92");
        
        System.out.println("5. Lámpara de Mesa Trama Ver 28cm Decore                                  : S/. 35.60");
        
        System.out.println("6. Lámpara Animal Print con Base de Metal 15x20x145cm Casa Bella          : S/. 60.40");
        
        System.out.println("7. Florero Esencia Acanalada 19cm Decore                                  : S/. 31.92");
        
        System.out.println("8. Florero Grande Elegant Decore                                          : S/. 59.92");
        
        System.out.println("9. Cuadro Canva bar & drinks 30x40cm Decore - Diseño Aleatorio            : S/. 23.92");
        
        System.out.println("10. Candelabro 12cm - Diseño Aleatorio Orange                             : S/. 15.00");
        
        System.out.print("Selecciona un producto: ");
        
        int producto = escaner.nextInt();
        System.out.print("Cantidad: ");
        int cantidad = escaner.nextInt();

        double precioUnidad = 0;
        switch (producto) {
            case 1: precioUnidad = 27.00; nombreProductoSeleccionado = "Alfombra Juego Mundo 80x150cm";
                break;
            case 2: precioUnidad = 35.60; nombreProductoSeleccionado = "Lámpara Colgante Calada 18cm Alto Astronauta";
                break;
            case 3: precioUnidad = 27.00; nombreProductoSeleccionado = "Juego x 6 piezas Vaso Alto Labrado 330ml Y6015"; 
                break;
            case 4: precioUnidad = 39.92; nombreProductoSeleccionado = "Farol Rectangular Negro 11x24cm Decore";
                break;
            case 5: precioUnidad = 35.60; nombreProductoSeleccionado = "Lámpara de Mesa Trama Ver 28cm Decore";
                break;
            case 6: precioUnidad = 60.40; nombreProductoSeleccionado = "Lámpara Animal Print con Base de Metal 15x20x145cm Casa Bella";
                break;
            case 7: precioUnidad = 31.92; nombreProductoSeleccionado = "Florero Esencia Acanalada 19cm Decore";
                break;
            case 8: precioUnidad = 59.92; nombreProductoSeleccionado = "Florero Grande Elegant Decore";
                break;
            case 9: precioUnidad = 23.92; nombreProductoSeleccionado = "Cuadro Canva bar & drinks 30x40cm Decore"; break;
                
            case 10: precioUnidad = 15.00; nombreProductoSeleccionado = "Candelabro 12cm - Diseño Aleatorio Orange"; break;
                
            default: System.out.println("Producto no valido."); return;
        }
        precio = precioUnidad * cantidad;
        if(precio > 0) {
            System.out.println("\nUsted ha escogido: " + nombreProductoSeleccionado + " x" + cantidad);
            procesarCompra(escaner, precio);
        }
    }

    public static void subCategoriaCocina(Scanner escaner) {
        
        System.out.println("=== PRODUCTOS DE COCINA ===");
        System.out.println("1. Horno Microondas LG 20L Negro                         : S/. 389.00");
        
        
        System.out.println("2. Licuadora Oster 2 Velocidades con Pulso               : S/. 189.00");
        
        System.out.println("3. Cocina a Gas Indurama 4 Hornillas                     : S/. 899.00");
        
        System.out.println("4. Arrocera Thomas 1.8 Litros                            : S/. 149.00");
        
        System.out.println("5. Extractor de Jugos Imaco Potente                      : S/. 199.00");
        
        System.out.println("6. Hervidor Eléctrico Record 1.7L Acero                  : S/. 79.00");
        
        System.out.println("7. Sartén Antiadherente Tramontina 24cm                  : S/. 45.00");
        
        System.out.println("8. Juego de Ollas Infinitum x 5 piezas Record            : S/. 259.00");
        
        System.out.println("9. Set de Cuchillos de Cocina x 6 piezas Carve           : S/. 59.00");
        
        System.out.println("10. Organizador de Platos Metálico Cromado Mueble        : S/. 49.00");
        
        System.out.print("Selecciona un producto: ");

        
        int producto = escaner.nextInt();
        System.out.print("Cantidad: ");
        int cantidad = escaner.nextInt();


        
        double precioUnidad = 0;
        switch (producto) {
            case 1: precioUnidad = 389.00; nombreProductoSeleccionado = "Horno Microondas LG 20L Negro";
                break;
            case 2: precioUnidad = 189.00; nombreProductoSeleccionado = "Licuadora Oster 2 Velocidades con Pulso"; 
                break;
            case 3: precioUnidad = 899.00; nombreProductoSeleccionado = "Cocina a Gas Indurama 4 Hornillas";
                break;
            case 4: precioUnidad = 149.00; nombreProductoSeleccionado = "Arrocera Thomas 1.8 Litros"; 
                break;
            case 5: precioUnidad = 199.00; nombreProductoSeleccionado = "Extractor de Jugos Imaco Potente"; 
                break;
            case 6: precioUnidad = 79.00; nombreProductoSeleccionado = "Hervidor Eléctrico Record 1.7L Acero";
                break;
            case 7: precioUnidad = 45.00; nombreProductoSeleccionado = "Sartén Antiadherente Tramontina 24cm"; 
                break;
            case 8: precioUnidad = 259.00; nombreProductoSeleccionado = "Juego de Ollas Infinitum x 5 piezas Record"; 
                break;
            case 9: precioUnidad = 59.00; nombreProductoSeleccionado = "Set de Cuchillos de Cocina x 6 piezas Carve"; 
                break;
            case 10: precioUnidad = 49.00; nombreProductoSeleccionado = "Organizador de Platos Metálico Cromado Mueble";
                break;
            default: System.out.println("Producto no valido.");
                return;
        }
        precio = precioUnidad * cantidad;
        if(precio > 0) {
            System.out.println("\nUsted ha escogido: " + nombreProductoSeleccionado + " x" + cantidad);
            procesarCompra(escaner, precio);
        }
    }

    public static void subCategoriaDormitorio(Scanner escaner) {
        
        System.out.println("=== PRODUCTOS DE DORMITORIO ===");
        
        
        System.out.println("1. Cama Box Tarima 4 Cajones PARAISO Pocket Star Chocolate King + 2 Almohadas : S/. 3499.00");
        
        System.out.println("2. Dormitorio 4 Cajones PARAISO Pocket Max Chocolate Queen + 2 Almohadas        : S/. 2899.00");
        
        System.out.println("3. Cama Boxet Paraíso Blocks Su Majestad Queen Chocolate + Cabecera             : S/. 1999.00");
        
        System.out.println("4. Cama Juvenil + Cabecera + Mesa de Noche Janeiro color Blanco/Negro 3 cajones : S/. 4600.00");
        
        System.out.println("5. Cama Boxet Paraíso Pocket Max 1.5 Plazas Champagne                           : S/. 2499.60");
        
        System.out.println("6. Ropero Florencia 7 Puertas 1 Cajón MDP Castaño                               : S/. 329.00");
        
        System.out.println("7. Ropero Bali Plus 6 Puertas MDP Canela/Blanco                                 : S/. 349.00");
        
        System.out.println("8. Tocador Charlotte 1 Cajón con Espejo Melamina Blanco/Nogal Bonno             : S/. 764.00");
        
        System.out.println("9. Cómoda Perú 4 cajones 1 puerta TV 40 Tuhome                                  : S/. 599.00");
        
        System.out.println("10. Cómoda Praga 3 Cajones 1 Puerta Abatible Melamina Wengue Tuhome             : S/. 450.00");
        
        System.out.print("Selecciona un producto: ");
        int producto = escaner.nextInt();
        System.out.print("Cantidad: ");
        int cantidad = escaner.nextInt();

        double precioUnidad = 0;
        switch (producto) {
            case 1: precioUnidad = 3499.00; nombreProductoSeleccionado = "Cama Box Tarima 4 Cajones PARAISO Pocket Star Chocolate King";
                break;
            case 2: precioUnidad = 2899.00; nombreProductoSeleccionado = "Dormitorio 4 Cajones PARAISO Pocket Max Chocolate Queen"; 
                break;
            case 3: precioUnidad = 1999.00; nombreProductoSeleccionado = "Cama Boxet Paraíso Blocks Su Majestad Queen Chocolate"; 
                break;
            case 4: precioUnidad = 4600.00; nombreProductoSeleccionado = "Cama Juvenil + Cabecera + Mesa de Noche Janeiro";
                break;
            case 5: precioUnidad = 2499.60; nombreProductoSeleccionado = "Cama Boxet Paraíso Pocket Max 1.5 Plazas Champagne";
                break;
            case 6: precioUnidad = 329.00; nombreProductoSeleccionado = "Ropero Florencia 7 Puertas 1 Cajón MDP Castaño"; 
                break;
            case 7: precioUnidad = 349.00; nombreProductoSeleccionado = "Ropero Bali Plus 6 Puertas MDP Canela/Blanco";
                break;
            case 8: precioUnidad = 764.00; nombreProductoSeleccionado = "Tocador Charlotte 1 Cajón con Espejo Melamina Blanco/Nogal Bonno"; 
                break;
            case 9: precioUnidad = 599.00; nombreProductoSeleccionado = "Cómoda Perú 4 cajones 1 puerta TV 40 Tuhome";
                break;
            case 10: precioUnidad = 450.00; nombreProductoSeleccionado = "Cómoda Praga 3 Cajones 1 Puerta Abatible Melamina Wengue Tuhome"; 
                break;
            default: System.out.println("Producto no valido."); return;
        }
        precio = precioUnidad * cantidad;
        if(precio > 0) {
            System.out.println("\nUsted ha escogido: " + nombreProductoSeleccionado + " x" + cantidad);
            procesarCompra(escaner, precio);
        }
    }

    public static void subCategoriaConstruccion(Scanner escaner) {
        
        System.out.println("\n=== PRODUCTOS DE CONSTRUCCION ===");
        
        System.out.println("1. Plancha de Drywall Gyplac Standard 3/8\" (9.5 mm) 1.22m x 2.44m          : S/. 31.90");
        
        System.out.println("2. Tablero melamina cendra escandinavo 18mm 7x8 Vesto                     : S/. 189.00");
        
        System.out.println("3. Techo calamina metálica Roja 0.22mm 3.60x0.80m Werken                  : S/. 39.90");
        
        
        System.out.println("4. Mortero de nivelacion para fijacion de equipos Sikagrout 110 30kg      : S/. 95.00");
        
        System.out.println("5. Techo Policarbonato 5.5mm Clear2.90x1.05m Poliligth-sh                  : S/. 79.50");
        
        System.out.println("6. Bloque de Vidrio Wave Azur 19x19x8cm Seves Glassblock                  : S/. 28.90");
        
        System.out.println("7. Ladrillo Pandereta Raya 10x14x22 cm                                    : S/. 1.35");
        
        System.out.println("8. Baldosa de vidrio para piso 20x20cm Seves Glassblock                   : S/. 29.90");
        
        System.out.println("9. Trompo eléctrico 180 litros                                            : S/. 899.00");
        
        System.out.println("10. Escalera Telescopica Fibra de Vidrio 24 Pasos                         : S/. 749.00");
        
        System.out.print("Selecciona un producto: ");
        
        
        int producto = escaner.nextInt();
        System.out.print("Cantidad: ");
        int cantidad = escaner.nextInt();

        double precioUnidad = 0;
        
        switch (producto) {
            case 1: precioUnidad = 31.90; nombreProductoSeleccionado = "Plancha de Drywall Gyplac Standard 3/8\"";
                break;
            case 2: precioUnidad = 189.00; nombreProductoSeleccionado = "Tablero melamina cendra escandinavo 18mm 7x8 Vesto";
                break;
            case 3: precioUnidad = 39.90; nombreProductoSeleccionado = "Techo calamina metálica Roja 0.22mm 3.60x0.80m Werken"; 
                break;
            case 4: precioUnidad = 95.00; nombreProductoSeleccionado = "Mortero de nivelacion para fijacion de equipos Sikagrout 110"; 
                break;
            case 5: precioUnidad = 79.50; nombreProductoSeleccionado = "Techo Policarbonato 5.5mm Clear2.90x1.05m Poliligth-sh";
                break;
            case 6: precioUnidad = 28.90; nombreProductoSeleccionado = "Bloque de Vidrio Wave Azur 19x19x8cm Seves Glassblock";
                break;
            case 7: precioUnidad = 1.35; nombreProductoSeleccionado = "Ladrillo Pandereta Raya 10x14x22 cm"; 
                break;
            case 8: precioUnidad = 29.90; nombreProductoSeleccionado = "Baldosa de vidrio para piso 20x20cm Seves Glassblock"; 
                break;
            case 9: precioUnidad = 899.00; nombreProductoSeleccionado = "Trompo eléctrico 180 litros"; 
                break;
            case 10: precioUnidad = 749.00; nombreProductoSeleccionado = "Escalera Telescopica Fibra de Vidrio 24 Pasos"; 
                break;
            default: System.out.println("Producto no valido.");
                return;
        }
        precio = precioUnidad * cantidad;
        if(precio > 0) {
            System.out.println("\nUsted ha escogido: " + nombreProductoSeleccionado + " x" + cantidad);
            procesarCompra(escaner, precio);
        }
    }

    public static void subCategoriaElectricidad(Scanner escaner) {

        
        System.out.println("=== PRODUCTOS DE ELECTRICIDAD ===");
        
        System.out.println("1. Cable THW-90 +plus 450/750 V 12 AWG Rojo 100m Indeco                     : S/. 215.00");
        
        
        System.out.println("2. Linterna Repelente Camping 4 en 1 Amarillo                               : S/. 34.90");
        
        System.out.println("3. Tomacorriente Doble Universal Orange Deco L/t                            : S/. 12.50");
        
        System.out.println("4. Lámpara de emergencia Werken de 2 luces 2.4w - Pack x 2 unidades         : S/. 49.00");
        
        System.out.println("5. Extensión 3 tomas tierra 3x18awg 5m Werken                               : S/. 29.90");
        
        System.out.println("6. Kit Digital TKL: Tablero Adosable 4 Polos Llave 2x25 + Medidor Digital   : S/. 69.00");
        
        System.out.println("7. Interruptor Simple Bticino Dplus Blanco 10A 250V                         : S/. 31.92");
        
        System.out.println("8. Kit de Alarma Protección de Seguridad Hikvision Minimun                   : S/. 449.00");
        
        System.out.println("9. Cámara de Seguridad Hikvision 2Mp H.265 Wifi Nvs Kit Dos Bullet           : S/. 399.00");
        
        System.out.println("10. Llave Termomagnética Bipolar 2x25A Bticino                              : S/. 45.00");
        
        System.out.print("Selecciona un producto: ");
        
        int producto = escaner.nextInt();
        System.out.print("Cantidad: ");
        int cantidad = escaner.nextInt();

        double precioUnidad = 0;
        switch (producto) {
            case 1: precioUnidad = 215.00; nombreProductoSeleccionado = "Cable THW-90 +plus 450/750 V 12 AWG Rojo 100m Indeco"; 
                break;
            case 2: precioUnidad = 34.90; nombreProductoSeleccionado = "Linterna Repelente Camping 4 en 1 Amarillo";
                break;
            case 3: precioUnidad = 12.50; nombreProductoSeleccionado = "Tomacorriente Doble Universal Orange Deco L/t"; 
                break;
            case 4: precioUnidad = 49.00; nombreProductoSeleccionado = "Lámpara de emergencia Werken de 2 luces 2.4w";
                break;
            case 5: precioUnidad = 29.90; nombreProductoSeleccionado = "Extensión 3 tomas tierra 3x18awg 5m Werken"; 
                break;
            case 6: precioUnidad = 69.00; nombreProductoSeleccionado = "Kit Digital TKL: Tablero Adosable 4 Polos Llave 2x25"; 
                break;
            case 7: precioUnidad = 31.92; nombreProductoSeleccionado = "Interruptor Simple Bticino Dplus Blanco 10A 250V";
                break;
            case 8: precioUnidad = 449.00; nombreProductoSeleccionado = "Kit de Alarma Protección de Seguridad Hikvision Minimun"; 
                break;
            case 9: precioUnidad = 399.00; nombreProductoSeleccionado = "Cámara de Seguridad Hikvision 2Mp H.265 Wifi Nvs Kit Dos Bullet";
                break;
            case 10: precioUnidad = 45.00; nombreProductoSeleccionado = "Llave Termomagnética Bipolar 2x25A Bticino";
                break;
            default: System.out.println("Producto no valido."); 
                return;
        }
        precio = precioUnidad * cantidad;
        if(precio > 0) {
            System.out.println("\nUsted ha escogido: " + nombreProductoSeleccionado + " x" + cantidad);
            procesarCompra(escaner, precio);
        }
    }

    public static void subCategoriaGasfiteria(Scanner escaner) {
        
        System.out.println("=== PRODUCTOS DE GASFITERIA ===");
        
        System.out.println("1. Tanque de Agua Arena Rotoplas Plus 1100 litros + Kit de Accesorios               : S/. 749.00");
        
        System.out.println("2. Tanque de agua Pro 1100 litros Negro + Kit de Accesorios                         : S/. 529.00");
        
        System.out.println("3. Electrobomba Periférica Werken 0.5 HP 32L/min Aluminio                           : S/. 129.00");
        
        System.out.println("4. Electrobomba Jet Werken 1 HP XJM101C Cuerpo de Acero                            : S/. 699.00");
        
        System.out.println("5. COMBO Tanque 1100L + Kit + Base metálica armable para tanque                     : S/. 1608.00");
        
        System.out.println("6. Sistema Doble Pulsador Jet Werken                                                : S/. 65.90");
        
        System.out.println("7. Llave doble manija para lavadora Werken                                           : S/. 65.90");
       
        System.out.println("8. Mezcladora de lavadero Monocomando al mueble Ocean Artic Vainsa                   : S/. 849.90");
        
        System.out.println("9. COMBO Lavadero básico 1 poza 50x41cm + Llave de lavadero Quadro                  : S/. 179.80");
        
        System.out.println("10. Combo Lavadero Serpens 2 pozas 82x46 Splendid + Llave Galápagos                  : S/. 389.00");
        
        System.out.print("Selecciona un producto: ");


        
        int producto = escaner.nextInt();
        System.out.print("Cantidad: ");
        int cantidad = escaner.nextInt();
        double precioUnidad = 0;

        
        switch (producto) {
                
            case 1: precioUnidad = 749.00; nombreProductoSeleccionado = "Tanque de Agua Arena Rotoplas Plus 1100 litros";
                break;
            case 2: precioUnidad = 529.00; nombreProductoSeleccionado = "Tanque de agua Pro 1100 litros Negro";
                break;
            case 3: precioUnidad = 129.00; nombreProductoSeleccionado = "Electrobomba Periférica Werken 0.5 HP 32L/min Aluminio"; 
                break;
            case 4: precioUnidad = 699.00; nombreProductoSeleccionado = "Electrobomba Jet Werken 1 HP XJM101C Cuerpo de Acero";
                break;
            case 5: precioUnidad = 1608.00; nombreProductoSeleccionado = "COMBO Tanque 1100L + Kit + Base metálica armable"; 
                break;
            case 6: precioUnidad = 65.90; nombreProductoSeleccionado = "Sistema Doble Pulsador Jet Werken";
                break;
            case 7: precioUnidad = 65.90; nombreProductoSeleccionado = "Llave doble manija para lavadora Werken"; 
                break;
            case 8: precioUnidad = 849.90; nombreProductoSeleccionado = "Mezcladora de lavadero Monocomando al mueble Ocean Artic Vainsa"; 
                break;
            case 9: precioUnidad = 179.80; nombreProductoSeleccionado = "COMBO Lavadero básico 1 poza 50x41cm + Llave Quadro";
                break;
            case 10: precioUnidad = 389.00; nombreProductoSeleccionado = "Combo Lavadero Serpens 2 pozas 82x46 Splendid + Llave Galápagos";
                break;
            default: System.out.println("Producto no valido."); 
                return;
                
        }
        precio = precioUnidad * cantidad;
        if(precio > 0) {
            System.out.println("\nUsted ha escogido: " + nombreProductoSeleccionado + " x" + cantidad);
            
            procesarCompra(escaner, precio);
        }
    }

    public static void subCategoriaPinturas(Scanner escaner) {
        
        System.out.println("\n=== PRODUCTOS DE PINTURAS Y ACABADOS ===");
        
        System.out.println("1. Pintura Látex CPP Pato Interiores Blanco 1 Balde         : S/. 145.00");
        
        System.out.println("2. Pintura Látex Vencedor Super Mate Blanco 1 Galón         : S/. 48.00");
        
        System.out.println("3. Esmalte Sintético Pato Orange Negro Gloss 1 Galón         : S/. 52.00");
        
        System.out.println("4. Imprimador para Paredes Fast Blanco 1 Balde               : S/. 85.00");
        
        System.out.println("5. Rodillo Antigota Profesional Mastodon 9 Pulgadas          : S/. 24.50");
        
        System.out.println("6. Brocha Premium Mango de Madera 3 Pulgadas Orange          : S/. 12.90");
        
        System.out.println("7. Thinner Acrílico Estándar Solven 1 Galón                  : S/. 32.00");
        
        System.out.println("8. Base de Imprimación Sika Wall Cero Salitre 5 Litros       : S/. 65.00");
        
        System.out.println("9. Lija para Madera Grano 80 Norton x 5 unidades             : S/. 8.50");
        
        System.out.println("10. Cinta Masking Tape Multipropósito Shurtape 2 Pulgadas    : S/. 9.90");
        
        System.out.print("Selecciona un producto: ");
        
        int producto = escaner.nextInt();
        
        System.out.print("Cantidad: ");
        
        int cantidad = escaner.nextInt();

        double precioUnidad = 0;
        switch (producto) {
                
            case 1: precioUnidad = 145.00; nombreProductoSeleccionado = "Pintura Látex CPP Pato Interiores Blanco 1 Balde"; 
                break;
            case 2: precioUnidad = 48.00; nombreProductoSeleccionado = "Pintura Látex Vencedor Super Mate Blanco 1 Galón";
                break;
            case 3: precioUnidad = 52.00; nombreProductoSeleccionado = "Esmalte Sintético Pato Orange Negro Gloss 1 Galón"; 
                break;
            case 4: precioUnidad = 85.00; nombreProductoSeleccionado = "Imprimador para Paredes Fast Blanco 1 Balde";
                break;
            case 5: precioUnidad = 24.50; nombreProductoSeleccionado = "Rodillo Antigota Profesional Mastodon 9 Pulgadas"; 
                break;
            case 6: precioUnidad = 12.90; nombreProductoSeleccionado = "Brocha Premium Mango de Madera 3 Pulgadas Orange";
                break;
            case 7: precioUnidad = 32.00; nombreProductoSeleccionado = "Thinner Acrílico Estándar Solven 1 Galón"; 
                break;
            case 8: precioUnidad = 65.00; nombreProductoSeleccionado = "Base de Imprimación Sika Wall Cero Salitre 5 Litros"; 
                
                break;
            case 9: precioUnidad = 8.50; nombreProductoSeleccionado = "Lija para Madera Grano 80 Norton x 5 unidades";
                
                break;
            case 10: precioUnidad = 9.90; nombreProductoSeleccionado = "Cinta Masking Tape Multipropósito Shurtape 2 Pulgadas";
                break;
            default: System.out.println("Producto no valido."); 
                
                return;
        }
        
        precio = precioUnidad * cantidad;
        if(precio > 0) {
            System.out.println("\nUsted ha escogido: " + nombreProductoSeleccionado + " x" + cantidad);
            procesarCompra(escaner, precio);
        }
    }

    // PARTE DE ZAMIR
    public static void subCategoriaFerreteria(Scanner S) { pinturas(2, S); }
    
    public static void subCategoriaAutomotriz(Scanner S) { pinturas(3, S); }
    
    public static void subCategoriaJardineria(Scanner S) { pinturas(4, S); }
    
    public static void subCategoriaOficina(Scanner S) { pinturas(5, S); }
    
    public static void subCategoriaInfantil(Scanner S) { pinturas(6, S); }
    
    public static void subCategoriaSaludDeportes(Scanner S) { pinturas(7, S); }
    
    public static void subCategoriaMascotas(Scanner S) { pinturas(8, S); }

    
    public static void pinturas(int categoria, Scanner S){

        
        if(categoria>=1 && categoria<=8){
            int opcion;
            int subopcion = 0;
            int cant = 1;
            double precioUnidad = 0;

            switch (categoria){
                    
                case 1:
                    
                    System.out.println("---Pinturas y acabados---");
                    System.out.println("1.- Pinturas Latex");
                    System.out.println("2.- Herramientas para pintar");
                    System.out.println("3.- Decoracion y paredes");
                    System.out.println("4.- Esmaltes y solventes");
                    System.out.println("5.- Acabados para madera");
                    System.out.println("6.- Escaleras");
                    System.out.println("7.- Pegamentos y Adhesivos");
                    System.out.println("Seleccione una opcion");
                    opcion=S.nextInt();
                    switch (opcion){
                            
                        case 1:
                            
                            System.out.println("---Pinturas latex---");
                            System.out.println("1.- Pinturas American Colors (S/. 65)");
                            System.out.println("2.- Pinturas Tekno (S/. 50)");
                            System.out.println("3.- Pinturas Pato (S/. 40)");
                            System.out.println("4.- Pinturas CPP (S/. 45)");
                            subopcion=S.nextInt();
                            if(subopcion==1) { precioUnidad = 65; nombreProductoSeleccionado = "Pinturas American Colors"; }
                            else if(subopcion==2) { precioUnidad = 50; nombreProductoSeleccionado = "Pinturas Tekno"; }
                            else if(subopcion==3) { precioUnidad = 40; nombreProductoSeleccionado = "Pinturas Pato"; }
                            else { precioUnidad = 45; nombreProductoSeleccionado = "Pinturas CPP"; }
                            break;
                            
                        case 2:
                            
                            System.out.println("---Herramientas para pintar---");
                            System.out.println("1.- Rodillos y Bandejas (S/. 20)");
                            System.out.println("2.- Lijas (S/. 2)");
                            System.out.println("3.- Brochas (S/. 8)");
                            System.out.println("4.- Compresores de aire (S/. 350)");
                            subopcion=S.nextInt();
                            if(subopcion==4) { precioUnidad = 350; nombreProductoSeleccionado = "Compresores de aire"; }
                            else if(subopcion==1) { precioUnidad = 20; nombreProductoSeleccionado = "Rodillos y Bandejas"; }
                            else if(subopcion==2) { precioUnidad = 2; nombreProductoSeleccionado = "Lijas"; }
                            else { precioUnidad = 8; nombreProductoSeleccionado = "Brochas"; }
                            
                            break;
                            
                        case 3:
                            
                            System.out.println("---Decoracion y paredes---");
                            System.out.println("1.- Papeles tapiz");
                            System.out.println("2.- Deco stickers para pared");
                            System.out.println("3.- Wall-panels");
                            subopcion=S.nextInt();
                            precioUnidad = 35;
                            if(subopcion==1) nombreProductoSeleccionado = "Papeles tapiz";
                            else if(subopcion==2) nombreProductoSeleccionado = "Deco stickers para pared";
                            else nombreProductoSeleccionado = "Wall-panels";
                            
                            break;
                            
                        case 4:
                            
                            System.out.println("---Esmaltes y solventes---");
                            System.out.println("1.- Sprays y aerosoles");
                            System.out.println("2.- Lacas");
                            System.out.println("3.- Disolventes");
                            System.out.println("4.- Anticorrosivos y zincromatos");
                            subopcion=S.nextInt();
                            precioUnidad = 25;
                            if(subopcion==1) nombreProductoSeleccionado = "Sprays y aerosoles";
                            else if(subopcion==2) nombreProductoSeleccionado = "Lacas";
                            else if(subopcion==3) nombreProductoSeleccionado = "Disolventes";
                            else nombreProductoSeleccionado = "Anticorrosivos y zincromatos";
                            
                            break;
                            
                        case 5:
                            
                            System.out.println("---Acabados para madera---");
                            System.out.println("1.- Barnices");
                            System.out.println("2.- Lacas");
                            System.out.println("3.- Preservantes y tintes para madera");
                            subopcion=S.nextInt();
                            precioUnidad = 30;
                            if(subopcion==1) nombreProductoSeleccionado = "Barnices";
                            else if(subopcion==2) nombreProductoSeleccionado = "Lacas para madera";
                            else nombreProductoSeleccionado = "Preservantes y tintes para madera";
                            break;
                            
                        case 6:
                            
                            System.out.println("---Escaleras---");
                            System.out.println("1.- Escaleras de aluminio metal y fibra");
                            System.out.println("2.- Escaleras de madera");
                            System.out.println("3.- Escaleras telescopicas");
                            subopcion=S.nextInt();
                            precioUnidad = 180;
                            if(subopcion==1) nombreProductoSeleccionado = "Escaleras de aluminio metal y fibra";
                            else if(subopcion==2) nombreProductoSeleccionado = "Escaleras de madera";
                            else nombreProductoSeleccionado = "Escaleras telescopicas";
                            break;
                            
                        case 7:

                            
                            System.out.println("---Pegamentos y Adhesivos---");
                            System.out.println("1.- Cintas adhesivas");
                            System.out.println("2.- Siliconas y aplicadores");
                            System.out.println("3.- Pegamentos");
                            System.out.println("4.- Colas sinteticas");
                            subopcion=S.nextInt();
                            precioUnidad = 12;
                            if(subopcion==1) nombreProductoSeleccionado = "Cintas adhesivas";
                            else if(subopcion==2) nombreProductoSeleccionado = "Siliconas y aplicadores";
                            else if(subopcion==3) nombreProductoSeleccionado = "Pegamentos";
                            else nombreProductoSeleccionado = "Colas sinteticas";
                            break;
                            
                    }
                    System.out.println("Has seleccionado el producto " +subopcion);
                    
                    break;
                    
                case 2:
                    
                    System.out.println("---Ferreteria y Puertas---");
                    System.out.println("1.- Puertas");
                    System.out.println("2.- Ganchos y cintas");
                    System.out.println("3.- Cerraduras y cajas fuertes");
                    System.out.println("4.- Accesorios de fijacion");
                    System.out.println("5.- Accesorios de puertas y ventanas");
                    System.out.println("6.- Cables, mallas y sogas");
                    System.out.println("Seleccione una opcion");
                    opcion=S.nextInt();
                    
                    switch (opcion){
                            
                        case 1:
                            System.out.println("---Puertas---");
                            System.out.println("1.- Puertas interior");
                            System.out.println("2.- Puertas exterior");
                            subopcion=S.nextInt();
                            precioUnidad = 250;
                            if(subopcion==1) nombreProductoSeleccionado = "Puertas interior"; else nombreProductoSeleccionado = "Puertas exterior";
                            
                            break;
                            
                        default:
                            
                            subopcion=1;
                            precioUnidad = 20;
                            nombreProductoSeleccionado = "Accesorios Varios de Ferretería";
                            break;
                    }
                    System.out.println("Has seleccionado el producto " +subopcion);
                    
                    break;
                case 3:
                    
                    System.out.println("---Automotriz---");
                    System.out.println("1.- Accesorios para auto");
                    System.out.println("2.- Herramientas de mecanica automotriz");
                    System.out.println("3.- Llantas");
                    System.out.print("Seleccione una opcion: ");
                    opcion=S.nextInt();
                    precioUnidad = 85;
                    subopcion = 1;
                    if(opcion==1) nombreProductoSeleccionado = "Accesorios para auto";
                    else if(opcion==2) nombreProductoSeleccionado = "Herramientas de mecanica automotriz";
                    else nombreProductoSeleccionado = "Llantas";
                    break;
                    
                case 4:
                    
                    System.out.println("---Jardineria---");
                    System.out.println("1.- Plantas y Deso jardin");
                    System.out.println("2.- Riego");
                    System.out.print("Seleccione una opcion: ");
                    opcion=S.nextInt();
                    precioUnidad = 45;
                    subopcion = 1;
                    if(opcion==1) nombreProductoSeleccionado = "Plantas y Deso jardin"; else nombreProductoSeleccionado = "Artículos de Riego";
                    break;
                    
                case 5:
                    
                    System.out.println("---Oficina y escolar---");
                    System.out.println("1.- Escritorios y mesas");
                    System.out.println("2.- Sillas de oficina");
                    System.out.print("Seleccione una opcion: ");
                    opcion=S.nextInt();
                    precioUnidad = 150;
                    subopcion = 1;
                    if(opcion==1) nombreProductoSeleccionado = "Escritorios y mesas"; else nombreProductoSeleccionado = "Sillas de oficina";
                    
                    break;
                case 6:
                    
                    System.out.println("---Infantil---");
                    System.out.println("1.- Juguetes");
                    System.out.print("Seleccione una opcion: ");
                    opcion=S.nextInt();
                    precioUnidad = 60;
                    subopcion = 1;
                    nombreProductoSeleccionado = "Juguetes Infantiles";
                    
                    break;
                case 7:
                    
                    System.out.println("---Salud y deportes---");
                    System.out.println("1.- Maquinas de gimnasio");
                    System.out.print("Seleccione una opcion: ");
                    opcion=S.nextInt();
                    precioUnidad = 400;
                    subopcion = 1;
                    nombreProductoSeleccionado = "Maquinas de gimnasio";
                    break;
                case 8:
                    
                    System.out.println("---Mascotas---");
                    System.out.println("1.- Perros");
                    System.out.println("2.- Gatos");
                    opcion=S.nextInt();
                    switch (opcion){
                            
                        case 1:
                            
                            System.out.println("---Perros---");
                            System.out.println("3.- Comida para perros");
                            subopcion=S.nextInt();
                            precioUnidad = 75;
                            nombreProductoSeleccionado = "Comida para perros";
                            break;
                            
                        case 2:
                            
                            System.out.println("---Gatos---");
                            System.out.println("3.- Comida para gatos");
                            subopcion=S.nextInt();
                            precioUnidad = 55;
                            nombreProductoSeleccionado = "Comida para gatos";
                            break;
                            
                    }
                    break;
            }





            //PARTE DE DANIEL

            System.out.print("Introduce la cantidad: ");
            cant = S.nextInt();
            precio = precioUnidad * cant;
            if(precio > 0) {
                System.out.println("\nUsted ha escogido: " + nombreProductoSeleccionado + " x" + cant);

                
                procesarCompra(S, precio);
            }
        } else {
            System.out.println("Opcion no valida");
            
        }
    }

    private static int categoria(int i) {
        return i;
    }


    public static void validaPagoTarjeta(Scanner escaner, double total) {


        
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
            

            boolean tarjetaOk = (nroTarjeta.length() == 16);
            
            boolean cvvOk = (cvv.length() == 3);
            
            boolean fechaEstructuraOk = (fechaVencimiento.length() == 5 && fechaVencimiento.contains("/"));
            
            boolean fechaNoVencida = false;
            



            if (fechaEstructuraOk) {
                
                try {

                    
                    DateTimeFormatter formateador = DateTimeFormatter.ofPattern("MM/yy");
                    YearMonth fechaTarjeta = YearMonth.parse(fechaVencimiento, formateador);
                    YearMonth fechaActual = YearMonth.now();
                    if (fechaTarjeta.isAfter(fechaActual) || fechaTarjeta.equals(fechaActual)) {
                        fechaNoVencida = true;
                    }

                    
                } catch (DateTimeParseException e) {
                    fechaEstructuraOk = false;
                }
            }



            if (tarjetaOk && fechaEstructuraOk && fechaNoVencida && cvvOk) {
                System.out.println("Autorizando fondos... transaccion exitosa.");
                pAprobado = true;
            } else {
                
                System.out.println("--- Operación denegada por el banco ---");
                if (!tarjetaOk) {
                    System.out.println("* El numero de tarjeta debe contener exactamente 16 digitos.");
                }
                
                if (!fechaEstructuraOk) {
                    System.out.println("* Formato de fecha incorrecto.");
                }
                
                if (fechaEstructuraOk && !fechaNoVencida) {
                    System.out.println("* Tarjeta caducada.");
                }
                
                if (!cvvOk) {
                    System.out.println("* El CVV debe contener 3 digitos.");
                }

                
                System.out.println("Intente nuevamente el pago electrónico...");
            }

        } while (!pAprobado);
    }




    public static void procesarCompra(Scanner escaner, double precioCalculado) {

        System.out.println();
        
        System.out.println("___________________ DATOS PERSONALES ___________________");
        System.out.print("Introduce tus Nombres: ");
        
        escaner.nextLine()
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

            validaPagoTarjeta(escaner, precioCalculado);

            System.out.println("¡Tu pedido ha sido procesado! Gracias por comprar en Promart.");
            
            System.out.println("Generando comprobante electrónico...");

            

            String correoMostrado = "Invitado";


            
            if (!correoLogin.equals("")) {


                
                correoMostrado = correoLogin;


                
            } else if (!correoRegistrado.equals("")) {


                
                correoMostrado = correoRegistrado;


                


                
            }


            
            double subtotal = precioCalculado / 1.18;


            
            double igv = precioCalculado - subtotal;


            
            LocalDateTime fechaHora = LocalDateTime.now();


            
            DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");


            

            System.out.println("=================================================");
            System.out.println("                 HOMECENTERS PERUANOS S.A                ");
            System.out.println("                  RUC: 20536557858                    ");
            System.out.println("              Av. Aviación Nro. 2405                 ");
            System.out.println("              juliaca, Perú                 ");
            System.out.println("-----------------------------------------------");
            System.out.println("   BOLETA DE VENTA ELECTRÓNICA             ");
            System.out.println("  BA01-000458923                     ");
            System.out.println("-----------------------------------------------------");
            System.out.println(" FECHA DE EMISION: " + fechaHora.format(formatoFecha));
            System.out.println(" SEÑOR(A)        : " + nombreTitular+" "+apellidosTitular);
            System.out.println(" " + tipoDocumento + "       : " + numDocumento);
            System.out.println(" TELEFONO      : " +telefonoMovil);
            System.out.println(" CORREO        : " + correoMostrado);
            System.out.println("--------------------------------------------------");
            System.out.println(" UBICACIÓN ENTREGA: ");
            System.out.println(" DEPARTAMENTO   : " + departamento);
            System.out.println(" PROVINCIA      : " + provincia);
            System.out.println(" DISTRITO     : " + distrito);
            System.out.println("-------------------------------------------");
            System.out.println(" CANT.  DESCRIPCION                                      ");
            System.out.println( nombreProductoSeleccionado + "   S/. " + precioCalculado);
            System.out.println("--------------------------------------------------");
            System.out.println("SUBTOTAL                  : S/. " + subtotal);
            System.out.println(" IGV (18%)                    : S/. " + igv);
            System.out.println("---------------------------------------------------------");
            System.out.println(" IMPORTE TOTAL      : S/. " + precioCalculado);
            System.out.println("========================================");
            System.out.println("   Representación impresa de la Boleta de Venta Electrónica");
            System.out.println("      Consulte su documento en https://www.promart.ec/facturacion-electronica?srsltid=AfmBOoo87s4zV0bzPSEP_RFUT6sbtU1vEsLwI20LyaiJ5zWsRqy5h1_g ");
            System.out.println("==========================");


            

        } else {


            
            System.out.println("Pedido cancelado. Volviendo al menu principal.");
        }
    }
}



