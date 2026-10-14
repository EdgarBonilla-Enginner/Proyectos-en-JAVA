package Model;

public class CuentaBancaria {
    //Definimos los atributos de manera privada
    private int numerodeCuenta;
    private String Titular;
    private double saldo;
    //Hacemos el constructor
    public CuentaBancaria(int numerodeCuenta, String Titular, double saldo){
        this.numerodeCuenta = numerodeCuenta;
        this.Titular = Titular;
        this.saldo = saldo;
    }
    public int getnumerodeCuenta(){
        return numerodeCuenta;
    }
    public String getTitular(){
        return Titular;
    }
    public double getsaldo(){
        return saldo;
    }
    public void depositar(double cantidad){
        if(cantidad > 0){
           saldo =  cantidad + saldo;
            System.out.println("Su cantidad actual es de ¢ " + saldo + " colones");
        }
        else {
            throw new ArithmeticException("La cantidad debe ser mayor a 0 ");
        }
    }
    public void retirar(double retirar){
        if(retirar <= 0){
        throw new ArithmeticException("El monto debe  de ser mayor a 0 ");
        }
        if (retirar <= saldo){
            saldo = saldo - retirar;
            System.out.println("El monto retirado de es de ¢ " + retirar + " colones");
        }
        else{
            throw new ArithmeticException("El monto debe de ser mayor a 0 y menor al saldo");
        }
    }
      public void mostrarSaldo(){
        System.out.println("Número de cuenta: " + numerodeCuenta);
        System.out.println("El nombre del titular de la cuenta es: " + Titular);
        System.out.println("El saldo de la cuenta de " + Titular + " es de ¢ " + saldo + " colones");
      }
}
