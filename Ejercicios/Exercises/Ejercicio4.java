package Exercises;

public class Ejercicio4 {
    public static void ejecutar(){
    int[] numeros = {45, 23, 67, 12, 89, 34, 56, 78, 91, 23, 45, 67, 34, 56, 78};
    int suma = 0;
    for(int i = 0; i < numeros.length; i++){
        suma += numeros[i];
    }
    System.out.println("La suma de los numeros es: " + suma);
    double promedio = (double) suma / numeros.length;
    System.out.println("El promedio es: " +  promedio);
    int mayor = numeros[0];
    for (int i = 1; i < numeros.length; i++){
        if (numeros[i] > mayor){
            mayor = numeros[i];
        }
    }
    System.out.println("El número mayor es: " + mayor);
    int menor = numeros[0];
    for(int i = 1; i < numeros.length; i++){
        if(numeros[i] < menor){
            menor = numeros[i];
        }
    }
    System.err.println("El numero menor es: " + menor);
    int cantidadMayores = 0;
    for (int i = 0; i < numeros.length; i++){
        if (numeros[i] > promedio){
            cantidadMayores++;
        }
    }
    System.out.println("Cantidad de números mayores al promedio: " + cantidadMayores);
    System.out.println("Numeros pares: ");
    for(int i = 0; i < numeros.length; i++){
        if(numeros[i] % 2 == 0){
            System.out.println(numeros[i]);
        }
    }
    }
}
