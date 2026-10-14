package Exercises;
import Model.CuentaBancaria;//Importamos el modelo de la cuenta bancaria
import java.util.Scanner; //Importamos el scanner
public class Ejercicio2 {
public static void ejecutar(){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Por favor digite el número de cuenta: ");
    int numerodeCuenta = entrada.nextInt();
    entrada.nextLine(); //Se usa para crear un salto de linea y el usuario no deba de dar enter para avanzar
    System.out.println("Por favor digite el nombre de la persona dueña de la cuenta: ");
    String Titular = entrada.nextLine();
    System.out.println("Por favor digite el saldo con el que iniciara la cuenta: ");
    double saldo = entrada.nextDouble();
    CuentaBancaria cuenta = new CuentaBancaria(numerodeCuenta, Titular, saldo);
    cuenta.mostrarSaldo();
    //Menu para que el usuario pueda elegir que desea hacer
    int opcion = 0 ; //Inicializamos con 0
    int operaciones = 0;
    while (opcion != 3){
        System.out.println("1) Hacer un deposito");
        System.out.println("2) Hacer un retiro ");
        System.out.println("3) Salir");
        System.out.println(Titular + " digite que opción acción desea ejecutar: ");
        opcion = entrada.nextInt(); 
        switch(opcion){
            case 1:
                System.out.println(Titular + " Digite el monto que desea Depositar: ");
                double montoDeposito = entrada.nextDouble();
                operaciones++;
                try{
                    cuenta.depositar(montoDeposito);
                   }catch(ArithmeticException e) {
        System.out.println("Error al realizar el deposito: " + e.getMessage());//Muestra el mensaje descriptivo que definí en la clase bancaria
    }
                break;
            case 2:
                System.out.println(Titular + "Digite por favor el monto que desea retirar: ");
                 double montoRetiro = entrada.nextDouble();
                 operaciones++;
                    try{
                       cuenta.retirar(montoRetiro);
                      }catch(ArithmeticException e) {
        System.out.println("Error al realizar el retiro: " + e.getMessage());
    }
                break;
            case 3: 
            if(operaciones < 5){
                opcion = 0;
                System.out.println(Titular + " Debe realizar almenos 05 operaciones antes de salir.");
            }
            else{
                  System.out.println(Titular + " Saliste del sistema");
            }
          
            break;
            default:
                System.out.println(Titular + "La opción digitada no existe, digite un numero entre 1 y 3");
        }
     }
     System.out.println("Total de operaciones realizadas: " + operaciones);
     System.out.println("Saldo final de la cuenta: ");
     cuenta.mostrarSaldo();
   
   
}
}
