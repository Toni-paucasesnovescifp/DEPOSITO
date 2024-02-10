package cuentas;

public class Main {

    public static void main(String[] args) {


        operativa_cuenta(2300);
    }

    private static void operativa_cuenta(float cantidad) {
        CCuenta miCuenta;
        double saldoActual;
        miCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            miCuenta.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar. Hola compi112");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
