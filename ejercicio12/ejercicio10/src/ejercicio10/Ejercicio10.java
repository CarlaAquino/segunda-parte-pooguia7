/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
package ejercicio10;

import java.util.Arrays;

public class Ejercicio10 {

    public static void main(String[] args) {

        double[] A = new double[50];

        double[] B;

        for (int i = 0; i < A.length; i++) {
            A[i] = (double) Math.round((Math.random() * 51) * 100) / 100;

        }
        System.out.println("Arreglo A con numeros aleatorios: ");
        System.out.println(Arrays.toString(A));

        // el metodo sort de la clase Arrays ordena los elementos de forma ascendentes.
        Arrays.sort(A);
        //Este método crea una copia de elementos, dentro de un rango específico de la matriz origina.
        B = Arrays.copyOfRange(A, 0, 20);
        // completa o rellena la posicion de cada elemento.
        Arrays.fill(B, 10, 20, 0.5);
        System.out.println("El arreglo A ordenado de forma ascendente: ");
        System.out.println(Arrays.toString(A));
        System.out.println("El arreglo B con condicion combinada: ");
        System.out.println(Arrays.toString(B));

    }

}
