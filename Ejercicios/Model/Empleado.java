package Model;

public class Empleado extends Persona {
    private int numeroEmpleado;
    private double salario;
    public Empleado(String nombre, int edad, int numeroEmpleado, double salario){
        super(nombre, edad);
        this.numeroEmpleado = numeroEmpleado;
        this.salario = salario;
    }
    public int getNumeroEmpleado(){
        return numeroEmpleado;
    }
    public double getSalario(){
        return salario;
    }
    public void setNumeroEmpleado(int numeroEmpleado){
        this.numeroEmpleado = numeroEmpleado;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double calcularBonoAnual(){
        return salario * 0.15;
    }
    public void mostrarInformacion(){
        presentarse();
        System.out.println("Numero de empleado: " + numeroEmpleado);
        System.out.println("Salario: " + salario);
        System.out.println("Bono anual: " + calcularBonoAnual());
    }
}
