package Model;

public class Estudiante {
    //Atributos Solicitados en el ejercicio.//
    //Private protege el atributo//
    private String nombre; //Nombre de los estudiantes en privado.//
    private int matricula; //Numero de Matricula privado//
    private double[] calificaciones; //[] se usa para indicar que es un arreglo//
    //Constructor//
    public Estudiante(String nombre, int matricula, double[] calificaciones){
    this.nombre = nombre; //this.nombre se refiere al atributo de la clase//
    this.matricula = matricula; //this.matricula se refiere al atributo de la matricula//
    this.calificaciones = calificaciones; //Misma funcion que los anteriores//
}
public String getNombre(){
    return nombre; //Va a retornar el nombre//
}
public int getMatricula(){
    return matricula; //Retorna la matricula.
}
public double[] getCalificaciones(){//Debe de llevar los [] porque es una arreglo//
    return calificaciones; //Retorna las calificaciones//
}
public double calcularPromedio(){//Metodo para calcular el promedio//
double suma = 0; //Se incializa la suma con un 0//
    for (double calificacion : calificaciones){//Para recorrer las calificaciones//
        suma += calificacion; //La operación suma nota por nota para lograr el promedio//
    }
     return suma / calificaciones.length; // Length para recorrer el arreglo//
}
public boolean aprueba(){//Metodo para revisar si el estudiante paso//
return calcularPromedio() >= 70; //Para pasar la nota debe de ser igual o mayor a 70
}
public void mostrarInformacion(){//Muestra la informacion//
System.out.println("Nombre: " + nombre);
System.out.println("Numero de Matricula: " + matricula);
System.out.println("Calificaciones: " );
for (double calificacion : calificaciones){//Este for recorre las calificaciones de los estudiantes una por una
System.out.println(calificacion);
}
System.out.println("Promedio: " + calcularPromedio());
System.out.println("Estado del estudiante: "+ (aprueba()? "Aprobado" : "Reprobado"));//Comprueba y retorna si paso o no
}
}


