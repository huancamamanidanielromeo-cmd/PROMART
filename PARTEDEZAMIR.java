//PA QUE NO SALGA ROJO


static double precio = 0.0; //



// Zamir







 public static void subCategoriaFerreteria(Scanner teclado) {
        System.out.println("FERRETERIA Y PUERTAS ---");
        System.out.println("1.Puertas");
        System.out.println("2. Cerraduras");
        System.out.println("3. Herramientas");
        System.out.print("Selecciona: ");
        int sub = teclado.nextInt();
        int prod;

        if (sub == 1) {
            System.out.println("1. Puerta de Madera : S/. 150.00");
            System.out.println("2. Puerta de Metal : S/. 250.00");
            System.out.println("3. Puerta de Vidrio : S/. 350.00");
            System.out.print("Elige el producto: ");
            prod = teclado.nextInt();
            if (prod == 1) { procesarCompra(teclado, 150.00); }
            else if (prod == 2) { procesarCompra(teclado, 250.00); }
            else if (prod == 3) { procesarCompra(teclado, 350.00); }
        } else if (sub == 2) {
            System.out.println("1. Cerradura de Puerta : S/. 30.00");
            System.out.println("2. Cerradura de Seguridad : S/. 50.00");
            System.out.println("3. Cerradura Electrónica : S/. 80.00");
            System.out.print("Elige el producto: ");
            prod = teclado.nextInt();
            if (prod == 1) { procesarCompra(teclado, 30.00); }
            else if (prod == 2) { procesarCompra(teclado, 50.00); }
            else if (prod == 3) { procesarCompra(teclado, 80.00); }
        } else if (sub == 3) {
            System.out.println("1. Martillo : S/. 20.00");
            System.out.println("2. Taladro : S/.100.00");
            System.out.println("3. Llave de Tubo : S/. 15.00");
            System.out.print("Elige el producto: ");
            prod = teclado.nextInt();
            if (prod == 1) { procesarCompra(teclado, 20.00); }
            else if (prod == 2) { procesarCompra(teclado, 100.00); }
            else if (prod == 3) { procesarCompra(teclado, 15.00); }
        }
    }

    public static void subCategoriaAutomotriz(Scanner teclado) {
        System.out.println("--- AUTOMOTRIZ ---");
        System.out.println("1. Accesorios para Auto");
        System.out.println("2. Herramientas de Mecánica");
        System.out.println("3. Llantas");
        System.out.print("Selecciona: ");
        int sub = teclado.nextInt();
        int prod;

        if (sub == 1) {
            System.out.println("1.Cubre Volante : S/. 20.00");
            System.out.println("2. Alfombra de Auto : S/. 30.00");
            System.out.println("3.GPS para Auto : S/. 150.00");
            System.out.print("Elige el producto: ");
            prod = teclado.nextInt();
            if (prod == 1) { procesarCompra(teclado, 20.00); }
            else if (prod == 2) { procesarCompra(teclado, 30.00); }
            else if (prod == 3) { procesarCompra(teclado, 150.00); }
        } else if (sub == 2) {
            System.out.println("1. Llave de Cruz : S/. 50.00");
            System.out.println("2. Gato Hidráulico de Botella : S/. 30.00");
            System.out.println("3. Compresor de Aire : S/. 200.00");
            System.out.print("Elige el producto: ");
            prod = teclado.nextInt();
            if (prod == 1) { procesarCompra(teclado, 50.00); }
            else if (prod == 2) { procesarCompra(teclado, 30.00); }
            else if (prod == 3) { procesarCompra(teclado, 200.00); }
        } else if (sub == 3) {
            System.out.println("1. Llanta de Auto 14: S/. 120.00");
            System.out.println("2. Llanta de Auto 15: S/. 150.00");
            System.out.println("3. Llanta de Auto 16: S/. 180.00");
            System.out.print("Elige el producto: ");
            prod = teclado.nextInt();
            if (prod == 1) { procesarCompra(teclado, 120.00); }
            else if (prod == 2) { procesarCompra(teclado, 150.00); }
            else if (prod == 3) { procesarCompra(teclado, 180.00); }
        }
    }

    public static void subCategoriaJardineria(Scanner teclado) {
        System.out.println("--- JARDINERIA ---");
        System.out.println("1. Plantas");
        System.out.println("2. Herramientas de Jardinería");
        System.out.println("3. Riego");
        System.out.print("Selecciona: ");
        int sub = teclado.nextInt();
        int prod;

        if (sub == 1) {
            System.out.println("1. Planta de Interior : S/. 20.00");
            System.out.println("2. Planta de Exterior : S/. 30.00");
            System.out.println("3. Árbol Frutal : S/. 50.00");
            System.out.print("Elige el producto: ");
            prod = teclado.nextInt();
            if (prod == 1) { procesarCompra(teclado, 20.00); }
            else if (prod == 2) { procesarCompra(teclado, 30.00); }
            else if (prod == 3) { procesarCompra(teclado, 50.00); }
        } else if (sub == 2) {
            System.out.println("1. Pala de Jardín : S/. 15.00");
            System.out.println("2. Rastrillo Metálico : S/. 10.00");
            System.out.println("3. Tijeras de Podar : S/. 20.00");
            System.out.print("Elige el producto: ");
            prod = teclado.nextInt();
            if (prod == 1) { procesarCompra(teclado, 15.00); }
            else if (prod == 2) { procesarCompra(teclado, 10.00); }
            else if (prod == 3) { procesarCompra(teclado, 20.00); }
        } else if (sub == 3) {
            System.out.println("1. Manguera de Riego 15m : S/. 20.00");
            System.out.println("2. Aspersor Giratorio : S/. 30.00");
            System.out.println("3. Sistema de Riego Automático : S/. 150.00");
            System.out.print("Elige el producto: ");
            prod = teclado.nextInt();
            if (prod == 1) { procesarCompra(teclado, 20.00); }
            else if (prod == 2) { procesarCompra(teclado, 30.00); }
            else if (prod == 3) { procesarCompra(teclado, 150.00); }
        }
    }

    public static void subCategoriaOficina(Scanner teclado) {
        System.out.println(" OFICINA Y ESCOLAR");
        System.out.println("1. Útiles de Escritorio");
        System.out.println("2. Computadoras");
        System.out.println("3. Muebles de Oficina");
        System.out.print("Selecciona: ");
        int sub = teclado.nextInt();
        int prod;

        if (sub == 1) {
            System.out.println("1. Cuaderno Anillado A4 : S/. 12.90");
            System.out.println("2. Lapiceros Pack x3 Color : S/. 19.90");
            System.out.println("3. Notas Adhesivas Post-it : S/. 6.50");
            System.out.print("Elige el producto: ");
            prod = teclado.nextInt();
            if (prod == 1) { procesarCompra(teclado, 12.90); }
            else if (prod == 2) { procesarCompra(teclado, 19.90); }
            else if (prod == 3) { procesarCompra(teclado, 6.50); }
        } else if (sub == 2) {
            System.out.println("1. PC de Escritorio Intel Core i5 : S/. 2199.00");
            System.out.println("2. Todo en Uno HP 23.8 : S/. 1899.00");
            System.out.println("3. Monitor Gamer 24 FHD : S/. 599.00");
            System.out.print("Elige el producto: ");
            prod = teclado.nextInt();
            if (prod == 1) { procesarCompra(teclado, 2199.00); }
            else if (prod == 2) { procesarCompra(teclado, 1899.00); }
            else if (prod == 3) { procesarCompra(teclado, 599.00); }
        } else if (sub == 3) {
            System.out.println("1. Silla Ergonómica Ejecutiva : S/. 349.00");
            System.out.println("2. Escritorio de Madera en L : S/. 450.00");
            System.out.println("3. Estante de Libros 5 Niveles : S/. 219.00");
            System.out.print("Elige el producto: ");
            prod = teclado.nextInt();
            if (prod == 1) { procesarCompra(teclado, 349.00); }
            else if (prod == 2) { procesarCompra(teclado, 450.00); }
            else if (prod == 3) { procesarCompra(teclado, 219.00); }
        }
    }

    public static void subCategoriaInfantil(Scanner teclado) {
        System.out.println ("INFANTIL ");
        System.out.println("1. Juguetes");
        System.out.println("2. Ropa Infantil");
        System.out.println("3. Muebles Infantiles");
        System.out.print("Selecciona: ");
        int sub = teclado.nextInt();
        int prod;

        if (sub == 1) {
            System.out.println("1. Set de Bloques Lego Classic : S/. 249.00");
            System.out.println("2. Muñeca Articulada Fashion : S/. 89.90");
            System.out.println("3. Carro a Control Remoto : S/. 129.00");
            System.out.print("Elige el producto: ");
            prod = teclado.nextInt();
            if (prod == 1) { procesarCompra(teclado, 249.00); }
            else if (prod == 2) { procesarCompra(teclado, 89.90); }
            else if (prod == 3) { procesarCompra(teclado, 129.00); }
        } else if (sub == 2) {
            System.out.println("1. Casaca de Invierno para Niño : S/. 79.90");
            System.out.println("2. Pack de 3 Polos de Algodón : S/. 45.00");
            System.out.println("3. Zapatillas Deportivas Kidz : S/. 89.00");
            System.out.print("Elige el producto: ");
            prod = teclado.nextInt();
            if (prod == 1) { procesarCompra(teclado, 79.90); }
            else if (prod == 2) { procesarCompra(teclado, 45.00); }
            else if (prod == 3) { procesarCompra(teclado, 89.00); }
        } else if (sub == 3) {
            System.out.println("1. Cuna Corral para Bebé : S/. 399.00");
            System.out.println("2. Organizador de Juguetes : S/. 149.00");
            System.out.println("3. Mesa con 2 Sillas Infantiles : S/. 189.00");
            System.out.print("Elige el producto: ");
            prod = teclado.nextInt();
            if (prod == 1) { procesarCompra(teclado, 399.00); }
            else if (prod == 2) { procesarCompra(teclado, 149.00); }
            else if (prod == 3) { procesarCompra(teclado, 189.00); }
        }
    }

    public static void subCategoriaSaludDeportes(Scanner teclado) {
        System.out.println("---SALUD Y DEPORTES---");
        System.out.println("1. Equipos de Gimnasio");
        System.out.println("2. Bicicletas");
        System.out.println("3. Vitaminas");
        System.out.print("Selecciona: ");
        int sub = teclado.nextInt();
        int prod;

        if (sub == 1) {
            System.out.println("1.Caminadora Eléctrica Plegable : S/. 1599.00");
            System.out.println("2. Bicicleta Estacionaria Spinning : S/. 799.00");
            System.out.println("3. Set de Mancuernas 20kg : S/. 199.00");
            System.out.print("Elige el producto: ");
            prod = teclado.nextInt();
            if (prod == 1) { procesarCompra(teclado, 1599.00); }
            else if (prod == 2) { procesarCompra(teclado, 799.00); }
            else if (prod == 3) { procesarCompra(teclado, 199.00); }
        } else if (sub == 2) {
            System.out.println("1. Bicicleta de Montaña Aro 29 : S/. 1199.00");
            System.out.println("2. Bicicleta Urbana Aro 26 : S/. 849.00");
            System.out.println("3. Bicicleta Infantil Aro 16 : S/. 349.00");
            System.out.print("Elige el producto: ");
            prod = teclado.nextInt();
            if (prod == 1) { procesarCompra(teclado, 1199.00); }
            else if (prod == 2) { procesarCompra(teclado, 849.00); }
            else if (prod == 3) { procesarCompra(teclado, 349.00); }
        } else if (sub == 3) {
            System.out.println("1. Multivitamínico 90 Cápsulas : S/. 69.90");
            System.out.println("2. Colágeno Hidrolizado 500g : S/. 89.90");
            System.out.println("3. Proteína Whey 2lb : S/. 149.00");
            System.out.print("Elige el producto: ");
            prod = teclado.nextInt();
            if (prod == 1) { procesarCompra(teclado, 69.90); }
            else if (prod == 2) { procesarCompra(teclado, 89.90); }
            else if (prod == 3) { procesarCompra(teclado, 149.00); }
        }
    }

    public static void subCategoriaMascotas(Scanner teclado) {
        System.out.println("MASCOTAS");
        System.out.println("1. Comida para Perros");
        System.out.println("2. Comida para Gatos");
        System.out.println("3. Accesorios para Mascota");
        System.out.print("Selecciona: ");
        int sub = teclado.nextInt();
        int prod;

        if (sub == 1) {

            System.out.println("1. Alimento Ricocan Adulto 15kg : S/. 129.90");
            System.out.println("2. Alimento Dog Chow Cachorros 8kg : S/. 85.00");
            System.out.println("3. Paté para Perro Canbo 330g : S/. 7.50");
            System.out.print("Elige el producto: ");
            prod = teclado.nextInt();
            if (prod == 1) { procesarCompra(teclado, 129.90); }

            else if (prod == 2) { procesarCompra(teclado, 85.00); }
            else if (prod == 3) { procesarCompra(teclado, 7.50); }
        } else if (sub == 2) {

            System.out.println("1. Alimento Ricocat Adulto 9kg : S/. 89.90");
            System.out.println("2. Alimento Whiskas Seco 3kg : S/. 42.00");
            System.out.println("3. Sobre Felix Filetes en Salsa : S/. 3.20");

            System.out.print("Elige el producto: ");
            prod = teclado.nextInt();
            if (prod == 1) { procesarCompra(teclado, 89.90); }
            else if (prod == 2) { procesarCompra(teclado, 42.00); }
            else if (prod == 3) { procesarCompra(teclado, 3.20); }
        } else if (sub == 3) {
            System.out.println("1. Cama Acolchada Mediana : S/. 59.90");
            System.out.println("2. Rascador para Gato de 3 Niveles : S/. 149.00");
            System.out.println("3. Correa Retráctil 5 metros : S/. 34.90");
            System.out.print("Elige el producto: ");
            prod = teclado.nextInt();
            if (prod == 1) { procesarCompra(teclado, 59.90); }
            else if (prod == 2) { procesarCompra(teclado, 149.00); }
            else if (prod == 3) { procesarCompra(teclado, 34.90); }
        }
    }

//PA QUE NO SALGA ROJO
//variables de ejmplo
public static void procesarCompra(Scanner escaner, double precioCalculado) {
    System.out.println();
    System.out.println("___________________ PROCESO DE PAGO ___________________");

}

void main() {
}
