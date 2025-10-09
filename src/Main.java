//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Aplicación para la gestión de una biblioteca");
        //ACTIVIDAD 1

        //INFORMACIÓN LIBROS
       String nombrelibro = "Cuando el cielo se vuelva amarillo";
       int fechadelanzamientolibro = 2024;
       double preciolibro = 1.9;
        System.out.println( "Libro: " +  nombrelibro +  " (" + fechadelanzamientolibro + ") - " + preciolibro  + "€/día");
       //Declaramos una variable String para guardar el nombre del libro.
        //Declaramos una variable int para la fecha de lanzamiento.
        //Declaramos una variable double para el precio por día.
        //Finalmente, usamos System.out.println() para mostrar toda la información del libro en una sola línea.

        //INFORMACIÓN PELÍCULA
        String  nombrepelicula = "Ojo por ojo";
        int fechadelanzamientopelicula = 1996;
        double preciopelicula = 3.5;
        System.out.println( "Película:" + nombrepelicula + " (" + fechadelanzamientopelicula + " ) - " + preciopelicula + "€/día");
        //Declaramos una variable String para guardar el nombre de la película.
        //Declaramos una variable int para la fecha de lanzamiento.
        //Declaramos una variable double para el precio por día.
        //Finalmente, usamos System.out.println() para mostrar toda la información de la película en una sola línea.

        //INFORMACIÓN VIDEOJUEGOS
        String nombrevideojuego = "Fortnite";
        int fechadelanzamientojuego = 2017;
        double preciovideojuego = 6.2 ;
        System.out.println( "Videojuego:" + nombrevideojuego + " (" + fechadelanzamientojuego + " ) - " + preciovideojuego + " €/día");
        //Declaramos una variable String para guardar el nombre del videojuegos.
        //Declaramos una variable int para la fecha de lanzamiento.
        //Declaramos una variable double para el precio por día.
        //Finalmente, usamos System.out.println() para mostrar toda la información del videojuegos en una sola línea.

        //INFORMACIÓN ALBÚN DE MÚSICA
        String nombremusica = "Metal";
        int fechalanzamientomusica = 1998;
        double preciomusica = 2.01;
        System.out.println( "Música:" + nombremusica + " (" + fechalanzamientomusica + " ) -" + preciomusica + " €/día");
        //Declaramos una variable String para guardar el albúm de música.
        //Declaramos una variable int para la fecha de lanzamiento.
        //Declaramos una variable double para el precio por día.
        //Finalmente, usamos System.out.println() para mostrar toda la información del albúm de música en una sola línea.

        //ACTIVIDAD 2
        double preciolibro1 = 1.9;
        double preciopelicula1 = 3.5;
        double preciojuegos1 = 6.2;
        double preciomusica1 = 2.01;
        int  cantidadlibros =6 ;
        int cantidadpelicula = 8;
        int cantidadjuego = 13;
        int cantidadmusica = 2;
        double ingresoslibros = preciolibro1 * cantidadlibros;
        double ingresospelicula = preciopelicula1 * cantidadpelicula;
        double ingresosjuegos = preciojuegos1 * cantidadjuego;
        double ingresosmusica = preciomusica1 * cantidadmusica;
        double ingresostotales = ingresoslibros + ingresospelicula + ingresosjuegos + ingresosmusica;
        System.out.println( "Ingresos totales: " + ingresostotales + "€");
        //Declaramos variables tipo double para guardar el precio por día de cada tipo de producto (libros, películas, videojuegos y música).
        //Declaramos variables tipo int para guardar la cantidad de unidades alquiladas de cada tipo de producto.
        //Calculamos los ingresos individuales de cada categoría multiplicando el precio por unidad por la cantidad de unidades.
        //Sumamos todos los ingresos individuales para obtener los ingresos totales.
        //Mostramos en pantalla el resultado final (los ingresos totales) junto con el símbolo de euro.

        //ACTIVIDAD 3
        //DESCUENTO DE LIBROS
        double preciolibro2 = 3.5;
        int cantidadlibros2 = 6;
        double porcentajedescuentolibro = 10.0;
        double preciototalsindesclibro = preciolibro2 * cantidadlibros2;
        double valordescuentolibro = preciototalsindesclibro * (porcentajedescuentolibro / 100.0);
        double valorcondesclibro = preciototalsindesclibro - valordescuentolibro;
        System.out.println( "Artículo: " + nombrelibro );
        System.out.println( "Unidades: " + cantidadlibros2);
        System.out.println( "Subtotales: " + preciototalsindesclibro);
        System.out.println( "Descuento:" + porcentajedescuentolibro);
        System.out.println( "Total:" + valorcondesclibro);
     //Declaramos las variables: Guardamos los datos del libro (nombre, precio, cantidad, descuento).
     //Cálculo del subtotal: Multiplicamos el precio unitario por la cantidad.
     //Cálculo del descuento: Conviertimos el porcentaje a decimal y lo multiplicas por el subtotal.
     //Cálculo del total final: Restamos el descuento al subtotal.
     //Imprimimos los resultados: Muestra toda la información

        //DESCUENTO DE PELICULAS
        double preciopelicula2 = 1.9;
        int cantidadpelicula2 = 8;
        double porcentajedescuentopelicula = 10.0;
        double preciototalsindescpelicula = preciolibro2 * cantidadpelicula2;
        double valordescuentopelicula = preciototalsindescpelicula * (porcentajedescuentopelicula / 100.0);
        double valorcondescpelicula = preciototalsindescpelicula - valordescuentopelicula;
        System.out.println( "Artículo: " + nombrepelicula );
        System.out.println( "Unidades: " + cantidadpelicula2);
        System.out.println( "Subtotales: " + preciototalsindescpelicula);
        System.out.println( "Descuento:" + porcentajedescuentopelicula);
        System.out.println( "Total:" + valorcondescpelicula);

        //DESCUENTO JUEGOS
        double preciojuego2 = 6.2;
        int cantidadjuego1 = 13;
        double porcentajedescuentojuego = 10;
        double preciototalsindescjuego = preciolibro2 * cantidadjuego1;
        double valordescuentojuego = preciototalsindescjuego * (porcentajedescuentopelicula / 100.0);
        double valorcondescjuego = preciototalsindescjuego - valordescuentojuego;
        System.out.println( "Artículo: " + nombrepelicula );
        System.out.println( "Unidades: " + cantidadjuego1);
        System.out.println( "Subtotales: " + preciototalsindescjuego);
        System.out.println( "Descuento:" + porcentajedescuentopelicula);
        System.out.println( "Total:" + valorcondescjuego);

        //ACTIVIDAD 4
        double preciolibro3 = 1.9;
        double preciopelicula3 = 3.5;
        double preciojuego3 = 6.2;
        double preciomusica3 = 2.01;
        double sumadepreciostotales = preciolibro3 + preciopelicula3 + preciojuego3 + preciomusica3;
        int articulostotales = 4;
        double  preciomedio = sumadepreciostotales / articulostotales;
        System.out.println( "Precio totales: " + preciomedio);
        //Guardamos los precios de los cuatro artículos: un libro, una película, un juego y música.
     //Sumamos todos esos precios para obtener el total.
     // Contamos cuántos artículos hay (4).
     //Dividemos el total entre el número de artículos para calcular el precio medio.
     // Mostramos el resultado en pantalla.

        //ACTIVIDAD 5
        int  cantidadlibros4 =6 ;
        int cantidadpelicula4 = 8;
        int cantidadjuego4 = 13;
        int cantidadmusica4 = 2;
        int totalarticulos = cantidadlibros4 + cantidadpelicula4 + cantidadjuego4 + cantidadmusica4;
        double porcentajelibro = (double) cantidadlibros4 * totalarticulos / 100;
        double porcentajepelicula = (double)  cantidadpelicula4 * totalarticulos /100;
        double porcentajejuego = (double)  cantidadjuego4 * articulostotales / 100;
        double porcentajemusica = (double)  cantidadmusica4 * articulostotales / 100;
        System.out.println( "Total artículos: " + totalarticulos);
        System.out.println( "Libros: " + porcentajelibro);
        System.out.println( "Películas: " + porcentajejuego);
        System.out.println( "Música: " + porcentajemusica);
     //Guardamos las cantidades de cada tipo de artículos:
     //Sumamos todas las cantidades para obtener el total de artículos:
     //Calculamos el porcentaje que representa cada tipo respecto al total.
     //Muestramos los resultados en la consola:














    }
}