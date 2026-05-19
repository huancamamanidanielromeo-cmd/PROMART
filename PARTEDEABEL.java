// para que no salga error

static double precio = 0.0; //

//


//abell



public static void eleccionMenu(int categoria){
    switch(categoria){
        case 1: System.out.println("Usted eligio productos de limpieza "); break;
        case 2: System.out.println("Usted eligio productos de Tegnología"); break;
        case 3: System.out.println("Usted eligio productos de Electrohogar"); break;
        case 4: System.out.println("Usted eligio productos de Muebles"); break;
        case 5: System.out.println("Usted eligio productos de Terraza Y Aire Libre"); break;
        case 6: System.out.println("Usted eligio productos de Baño"); break;
        case 7: System.out.println("Usted eligio productos de Herramientas"); break;
        case 8: System.out.println("Usted eligio productos de Pisos y cerámicos"); break;
        default: System.out.println("Categoria no valida");
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
    scanner.nextInt(); // Nota: En tu archivo original dice 'cantidad = scanner.nextInt();', pero por consistencia textual exacta:
    // cantidad = scanner.nextInt();

    switch (subCategoria) {
        case 1:
            switch(producto){
                case 1: precio = 9.90*cantidad; break;
                case 2: precio = 44.50*cantidad; break;
                case 3: precio = 25*cantidad; break;
                case 4: precio = 25*cantidad; break;
                case 5: precio = 22.90*cantidad; break;
                case 6: precio = 19.90*cantidad; break;
                case 7: precio = 28.90*cantidad; break;
                case 8: precio = 107.40*cantidad; break;
                case 9: precio = 69.90*cantidad; break;
                case 10: precio = 11.90*cantidad; break;
            }
            break;
        case 2:
            switch(producto){
                case 1: precio = 1849*cantidad; break;
                case 2: precio = 1619*cantidad; break;
                case 3: precio = 2079*cantidad; break;
                case 4: precio = 3099*cantidad; break;
                case 5: precio = 5299*cantidad; break;
                case 6: precio = 3199*cantidad; break;
                case 7: precio = 2399*cantidad; break;
                case 8: precio = 1599*cantidad; break;
                case 9: precio = 1599*cantidad; break;
                case 10: precio = 2399*cantidad; break;
            }
            break;
        case 3:
            switch(producto){
                case 1: precio = 1249*cantidad; break;
                case 2: precio = 1449*cantidad; break;
                case 3: precio = 2099*cantidad; break;
                case 4: precio = 1299*cantidad; break;
                case 5: precio = 1799*cantidad; break;
                case 6: precio = 999*cantidad; break;
                case 7: precio = 1499*cantidad; break;
                case 8: precio = 1599*cantidad; break;
                case 9: precio = 999*cantidad; break;
                case 10: precio = 799*cantidad; break;
            }
            break;
        case 4:
            switch(producto){
                case 1: precio = 3598*cantidad; break;
                case 2: precio = 3318*cantidad; break;
                case 3: precio = 4598*cantidad; break;
                case 4: precio = 2518*cantidad; break;
                case 5: precio = 3598*cantidad; break;
                case 6: precio = 4798*cantidad; break;
                case 7: precio = 3638*cantidad; break;
                case 8: precio = 3638*cantidad; break;
                case 9: precio = 2798*cantidad; break;
                case 10: precio = 2518*cantidad; break;
            }
            break;
        case 5:
            switch(producto){
                case 1: precio = 899*cantidad; break;
                case 2: precio = 1299*cantidad; break;
                case 3: precio = 249*cantidad; break;
                case 4: precio = 599*cantidad; break;
                case 5: precio = 159*cantidad; break;
                case 6: precio = 1899*cantidad; break;
                case 7: precio = 399*cantidad; break;
                case 8: precio = 449*cantidad; break;
                case 9: precio = 99*cantidad; break;
            }
            break;
        case 6:
            switch(producto){
                case 1: precio = 349*cantidad; break;
                case 2: precio = 199*cantidad; break;
                case 3: precio = 129*cantidad; break;
                case 4: precio = 49*cantidad; break;
                case 5: precio = 499*cantidad; break;
                case 6: precio = 79*cantidad; break;
            }
            break;
        case 7:
            switch(producto){
                case 1: precio = 649*cantidad; break;
                case 2: precio = 329*cantidad; break;
                case 3: precio = 299*cantidad; break;
                case 4: precio = 39*cantidad; break;
                case 5: precio = 249*cantidad; break;
            }
            break;
        case 8:
            switch(producto){
                case 1: precio = 39.90*cantidad; break;
                case 2: precio = 45.90*cantidad; break;
                case 3: precio = 24.90*cantidad; break;
                case 4: precio = 32.90*cantidad; break;
                case 5: precio = 7.90*cantidad; break;
            }
            break;
    }
    if (precio > 0) {
        procesarCompra(scanner, precio);
    }
}




//para que no salga error

public static void procesarCompra(Scanner escaner, double precioCalculado) {
    System.out.println();
    System.out.println("___________________ PROCESO DE PAGO ___________________");

    }

void main() {
}
