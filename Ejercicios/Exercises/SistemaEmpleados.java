package Exercises;
import Model.Empleado;
import java.util.Scanner;
public class SistemaEmpleados{
    public static void ejecutar(){
        Scanner entrada = new Scanner(System.in);
        Empleado[] empleados = new Empleado[4];
        double totalSalarios = 0;
        double totalBonos = 0;
        for(int i = 0; i < empleados.length; i++){
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = entrada.nextLine();
        System.out.println("Digite la edad del empleado: ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite el número de empleado: ");
        int numeroEmpleado = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el salario del empleado: ");
        double salario = entrada.nextDouble();
        entrada.nextLine();
         empleados[i] = new Empleado(nombre, edad, numeroEmpleado, salario); 
         }
       
        for(int i = 0;  i < empleados.length; i++){
            empleados[i].mostrarInformacion();

            totalSalarios += empleados[i].getSalario();
            totalBonos += empleados[i]. calcularBonoAnual();
        }
        System.out.println("Total de salarios: " + totalSalarios);
        System.out.println("Total de bonos anuales: " + totalBonos);
    }
}