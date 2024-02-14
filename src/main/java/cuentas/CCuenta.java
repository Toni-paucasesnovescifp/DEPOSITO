package cuentas;

/**
 * la classe compte crea els objectes CCuenta i conté els mètodes per aplicar als atributs membre d'aquests objectes
 */
public class CCuenta {


    /**
     * nom de l'usuari del compte
     */
    private String nombre;
    /**
     * això és el número de compte corrent
     */
    private String cuenta;
    /**
     * valor amb decimals que conté el saldo del compte
     */
    private double saldo;
    /**
     * valor amb decimals que conté el tipus d'interes
     */
    private double tipoInteres;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se podrían ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo saldado");
        saldo = saldo - cantidad;
    }
}
