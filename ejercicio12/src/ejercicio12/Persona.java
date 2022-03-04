
package ejercicio12;

import java.util.Date;
import java.util.Scanner;
import java.util.logging.Logger;


public class Persona {
   private String nombre;
   private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
   
    public void crearPersona() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre:");
        this.nombre = entrada.next();
        System.out.println("Ingrese año de nacimiento: ");
        int anio = entrada.nextInt();
        System.out.println("Ingrese mes de nacimineto: ");
        int mes = entrada.nextInt();
        System.out.println("Ingrese dia de nacimineto: ");
        int dia = entrada.nextInt();
        Date fecha = new Date (anio, mes, dia); 
        System.out.printf("La fecha es: %d/%d/%d",fechaNacimiento.getYear(),fechaNacimiento.getMonth(),fechaNacimiento.getDate());
    }
    public void calcularEdad() {
        Date fechaActual = new Date();
        int diferencia = (fechaActual.getYear() + 1900) - fechaNacimiento.getYear();
        diferencia --;
        System.out.printf("La cantidad de diferencia es: %d \n", diferencia);
    }
    public boolean menorQue(int edad){
         Date fechaActual = new Date();
        int diferencia = (fechaActual.getYear() + 1900) - fechaNacimiento.getYear();
       
      if(diferencia <18){
          return true;
      } else{
          return false; 
      }
        
        
    }
    public void mostrarPersona() {
        System.out.printf("Nombre %s nacio el %d/%d/%d: \n",this.nombre,this.fechaNacimiento.getYear(),this.fechaNacimiento.getMonth(),this.fechaNacimiento.getDate());   
    }
    
}
