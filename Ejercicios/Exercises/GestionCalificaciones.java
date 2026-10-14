package Exercises;
import java.util.Scanner; //Se importa la librería del Scanner

import Model.Estudiante;
public class GestionCalificaciones {
    public static void ejecutar(){
         Scanner entrada = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[3]; //Definimos el tamaño del arreglo
        for(int i = 0; i < 3; i++){
            System.out.println("Ingrese el nombre del estudiante: ");//Bucle para repetir la accion 03 veces
            String nombre = entrada.nextLine(); //Entrada que lee el nombre de los estudiantes
            System.out.println("Por favor digite el número de matricula del estudiante: ");
            int matricula = entrada.nextInt();//Entrada que lee la matrícula 
            entrada.nextLine();//Solo para permitir que Java lea correctamente el texto
            System.out.println("Por favor digite las notas de los estudiantes: ");
            double [] calificaciones = new double[5]; //Arreglo para guardar las 05 calificaciones
            for(int j = 0; j < 5; j++){
                System.out.println("Ingrese las notas del estudiante: ");
                calificaciones[j] = entrada.nextDouble();
            }
            entrada.nextLine();
            estudiantes[i] = new Estudiante(nombre, matricula, calificaciones);

        }
        int aprobados = 0;
        int reprobados = 0;
        for (Estudiante estudiante : estudiantes){//Foreach
            estudiante.mostrarInformacion();
            if (estudiante.aprueba()){
                aprobados++;
            }
            else{
                reprobados++;
            }
        }
        System.out.println("Total de estudiantes aprobados: " + aprobados);//Imprime la cantidad de estudiantes aprobados
        System.out.println("Total de estudiantes reprobados: " + reprobados);//Imprime los estudiantes reprobados

    }
}
