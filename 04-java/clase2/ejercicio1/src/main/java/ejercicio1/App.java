package ejercicio1;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

class CuentaCorriente {

    private String titular;
    private double saldo;

    public CuentaCorriente() { }

    public CuentaCorriente(String titular, double saldo) {
        this.setTitular(titular);
        this.setSaldo(saldo);
    }

    public CuentaCorriente(CuentaCorriente cc) {
        this.setTitular(cc.getTitular());
        this.setSaldo(cc.getSaldo());
    }

    public void ingreso(double d) {
    }

    public void egreso(double d) {
    }

    public void reintegro(double d) {
    }

    public void transferencia(CuentaCorriente cc) {
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
