public class Paradigma2 {
    public static void main(String[] args) {

        //Objeto Mock (Objeto Simulado)
        System.out.println("-- cuenta1 --");
        Cuenta cuenta1=new Cuenta(1,"arg$");
        cuenta1.depositar(35000);
        cuenta1.depositar(60000);
        cuenta1.debitar(22000);
        System.out.println(cuenta1.getEstado());

        System.out.println("-- cliente1 --");
        Cliente cliente1=new Cliente(1,"Cristian Molinari",2);
        //cliente1.depositar(120000);                   //error
        //Cuenta cuentaX=new Cuenta(2,"arg2");          //error es una referencia en memoria
        Cuenta cuentaX=cliente1.getCuenta();
        cuentaX.depositar(120000);

        cliente1.getCuenta().depositar(120000);

        System.out.println(cliente1.getEstado());

    }
} //end class Paradigma2

class Cuenta {
    private int nro;
    private String moneda;
    private double saldo;

    // método constructor
    public Cuenta(int nro, String moneda) {
        this.nro = nro;
        this.moneda = moneda;
    }

    public void depositar(double monto) {
        saldo = saldo + monto;
    }

    public void debitar(double monto) {
        if (saldo >= monto) {
            saldo = saldo - monto;
        } else {
            System.out.println("Saldo Insuficiente!");
        }
    }

    public String getEstado(){
        return nro+", "+moneda+", "+saldo;
    }
} //end class Cuenta

class Cliente{
    private int nro;
    private String nombre;
    private Cuenta cuenta;

    public Cliente(int nro, String nombre, int nroCuenta){
        this.nro=nro;
        this.nombre = nombre;
        this.cuenta = new Cuenta(nroCuenta,"arg$");
    }

    public Cuenta getCuenta(){
        return cuenta;
    }

    public String getEstado(){
        return nro+", "+nombre+", "+cuenta.getEstado();
    }

}//end class Cliente

