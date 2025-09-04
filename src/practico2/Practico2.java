
package practico2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Practico2 {

//   Función del punto 8:
//   public static double calcularPrecioFinal (double precioBase, double impuesto, double descuento){
//            return precioBase + (precioBase*impuesto) - (precioBase*descuento);
//        }
//    Funciones punto 9:
//    public static double calcularCostoEnvio (double peso, String zona){
//        double costo;
//        if (zona.equalsIgnoreCase("Nacional")) {
//            costo = peso*5;
//        } else if (zona.equalsIgnoreCase("Internacional")) {
//            costo =  peso*10;
//        } else {
//            System.out.println("Se ingresó una opción de Zona errónea.");
//        return -1;
//        }
//        return costo;
//    }
//    
//    public static double calcularTotalCompra (double precioBase, double costoEnvio){
//        return precioBase + costoEnvio;
//    }
    // Función del punto 10
//    public static int actualizarStock (int stockActual, int cantidadVendida, int cantidadRecibida) {
//        return stockActual - cantidadVendida + cantidadRecibida;
//    }
//    
    
    //Función y variable global punto 11:
//    
//    static double descuentoEspecial = 0.10;
//            
//    public static void calcularDescuentoEspecial (double precioBase){
//        double descuentoAplicado = precioBase * descuentoEspecial;
//        double precioTotal = precioBase * (1.0 - descuentoEspecial);
//        
//        System.out.println("El precio final a pagar es " + precioTotal);
//        System.out.println("El descuento aplicado es " + descuentoAplicado);
//    }      
    //Función punto 13:
    public static void imprimirRecursivo(ArrayList<Double> lista, int indice){
        if (indice >= lista.size()){
            return;
        }
        System.out.println("Indice" + indice + "$" + lista.get(indice));
        imprimirRecursivo(lista, indice + 1);
    }
            
    public static void main(String[] args) {
        // Punto 1:Escribe un programa en Java que solicite al usuario un año y determine si es
        //bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
        //divisible por 400. 
//        Scanner input = new Scanner (System.in);
//        int anio;
//        
//        System.out.println("Ingrese el año a evaluar");
//        anio = Integer.parseInt(input.nextLine());
//        
//        if ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0)){
//            System.out.println("El año es bisiesto");
//        } else {
//            System.out.println("El año no es bisiesto");
//        }
        // Punto 2:Determinar el Mayor de Tres Números. Escribe un programa en Java que pida 
        //al usuario tres números enteros y
        //determine cuál es el mayor.
//        Scanner input = new Scanner (System.in);
//        int num1, num2,num3;
//        
//        System.out.println("Ingrese el primer número");
//        num1 = Integer.parseInt(input.nextLine());
//        
//        System.out.println("Ingrese el segundo número");
//        num2 = Integer.parseInt(input.nextLine());
//        
//        System.out.println("Ingrese el tercer número");
//        num3 = Integer.parseInt(input.nextLine());      
//        
//        if (num1 > num2 && num1 > num3){
//            System.out.println("El número mayor es " + num1);
//            
//        } else if (num2 > num3 && num2 >  num1){
//            System.out.println("El número mayor es " + num2);
//        } else if (num3 > num1 && num3 > num2){
//            System.out.println("El número mayor es " + num3);
//        } else {
//            System.out.println("Al menos dos números son iguales y mayores");
//        }
 
        //Punto 3: Escribe un programa en Java que solicite al usuario su edad y clasifique su
        //etapa de vida según la siguiente tabla:
        //Menor de 12 años: "Niño"
        //Entre 12 y 17 años: "Adolescente"
        //Entre 18 y 59 años: "Adulto"
        //60 años o más: "Adulto mayor"
        
        //determine cuál es el mayor.
//        Scanner input = new Scanner (System.in);
//        int num1;
//        
//        System.out.println("Ingrese la edad");
//        num1 = Integer.parseInt(input.nextLine());
//        
//        if (num1 < 12) {
//            System.out.println("Niño");
//        } else if (12 < num1 && num1 < 17){
//            System.out.println("Adolescente");
//        } else if (18 < num1 && num1 < 59){
//            System.out.println("Adulto");
//        } else if (num1 > 60){
//            System.out.println("Adulto mayor");
//        }  else{
//            System.out.println("ERROR. Ingreso un número incorrecto");
//        }
         
        //Punto 4: Calculadora de Descuento según categoría.
        //Escribe un programa que solicite al usuario el precio de un producto y
        //su categoría (A, B o C).
        //Luego, aplique los siguientes descuentos:
        //Categoría A: 10% de descuento
        //Categoría B: 15% de descuento
        //Categoría C: 20% de descuento
        //El programa debe mostrar el precio original, el descuento aplicado y el
        //precio final
//        
//        Scanner input = new Scanner (System.in);
//        double precio, desc, precio_final;
//        String opcion;
//        
//        desc = 0.0;
//        precio_final = 0.0;
//        
//        System.out.println("Ingrese el precio del producto");
//        precio = Double.parseDouble(input.nextLine());
//        
//        System.out.println("Ingrese la categoría");
//        opcion = input.nextLine().toLowerCase();
//        
//        
//        switch (opcion) {
//            case "a" -> {
//                precio_final = precio * 0.9;
//                        desc = precio * 0.1;
//                                }
//            case "b" -> {
//               precio_final = precio * 0.85;
//                        desc = precio * 0.15; 
//            }
//            case "c" -> {
//                precio_final = precio * 0.8;
//                        desc = precio * 0.2;
//            }
//}
//        System.out.println("El precio del producto es: " + precio + " su descuento es de " + desc + " y el precio final es " + precio_final);
//        
        //Punto 5: Suma de Números Pares (while).
        //Escribe un programa que solicite números al usuario y sume solo los
        //números pares. El ciclo debe continuar hasta que el usuario ingrese el número
        //0, momento en el que se debe mostrar la suma total de los pares ingresados.
//        
//        Scanner input = new Scanner (System.in);
//        int num, suma = 0;
//        
//        System.out.println("Ingrese un número. 0 para salir");
//        num = Integer.parseInt(input.nextLine());
//        
//        while (num != 0) {            
//            if (num % 2 == 0) {
//                suma += num;
//                System.out.println("Ingrese un número. 0 para salir");
//                num = Integer.parseInt(input.nextLine());
//            }else {
//                System.out.println("Ingrese un número. 0 para salir");
//                num = Integer.parseInt(input.nextLine());
//            }
//        }
//        System.out.println("La suma de los n{uimeros pares es " + suma);
//        
        //Punto 6: Contador de Positivos, Negativos y Ceros (for).
        //Escribe un programa que pida al usuario ingresar 10 números enteros y
        //cuente cuántos son positivos, negativos y cuántos son ceros.

//        Scanner input = new Scanner (System.in);
//        int num, sumaPos = 0, sumaNeg = 0, sumaCero = 0;
//        
//               
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Ingrese un número. 0 para salir");
//            num = Integer.parseInt(input.nextLine());
//            if (num == 0) {
//                sumaCero += 1;
//            } else if (num > 0) {
//                sumaPos += 1;
//            } else {
//                sumaNeg += 1;
//            }
//        }
//        
//        System.out.println("La cantidad de números Positivos es: "+ sumaPos + " , la cantidad de números negativos es: " + sumaNeg + " , y la cantidad de ceros es: " + sumaCero);
//        
        //Punto 7: Validación de Nota entre 0 y 10 (do-while).
        //Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
        //usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
        //hasta que ingrese un valor válido.  
        
        
//        Scanner input = new Scanner (System.in);
//        int nota;
//        
//        do {
//            System.out.println("Error.");
//            System.out.println("Ingrese una nota del 0 al 10");
//            nota = Integer.parseInt(input.nextLine());
//        } while (nota < 0 || nota > 10);
//        
//        System.out.println("Nota guardada correctamente");
//        
        //Punto 8: Cálculo del Precio Final con impuesto y descuento.
        //Crea un método calcularPrecioFinal(double impuesto, double
        //descuento) que calcule el precio final de un producto en un e-commerce. La
        //fórmula es:
        //PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
        //PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times
        //Descuento)
        //Desde main(), solicita el precio base del producto, el porcentaje de
        //impuesto y el porcentaje de descuento, llama al método y muestra el precio
//        //final.
//            
//        Scanner input = new Scanner (System.in);
//        double precioBase = 0, desc  = 0, imp = 0;
//        
//        System.out.println("Ingrese el precio base del producto: ");
//        precioBase = Double.parseDouble(input.nextLine());
//        
//        System.out.println("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
//        imp = Double.parseDouble(input.nextLine());
//        
//        System.out.println("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
//        desc = Double.parseDouble(input.nextLine()); 
//        
//        imp = imp/100;
//        desc = desc/100;
//        
//        double precioFinal = calcularPrecioFinal (precioBase, imp, desc);
//        
//        System.out.println("El precio final es: " + precioFinal);
//        
//        
       //Punto 9:Composición de funciones para calcular costo de envío y total de compra.
        //a. calcularCostoEnvio(double peso, String zona): Calcula el costo de
        //envío basado en la zona de envío (Nacional o Internacional) y el peso del
        //paquete.
        //Nacional: $5 por kg
        //Internacional: $10 por kg
        //b. calcularTotalCompra(double precioProducto, double
        //costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
        //el costo de envío.
        //Desde main(), solicita el peso del paquete, la zona de envío y el precio
        //del producto. Luego, muestra el total a pagar.

        
//        Scanner input = new Scanner (System.in);
//        double precioBase = 0, costoEnvio  = 0, precioTotal = 0, peso = 0;
//        String zona; 
//        
//        System.out.println("Ingrese el precio base del producto: ");
//        precioBase = Double.parseDouble(input.nextLine());
//        
//        System.out.println("Ingrese la zona a enviar(Nacional o Internacional): ");
//        zona  = input.nextLine();
//        
//        System.out.println("Ingrese el peso del producto: ");
//        peso = Double.parseDouble(input.nextLine());
//        
//        costoEnvio = calcularCostoEnvio(peso, zona);
//        
//        
//        precioTotal = calcularTotalCompra (precioBase, costoEnvio);
//        
//        System.out.println("El costo de envio es " + costoEnvio + " y el precio total de la compra es " + precioTotal);
//        
//        
        //Punto 10: Actualización de stock a partir de venta y recepción de productos.
        //Crea un método actualizarStock(int stockActual, int cantidadVendida,
        //int cantidadRecibida), que calcule el nuevo stock después de una venta y
        //recepción
        //de productos:
        //NuevoStock = StockActual − CantidadVendida + CantidadRecibida
        //NuevoStock = CantidadVendida + CantidadRecibida
        //Desde main(), solicita al usuario el stock actual, la cantidad vendida y la
        //cantidad recibida, y muestra el stock actualizado.

//        Scanner input = new Scanner (System.in);
//        int cantidadVendida, cantidadRecibida, stockActual, nuevoStock;
//        
//        
//        System.out.println("Ingrese el stock actual: ");
//        stockActual = Integer.parseInt(input.nextLine());
//        
//        System.out.println("Ingrese las ventas: ");
//        cantidadVendida = Integer.parseInt(input.nextLine());
//        
//        System.out.println("Ingrese los ingresos: ");
//        cantidadRecibida = Integer.parseInt(input.nextLine());
//        
//        nuevoStock =  actualizarStock(stockActual,cantidadVendida,cantidadRecibida);
//        
//        System.out.println("El nuevo stock es: " + nuevoStock);
//        
        
        //Punto 11: Cálculo de descuento especial usando variable global.
        //Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un
        //método calcularDescuentoEspecial(double precio) que use la variable global para
        //calcular el descuento especial del 10%.
        //Dentro del método, declara una variable local descuentoAplicado, almacena
        //el valor del descuento y muestra el precio final con descuento.

//        Scanner input = new Scanner (System.in);
//        double precioBase;
//         
//        
//        System.out.println("Ingrese el precio del producto: ");
//        precioBase = Double.parseDouble(input.nextLine());
//        
//
//        calcularDescuentoEspecial (precioBase);
//        
        //Punto 12: Modificación de un array de precios y visualización de resultados.
        //Crea un programa que:
        //a. Declare e inicialice un array con los precios de algunos productos.
        //b. Muestre los valores originales de los precios.
        //c. Modifique el precio de un producto específico.
        //d. Muestre los valores modificados.
      
//                
//        ArrayList<Double> preciosProductos = new ArrayList<>(Arrays.asList(199.99, 299.5, 149.75, 399.0, 89.99));
//        
//        System.out.println("Precios originales:");
//        for (double p : preciosProductos){
//            System.out.println("$" + p);
//        }
//        
//        preciosProductos.set(2, 129.99);
//        
//        System.out.println("Precios modificados:");
//        for (double p : preciosProductos){
//            System.out.println("$" + p);
//        }
        
        
        //Punto 13: Impresión recursiva de arrays antes y después de modificar un elemento.
        //Crea un programa que:
        //a. Declare e inicialice un array con los precios de algunos productos.
        //b. Use una función recursiva para mostrar los precios originales.
        //c. Modifique el precio de un producto específico.
        //d. Use otra función recursiva para mostrar los valores modificados.
        
        ArrayList<Double> preciosProductos = new ArrayList<>(Arrays.asList(199.99, 299.5, 149.75, 399.0, 89.99));
        
        System.out.println("Precios originales:");
        imprimirRecursivo(preciosProductos, 0);
        preciosProductos.set(2, 129.99);
        
        System.out.println("Precios modificados:");
        imprimirRecursivo(preciosProductos, 0);
        
        
        
        
        
    }
    
}
