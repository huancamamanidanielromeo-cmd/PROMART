//PA QUE NO SALGA ROJO


static double precio = 0.0; //



// Zamir







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
                        if(subopcion==1) precioUnidad = 65;
                        else if(subopcion==2) precioUnidad = 50;
                        else precioUnidad = 42;
                        break;
                    case 2:
                        System.out.println("---Herramientas para pintar---");
                        System.out.println("1.- Rodillos y Bandejas (S/. 20)");
                        System.out.println("2.- Lijas (S/. 2)");
                        System.out.println("3.- Brochas (S/. 8)");
                        System.out.println("4.- Compresores de aire (S/. 350)");
                        subopcion=S.nextInt();
                        if(subopcion==4) precioUnidad = 350; else precioUnidad = 15;
                        break;
                    case 3:
                        System.out.println("---Decoracion y paredes---");
                        System.out.println("1.- Papeles tapiz");
                        System.out.println("2.- Deco stickers para pared");
                        System.out.println("3.- Wall-panels");
                        subopcion=S.nextInt();
                        precioUnidad = 35;
                        break;
                    case 4:
                        System.out.println("---Esmaltes y solventes---");
                        System.out.println("1.- Sprays y aerosoles");
                        System.out.println("2.- Lacas");
                        System.out.println("3.- Disolventes");
                        System.out.println("4.- Anticorrosivos y zincromatos");
                        subopcion=S.nextInt();
                        precioUnidad = 25;
                        break;
                    case 5:
                        System.out.println("---Acabados para madera---");
                        System.out.println("1.- Barnices");
                        System.out.println("2.- Lacas");
                        System.out.println("3.- Preservantes y tintes para madera");
                        subopcion=S.nextInt();
                        precioUnidad = 30;
                        break;
                    case 6:
                        System.out.println("---Escaleras---");
                        System.out.println("1.- Escaleras de aluminio metal y fibra");
                        System.out.println("2.- Escaleras de madera");
                        System.out.println("3.- Escaleras telescopicas");
                        subopcion=S.nextInt();
                        precioUnidad = 180;
                        break;
                    case 7:
                        System.out.println("---Pegamentos y Adhesivos---");
                        System.out.println("1.- Cintas adhesivas");
                        System.out.println("2.- Siliconas y aplicadores");
                        System.out.println("3.- Pegamentos");
                        System.out.println("4.- Colas sinteticas");
                        subopcion=S.nextInt();
                        precioUnidad = 12;
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
                        break;
                    default:
                        subopcion=1;
                        precioUnidad = 20;
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
                break;
            case 4:
                System.out.println("---Jardineria---");
                System.out.println("1.- Plantas y Deso jardin");
                System.out.println("2.- Riego");
                System.out.print("Seleccione una opcion: ");
                opcion=S.nextInt();
                precioUnidad = 45;
                subopcion = 1;
                break;
            case 5:
                System.out.println("---Oficina y escolar---");
                System.out.println("1.- Escritorios y mesas");
                System.out.println("2.- Sillas de oficina");
                System.out.print("Seleccione una opcion: ");
                opcion=S.nextInt();
                precioUnidad = 150;
                subopcion = 1;
                break;
            case 6:
                System.out.println("---Infantil---");
                System.out.println("1.- Juguetes");
                System.out.print("Seleccione una opcion: ");
                opcion=S.nextInt();
                precioUnidad = 60;
                subopcion = 1;
                break;
            case 7:
                System.out.println("---Salud y deportes---");
                System.out.println("1.- Maquinas de gimnasio");
                System.out.print("Seleccione una opcion: ");
                opcion=S.nextInt();
                precioUnidad = 400;
                subopcion = 1;
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
                        break;
                    case 2:
                        System.out.println("---Gatos---");
                        System.out.println("3.- Comida para gatos");
                        subopcion=S.nextInt();
                        precioUnidad = 55;
                        break;
                }
                break;
        }

        System.out.print("Introduce la cantidad: ");
        cant = S.nextInt();
        precio = precioUnidad * cant;
        if(precio > 0) {
            procesarCompra(S, precio);
        }
    } else {
        System.out.println("Opcion no valida");
    }
}

private static int categoria(int i) {
    return i;
}


//PA QUE NO SALGA ROJO
//variables de ejmplo
public static void procesarCompra(Scanner escaner, double precioCalculado) {
    System.out.println();
    System.out.println("___________________ PROCESO DE PAGO ___________________");

}

void main() {
}