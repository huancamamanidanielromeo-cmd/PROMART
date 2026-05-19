
//pa que no salga ERROR ROJO


static double precio = 0.0; //


//ADRIAN














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
        case 1: precioUnidad = 19.90; break;
        case 2: precioUnidad = 25.00; break;
        case 3: precioUnidad = 19.90; break;
        case 4: precioUnidad = 39.90; break;
        case 5: precioUnidad = 39.00; break;
        case 6: precioUnidad = 9.90; break;
        case 7: precioUnidad = 21.90; break;
        case 8: precioUnidad = 25.00; break;
        case 9: precioUnidad = 12.90; break;
        case 10: precioUnidad = 29.90; break;
        default: System.out.println("Producto no valido."); return;
    }
    precio = precioUnidad * cantidad;
    if(precio > 0) procesarCompra(escaner, precio);
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
        case 1: precioUnidad = 27.00; break;
        case 2: precioUnidad = 35.60; break;
        case 3: precioUnidad = 27.00; break;
        case 4: precioUnidad = 39.92; break;
        case 5: precioUnidad = 35.60; break;
        case 6: precioUnidad = 60.40; break;
        case 7: precioUnidad = 31.92; break;
        case 8: precioUnidad = 59.92; break;
        case 9: precioUnidad = 23.92; break;
        case 10: precioUnidad = 15.00; break;
        default: System.out.println("Producto no valido."); return;
    }
    precio = precioUnidad * cantidad;
    if(precio > 0) procesarCompra(escaner, precio);
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
        case 1: precioUnidad = 389.00; break;
        case 2: precioUnidad = 189.00; break;
        case 3: precioUnidad = 899.00; break;
        case 4: precioUnidad = 149.00; break;
        case 5: precioUnidad = 199.00; break;
        case 6: precioUnidad = 79.00; break;
        case 7: precioUnidad = 45.00; break;
        case 8: precioUnidad = 259.00; break;
        case 9: precioUnidad = 59.00; break;
        case 10: precioUnidad = 49.00; break;
        default: System.out.println("Producto no valido."); return;
    }
    precio = precioUnidad * cantidad;
    if(precio > 0) procesarCompra(escaner, precio);
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
        case 1: precioUnidad = 3499.00; break;
        case 2: precioUnidad = 2899.00; break;
        case 3: precioUnidad = 1999.00; break;
        case 4: precioUnidad = 4600.00; break;
        case 5: precioUnidad = 2499.60; break;
        case 6: precioUnidad = 329.00; break;
        case 7: precioUnidad = 349.00; break;
        case 8: precioUnidad = 764.00; break;
        case 9: precioUnidad = 599.00; break;
        case 10: precioUnidad = 450.00; break;
        default: System.out.println("Producto no valido."); return;
    }
    precio = precioUnidad * cantidad;
    if(precio > 0) procesarCompra(escaner, precio);
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
        case 1: precioUnidad = 31.90; break;
        case 2: precioUnidad = 189.00; break;
        case 3: precioUnidad = 39.90; break;
        case 4: precioUnidad = 95.00; break;
        case 5: precioUnidad = 79.50; break;
        case 6: precioUnidad = 28.90; break;
        case 7: precioUnidad = 1.35; break;
        case 8: precioUnidad = 29.90; break;
        case 9: precioUnidad = 899.00; break;
        case 10: precioUnidad = 749.00; break;
        default: System.out.println("Producto no valido."); return;
    }
    precio = precioUnidad * cantidad;
    if(precio > 0) procesarCompra(escaner, precio);
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
        case 1: precioUnidad = 215.00; break;
        case 2: precioUnidad = 34.90; break;
        case 3: precioUnidad = 12.50; break;
        case 4: precioUnidad = 49.00; break;
        case 5: precioUnidad = 29.90; break;
        case 6: precioUnidad = 69.00; break;
        case 7: precioUnidad = 31.92; break;
        case 8: precioUnidad = 449.00; break;
        case 9: precioUnidad = 399.00; break;
        case 10: precioUnidad = 45.00; break;
        default: System.out.println("Producto no valido."); return;
    }
    precio = precioUnidad * cantidad;
    if(precio > 0) procesarCompra(escaner, precio);
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
        case 1: precioUnidad = 749.00; break;
        case 2: precioUnidad = 529.00; break;
        case 3: precioUnidad = 129.00; break;
        case 4: precioUnidad = 699.00; break;
        case 5: precioUnidad = 1608.00; break;
        case 6: precioUnidad = 65.90; break;
        case 7: precioUnidad = 65.90; break;
        case 8: precioUnidad = 849.90; break;
        case 9: precioUnidad = 179.80; break;
        case 10: precioUnidad = 389.00; break;
        default: System.out.println("Producto no valido."); return;
    }
    precio = precioUnidad * cantidad;
    if(precio > 0) procesarCompra(escaner, precio);
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
        case 1: precioUnidad = 145.00; break;
        case 2: precioUnidad = 48.00; break;
        case 3: precioUnidad = 52.00; break;
        case 4: precioUnidad = 85.00; break;
        case 5: precioUnidad = 24.50; break;
        case 6: precioUnidad = 12.90; break;
        case 7: precioUnidad = 32.00; break;
        case 8: precioUnidad = 65.00; break;
        case 9: precioUnidad = 8.50; break;
        case 10: precioUnidad = 9.90; break;
        default: System.out.println("Producto no valido."); return;
    }
    precio = precioUnidad * cantidad;
    if(precio > 0) procesarCompra(escaner, precio);


}
//pa que no salga rojo
public static void procesarCompra(Scanner escaner, double precioCalculado) {
    System.out.println();
    System.out.println("___________________ PROCESO DE PAGO ___________________");

}

void main() {
}
