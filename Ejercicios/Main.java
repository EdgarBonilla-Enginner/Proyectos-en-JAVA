//Acá va el menu de los 04 Ejercicios que deseamos ejecutar
import java.util.Scanner;//Se importa el scanner para leer los datos
import Exercises.Ejercicio1;//Se importa el ejercicio Gestion Calificaciones
import Exercises.Ejercicio2;
import Exercises.SistemaEmpleados;
import Exercises.Ejercicio4;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor digite su nombre: ");
        String nombre = entrada.nextLine(); 
        while (true){//Ciclo para que pueda ejecutar el progrma las veces que desee
        //Menu de opciones que puede elegir el usuario
        System.out.println("*Menú Principal de los 04 Ejercicios*");
        System.out.println("1) Gestión de Calificaciones ");
        System.out.println("2) Operaciones Bancarias ");
        System.out.println("3) Sistema de Empleados ");
        System.out.println("4) Analisis de Datos ");
        System.out.println("5) Salir ");
        
        System.out.println(nombre + " Digite que programa desea ejecutar: ");
        int opcion = entrada.nextInt();
        if (opcion == 1){
            Ejercicio1.ejecutar(); //Ejecuta el programa numero 1 Gestion de calificaciones
        }
        else if(opcion == 2){
            Exercises.Ejercicio2.ejecutar();

        }
        else if(opcion == 3){
            SistemaEmpleados.ejecutar();
            

        }
        else if(opcion == 4){
            Ejercicio4.ejecutar();

        }
        else if(opcion == 5){
            System.out.println(nombre + " Muchas Gracias");
        }
        else{ 
        System.out.println(nombre + " Opcion invalida debe colocar un numero del 1 al 5");
        break;
    }
    }
    }

}
