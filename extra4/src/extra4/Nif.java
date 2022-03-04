
package extra4;

import java.util.Scanner;


public class Nif {
    private int dni;
    private char  letra ;

    public Nif() {
    }

    public Nif(int dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public int getDni() {
        return dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    public void crearNif(){
        Scanner entrada = new Scanner(System.in);
        char [] letra = new char[] {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	
        System.out.println("Ingrese su numero de documento: ");
        this.dni = entrada.nextInt();
        this.letra = letra[(int)dni %23];
    }
   public void mostrar_Nif(){
       System.out.println("el NIF ES: " +dni + letra); 
    }
}
