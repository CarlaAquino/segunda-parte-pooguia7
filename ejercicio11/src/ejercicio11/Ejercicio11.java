/*Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
 */
package ejercicio11;

import java.util.Date;

import java.util.Scanner;


public class Ejercicio11 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Date fechaActual = new Date();
       
       
        System.out.println("Ingrese dia: ");
        int dia = entrada.nextInt();
        
        System.out.println("Ingrese mes: ");
        int mes = entrada.nextInt();
              
        System.out.println("Ingrese año: ");
        int anio = entrada.nextInt();
        
        Date fecha = new Date( dia, mes, anio) ;
        
        System.out.printf("La fecha ingresada es: %d/%d/%d \n",fecha.getDate(),fecha.getMonth(),fecha.getYear());
        
        System.out.printf("La fecha de hoy es: %d/%d/%d \n", fechaActual.getDate(),fechaActual.getMonth()+1, fechaActual.getYear()+1900);
        int diferencia = fechaActual.getYear()+1900 - fecha.getYear();
        diferencia --;
        System.out.printf("La cantidad de diferencia es: %d \n", diferencia);
    }
    
}
